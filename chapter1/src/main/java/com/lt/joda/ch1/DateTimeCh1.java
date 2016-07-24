package com.lt.joda.ch1;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;

public class DateTimeCh1 {
	
	public static String addDayOfNum(int num){
		DateTime dateTime = new DateTime();
		dateTime.plusHours(num);//增加指定小时
		return dateTime.plusDays(num).toString("yyyy-MM-dd HH:mm:ss");
	}

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
	
	public static Date plusDays(int num){
		DateTime dateTime = new DateTime();
		dateTime.plusDays(num);
		dateTime.dayOfWeek();
		return dateTime.plusDays(num).toDate();
	}
	
	
	
	public static void main(String[] args) {
//		System.out.println("The result of isAfterPayDay is "+Base1.isAfterPayDay(dateTime));
//		System.out.println(Base1.addDayOfNum(8));
//		System.out.println(Base1.plusDays(3).toString());
		DateTime dateTime = new DateTime(2016,7,22,16,44);
		System.out.println(dateTime.toString());
		System.out.println(dateTime.dayOfWeek().roundCeilingCopy());
		System.out.println(dateTime.dayOfWeek().roundFloorCopy());
		System.out.println(dateTime.year().isLeap());
		
	}

}
