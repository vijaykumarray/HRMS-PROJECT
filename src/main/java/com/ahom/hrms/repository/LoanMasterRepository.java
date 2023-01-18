package com.ahom.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ahom.hrms.entity.LoanMaster;
@EnableJpaRepositories
public interface LoanMasterRepository extends JpaRepository<LoanMaster, Integer> {

}
