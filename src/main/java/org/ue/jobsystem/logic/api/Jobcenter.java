package org.ue.jobsystem.logic.api;

import java.util.List;

import org.bukkit.Location;
import org.ue.common.logic.api.EconomyVillager;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.general.GeneralEconomyException;
import org.ue.jobsystem.logic.JobSystemException;
import org.ue.townsystem.logic.TownSystemException;

public interface Jobcenter extends EconomyVillager {

	/**
	 * Setup a new jobcenter.
	 * 
	 * @param name
	 * @param spawnLocation
	 * @param size
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 */
	public void setupNew(String name, Location spawnLocation, int size) throws GeneralEconomyException, EconomyPlayerException;

	/**
	 * Setup an existing shop.
	 * 
	 * @param name
	 * @throws TownSystemException     if the world of the spawnlocation does not
	 *                                 exist
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 */
	public void setupExisting(String name) throws TownSystemException, GeneralEconomyException, EconomyPlayerException;

	/**
	 * This method adds a job to this jobcenter.
	 * 
	 * @param job
	 * @param itemMaterial
	 * @param slot
	 * @throws JobSystemException
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 */
	public void addJob(Job job, String itemMaterial, int slot)
			throws JobSystemException, EconomyPlayerException, GeneralEconomyException;

	/**
	 * This method removes a job from this jobcenter.
	 * 
	 * @param job
	 * @throws JobSystemException
	 */
	public void removeJob(Job job) throws JobSystemException;

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
