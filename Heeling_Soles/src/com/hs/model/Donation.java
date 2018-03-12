package com.hs.model;

public class Donation {
	
	private int DON_ID ;
	private int CUST_ID ; 
	private int ITEM_ID ; 
	private int AMOUNT ;
	
	public int getDON_ID() {
		return DON_ID;
	}
	public void setDON_ID(int DON_ID) {
		this.DON_ID = DON_ID;
	}
	public int getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(int CUST_ID) {
		this.CUST_ID = CUST_ID;
	}
	public int getITEM_ID() {
		return ITEM_ID;
	}
	public void setITEM_ID(int iTEM_ID) {
		this.ITEM_ID = iTEM_ID;
	}
	public int getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(int aMOUNT) {
		this.AMOUNT = aMOUNT;
	}

}
