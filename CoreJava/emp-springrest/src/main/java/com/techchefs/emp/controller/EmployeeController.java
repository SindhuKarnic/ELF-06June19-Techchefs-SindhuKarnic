package com.techchefs.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeResponse;
import com.techchefs.emp.dto.EmployeeAddressInfo;
import com.techchefs.emp.dto.EmployeeEducationalInfo;
import com.techchefs.emp.dto.EmployeeExperienceInfoBean;
import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.EmployeeOtherInfoBean;


//@Controller
@RestController
@RequestMapping("/employeerest")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@PostMapping(path="/createEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse createEmp(@RequestBody EmployeeInfoBean bean) {
		 
		EmployeeResponse response = new EmployeeResponse();
		if(dao.createEmployeeInfo(bean)) {
			response.setMessage("Success");
			response.setStatusCode(201);
			response.setDecription("Employee addded successfully");
		} else {
			response.setMessage("Failure");
			response.setStatusCode(401);
			response.setDecription("Employee not added");
		}
		return response;
	}
	@DeleteMapping(path="/deleteEmployee" , produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse deleteEmp(@RequestParam("id") int id, HttpServletRequest req) {
		EmployeeResponse response = new EmployeeResponse();
		if(req.getSession(false) != null) {
			if(dao.deleteEmployeeInfo(id)) {
				response.setMessage("Success");
				response.setStatusCode(201);
				response.setDecription("Employee deleted successfully");
			} else {
				response.setMessage("Failure");
				response.setStatusCode(401);
				response.setDecription("Employee not deleted");
			}
			return response;
		}else {
			response.setMessage("Failure");
			response.setStatusCode(501);
			response.setDecription("Pls ");
			return response;
		}
	}
	@PutMapping(path="/updateEmployee" , produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse updateEmp(@RequestBody EmployeeInfoBean bean, HttpServletRequest req) {
		EmployeeResponse response = new EmployeeResponse();
		if(req.getSession(false) != null) {
			if(dao.updateEmployeeInfo(bean)) {
				response.setMessage("Success");
				response.setStatusCode(201);
				response.setDecription("Employee updated successfully");
			} else {
				response.setMessage("Failure");
				response.setStatusCode(401);
				response.setDecription("Employee not updated");
			}
			return response;
		}else {
			response.setMessage("Failure");
			response.setStatusCode(501);
			response.setDecription("Pls ");
			return response;
		}
	}
	@GetMapping(path="/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse getEmp(@RequestParam("id") int id, HttpServletRequest req) {
		EmployeeResponse response = new EmployeeResponse();
		if(req.getSession(false) != null) {
			EmployeeInfoBean bean = dao.getEmployeeInfo(id);
			if(bean != null) {
				response.setMessage("Success");
				response.setStatusCode(201);
				response.setDecription("Employee found");
				response.setBeans(Arrays.asList(bean));
			} else {
				response.setMessage("Failure");
				response.setStatusCode(401);
				response.setDecription("Employee not found");
			}
			return response;
		} else {
			response.setMessage("Failure");
			response.setStatusCode(501);
			response.setDecription("Pls ");
			return response;
		}
	}
	@GetMapping(path="/getAllEmployee", produces =MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse getAllEmp(HttpServletRequest req) {
		EmployeeResponse response = new EmployeeResponse();
		if(req.getSession(false) != null) {
			List<EmployeeInfoBean> bean = dao.getAllEmployeeInfo();
			if(bean != null) {
				response.setMessage("Success");
				response.setStatusCode(201);
				response.setDecription("Employees found");
				response.setBeans(bean);
			} else {
				response.setMessage("Failure");
				response.setStatusCode(401);
				response.setDecription("Employees not found");
			}
			return response;
		} else {
			response.setMessage("Failure");
			response.setStatusCode(501);
			response.setDecription("Pls ");
			return response;
		}
	}
	
	
}