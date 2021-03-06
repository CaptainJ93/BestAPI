package com.best1.api.client.scm.spm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.webservice.soap.scm.ProductSoapService;

/**
 * 示范：spm商品仓库导入
 */
@WebServlet("/SpmProductWarehouseImportServlet")
@Transactional
public class SpmProductWarehouseImportServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory
			.getLogger(SpmProductWarehouseImportServlet.class);

	private static final long serialVersionUID = 6833688147345340845L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");
		// PrintWriter out = response.getWriter();

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long productid = 1215L;// 商品代码
		Long createdby = 30863L;
		Long warehouseid = 1l;
		service.productwarehouserSpmImport(productid, warehouseid, createdby);

		LOG.info("end");
	}
}