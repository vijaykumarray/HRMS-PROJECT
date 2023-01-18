package com.ahom.hrms.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.Dto.LoanMasterDto;
import com.ahom.hrms.entity.LoanMaster;
import com.ahom.hrms.repository.LoanMasterRepository;
import com.ahom.hrms.service.LoanMasterService;

@Service
public class LoanMasterServiceImpl implements LoanMasterService{
	

	@Autowired
	LoanMasterRepository loanMasterRepository;

	//PostMapping
	@Override
	public void saveLoanMaster(LoanMasterDto loanMasterDto)
	{
		loanMasterRepository.save(loanMasterDtoTOLoanMaster(loanMasterDto));		
	}
	//GetMapping
	@Override
	public List<LoanMaster>getAllLoanMaster(){
		List<LoanMaster> ListLoanMaster=new ArrayList<LoanMaster>();
		loanMasterRepository.findAll().forEach(l1->ListLoanMaster.add(l1));
		return ListLoanMaster;
	}
	
	public LoanMaster loanMasterDtoTOLoanMaster(LoanMasterDto loanMasterDto)
	{
		LoanMaster loanMaster=new LoanMaster();
		
		loanMaster.setLoanId(loanMasterDto.getLoanId());
		
		loanMaster.setLoanName(loanMasterDto.getLoanName());
		
		loanMaster.setRateOfInterest(loanMasterDto.getRateOfInterest());
		
		loanMaster.setLoanType(loanMasterDto.getLoanType());
		
		loanMaster.setLoanCriteria(loanMasterDto.getLoanCriteria());
		
		loanMaster.setDescription(loanMasterDto.getDescription());
		return loanMaster;
		
	}
	 public LoanMasterDto loanMasterToLoanMasterDto(LoanMaster loanMaster)
	    {
		 LoanMasterDto loanMasterDto= new LoanMasterDto();

		 loanMasterDto.setLoanId(loanMaster.getLoanId());;

		 loanMasterDto.setLoanName(loanMaster.getLoanName());

		 loanMasterDto.setRateOfInterest(loanMaster.getRateOfInterest());

		 loanMasterDto.setLoanType(loanMaster.getLoanType());

		 loanMasterDto.setLoanCriteria(loanMaster.getLoanCriteria());
		 
		 loanMasterDto.setDescription(loanMaster.getDescription());

	        return loanMasterDto;
	    }

}
