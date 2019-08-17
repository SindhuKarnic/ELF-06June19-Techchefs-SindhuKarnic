package com.techchefs.hibernatemapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.techchefs.hibernatemapping.manytomany.TrainingInfoBean;
import com.techchefs.hibernatemapping.manytoone.EmpEduPK;
import com.techchefs.hibernatemapping.manytoone.EmpExpPK;
import com.techchefs.hibernatemapping.manytoone.EmployeeAddressInfo;
import com.techchefs.hibernatemapping.manytoone.EmployeeAddressPK;
import com.techchefs.hibernatemapping.manytoone.EmployeeEducationalInfo;
import com.techchefs.hibernatemapping.manytoone.EmployeeExperienceInfoBean;


public class EmpTest {
public static void main(String[] args) {
	EmployeeInfoBean b1 = new EmployeeInfoBean();
	b1.setId(22);
	b1.setName("ggggg");
	EmployeeOtherInfoBean b2 = new EmployeeOtherInfoBean();
	b2.setPan("sdsdsd");
	b2.setInfobean(b1);
	b1.setEmpotherinfo(b2);
	
	EmployeeAddressPK addpk1 = new EmployeeAddressPK();
	addpk1.setAddressType("T");
	addpk1.setInfoBean(b1);
	
	EmployeeAddressPK addpk2 = new EmployeeAddressPK();
	addpk2.setAddressType("P");
	addpk2.setInfoBean(b1);
	
	EmployeeAddressInfo addinfo1 = new EmployeeAddressInfo();
	addinfo1.setAddress1("abc");
	addinfo1.setEmpPK(addpk1);
	
	EmployeeAddressInfo addinfo2 = new EmployeeAddressInfo();
	addinfo2.setAddress1("def");
	addinfo2.setAddress2("zzz");
	addinfo2.setEmpPK(addpk2);
	
	
	
	//edu
	EmpEduPK edu1 = new EmpEduPK();
	edu1.setEducationType("degree");
	edu1.setInfoBean(b1);
	
	EmpEduPK edu2 = new EmpEduPK();
	edu2.setEducationType("pu");
	edu2.setInfoBean(b1);
	
	EmployeeEducationalInfo empEdu1 = new EmployeeEducationalInfo();
	empEdu1.setBranch("cs");
	empEdu1.setCollegename("aaaa");
	empEdu1.setDegreeType("M");
	empEdu1.setLocation("loc1");
	empEdu1.setPercentage(20.33);
	empEdu1.setUniversity("qqq");
	empEdu1.setYop("2018-02-05");
	empEdu1.setEduPk(edu1);
	
	
	EmployeeEducationalInfo empEdu2 = new EmployeeEducationalInfo();
	empEdu2.setBranch("ec");
	empEdu2.setCollegename("bbbb");
	empEdu2.setDegreeType("T");
	empEdu2.setLocation("loc2");
	empEdu2.setPercentage(60.33);
	empEdu2.setUniversity("qqq");
	empEdu2.setYop("2018-02-05");
	empEdu2.setEduPk(edu2);
	
	//Emp experience
	EmpExpPK exp1 = new EmpExpPK();
	exp1.setCompaneName("QAAA");
	exp1.setInfoBean(b1);
	EmpExpPK exp2 = new EmpExpPK();
	exp2.setCompaneName("ssss");
	exp2.setInfoBean(b1);
	
	
	EmployeeExperienceInfoBean empExp1 = new EmployeeExperienceInfoBean();
	empExp1.setDesignation("dev");
	empExp1.setEmpExp(exp1);
	
	EmployeeExperienceInfoBean empExp2 = new EmployeeExperienceInfoBean();
	empExp2.setDesignation("dev");
	empExp2.setEmpExp(exp2);
	
	//training
	TrainingInfoBean tbean = new TrainingInfoBean();
	tbean.setCourseId(111);
	tbean.setCourseType("aaaa");
	tbean.setDuration(10);
	tbean.setName("java");
	tbean.setInfoBeans(Arrays.asList(b1));
	
	
	b1.setAddressInfobean(Arrays.asList(addinfo1, addinfo2));
	b1.setEduInfobean(Arrays.asList(empEdu1,empEdu2));
	b1.setExpInfobean(Arrays.asList(empExp1,empExp2));
	b1.setTrainbean(Arrays.asList(tbean));
	HibernateImpl imp = new HibernateImpl();
	imp.createEmpForMgr(b1);
}
	/*public static void main(String[] args) {
		EmployeeInfoBean empinf = new EmployeeInfoBean();

		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = null;
		Date d1 = null;
		Date d2 = null;
		try { 
			date = form.parse("1993-04-03"); 
			d1 = form.parse("2014-02-02"); 
			d2 = form.parse("2015-05-05"); 
		} catch (ParseException e) {
			e.printStackTrace(); 
		}
		
		empinf.setId(5);
		empinf.setName("harry");
		empinf.setDepartmentId(103);
		empinf.setDesignation("dev");
		empinf.setDob(date);
		empinf.setEmail("harryyyy@mail.com");
		empinf.setGender("male");
		empinf.setJoiningDate(date);
		//empinf.setManagerId(4);
		empinf.setPhone(22222222);
		empinf.setSalary(25000);
		empinf.setAccountNumber(11111111);
		empinf.setAge(25);
		
		EmployeeInfoBean empinf11 = new EmployeeInfoBean();
		empinf11.setId(6);
		empinf11.setName("harry");
		empinf11.setDepartmentId(103);
		empinf11.setDesignation("dev");
		empinf11.setDob(date);
		empinf11.setEmail("harryyyy@mail.com");
		empinf11.setGender("male");
		empinf11.setJoiningDate(date);
		//empinf11.setManagerId(4);
		empinf11.setPhone(22222222);
		empinf11.setSalary(25000);
		empinf11.setAccountNumber(11111111);
		empinf11.setAge(25);
		
		EmployeeInfoBean empinf12 = new EmployeeInfoBean();
		empinf12.setId(7);
		empinf12.setName("harry");
		empinf12.setDepartmentId(103);
		empinf12.setDesignation("dev");
		empinf12.setDob(date);
		empinf12.setEmail("harryyyy@mail.com");
		empinf12.setGender("male");
		empinf12.setJoiningDate(date);
		//empinf12.setManagerId(4);
		empinf12.setPhone(22222222);
		empinf12.setSalary(25000);
		empinf12.setAccountNumber(11111111);
		empinf12.setAge(25);

		EmployeeOtherInfoBean empinf1 = new EmployeeOtherInfoBean();
		
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
		empinf1.setInfobean(empinf);
		
		//Emp address
		EmployeeAddressPK addpk1 = new EmployeeAddressPK();
		addpk1.setAddressType("T");
		addpk1.setInfoBean(empinf);
		
		EmployeeAddressPK addpk2 = new EmployeeAddressPK();
		addpk2.setAddressType("P");
		addpk2.setInfoBean(empinf);
		
		EmployeeAddressInfo addinfo1 = new EmployeeAddressInfo();
		addinfo1.setAddress1("abc");
		addinfo1.setAddress2("xyz");
		addinfo1.setCity("blore");
		addinfo1.setCountry("india");
		addinfo1.setLandmark("aaa");
		addinfo1.setPincode(56666);
		addinfo1.setState("kar");
		addinfo1.setEmpPK(addpk1);
		
		EmployeeAddressInfo addinfo2 = new EmployeeAddressInfo();
		addinfo2.setAddress1("def");
		addinfo2.setAddress2("zzz");
		addinfo2.setCity("blore");
		addinfo2.setCountry("india");
		addinfo2.setLandmark("aaggga");
		addinfo2.setPincode(565666);
		addinfo2.setState("kar");
		addinfo2.setEmpPK(addpk2);
		
		//Emp education
		
		EmpEduPK edu1 = new EmpEduPK();
		edu1.setEducationType("degree");
		edu1.setInfoBean(empinf);
		EmployeeEducationalInfo empEdu1 = new EmployeeEducationalInfo();
		empEdu1.setBranch("cs");
		empEdu1.setCollegename("aaaa");
		empEdu1.setDegreeType("M");
		empEdu1.setLocation("loc1");
		empEdu1.setPercentage(20.33);
		empEdu1.setUniversity("qqq");
		empEdu1.setYop("2018-02-05");
		empEdu1.setEmpPk(edu1);
		
		EmpEduPK edu2 = new EmpEduPK();
		edu2.setEducationType("pu");
		edu2.setInfoBean(empinf);
		EmployeeEducationalInfo empEdu2 = new EmployeeEducationalInfo();
		empEdu2.setBranch("ec");
		empEdu2.setCollegename("bbbb");
		empEdu2.setDegreeType("T");
		empEdu2.setLocation("loc2");
		empEdu2.setPercentage(60.33);
		empEdu2.setUniversity("qqq");
		empEdu2.setYop("2018-02-05");
		empEdu2.setEmpPk(edu2);
		
		//Emp experience
		EmpExpPK exp1 = new EmpExpPK();
		exp1.setCompaneName("QAAA");
		exp1.setInfoBean(empinf);
		EmpExpPK exp2 = new EmpExpPK();
		exp2.setCompaneName("ssss");
		exp2.setInfoBean(empinf);
		
		
		EmployeeExperienceInfoBean empExp1 = new EmployeeExperienceInfoBean();
		empExp1.setDesignation("dev");
		empExp1.setJoiningDate(d1);
		empExp1.setLeavingDate(d2);
		empExp1.setEmpExp(exp1);
		
		EmployeeExperienceInfoBean empExp2 = new EmployeeExperienceInfoBean();
		empExp2.setDesignation("dev");
		empExp2.setJoiningDate(d1);
		empExp2.setLeavingDate(d2);
		empExp2.setEmpExp(exp2);
		
		//emp training
		TrainingInfoBean tbean = new TrainingInfoBean();
		tbean.setCourseId(111);
		tbean.setCourseType("aaaa");
		tbean.setDuration(10);
		tbean.setName("java");
		tbean.setInfobean(Arrays.asList(empinf11,empinf12,empinf));
		
		//emp manager id
		EmployeeInfoBean b1 = new EmployeeInfoBean();
		b1.setId(10);
		b1.setName("aaaaa");
		
		EmployeeInfoBean b2 = new EmployeeInfoBean();
		b2.setId(11);
		b2.setName("aaaaa");
		b2.setManagerId(b1);
		
		EmployeeInfoBean b3 = new EmployeeInfoBean();
		b3.setId(12);
		b3.setName("aaaaa");
		b3.setManagerId(b1);
		
		HibernateImpl impl = new HibernateImpl();
		//impl.createEmp(empinf, empinf1, Arrays.asList(addinfo1, addinfo2), Arrays.asList(empEdu1, empEdu2), Arrays.asList(empExp1, empExp2));
		//impl.createTraining(tbean);
		//impl.createEmpForMgr(b1);
		
		//impl.createEmpForMgr(b2);
		//impl.createEmpForMgr(b3);
		
		TrainingInfoBean tb = new TrainingInfoBean();
		tb.setCourseId(107);
		tb.setName("j2ee");
		EmployeeInfoBean eb1 = impl.getEmployeeBean(199);
		EmployeeInfoBean eb2 = new EmployeeInfoBean();
		eb2.setId(112);
		tb.setInfobean(Arrays.asList(eb1,eb2));
		impl.createTraining(tb);
		
	}
*/
}
