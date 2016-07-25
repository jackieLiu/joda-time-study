package com.lt.joda.ch1;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.chrono.GJChronology;

/**
 * 第一个练习
 */
public class DateTimeE1 {

	public static void showYear(){
		DateTime dateTime = new DateTime();
		System.out.println("DateTime year:"+dateTime.getYear());
		System.out.println("DateTime year of century:"+dateTime.getYearOfCentury());
		System.out.println("DateTime year of era:"+dateTime.getYearOfEra());
	}

	public static void property(){
		DateTime now = new DateTime();

		DateTime.Property p = now.year();//年份
		System.out.println(p.getAsText()+":"+p.isLeap());// 判断是否为闰年

		p = now.monthOfYear();
		System.out.println(p.setCopy(1).toString("yyyy-MM-dd HH:mm:ss"));

		p = now.dayOfMonth();
		System.out.println(p.setCopy(9).toString());

		p = now.dayOfWeek();
		System.out.println(p.setCopy(6).toString("yyyy-MM-dd"));
	}

	public static void chronologyAndZone(){
		DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
		Chronology chronology = GJChronology.getInstance(zone);
		DateTime dateTime = new DateTime(chronology);
		System.out.println(dateTime.toString("yyyy-MM-dd HH:mm:ss.sss"));
	}

	public static void date(){
		DateTime dateTime = new DateTime();
		LocalDate localDate = dateTime.toLocalDate();
		System.out.println(localDate.toString());

		localDate = new LocalDate(2015,7,20);
		System.out.println("Define str:"+localDate.toString());
	}
	
	public static void main(String[] args) {
//		DateTimeCh1.showYear();
//		DateTimeCh1.property();
//		DateTimeCh1.chronologyAndZone();
		date();
	}

}
