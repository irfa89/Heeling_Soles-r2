package com.hs.actions;

import org.hibernate.Session;

import com.hs.database.*;
import com.hs.model.Donation;
import com.opensymphony.xwork2.ActionSupport;

public class saveDonation extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private int DON_ID ;
	private int CUST_ID ; 
	private int ITEM_ID ; 
	private int AMOUNT ;
	
	Donation donation = new Donation();
	
public String execute(){
		
	Session session = HibernateUtilities.getSessionFactory().openSession();
	session.beginTransaction();
	
		donation.setDON_ID(DON_ID);
		donation.setCUST_ID(CUST_ID);
		donation.setITEM_ID(ITEM_ID);
		donation.setAMOUNT(AMOUNT);
		
		session.save(donation);
		
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getSessionFactory().close();
		
		return SUCCESS;
		}

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
public void setITEM_ID(int ITEM_ID) {
	this.ITEM_ID = ITEM_ID;
}
public int getAMOUNT() {
	return AMOUNT;
}
public void setAMOUNT(int AMOUNT) {
	this.AMOUNT = AMOUNT;
}

}
