package com.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entities
@Table(name="department")
public class Department implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "departid")
    private int departId;
    
    @Column(name="departname")
    private String departName;
    
    @OneToOne(mappedBy="compliance")
    private Compliance compliance;
    
    @OneToOne(mappedBy="employee_master")
    private Employee employee;
    
    @OneToOne(mappedBy="statusreport")
    private StatusReport statusReport;
    
    public Compliance getCompliance() {
		return compliance;
	}

	public void setCompliance(Compliance compliance) {
		this.compliance = compliance;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public StatusReport getStatusReport() {
		return statusReport;
	}

	public void setStatusReport(StatusReport statusReport) {
		this.statusReport = statusReport;
	}

	public int getDepartId() {
        return departId;
    }
    
    public void setDepartId(int departId) {
        this.departId=departId;
    }
    
    public String getDepartName() {
        return departName;
    }
    
    public void setDepartName(String departName) {
        this.departName=departName;
    }
    
}
