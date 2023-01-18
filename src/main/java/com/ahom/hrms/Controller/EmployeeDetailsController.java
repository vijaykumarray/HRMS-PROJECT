package com.ahom.hrms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ahom.hrms.Dto.EmployeeDetailsDto;
import com.ahom.hrms.ServiceImpl.EmployeeDetailsServiceImpl;
import com.ahom.hrms.entity.EmployeeDetails;

@RestController
@RequestMapping("/attendance_details")
@CrossOrigin
public class EmployeeDetailsController {
	

	@Autowired
	EmployeeDetailsServiceImpl employeeDetailsService;
	
	
	@PostMapping("/save")
	public EmployeeDetailsDto saveEmp(@RequestBody EmployeeDetailsDto employeeDto) 
	{
		employeeDetailsService.saveEmployeeDetails(employeeDto);
		return employeeDto;
	}
	
	
	@GetMapping("/fatech")
	public List<EmployeeDetails> getEmployeeDetails()
	{
		List<EmployeeDetails>allEmployeeDetails=employeeDetailsService.getAllEmployeeDetails();
		return allEmployeeDetails;
	}
	

	@DeleteMapping("/leave/{leaveId}")
	public void deleteEmployeeDetails(@PathVariable("Id")int id)
	{
		 employeeDetailsService.deleteEmployeeDetails(id);
	}
	
	
	@PutMapping("/leave")
	public EmployeeDetails UpdEmp(@RequestBody EmployeeDetails employeeDetails)
	{
		employeeDetailsService.saveEmployeeDetails1(employeeDetails);
		
		return employeeDetails;	
	}

	
}


