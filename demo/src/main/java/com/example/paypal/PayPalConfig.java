package com.example.paypal;

import javax.servlet.http.HttpServletRequest;

public class PayPalConfig {
	private String authToken;
	private String posturl;
	private String business;
	private String returnurl;
	private String cancelurl;
	private String cmd;
	
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getPosturl() {
		return posturl;
	}
	public void setPosturl(String posturl) {
		this.posturl = posturl;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getReturnurl() {
		return returnurl;
	}
	public void setReturnurl(String returnurl) {
		this.returnurl = returnurl;
	}
	public String getCancelurl() {
		return cancelurl;
	}
	public void setCancelurl(String cancelurl) {
		this.cancelurl = cancelurl;
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public PayPalConfig getConfig(HttpServletRequest request) {
		PayPalConfig pc = new PayPalConfig();
		pc.authToken = "AdUdj9SPceNAk4ziSwIqOpFBjathh4NlV8GtsgVPsqKFzzuNnhwtoF1UUK6LRfVZ-4EDKVzF5Q7mUjvb";
		pc.posturl = "http://www.sandbox.paypal.com/cgi-bin/webscr";
		pc.business = "vikassingh.vp-facilitator@gmail.com";
		pc.returnurl = "http://localhost:8080/SpringMVCHibernateCRUD/dashboard";
		
		/*try{
		pc.authToken = request.getServletContext().getInitParameter("authtoken");
		pc.posturl = request.getServletContext().getInitParameter("posturl");
		pc.business = request.getServletContext().getInitParameter("buisiness");
		pc.returnurl = request.getServletContext().getInitParameter("returnurl");
		}
		catch(Exception e)
		{
			pc=null;
		}*/
		return pc;
	}
}
