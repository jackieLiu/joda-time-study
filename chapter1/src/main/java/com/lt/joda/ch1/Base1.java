package com.lt.joda.ch1;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;

public class Base1 {

	public static boolean isAfterPayDay(DateTime dateTime){
		int month = dateTime.getMonthOfYear();
		return month==2?dateTime.getDayOfMonth()>26:dateTime.getDayOfMonth()>28;
	}
	
	/**
	 * 确定还有多少天到下一年
	 * @param fromDate
	 * @return
	 */
	public static Days daysToNewYear(LocalDate fromDate){
		LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
		return Days.daysBetween(fromDate, newYear);
	}
	
	
	
	public static void main(String[] args) {
//		System.out.println("The result of isAfterPayDay is "+Base1.isAfterPayDay(dateTime));

	}

}
