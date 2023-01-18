package com.ahom.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahom.hrms.entity.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails,Integer> {

}