package com.techchefs.springs.beans.configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.techchefs.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Configuration// similar to <beans> tag of xml
@Log
public class MessageConfig {
	@Bean// similar to <bean> tag of xml
	//@Scope("prototype")//by default it is singleton, if we create new obj it will point to old, so we add scope
	public MessageBean getMessageBean() {
		MessageBean msgBean = new MessageBean();
		msgBean.setMessage("hello");
		return msgBean;
	}
	@PostConstruct
	public void init() {
		log.info("init");
	}
	@PreDestroy
	public void destroy() {
		log.info("dest");
	}
	
}
