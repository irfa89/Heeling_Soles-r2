package com.hs.actions;



import org.hibernate.Session;
import com.hs.database.HibernateUtilities;
import com.hs.model.Sign_Up;
import com.opensymphony.xwork2.ActionSupport;

public class SaveSignUp extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private int CUST_ID ;					
	private String FNAME; 					
	private String MNAME; 					
	private String LNAME; 					 
	private String DOB ; 						
	private String GENDER; 					 
	private String EMAIL_ID;				 
	private int CONTACT; 					
	private String ADDRS_L1; 				
	private String ADDRS_L2; 				 
	private String STATE; 					 
	private String CITY; 					 
	private String ZIPCODE; 				
	private String COUNTRY; 				
	private String IMAGE; 
	
	Sign_Up signup = new Sign_Up();
	
public String execute(){
		
	Session session = HibernateUtilities.getSessionFactory().openSession();
	session.beginTransaction();
		
			signup.setCUST_ID(CUST_ID);
			signup.setFNAME(FNAME);
			signup.setMNAME(MNAME);
			signup.setLNAME(LNAME);
			signup.setDOB(DOB);
			signup.setGENDER(GENDER);
			signup.setEMAIL_ID(EMAIL_ID);
			signup.setCONTACT(CONTACT);
			signup.setADDRS_L1(ADDRS_L1);
			signup.setADDRS_L2(ADDRS_L2);
			signup.setSTATE(STATE);
			signup.setCITY(CITY);
			signup.setZIPCODE(ZIPCODE);
			signup.setCOUNTRY(COUNTRY);
			signup.setIMAGE(IMAGE);
			
	session.save(signup);
			
	session.getTransaction().commit();
	session.close();
	HibernateUtilities.getSessionFactory().close();
			
	return SUCCESS;
			}

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
