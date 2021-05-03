package org.ue.jobsystem.logic.api;

import java.util.List;

public interface JobManager {

	/**
	 * Returns a list of all available jobs.
	 * 
	 * @return list of jobs
	 */
	public List<Job> getJobList();
	
	/**
	 * Returns a string list of all job names.
	 * 
	 * @return list of job names
	 */
	public List<String> getJobNameList();
	
	/**
	 * This method returns a job by it's name.
	 * 
	 * @param jobName
	 * @return Job
	 * @throws JobsystemException 
	 */
	public Job getJobByName(String jobName) throws JobsystemException;
	
	/**
	 * This method deletes a job.
	 * 
	 * @param job
	 */
	public void deleteJob(Job job);
	
	/**
	 * This method should be used to create a new Job.
	 * 
	 * @param jobName
	 * @throws JobsystemException 
	 */
	public void createJob(String jobName) throws JobsystemException;
	
	/**
	 * This method loads all Jobs from the save files.
	 * 
	 */
	public void loadAllJobs();

	/**
	 * Removes a job from all joined players.
	 * @param job
	 */
	public void removeJobFromAllPlayers(Job job);
}
