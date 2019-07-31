package com.techchefs.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.techchefs.hibernate.dto.ProductBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

//Question 2. Create a Table using following information, and add restrictions with appropriate conditions 
@Log
public class RestrictionsProduct {

	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(ProductBean.class);
		//condition 1: Get a list of Products, which has a price less than 100.
		criteria.add(Restrictions.lt("price", 100.0));
		List<ProductBean> bean = criteria.list();
		for(ProductBean b : bean) {
			log.info("id" +b.getProductId());
			log.info("name" +b.getProductName());
		}
		//condition 2: Get a list of Product, product name should start with "A".
			criteria.add(Restrictions.like("productName", "A%"));
			List<ProductBean> bean1 = criteria.list();
			for(ProductBean b : bean1) {
				log.info("id" +b.getProductId());
				log.info("name" +b.getProductName());
			}
	}

}
