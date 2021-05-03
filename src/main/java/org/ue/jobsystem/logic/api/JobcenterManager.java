package org.ue.jobsystem.logic.api;

import java.util.List;

import org.bukkit.Location;

public interface JobcenterManager {

	/**
	 * This method returns a jobcenter by it's name.
	 * 
	 * @param name
	 * @return JobCenter
	 * @throws JobsystemException 
	 */
	public Jobcenter getJobcenterByName(String name) throws JobsystemException;
	
	/**
	 * This method returns a namelist of all jobcenters.
	 * 
	 * @return List of Strings
	 */
	public List<String> getJobcenterNameList();
	
	/**
	 * This method returns a list of all existing jobcenters.
	 * 
	 * @return List of JobCenters
	 */
	public List<Jobcenter> getJobcenterList();
	
	/**
	 * This method should me used to delete a jobcenter.
	 * 
	 * @param jobcenter
	 * @throws JobsystemException 
	 */
	public void deleteJobcenter(Jobcenter jobcenter) throws JobsystemException;
	
	/**
	 * This method should be used to create a new jobcenter.
	 * 
	 * @param name
	 * @param spawnLocation
	 * @param size
	 * @throws JobsystemException 
	 */
	public void createJobcenter(String name, Location spawnLocation, int size) throws JobsystemException;
	
	/**
	 * This method loads all jobcenters from the save files. !!!
	 * JobController.loadAllJobs() have to be executed before this method. !!!
	 */
	public void loadAllJobcenters();
	
	/**
	 * This method despawns all jobcenter villager.
	 */
	public void despawnAllVillagers();
}
