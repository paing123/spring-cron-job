package com.moehtet.job;

import org.springframework.stereotype.Component;

@Component("printService")
public class PrintService {
	public void printMessage() {
		System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean....");
	}
}
