<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html><title>Sign up Form</title>

<body style="{font-family:Segoe Print;text-align: center; }">
<center>

<s:form method="post" action="SaveSignUp.action">

<s:textfield label="Customer Id" name="CUST_ID"/>
<s:textfield label="First Name" name="FNAME"/>
<s:textfield label="Middle Name" name="MNAME"/>
<s:textfield label="Last Name" name="LNAME"/>

<s:textfield label="DOB" name="DOB"/>
<s:textfield label="Gender" name="GENDER"/>
<s:textfield label="Email" name="EMAIL_ID"/>
<s:textfield label="Contact" name="CONTACT"/>

<s:textfield label="Address Line 1" name="ADDRS_L1"/>
<s:textfield label="Address Line 2" name="ADDRS_L2"/>
<s:textfield label="State" name="STATE"/>
<s:textfield label="City" name="CITY"/>
<s:textfield label="Zipcode" name="ZIPCODE"/>
<s:textfield label="Country" name="COUNTRY"/>
<s:textfield label="Image" name="IMAGE"/>

<s:submit label="Save"></s:submit>

</s:form>
</center>
</body>
</html>

