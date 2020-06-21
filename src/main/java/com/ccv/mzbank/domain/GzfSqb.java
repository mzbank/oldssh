package com.ccv.mzbank.domain;

import java.util.Date;

public class GzfSqb {
	private String businessId;
	
	private String username;

	private Date startDate;

	private String IDcardNum;
	
	private String tel;
	
	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getIDcardNum() {
		return IDcardNum;
	}

	public void setIDcardNum(String iDcardNum) {
		IDcardNum = iDcardNum;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "GzfSqb [businessId=" + businessId 
				+ ", username=" + username 
				+ ", startDate=" + startDate
				+ ", IDcardNum=" + IDcardNum 
				+ ", tel=" + tel 
				+ ", address=" + address + "]";
	}
}
