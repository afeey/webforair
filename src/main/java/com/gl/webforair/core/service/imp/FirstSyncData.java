package com.gl.webforair.core.service.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import com.gl.webforair.core.service.ISyncJob;

/**
 * Spring加载完毕，首次执行数据同步
 * @author afeey
 *
 */
@Service
public class FirstSyncData implements ApplicationListener<ContextRefreshedEvent>{

	private static final Logger log = LoggerFactory.getLogger(FirstSyncData.class);
	
	private boolean isStart = false;
	@Autowired
	private ISyncJob syncJob;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (!isStart) {
			log.info("应用加载完毕，执行数据同步...");
			
			isStart = true;
			syncJob.execute();
		}
	}
	
}
