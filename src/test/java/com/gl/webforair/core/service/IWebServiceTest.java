package com.gl.webforair.core.service;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gl.webforair.BaseTest;

public class IWebServiceTest extends BaseTest {

	@Autowired
	private IWebService webService;

	@Test
	public void testGetHourAQI() {
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date start = sdf.parse(sdf.format(new Date()));
			Date end = sdf.parse(sdf.format(new Date()));

			String json = webService.getHourAQI(4, start, end);
			System.out.println(json);

			assertTrue(json.length()>0);	
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetRealHourAQI() {

		try {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			// 获取结束日期
			Date end = sdf.parse(sdf.format(new Date()));
			// 计算起始日期
			Calendar cal = Calendar.getInstance();
			cal.setTime(end);
			cal.add(Calendar.DAY_OF_MONTH, -1);
			Date start = sdf.parse(sdf.format(cal.getTime()));

			String json = webService.getRealHourAQI(4, start, end);
			System.out.println(json);
			assertTrue(json.length()>0);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
