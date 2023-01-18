package com.ahom.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ahom.hrms.entity.LeaveApproval;

@EnableJpaRepositories
public interface LeaveApprovalRepository extends JpaRepository<LeaveApproval,Integer> {

}
