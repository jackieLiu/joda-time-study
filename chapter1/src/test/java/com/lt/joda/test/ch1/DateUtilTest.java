package com.lt.joda.test.ch1;

import com.lt.joda.ch1.util.DateUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.util.resources.CalendarData;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jackieliu on 16/7/25.
 */
public class DateUtilTest {

    private DateUtil dateUtil;

    @Before
    public void init(){
        this.dateUtil = DateUtil.genDateUtil();
    }

    @Test
    public void genDays(){
        Calendar start = Calendar.getInstance();
        int day = start.get(Calendar.DAY_OF_YEAR);
        Date now = dateUtil.genDays(start.getTime(),3);
        start.setTime(now);
        Assert.assertEquals(day+3,start.get(Calendar.DAY_OF_YEAR));
    }

    @Test
    public void genQuarteTest(){
        Calendar start = Calendar.getInstance();
        int month = start.get(Calendar.MONTH)+1;
        if (month <=3)
            month = 3;
        else if(month <= 6)
            month = 6;
        else if(month <= 9)
            month = 9;
        else if(month <= 12)
            month = 12;
        Date now = dateUtil.genQuarte(start.getTime(),2);//两个季度
        start.setTime(now);
        Assert.assertEquals((month+2*3)%12,start.get(Calendar.MONTH)+1);
    }
}
