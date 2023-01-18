package com.ahom.hrms.service;

import java.util.List;

import com.ahom.hrms.Dto.LeaveApprovalDto;
import com.ahom.hrms.entity.LeaveApproval;

public interface LeaveApprovalService {
    //post
	void saveLeaveApproval(LeaveApprovalDto leaveApprovalDto);
    //get
	List<LeaveApproval> getAllLeaveApproval();
   //delete
	void deleteLeaveApproval(int Id);
  //update
	void saveLeaveApproval1(LeaveApproval leaveApproval);

}
