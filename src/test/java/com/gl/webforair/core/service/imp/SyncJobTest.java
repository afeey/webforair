package com.gl.webforair.core.service.imp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gl.webforair.BaseTest;

public class SyncJobTest extends BaseTest {
	
	@Autowired
	private SyncJob syncJob;
	
	@Test
	public void testExecute() {
		syncJob.execute();
	}

	@Test
	public void testJsonToAQIDataList() {
		fail("Not yet implemented");
	}

}
