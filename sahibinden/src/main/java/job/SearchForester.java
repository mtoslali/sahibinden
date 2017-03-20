package job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import client.SahibindenManipulation;

public class SearchForester implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		
		System.out.println("Job has been triggerred");
		SahibindenManipulation.getForester();
		
	}

}
