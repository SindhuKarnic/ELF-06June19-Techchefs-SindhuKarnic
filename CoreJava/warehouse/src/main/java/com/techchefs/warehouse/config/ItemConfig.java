package com.techchefs.warehouse.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ItemConfig {
	
	@Bean
	public SessionFactory getSession() {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
}
