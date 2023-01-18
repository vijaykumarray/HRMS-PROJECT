package com.ahom.hrms.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.Dto.EmployeeDetailsDto;
import com.ahom.hrms.entity.EmployeeDetails;
import com.ahom.hrms.repository.EmployeeDetailsRepository;
import com.ahom.hrms.service.EmployeeDetailsService;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {
	

	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;
	
	//Post
	@Override
	public void saveEmployeeDetails(EmployeeDetailsDto employeeDetailsDto)
	{
		employeeDetailsRepository.save(employeeDtoTOEmployee(employeeDetailsDto));		
	}
	
	//Get
	@Override
	public List<EmployeeDetails>getAllEmployeeDetails(){
		List<EmployeeDetails> ListEmployeeDetails=new ArrayList<EmployeeDetails>();
		employeeDetailsRepository.findAll().forEach(l1->ListEmployeeDetails.add(l1));
		return ListEmployeeDetails;
	}
	//delete
	@Override
	public void deleteEmployeeDetails(int Id) {
		employeeDetailsRepository.deleteById(Id);
	}
	
	//update
	@Override
	public void saveEmployeeDetails1(EmployeeDetails employeeDetails)
	{
		employeeDetailsRepository.save(employeeDetails);		
	}
	
	public EmployeeDetails employeeDtoTOEmployee(EmployeeDetailsDto employeeDetailsDto)
	{
		EmployeeDetails employeeDetails=new EmployeeDetails();
		
		employeeDetails.setId(employeeDetailsDto.getId());
		
		employeeDetails.setFromDate(employeeDetailsDto.getFromDate());
		
		employeeDetails.setToDate(employeeDetailsDto.getToDate());
		
		employeeDetails.setSelectEmployee(employeeDetailsDto.getSelectEmployee());
		return employeeDetails;
		
	}
	 public EmployeeDetailsDto employeeDetailsToEmployeeDetailsDto(EmployeeDetails employeeDetails)
	    {
		 EmployeeDetailsDto employeeDetailsDto= new EmployeeDetailsDto();

	        employeeDetailsDto.setId(employeeDetails.getId());;

	        
	        employeeDetailsDto.setFromDate(employeeDetails.getFromDate());
	        
	        employeeDetailsDto.setToDate(employeeDetails.getToDate());
	        
	        employeeDetailsDto.setSelectEmployee(employeeDetails.getSelectEmployee());
	        return employeeDetailsDto;
	    }
	 
}


