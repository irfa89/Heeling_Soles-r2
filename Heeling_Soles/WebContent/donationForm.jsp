<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html><title>Donation</title>
<body style="{font-family:Segoe Print;text-align: center; }">
<center>
<s:form method="post" action="SaveDonation.action">
<s:textfield label="Donation Id" name="CUST_ID"/>
<s:textfield label="Customer Id" name="DON_ID"/>
<s:textfield label="Item Id" name="ITEM_ID"/>
<s:textfield label="Donation Amount" name="AMOUNT"/>

<s:submit label="Save"></s:submit>
</s:form>
</center>
</body></html>
