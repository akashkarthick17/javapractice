package com.Zilker.sample;

import java.text.*;
import java.util.*;
import java.util.logging.*;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = Logger.getLogger(DateFormat.class.getName());

		Date date = new Date();

		try {
			
			SimpleDateFormat format = new SimpleDateFormat("E yyyy.M.dd 'at' H:m:s a z");
			format.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));

			logger.log(Level.INFO, format.format(date));

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
