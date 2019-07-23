package com.techchefs.springs.beans.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Log
public class MessageConfigTest {
	public static void main(String[] args) {
		ApplicationContext appCon = new AnnotationConfigApplicationContext(MessageConfig.class);
		((ConfigurableApplicationContext)appCon).registerShutdownHook();
		MessageBean msgbean = appCon.getBean(MessageBean.class);
		MessageBean msgbean1 = appCon.getBean(MessageBean.class);
		log.info("" +msgbean.getMessage());
		log.info("" +msgbean1.getMessage());
		msgbean1.setMessage("oooo");
		log.info("" +msgbean.getMessage());
		log.info("" +msgbean1.getMessage());
	}
}
