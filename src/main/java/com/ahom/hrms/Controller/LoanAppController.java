package com.ahom.hrms.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahom.hrms.Dto.LoanAppDto;
import com.ahom.hrms.ServiceImpl.LoanAppServiceImpl;
import com.ahom.hrms.entity.LoanApp;

@RestController
@RequestMapping("/loan_application")
@CrossOrigin
public class LoanAppController {
	

	@Autowired
	LoanAppServiceImpl loanAppService;
	
	@PostMapping("/save")
	public LoanAppDto saveLoanApp(@RequestBody LoanAppDto loanAppDto) 
	{
		loanAppService.saveLoanApp(loanAppDto);
		return loanAppDto;
	}
	
	
	@GetMapping("/fatch")
	public List<LoanApp> getLoanApp()
	{
		List<LoanApp>allLoanApp=loanAppService.getAllLoanApp();
		return allLoanApp;
	}
	

	
	

}

