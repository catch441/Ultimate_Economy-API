package org.ue.jobsystem.logic.api;

import java.util.List;

import org.ue.common.logic.api.EconomyVillagerValidationHandler;
import org.ue.general.GeneralEconomyException;
import org.ue.jobsystem.logic.JobSystemException;

public interface JobsystemValidationHandler extends EconomyVillagerValidationHandler {

	/**
	 * Check for a valid fisher loot type.
	 * 
	 * @param lootType
	 * @throws GeneralEconomyException
	 */
	public void checkForValidFisherLootType(String lootType) throws GeneralEconomyException;

	/**
	 * Check for the job does not exists in the jobcenter.
	 * 
	 * @param jobList
	 * @param job
	 * @throws JobSystemException
	 */
	public void checkForJobDoesNotExistInJobcenter(List<Job> jobList, Job job) throws JobSystemException;

	/**
	 * Check for the job exixts in the jobcenter.
	 * 
	 * @param jobList
	 * @param job
	 * @throws JobSystemException
	 */
	public void checkForJobExistsInJobcenter(List<Job> jobList, Job job) throws JobSystemException;
}
