package com.hs.model;

import java.util.Date;

public class Sign_Up {

	private int CUST_ID ;					// int(11) PK 
	private String FNAME; 					//varchar(50) 
	private String MNAME; 					//varchar(50) 
	private String LNAME; 					//varchar(50) 
	private String DOB; 						//date 
	private String GENDER; 					//varchar(1) 
	private String EMAIL_ID;				//varchar(50) 
	private int CONTACT; 					//int(11) 
	private String ADDRS_L1; 				//varchar(45) 
	private String ADDRS_L2; 				//varchar(45) 
	private String STATE; 					//varchar(45) 
	private String CITY; 					//varchar(45) 
	private String ZIPCODE; 				//int(11) 
	private String COUNTRY; 				//varchar(45) 
	private String IMAGE; 					//varchar(45)
	
	public int getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(int CUST_ID) {
		this.CUST_ID = CUST_ID;
	}
	public String getFNAME() {
		return FNAME;
	}
	public void setFNAME(String FNAME) {
		this.FNAME = FNAME;
	}
	public String getMNAME() {
		return MNAME;
	}
	public void setMNAME(String MNAME) {
		this.MNAME = MNAME;
	}
	public String getLNAME() {
		return LNAME;
	}
	public void setLNAME(String LNAME) {
		this.LNAME = LNAME;
	}
	
	
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String GENDER) {
		this.GENDER = GENDER;
	}
	public String getEMAIL_ID() {
		return EMAIL_ID;
	}
	public void setEMAIL_ID(String EMAIL_ID) {
		this.EMAIL_ID = EMAIL_ID;
	}
	public int getCONTACT() {
		return CONTACT;
	}
	public void setCONTACT(int CONTACT) {
		this.CONTACT = CONTACT;
	}
	public String getADDRS_L1() {
		return ADDRS_L1;
	}
	public void setADDRS_L1(String ADDRS_L1) {
		this.ADDRS_L1 = ADDRS_L1;
	}
	public String getADDRS_L2() {
		return ADDRS_L2;
	}
	public void setADDRS_L2(String ADDRS_L2) {
		this.ADDRS_L2 = ADDRS_L2;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String STATE) {
		this.STATE = STATE;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String CITY) {
		this.CITY = CITY;
	}
	public String getZIPCODE() {
		return ZIPCODE;
	}
	public void setZIPCODE(String ZIPCODE) {
		this.ZIPCODE = ZIPCODE;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String COUNTRY) {
		this.COUNTRY = COUNTRY;
	}
	public String getIMAGE() {
		return IMAGE;
	}
	public void setIMAGE(String IMAGE) {
		this.IMAGE = IMAGE;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
}
