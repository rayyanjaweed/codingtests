package com.rayyan.preparation.codingtests;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class DateCompare {
	
	/* A list of dates are provided in the pattern '17 MAY 2019'.
	 * Compare all the dates and print them in ascending order*/

	public static void main(String[] args) {

		ArrayList<String> unorderedDates = new ArrayList<String>();
		unorderedDates.add("17 MAY 2019");
		unorderedDates.add("18 NOV 1989");
		unorderedDates.add("22 FEB 1996");
		unorderedDates.add("27 APR 1987");
		unorderedDates.add("23 DEC 1997");
		
		DateCompare dc = new DateCompare();
		ArrayList<String> sortedDateList = dc.sortDates(unorderedDates);
		for(String d:sortedDateList) {
			System.out.println(d);
		}
		
		
	}
	
	public ArrayList<String> sortDates(ArrayList<String> unorderedDates){
	
		ArrayList<String> sortedDateList = new ArrayList<String>();
		HashMap<String, Integer> mapMonth = new HashMap<String, Integer>();
		mapMonth.put("JAN", 0);
		mapMonth.put("FEB", 1);
		mapMonth.put("MAR", 2);
		mapMonth.put("APR", 3);
		mapMonth.put("MAY", 4);
		mapMonth.put("JUN", 5);
		mapMonth.put("JUL", 6);
		mapMonth.put("AUG", 7);
		mapMonth.put("SEP", 8);
		mapMonth.put("OCT", 9);
		mapMonth.put("NOV", 10);
		mapMonth.put("DEC", 11);
		
		ArrayList<Date> dateList = new ArrayList<Date>();
		for(String stringDate: unorderedDates) {
			int year = Integer.parseInt(stringDate.substring(7, 11));
			String month = stringDate.substring(3,6);
			int date = Integer.parseInt(stringDate.substring(0,2));
			Date d = new Date(year-1900,mapMonth.get(month),date);
			dateList.add(d);
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM YYYY");
		Collections.sort(dateList);
		for(Date date:dateList) {
			String stringDate = sdf.format(date);
			sortedDateList.add(stringDate.toUpperCase());
		}
		
		return sortedDateList;
	}
	
	

	

	

	

	

	

	

	

	

	

	

	

	

	

	
	

}
