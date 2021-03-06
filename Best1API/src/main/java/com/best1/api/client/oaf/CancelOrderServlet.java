package com.best1.api.client.oaf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.best1.api.webservice.soap.oaf.CustomerOrderSoapService;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderInfoResult;


@WebServlet("/CancelOrderServlet")
public class CancelOrderServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(CancelOrderServlet.class);
	
	private static final long serialVersionUID = 3989091463222373858L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.info("Canceling order Testing begins");
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");
		
		CustomerOrderSoapService customerOrderService = (CustomerOrderSoapService) factory.create();
		
		Long orderid = 2366769L;
		Integer itemid = 1;
		Long createdby = 30367l;
		String remarks = "我要退该商品";
		Integer primarycancelreason = 1007;
		Integer secondarycancelreason = 232;
				
		CustomerOrderInfoResult result = customerOrderService.cancelCustomerOrder(orderid, itemid, createdby, remarks, primarycancelreason, secondarycancelreason);

		logger.info("Canceling order End");
		
	}
	
}
