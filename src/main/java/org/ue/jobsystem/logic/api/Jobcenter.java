package org.ue.jobsystem.logic.api;

import java.util.List;

import org.bukkit.Location;
import org.ue.economyvillager.logic.api.EconomyVillager;

public interface Jobcenter extends EconomyVillager<JobsystemException> {

	/**
	 * Setup a new jobcenter.
	 * 
	 * @param name
	 * @param spawnLocation
	 * @param size
	 */
	public void setupNew(String name, Location spawnLocation, int size);

	/**
	 * Setup an existing shop.
	 * 
	 * @param name
	 */
	public void setupExisting(String name);

	/**
	 * This method adds a job to this jobcenter.
	 * 
	 * @param job
	 * @param itemMaterial
	 * @param slot
	 * @throws JobsystemException 
	 */
	public void addJob(Job job, String itemMaterial, int slot) throws JobsystemException;

	/**
	 * This method removes a job from this jobcenter.
	 * 
	 * @param job
	 * @throws JobsystemException 
	 */
	public void removeJob(Job job) throws JobsystemException;

	/**
	 * This method returns the name of this jobcenter.
	 * 
	 * @return String
	 */
	public String getName();

	/**
	 * This method returns a list of all jobs in this jobcenter.
	 * 
	 * @return List of jobs
	 */
	public List<Job> getJobList();

	/**
	 * This method returns true if this jobcenter contains this job.
	 * 
	 * @param job
	 * @return boolean
	 */
	public boolean hasJob(Job job);

	/**
	 * Deletes savefile and despawns villager.
	 */
	public void deleteJobcenter();
}
