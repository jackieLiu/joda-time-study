package com.lt.joda.ch1.util;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by jackieliu on 16/7/25.
 */
public class DateUtil {
    private static DateUtil dateUtil = new DateUtil();

    public static DateUtil genDateUtil(){
        return dateUtil;
    }

    /**
     * 获取从指定时间开始,num的时间
     *
     * @param start
     * @param num
     * @return
     */
    public Date genDays(Date start,int num){
        DateTime endTime = new DateTime(start).plusDays(num);
        return endTime.toDate();
    }

    public Date genQuarte(Date start,int num){
        DateTime startTime = new DateTime(start);
        int month = startTime.getMonthOfYear();
        DateTime endTime;
        int nowEnd = 3;
        if (month <=6){
            nowEnd = 6;
        }else if(month <=9)
            nowEnd = 9;
        else if(month <=12)
            nowEnd = 12;
        return startTime.monthOfYear().setCopy(nowEnd).plusMonths(3*num).toDate();
    }
}
