package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_id;
	@Column(name="cust_name")
	private String custName;
	@Column(name="app_id")
	private String appId;
	@Column(name="completed_time")
	private String completedTime;
	@Column(name="city")
	private String city;
	@Column(name="loan_product")
	private String loanProduct;
	@Column(name="beaure_score")
	private long beaureScore;

	public Customer(){
		
	}

	public Customer(int cust_id, String custName, String appId, String completedTime, String city, String loanProduct,
			long beaureScore) {
		super();
		this.cust_id = cust_id;
		this.custName = custName;
		this.appId = appId;
		this.completedTime = completedTime;
		this.city = city;
		this.loanProduct = loanProduct;
		this.beaureScore = beaureScore;
	}

	public int getCust_id() {
		return cust_id;
	} 

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCust_Name(String custName) {
		this.custName = custName;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getCompletedTime() {
		return completedTime;
	}

	public void setCompletedTime(String completedTime) {
		this.completedTime = completedTime;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLoanProduct() {
		return loanProduct;
	}

	public void setLoanProduct(String loanProduct) {
		this.loanProduct = loanProduct;
	}

	public long getBeaureScore() {
		return beaureScore;
	}

	public void setBeaureScore(long beaureScore) {
		this.beaureScore = beaureScore;
	}


	
}
