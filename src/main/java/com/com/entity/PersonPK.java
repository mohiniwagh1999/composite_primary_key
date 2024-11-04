package com.com.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPK {
	private Integer personId;
	private Integer passportNum;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public Integer getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(Integer passportNum) {
		this.passportNum = passportNum;
	}
	@Override
	public String toString() {
		return "PersonPK [personId=" + personId + ", passportNum=" + passportNum + "]";
	}
	
	
	
	

}
