package com.gl.webforair.core.service.imp;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gl.webforair.BaseTest;

public class SyncJobTest extends BaseTest {
	
	@Autowired
	private SyncJobImpl syncJob;
	
	@Test
	public void testExecute() {
		syncJob.execute();
	}

}
