package com.techchefs.hibernate.dao;

import com.techchefs.hibernate.dto.CustomerBean;

public interface CustomerDao {
	public void createCustomer(CustomerBean bean);
	public void updateCustomer(int id);
	public void deleteCustomer(int id);
	public CustomerBean readCustomer(int id);
}
