package com.ahom.hrms.Dto;

import javax.persistence.Id;

public class EmployeeDetailsDto {
	

	@Id
	private int id; 
	private String fromDate;
	private String toDate;
	private String selectEmployee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getSelectEmployee() {
		return selectEmployee;
	}
	public void setSelectEmployee(String selectEmployee) {
		this.selectEmployee = selectEmployee;
	}
	public EmployeeDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDetailsDto [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", selectEmployee="
				+ selectEmployee + "]";
	}
	
	
}

