package com.techchefs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.MessageBean;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("bean.xml");
		MessageBean msg = (MessageBean) appCon.getBean("messageBean"); 
		System.out.println(msg.getMessage());
	}

}
