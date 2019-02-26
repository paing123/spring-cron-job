package com.moehtet.job;

import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {
	public void sayHello() {
		System.out.println("I am called by MethodInvokingJobFactoryBean");
	}
}
