package com.tc.springboot.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tc.springboot.dto.EmployeeAddressInfo;
import com.tc.springboot.dto.EmployeeEducationalInfo;
import com.tc.springboot.dto.EmployeeExperienceInfoBean;
import com.tc.springboot.dto.EmployeeInfoBean;
import com.tc.springboot.dto.EmployeeOtherInfoBean;
import com.tc.springboot.dto.EmployeeResponse;
import com.tc.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;
	
	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "hello";
	}
	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean, HttpServletRequest req) {

		 for(EmployeeAddressInfo ai : bean.getAddressInfobean()) {
			 ai.getEmpPK().setInfoBean(bean);
		 }
		 
		 for(EmployeeEducationalInfo ei :  bean.getEduInfobean()) {
			 ei.getEduPk().setInfoBean(bean);
		 }
		 
		 for(EmployeeExperienceInfoBean expinfobean : bean.getExpInfobean()) {
			 expinfobean.getEmpExp().setInfoBean(bean);
		 }
		 bean.getOtherInfo().setInfobean(bean);
		 
		 EmployeeInfoBean managerBean = bean.getManagerId();
		 if(managerBean != null) {
			 managerBean = repository.findById(managerBean.getId()).get();
			 bean.setManagerId(bean);
		 }
		 System.out.println(bean.getId());
		 System.out.println(bean.getOtherInfo().getInfobean().getId());
		 for (EmployeeAddressInfo addressInfo : bean.getAddressInfobean()) {
			 System.out.println(addressInfo.getEmpPK().getInfoBean().getId());
		}
		 for (EmployeeEducationalInfo educationalInfo : bean.getEduInfobean()) {
			 System.out.println(educationalInfo.getEduPk().getInfoBean().getId());
		}
		 for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExpInfobean()) {
			 System.out.println(experienceInfoBean.getEmpExp().getInfoBean().getId());
		}
		 
		 EmployeeResponse response = new EmployeeResponse();
		 if(req.getSession(false) != null) {
			 if(!repository.existsById(bean.getId())) {
				repository.save(bean);
				response.setMessage("Success");
				response.setStatusCode(201);
				response.setDecription("Employee addded successfully");
			 } else {
				response.setMessage("Failure");
				response.setStatusCode(401);
				response.setDecription("Employees not added");
			 }
			 return response;
		  }else {
				response.setMessage("Failure");
				response.setStatusCode(501);
				response.setDecription("Pls ");
				return response;
			}
		
	}
	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean, HttpServletRequest req) {
		for(EmployeeAddressInfo ai : bean.getAddressInfobean()) {
			 ai.getEmpPK().setInfoBean(bean);
		 }
		 
		 for(EmployeeEducationalInfo ei :  bean.getEduInfobean()) {
			 ei.getEduPk().setInfoBean(bean);
		 }
		 
		 for(EmployeeExperienceInfoBean expinfobean : bean.getExpInfobean()) {
			 expinfobean.getEmpExp().setInfoBean(bean);
		 }
		 bean.getOtherInfo().setInfobean(bean);
		 
		 EmployeeInfoBean managerBean = bean.getManagerId();
		 if(managerBean != null) {
			 managerBean = repository.findById(managerBean.getId()).get();
			 bean.setManagerId(bean);
		 }
		 
		 
		 EmployeeResponse response = new EmployeeResponse();
		 if(req.getSession(false) != null) {
			 if(repository.existsById(bean.getId())) {
				bean.getOtherInfo().setOtherInfo(repository.findByEmpId(bean).getOtherInfo());
				repository.save(bean);
				response.setMessage("Success");
				response.setStatusCode(201);
				response.setDecription("Employee addded successfully");
			 } else {
				response.setMessage("Failure");
				response.setStatusCode(401);
				response.setDecription("Employees not added");
			 }
			 return response;
		 }else {
				response.setMessage("Failure");
				response.setStatusCode(501);
				response.setDecription("Pls ");
				return response;
			}
		
		
	}
	@GetMapping(path="/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id, HttpServletRequest req) {
		
		EmployeeResponse response = new EmployeeResponse();
		 if(req.getSession(false) != null) {
			if(repository.existsById(id)) {
				EmployeeInfoBean bean = repository.findById(id).get();
				response.setBeans(Arrays.asList(bean));
				response.setMessage("Success");
				response.setStatusCode(201);
				response.setDecription("Employee found");
			} else {
				response.setMessage("Failure");
				response.setStatusCode(401);
				response.setDecription("Employees not found");
			}
			return response;
		  }else {
				response.setMessage("Failure");
				response.setStatusCode(501);
				response.setDecription("Pls ");
				return response;
			}
		
	}
	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id, HttpServletRequest req) {
		EmployeeInfoBean bean = repository.findById(id).get();
		EmployeeResponse response = new EmployeeResponse();
		 if(req.getSession(false) != null) {
			if(bean != null) {
				repository.delete(bean);
				response.setMessage("Success");
				response.setStatusCode(201);
				response.setDecription("Employee found");
			} else {
				response.setMessage("Failure");
				response.setStatusCode(401);
				response.setDecription("Employees not found");
			}
			return response;
		 }else {
				response.setMessage("Failure");
				response.setStatusCode(501);
				response.setDecription("Pls ");
				return response;
			}
		
		
	}
	@GetMapping(value= "/getotherinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeOtherInfoBean getOtherinfo(int id) {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		return repository.findByEmpId(bean);
	}
}
