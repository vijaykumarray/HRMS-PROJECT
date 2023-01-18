package com.ahom.hrms.Dto;

import javax.persistence.Id;

public class LeaveApprovalDto {
	
	@Id
	private int id; 
	private String requestBy;
	private String leaveType;
	private String startDate;
	private String endDate;
	private String noOfDays;
	private String reason;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRequestBy() {
		return requestBy;
	}
	public void setRequestBy(String requestBy) {
		this.requestBy = requestBy;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LeaveApprovalDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LeaveApproval [id=" + id + ", requestBy=" + requestBy + ", leaveType=" + leaveType + ", startDate="
				+ startDate + ", endDate=" + endDate + ", noOfDays=" + noOfDays + ", reason=" + reason + ", status="
				+ status + "]";
	}
	
	
}


