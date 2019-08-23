package com.tc.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tc.springboot.dto.EmployeeInfoBean;
import com.tc.springboot.dto.EmployeeOtherInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer>{

	@Query("Select e from EmployeeOtherInfoBean e where e.infobean=:id")
		public EmployeeOtherInfoBean findByEmpId(@Param("id") EmployeeInfoBean id);
		
}
