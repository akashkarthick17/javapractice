package com.Zilker.sample;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HTMLtag {
	
	public static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 sc = new Scanner(System.in);
			Logger logger = Logger.getLogger(HTMLtag.class.getName());
			
			String htmlTag = sc.nextLine();
			
			String tmp = htmlTag.replaceAll("<[/]*([a-z]+)([a-z A-z 0-9 = - ]+)*>", " ");
//			String tmp = htmlTag.replaceAll("<.*?>", " ");
			
			logger.log(Level.INFO,tmp);

	}

}
