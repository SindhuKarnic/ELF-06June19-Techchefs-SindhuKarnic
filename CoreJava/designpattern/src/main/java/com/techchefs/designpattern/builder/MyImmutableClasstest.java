package com.techchefs.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClasstest { 
	
	public static void main(String[] args) throws ParseException {
		MyImmutableClass immutableClass = null;
		immutableClass = new MyImmutableClass("abc", 11, 11111111111L);
		log.info("Name " +immutableClass.getName());
		log.info("Age " +immutableClass.getAge());
		log.info("Phone " +immutableClass.getPhone());
		
		immutableClass = new MyImmutableClass("xyz", 11, 11111111111L);
		log.info("Name " +immutableClass.getName());
		log.info("Age " +immutableClass.getAge());
		log.info("Phone " +immutableClass.getPhone());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("2018-10-09");
		
		EmployeeData emp = new EmployeeData(1, "abc", 20, "female", 25000, 1111111111, date, 3333333333L, "aa@mail.com", "dev", date, 10, 3);
		log.info("emp data " +emp.toString());
		
		EmployeeData2 data2 = new EmployeeData2.Employeedata2Builder()
											   .id(1)
											   .name("aaa")
											   .age(25)
											   .gender("female")
											   //.salary(25000)
											   //.phone(1111111L)
											   .joiningDate(date)
											   .accountNumber(33333333)
											   .email("aaa@mail.com")
											   .designation("dev")
											   .dob(date)
											   .departmentId(30)
											   .managerId(2)
											   .build();
		log.info("emp data2  " +data2.toString());
		
		EmployeeData3 data3 = new EmployeeData3.EmployeeData3Builder()
				   .id(1)
				   .name("aaa")
				   .age(25)
				   .gender("female")
				   //.salary(25000)
				   //.phone(1111111L)
				   .joiningDate(date)
				   .accountNumber(33333333)
				   .email("aaa@mail.com")
				   .designation("dev")
				   .dob(date)
				   .departmentId(30)
				   .managerId(2)
				   .build();
log.info("emp data3  " +data3.toString());
	}
}
