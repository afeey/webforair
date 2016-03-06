package com.gl.webforair.core.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gl.webforair.BaseTest;
import com.gl.webforair.core.po.RealHourAQI;

public class IRealHourAQIServiceTest extends BaseTest {

	@Autowired
	private IRealHourAQIService realHourAQIService;
	
	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testListAll() {
		List<RealHourAQI> list = realHourAQIService.listAll();
		assertTrue(list.size()>0);
	}

	@Test
	public void testSyncData() {
		fail("Not yet implemented");
	}

}
