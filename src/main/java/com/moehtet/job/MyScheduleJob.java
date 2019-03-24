package com.moehtet.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import com.moehtet.job.*;

public class MyScheduleJob extends QuartzJobBean{
	private PrintService printService;
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		printService.printMessage();
	}
	public void setPrintService(PrintService printService) {
		this.printService = printService;
	}
	
}
