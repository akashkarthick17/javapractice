package com.Zilker.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateOfBirth {

	public static Scanner sc;
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

        sc = new Scanner(System.in);
		
		String dateString1 = sc.next();
//		String dateString2 = sc.next();
		
		SimpleDateFormat  format = new SimpleDateFormat("dd-MMM-yyyy");
		Date date1 = format.parse(dateString1);
//		Date date2 = format.parse(dateString2);
		
		SimpleDateFormat format1 = new SimpleDateFormat("EEEE");
		
		
		System.out.println(format1.format(date1));
//		System.out.println(format1.format(date2));
	}

}
