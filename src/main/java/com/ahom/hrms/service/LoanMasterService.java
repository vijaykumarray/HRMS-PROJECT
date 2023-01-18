package com.ahom.hrms.service;

import java.util.List;

import com.ahom.hrms.Dto.LoanMasterDto;
import com.ahom.hrms.entity.LoanMaster;

public interface LoanMasterService {
	
    //postmapping
	void saveLoanMaster(LoanMasterDto loanMasterDto);
		
   //getmapping
	List<LoanMaster> getAllLoanMaster();

}
