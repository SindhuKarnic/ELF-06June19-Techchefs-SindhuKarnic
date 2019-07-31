package com.techchefs.hibernate;

import com.techchefs.hibernate.dao.CustomerCRUD;
import com.techchefs.hibernate.dao.CustomerDao;
import com.techchefs.hibernate.dto.CustomerBean;

import lombok.extern.java.Log;

@Log
public class CustomerCRUDTest {

	public static void main(String[] args) {
		//Create Customer info
		CustomerBean bean = new CustomerBean();
		bean.setId(1);
		bean.setFirstName("sindhu");
		bean.setLastName("karnic");
		bean.setAddress("blore");
		bean.setContactNumber(111111);
		bean.setCity("bangalore");
		bean.setCountry("india");
		bean.setState("karnataka");
		CustomerDao dao = new CustomerCRUD();
		dao.createCustomer(bean);
		
		//Update  Customer info
		dao.updateCustomer(1);
		
		//Read Customer info
		CustomerBean bean1 = dao.readCustomer(1);
		log.info("ID "+bean1.getId());
		log.info("First Name "+bean1.getFirstName());
		log.info("Last name "+bean1.getLastName());
		log.info("address "+bean1.getAddress());
		log.info("City "+bean1.getCity());
		log.info("State "+bean1.getState());
		log.info("Country "+bean1.getCountry());
		log.info("Contact number "+bean1.getContactNumber());
		
		//Delete Customer info
		dao.deleteCustomer(1);
	}

}
