package main;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import job.SearchForester;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
		JobDetail job = JobBuilder.newJob(SearchForester.class)
				.withIdentity("dummyJobName", "group1").build();

	                //Quartz 1.6.3
			// SimpleTrigger trigger = new SimpleTrigger();
			// trigger.setStartTime(new Date(System.currentTimeMillis() + 1000));
			// trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
			// trigger.setRepeatInterval(30000);

			// Trigger the job to run on the next round minute
			Trigger trigger = TriggerBuilder
				.newTrigger()
				.withIdentity("dummyTriggerName", "group1")
				.withSchedule(
					SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(1500).repeatForever())
				.build();

			// schedule it
			Scheduler scheduler;
			try {
				scheduler = new StdSchedulerFactory().getScheduler();
				scheduler.start();
				scheduler.scheduleJob(job, trigger);
			} catch (SchedulerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	
}