package com.ahom.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_master")
public class LoanMaster {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
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
public LoanMaster() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "LoanMaster [loanId=" + loanId + ", loanName=" + loanName + ", rateOfInterest=" + rateOfInterest
			+ ", loanType=" + loanType + ", loanCriteria=" + loanCriteria + ", description=" + description + "]";
}

}



