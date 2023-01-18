package com.ahom.hrms.Dto;

import javax.persistence.Id;
public class LoanMasterDto {
	
@Id
private int  loanId;
private String loanName; 
private String rateOfInterest; 
private String loanType; 
private String loanCriteria;
private String description;
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getLoanName() {
	return loanName;
}
public void setLoanName(String loanName) {
	this.loanName = loanName;
}

public String getRateOfInterest() {
	return rateOfInterest;
}
public void setRateOfInterest(String rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
}
public String getLoanType() {
	return loanType;
}
public void setLoanType(String loanType) {
	this.loanType = loanType;
}
public String getLoanCriteria() {
	return loanCriteria;
}
public void setLoanCriteria(String loanCriteria) {
	this.loanCriteria = loanCriteria;
}

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LoanMasterDto() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "LoanMaster [loanId=" + loanId + ", loanName=" + loanName + ", rateOfInterest=" + rateOfInterest
			+ ", loanType=" + loanType + ", loanCriteria=" + loanCriteria + ", description=" + description + "]";
}

}



