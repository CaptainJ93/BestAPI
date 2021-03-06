package com.best1.api.mq.vwms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirm;
import com.best1.api.service.vwms.VwmsInputService;
import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.dto.vwms.ReturnorderconfirmDTO;
import com.rabbitmq.client.Channel;

public class WMSSROWholeConfirmMQListener  implements ChannelAwareMessageListener{

	private static final Logger  logger =  LoggerFactory.getLogger(WMSSROWholeConfirmMQListener.class); 
	@Autowired
	private VwmsInputService vwmsService;
	
	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		// TODO Auto-generated method stub
		 MessageProperties messageProperties = message.getMessageProperties(); 
		 System.out.println("msg:"+new String(message.getBody(),"utf-8"));
		try{
			TvwsApiReturnorderconfirm  tvwsApiReturnorderconfirm =new TvwsApiReturnorderconfirm();
			tvwsApiReturnorderconfirm = JSON.parseObject(new String(message.getBody(),"utf-8"),TvwsApiReturnorderconfirm.class);
			ReturnorderconfirmDTO dto = vwmsService.modifyReturnOrderconfirm(tvwsApiReturnorderconfirm);
			
			if((null==dto)||(dto.getRtncode() !=APIConstant.RTNCODE_OK)){
				logger.error("插入数据库异常,json msg:"+new String(message.getBody(),"utf-8"));
			}
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
		}catch(Exception  e){ 
			logger.error("json生成对象异常,json msg:"+new String(message.getBody(),"utf-8"));
			logger.error(e.getMessage());
			e.printStackTrace();
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
		}
			
	}

}
