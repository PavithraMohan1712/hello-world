package com.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="compliance")
@Getter @Setter
public class Compliance implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "com_id")
	private int complianceId;
	
	@Column(name = "type")
	private String rlType;
	
	private String details;
	
	@Column(name ="date")
	private Date createDate;
	
	//joining Department and compliance using one to one association
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="departid")
	private Department department;
	
	@Column(name ="emp_count")
	private int empCount;
	
	@Column(name ="status_count")
	private int stsCount;
	private String status;
	//joining statusReport and compliance using one to one association
	@OneToOne(mappedBy="statusreport")
	private StatusReport statusReport;
	

}