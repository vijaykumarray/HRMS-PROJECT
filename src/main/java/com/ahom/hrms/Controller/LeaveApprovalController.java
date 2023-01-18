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

import com.ahom.hrms.Dto.LeaveApprovalDto;
import com.ahom.hrms.ServiceImpl.LeaveApprovalServiceImpl;
import com.ahom.hrms.entity.LeaveApproval;


@RestController
@RequestMapping("/leave_approval")
@CrossOrigin
public class LeaveApprovalController {

	@Autowired
	LeaveApprovalServiceImpl leaveApprovalService;

	@PostMapping("/save")
	public LeaveApprovalDto saveLeaveApproval(@RequestBody LeaveApprovalDto leaveApprovalDto) 
	{
		leaveApprovalService.saveLeaveApproval(leaveApprovalDto);
		return leaveApprovalDto;
	}
	
	
	@GetMapping("/fatch")
	public List<LeaveApproval> getLeaveApproval()
	{
		List<LeaveApproval>allLeaveApproval=leaveApprovalService.getAllLeaveApproval();
		return allLeaveApproval;
	}
	
	
	@DeleteMapping("/leave/{leaveId}")
	public void deleteLeaveApproval(@PathVariable("Id")int id)
	{
		leaveApprovalService.deleteLeaveApproval(id);
	}


	
	@PutMapping("/leave")
	public LeaveApproval UpdLeaveApproval(@RequestBody LeaveApproval leaveApproval)
	{
		leaveApprovalService.saveLeaveApproval1(leaveApproval);
		
		return leaveApproval;	
	}

	
	

}

