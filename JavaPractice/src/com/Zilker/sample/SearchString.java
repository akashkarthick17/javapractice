package com.Zilker.sample;

import java.util.*;
import java.util.logging.*;

public class SearchString {

	public static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = Logger.getLogger(SearchString.class.getName());
		
		   sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        String[] array = new String[n];
	        
	        for(int i =0;i<n;i++){
	            
	            array[i]=sc.next();
	            
	        }
	        
	        String find = sc.next();
	        int flag=0;
	        
	        for(int i=0;i<n;i++){
	            
	            String temp = array[i];
	            if(temp.equals(find)){
	                flag=1;
	            }
	        }
	        
	        
	       if(flag==1){
	          
	           logger.log(Level.INFO,"True");
	       }
	       else{
	    	   logger.log(Level.INFO,"False");
	       }
	        
	        

	}

}
