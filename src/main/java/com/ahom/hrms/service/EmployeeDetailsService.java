package com.ahom.hrms.service;

import java.util.List;

import com.ahom.hrms.Dto.EmployeeDetailsDto;
import com.ahom.hrms.entity.EmployeeDetails;

public interface EmployeeDetailsService {
   //post
	void saveEmployeeDetails(EmployeeDetailsDto employeeDetailsDto);
   //get
	List<EmployeeDetails> getAllEmployeeDetails();
   //delete
	void deleteEmployeeDetails(int Id);
   //update
	void saveEmployeeDetails1(EmployeeDetails employeeDetails);

}
