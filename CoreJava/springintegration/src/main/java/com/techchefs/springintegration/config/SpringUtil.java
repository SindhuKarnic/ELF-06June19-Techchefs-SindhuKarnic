package com.techchefs.springintegration.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.techchefs.springintegration.bean.EmployeeInfoBean;

@Component
public class SpringUtil {
	@Bean
	private static SessionFactory buildSessionFactory() {
		return new Configuration()
					.configure()
					.addAnnotatedClass(EmployeeInfoBean.class)
					.buildSessionFactory();
	}
}
