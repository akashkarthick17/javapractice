package com.Zilker.sample;


import java.util.*;
import java.util.logging.*;

public class URLValidation {

	
	public static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 sc = new Scanner(System.in);
		Logger logger = Logger.getLogger(URLValidation.class.getName());
		
		String url = sc.next();
		
		if(url.matches("^([a-z A-Z]+://)?([a-zA-z.]+)?[a-zA-z0-9]+([.]([a-z]){2,5}){1,2}([/]+[a-zA-Z_0-9.]+)*")) {
			
			logger.log(Level.INFO,"Valid URL");
		}
		else {
			logger.log(Level.INFO,"InValid URL");
		}
		

	}

}
