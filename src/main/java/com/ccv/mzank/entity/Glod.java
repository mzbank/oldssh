package com.ccv.mzank.entity;

import java.util.Date;

public class Glod {

	private String glodId;
	
	private String anotherName;
	
	private float weight;
	
	private String color;
	
	private Date findTime;
	
	private float glodPrice;
	
	public String getAnotherName() {
		return anotherName;
	}

	public void setAnotherName(String anotherName) {
		this.anotherName = anotherName;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getFindTime() {
		return findTime;
	}

	public void setFindTime(Date findTime) {
		this.findTime = findTime;
	}

	public float getGlodPrice() {
		return glodPrice;
	}

	public void setGlodPrice(float glodPrice) {
		this.glodPrice = glodPrice;
	}

	public String getGlodId() {
		return glodId;
	}

	public void setGlodId(String glodId) {
		this.glodId = glodId;
	}

	
}
