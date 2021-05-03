package org.ue.jobsystem.logic.api;

import java.util.Map;

import org.bukkit.entity.EntityType;

public interface Job {

	/**
	 * Returns the breedable entity list of the job.
	 * 
	 * @return breedableList
	 */
	public Map<String, Double> getBreedableList();

	/**
	 * Returns the price for breeding this entity.
	 * 
	 * @param breedable
	 * @return price
	 * @throws JobsystemException
	 */
	public double getBreedPrice(EntityType breedable) throws JobsystemException;

	/**
	 * Removes a breedable entity from the job.
	 * 
	 * @param breedable
	 * @throws JobsystemException
	 */
	public void deleteBreedable(EntityType breedable) throws JobsystemException;

	/**
	 * Adds a breedable entity to the job.
	 * 
	 * @param breedable
	 * @param price
	 * @throws JobsystemException
	 */
	public void addBreedable(EntityType breedable, double price) throws JobsystemException;

	/**
	 * This method removes a mob from a job.
	 * 
	 * @param entity
	 * @throws JobsystemException
	 */
	public void deleteMob(String entity) throws JobsystemException;

	/**
	 * This method removes a block from a job.
	 * 
	 * @param material
	 * @throws JobsystemException
	 */
	public void deleteBlock(String material) throws JobsystemException;

	/**
	 * This method removes a loottype from this job. The loottype is for a
	 * fisherJob. It should be "treasure", "junk" or "fish".
	 * 
	 * @param lootType
	 * @throws JobsystemException
	 */
	public void removeFisherLootType(String lootType) throws JobsystemException;

	/**
	 * This method adds a loottype with a price to this job. The loottype is for a
	 * fisherJob. It should be "treasure", "junk" or "fish".
	 * 
	 * @param lootType
	 * @param price
	 * @throws JobsystemException
	 */
	public void addFisherLootType(String lootType, double price) throws JobsystemException;

	/**
	 * This method adds a mob to a job.
	 * 
	 * @param entity
	 * @param price
	 * @throws JobsystemException
	 */
	public void addMob(String entity, double price) throws JobsystemException;

	/**
	 * This method adds a block to a job.
	 * 
	 * @param material
	 * @param price
	 * @throws JobsystemException
	 */
	public void addBlock(String material, double price) throws JobsystemException;

	/**
	 * This method deletes the job saveFile.
	 */
	public void deleteJob();

	/**
	 * This method returns the name of this job.
	 * 
	 * @return String
	 */
	public String getName();

	/**
	 * This method returns the price of a block in this job.
	 * 
	 * @param material
	 * @return double
	 * @throws JobsystemException
	 */
	public double getBlockPrice(String material) throws JobsystemException;

	/**
	 * This method returns the price of a fisher lootType.
	 * 
	 * @param lootType
	 * @return double
	 * @throws JobsystemException
	 */
	public double getFisherPrice(String lootType) throws JobsystemException;

	/**
	 * This method returns the price for killing a entity.
	 * 
	 * @param entityName
	 * @return double
	 * @throws JobsystemException
	 */
	public double getKillPrice(String entityName) throws JobsystemException;

	/**
	 * This method returns the fisherList.
	 * 
	 * @return List of Strings
	 */
	public Map<String, Double> getFisherList();

	/**
	 * This method returns the entityList.
	 * 
	 * @return List of Strings
	 */
	public Map<String, Double> getEntityList();

	/**
	 * This method returns the block list.
	 * 
	 * @return List of Strings
	 */
	public Map<String, Double> getBlockList();

}
