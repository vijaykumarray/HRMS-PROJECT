package com.ahom.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_application")
public class LoanApp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String chooseEmployee;
	private String loanType;
	private String postingDate;
	private String requiredDate;
	private double amountRs;
	private String selectApprover;
	private String loanReason;
	private String rePaymentMethod;
	private String rePaymentStartingDate;
	private String repaymentComments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChooseEmployee() {
		return chooseEmployee;
	}
	public void setChooseEmployee(String chooseEmployee) {
		this.chooseEmployee = chooseEmployee;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getPostingDate() {
		return postingDate;
	}
	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}
	public String getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}
	public double getAmountRs() {
		return amountRs;
	}
	public void setAmountRs(double amountRs) {
		this.amountRs = amountRs;
	}
	public String getSelectApprover() {
		return selectApprover;
	}
	public void setSelectApprover(String selectApprover) {
		this.selectApprover = selectApprover;
	}
	public String getLoanReason() {
		return loanReason;
	}
	public void setLoanReason(String loanReason) {
		this.loanReason = loanReason;
	}
	public String getRePaymentMethod() {
		return rePaymentMethod;
	}
	public void setRePaymentMethod(String rePaymentMethod) {
		this.rePaymentMethod = rePaymentMethod;
	}
	public String getRePaymentStartingDate() {
		return rePaymentStartingDate;
	}
	public void setRePaymentStartingDate(String rePaymentStartingDate) {
		this.rePaymentStartingDate = rePaymentStartingDate;
	}
	public String getRepaymentComments() {
		return repaymentComments;
	}
	public void setRepaymentComments(String repaymentComments) {
		this.repaymentComments = repaymentComments;
	}
	public LoanApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoanApp [id=" + id + ", chooseEmployee=" + chooseEmployee + ", loanType=" + loanType + ", postingDate="
				+ postingDate + ", requiredDate=" + requiredDate + ", amountRs=" + amountRs + ", selectApprover="
				+ selectApprover + ", loanReason=" + loanReason + ", rePaymentMethod=" + rePaymentMethod
				+ ", rePaymentStartingDate=" + rePaymentStartingDate + ", repaymentComments=" + repaymentComments + "]";
	}
	
	
	
}
