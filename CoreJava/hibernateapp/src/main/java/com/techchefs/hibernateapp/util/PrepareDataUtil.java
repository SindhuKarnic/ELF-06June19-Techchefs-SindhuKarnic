package com.techchefs.hibernateapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDataUtil {
	private PrepareDataUtil() {}
	public static EmployeeInfoBean prepareData(int id) {
		EmployeeInfoBean empinf = new EmployeeInfoBean();

		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = null;
		try { 
			date = form.parse("1993-04-03"); 
		} catch (ParseException e) {
			e.printStackTrace(); 
		}
		empinf.setId(id);
		empinf.setName("harry");
		empinf.setDepartmentId(103);
		empinf.setDesignation("dev");
		empinf.setDob(date);
		empinf.setEmail("harryyyy@mail.com");
		empinf.setGender("male");
		empinf.setJoiningDate(date);
		empinf.setManagerId(4);
		empinf.setPhone(22222222);
		empinf.setSalary(25000);
		empinf.setAccountNumber(11111111);
		empinf.setAge(25);

		EmployeeOtherInfoBean empinf1 = new EmployeeOtherInfoBean();
		
		empinf1.setId(id);
		empinf1.setPan("ABCD12222");
		empinf1.setIsmarried(true);
		empinf1.setBloodGroup("o+ve");
		empinf1.setIschallenged(false);
		empinf1.setEmergencyContactName("abc");
		empinf1.setEmergencyContactNumber(122222222);
		empinf1.setNationality("indian");
		empinf1.setReligion("hindu");
		empinf1.setFatherNm("xyz");
		empinf1.setMotherNm("pqr");
		empinf1.setSpouseNm("ttt");
		empinf1.setPassport("duvjdghsjdhsj273238");
		empinf1.setAdhar(1222222222);
		
		empinf.setOtherInfo(empinf1);
		return empinf;
	}
}
