package com.ahom.hrms.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.Dto.LoanAppDto;
import com.ahom.hrms.entity.LoanApp;
import com.ahom.hrms.repository.LoanAppRepository;
import com.ahom.hrms.service.LoanAppService;
@Service
public class LoanAppServiceImpl implements LoanAppService {

	@Autowired
	LoanAppRepository loanAppRepository;  
	
	//PostMapping
	@Override
	public void saveLoanApp(LoanAppDto loanAppDto)
	{
		loanAppRepository.save(loanAppDtoTOLoanApp(loanAppDto));		
	}
	
	//GetMapping
	@Override
	public List<LoanApp>getAllLoanApp(){
		List<LoanApp> ListLoanApp=new ArrayList<LoanApp>();
		loanAppRepository.findAll().forEach(l1->ListLoanApp.add(l1));
		return ListLoanApp;
	}
	
	public LoanApp loanAppDtoTOLoanApp(LoanAppDto loanAppDto)
	{
		LoanApp loanApp=new LoanApp();
		
		loanApp.setChooseEmployee(loanAppDto.getChooseEmployee());
		
		loanApp.setLoanType(loanAppDto.getLoanType());
		
		loanApp.setPostingDate(loanAppDto.getPostingDate());
		
		loanApp.setRequiredDate(loanAppDto.getRequiredDate());
		
		loanApp.setAmountRs(loanAppDto.getAmountRs());
		
		loanApp.setSelectApprover(loanAppDto.getSelectApprover());
		
		loanApp.setLoanReason(loanAppDto.getLoanReason());
		
		loanApp.setRePaymentMethod(loanAppDto.getRePaymentMethod());
		
		loanApp.setRePaymentStartingDate(loanAppDto.getRePaymentStartingDate());
		
		loanApp.setRepaymentComments(loanAppDto.getRepaymentComments());
		
		return loanApp;
		
	}
	 public LoanAppDto loanAppToLoanAppDto(LoanApp loanApp)
	    {
		 LoanAppDto loanAppDto= new LoanAppDto();

		 loanAppDto.setChooseEmployee(loanApp.getChooseEmployee());
	        
		 loanAppDto.setLoanType(loanApp.getLoanType());
	        
		 loanAppDto.setPostingDate(loanApp.getPostingDate());
	        
		 loanAppDto.setRequiredDate(loanApp.getRequiredDate());
	        
		 loanAppDto.setAmountRs(loanApp.getAmountRs());
	        
		 loanAppDto.setSelectApprover(loanApp.getSelectApprover());

		 loanAppDto.setLoanReason(loanApp.getLoanReason());

		 loanAppDto.setRePaymentMethod(loanApp.getRePaymentMethod());

		 loanAppDto.setRePaymentStartingDate(loanApp.getRePaymentStartingDate());

		 loanAppDto.setRepaymentComments(loanApp.getRepaymentComments());

	        return loanAppDto;
	    }	

}

