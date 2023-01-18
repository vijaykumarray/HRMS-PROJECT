package com.ahom.hrms.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.Dto.LeaveApprovalDto;
import com.ahom.hrms.entity.LeaveApproval;
import com.ahom.hrms.repository.LeaveApprovalRepository;
import com.ahom.hrms.service.LeaveApprovalService;
@Service
public class LeaveApprovalServiceImpl implements LeaveApprovalService {
	

	@Autowired
	LeaveApprovalRepository leaveApprovalRepository;


	//Post
	@Override
	public void saveLeaveApproval(LeaveApprovalDto leaveApprovalDto)
	{
		leaveApprovalRepository.save(leaveApprovalDtoTOLeaveApproval(leaveApprovalDto));		
	}
	
   //Get
	@Override
	public List<LeaveApproval>getAllLeaveApproval(){
		List<LeaveApproval> ListLeaveApproval=new ArrayList<LeaveApproval>();
		leaveApprovalRepository.findAll().forEach(l1->ListLeaveApproval.add(l1));
		return ListLeaveApproval;
	}
	
	//Delete
	@Override
	public void deleteLeaveApproval(int Id) {
		leaveApprovalRepository.deleteById(Id);
	}
	
	//Put
	@Override
	public void saveLeaveApproval1(LeaveApproval leaveApproval)
	{
		leaveApprovalRepository.save(leaveApproval);		
	}
	
	public LeaveApproval leaveApprovalDtoTOLeaveApproval(LeaveApprovalDto leaveApprovalDto)
	{
		LeaveApproval leaveApproval=new LeaveApproval();
		
		leaveApproval.setId(leaveApprovalDto.getId());
		
		leaveApproval.setRequestBy(leaveApprovalDto.getRequestBy());
		
		leaveApproval.setLeaveType(leaveApprovalDto.getLeaveType());
		
		leaveApproval.setStartDate(leaveApprovalDto.getStartDate());
		
		leaveApproval.setEndDate(leaveApprovalDto.getEndDate());
		
		leaveApproval.setNoOfDays(leaveApprovalDto.getNoOfDays());
		
		leaveApproval.setReason(leaveApprovalDto.getReason());
		
		leaveApproval.setStatus(leaveApprovalDto.getStatus());
		return leaveApproval;
		
	}
	 public LeaveApprovalDto leaveApprovalToLeaveApprovalDto(LeaveApproval leaveApproval)
	    {
		 LeaveApprovalDto leaveApprovalDto= new LeaveApprovalDto();

		 leaveApprovalDto.setId(leaveApproval.getId());;

		 leaveApprovalDto.setRequestBy(leaveApproval.getRequestBy());

		 leaveApprovalDto.setLeaveType(leaveApproval.getLeaveType());

		 leaveApprovalDto.setStartDate(leaveApproval.getStartDate());

		 leaveApprovalDto.setEndDate(leaveApproval.getEndDate());
		 
		 leaveApprovalDto.setNoOfDays(leaveApproval.getNoOfDays());
		 
		 leaveApprovalDto.setReason(leaveApproval.getReason());
		 
		 leaveApprovalDto.setStatus(leaveApproval.getStatus());

	        return leaveApprovalDto;
	    }


	

	
}

	
	


