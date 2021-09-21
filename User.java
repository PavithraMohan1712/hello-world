package com.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="useremployee_master")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name="password", nullable=false)
	private String password;
	
	private String role;
	
	private int result;
	
	@OneToOne(mappedBy = "employee_master", cascade = CascadeType.ALL)
	private Employee employee;
	
	@OneToOne(mappedBy="statusreport")
	private StatusReport statusReport;
	
	public StatusReport getStatusReport() {
		return statusReport;
	}

	public void setStatusReport(StatusReport statusReport) {
		this.statusReport = statusReport;
	}

	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
		
	public String getPassword() {
		return password;
	}
		
	public void setPassword(String password) {
		this.password = password;
	}
		
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
