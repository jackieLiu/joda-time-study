package com.lt.joda.ch1;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.Period;

/**
 * 第三个练习
 * Created by jackieliu on 16/7/24.
 */
public class DateTimeE3 {

    public void showNow(){
        LocalDate localDate = new LocalDate();
        System.out.println(localDate.toString());

        localDate.getYear();
        localDate.getMonthOfYear();
        localDate.getDayOfMonth();
        System.out.println(localDate.withDayOfWeek(2).toString());
    }

    public void com(){
        LocalDate now = new LocalDate();
        LocalDate then = new LocalDate(2016,9,10);
        System.out.println(now.equals(then));
        System.out.println(now.isBefore(then));
        System.out.println(now.isAfter(then));
    }

    public void change(){
        LocalDate date = new LocalDate();
        System.out.println(date.toString());
        //添加
        System.out.println(date.plusDays(2).toString());
        //减少
        System.out.println(date.minusMonths(1).toString());
        //设置
        System.out.println(date.withYear(2015));
        System.out.println(date.toDate().toString());
    }

    public void check(){
        MonthDay monthDay = new MonthDay(7,24);
        LocalDate localDate = new LocalDate();
        System.out.println(monthDay.isEqual(new MonthDay(localDate)));
    }

    public void periodTest(){

        Period period = new Period(2016,7,10,0);

        System.out.println(period.getDays());
        System.out.println(period.getHours());
        System.out.println(period.getMonths());

        DateTime df= new DateTime(2016,9,10,12,20);
        DateTime start = df.plus(Period.days(2));
        System.out.println(start.toString());
    }

    public void getDateTime(){
        //上个月的最后一天
        LocalDate localDate = new LocalDate();
        LocalDate changeDate = localDate.minusMonths(1)//上个月
                .dayOfMonth().withMaximumValue();//最后一天
        System.out.println(changeDate.toString());

        //获取6月份的第一个周一
        changeDate = localDate.monthOfYear().setCopy(6)//设置11月份
                .dayOfMonth().withMinimumValue()//月份的第一天
                .plusDays(6)//加6天
                .dayOfWeek().setCopy(1);//设置为周一
        System.out.println(changeDate.toString("yyyy-MM-dd"));
    }

    public void changeTest2(){
        DateTime dateTime = DateTime.now();
        DateTime toDateTime = dateTime.plusYears(1)
            .monthOfYear().setCopy(2)
                .dayOfMonth().withMaximumValue();
        System.out.println(toDateTime.toString());
    }

    public static void main(String[] args){
        DateTimeE3 dte3 = new DateTimeE3();
//        dte3.showNow();
//        dte3.com();
//        dte3.change();
//        dte3.check();
        dte3.periodTest();
//        dte3.getDateTime();
//        dte3.changeTest2();
    }
}
