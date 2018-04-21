package com.jinglun.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;


public class InitListener implements ApplicationListener<ApplicationPreparedEvent> {
	protected Logger log = LoggerFactory.getLogger(InitListener.class); 
	
	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {
		log.info("启动监听器--------");
		ConfigurableApplicationContext applicationContext = event.getApplicationContext();
	}

}
