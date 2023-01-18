package com.ahom.hrms.service;

import java.util.List;

import com.ahom.hrms.Dto.LoanAppDto;
import com.ahom.hrms.entity.LoanApp;

public interface LoanAppService {
	
    //postmapping
	void saveLoanApp(LoanAppDto loanAppDto);
	
 //getmapping
	List<LoanApp> getAllLoanApp();

}
