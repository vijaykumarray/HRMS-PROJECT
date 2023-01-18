package com.ahom.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="attendance_details")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	public EmployeeDetails() {
		super();
		
	}
	@Override
	public String toString() {
		return "EmployeeDetailsDto [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", selectEmployee="
				+ selectEmployee + "]";
	}
	
	
}
