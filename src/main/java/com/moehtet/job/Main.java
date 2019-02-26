package com.moehtet.job;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
	}
}
