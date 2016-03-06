package com.gl.webforair.core.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gl.webforair.BaseTest;
import com.gl.webforair.core.po.HourAQI;

public class IHourAQIServiceTest extends BaseTest{

	@Autowired
	private IHourAQIService hourAQIService;
	
	@Test
	public void testAdd() {
		
		List<HourAQI> list = new ArrayList<HourAQI>();
		
		for(int i=0;i<10;i++){
			HourAQI hourAQI = new HourAQI();
			hourAQI.setPortname("test"+i);
			list.add(hourAQI);
		}
		
		hourAQIService.add(list);
		
		list = hourAQIService.listAll();
		assertTrue(list.size() > 0);
	}

	@Test
	public void testDeleteAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testListAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSyncData() {
		fail("Not yet implemented");
	}

}
