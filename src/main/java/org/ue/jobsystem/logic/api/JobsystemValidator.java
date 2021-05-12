package org.ue.jobsystem.logic.api;

import java.util.List;

import org.ue.economyvillager.logic.api.EconomyVillagerValidator;

public interface JobsystemValidator extends EconomyVillagerValidator<JobsystemException> {

	/**
	 * Check for the job does not exists in the jobcenter.
	 * 
	 * @param jobList
	 * @param job
	 * @throws JobsystemException
	 */
	public void checkForJobDoesNotExistInJobcenter(List<Job> jobList, Job job) throws JobsystemException;

	/**
	 * Check for the job exixts in the jobcenter.
	 * 
	 * @param jobList
	 * @param job
	 * @throws JobsystemException
	 */
	public void checkForJobExistsInJobcenter(List<Job> jobList, Job job) throws JobsystemException;
}
