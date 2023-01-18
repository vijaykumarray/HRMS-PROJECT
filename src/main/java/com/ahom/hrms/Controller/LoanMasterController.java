package com.ahom.hrms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahom.hrms.Dto.LoanMasterDto;
import com.ahom.hrms.ServiceImpl.LoanMasterServiceImpl;
import com.ahom.hrms.entity.LoanMaster;

@RestController
@RequestMapping("/loan_master")
@CrossOrigin
public class LoanMasterController {
	

	@Autowired
	LoanMasterServiceImpl loanMasterService;
	

	@PostMapping("/save")
	public LoanMasterDto saveLoanMaster(@RequestBody LoanMasterDto loanMasterDto) 
	{
		loanMasterService.saveLoanMaster(loanMasterDto);
		return loanMasterDto;
	}
	
	
	@GetMapping("/fetch")
	public List<LoanMaster> getLoanMaster()
	{
		List<LoanMaster>allLoanMaster=loanMasterService.getAllLoanMaster();
		return allLoanMaster;
	}


}



