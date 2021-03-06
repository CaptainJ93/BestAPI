package com.best1.api.client.oaf;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.oaf.order.CustomerOrderInfo;
import com.best1.api.utils.IOAFDomainConstants;
import com.best1.api.utils.PropertiesLoader;
import com.best1.api.webservice.soap.oaf.CustomerOrderSoapService;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderInfoDTO;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderInfoResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderInvoiceInfoResult;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/OrderInvoiceServlet")
@Transactional
public class OrderInvoiceServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory.getLogger(OrderInvoiceServlet.class);

	private static final long serialVersionUID = -2625369960318367408L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");
		CustomerOrderSoapService service = (CustomerOrderSoapService) factory.create();

		Long orderid = 2366542l;
		Integer itemid = 1;
		Long createdby = 1L;

		OrderInvoiceInfoResult result = service.checkInvoice(orderid, itemid, createdby);

		System.out.println(result);
		LOG.info("return end");
	}
}