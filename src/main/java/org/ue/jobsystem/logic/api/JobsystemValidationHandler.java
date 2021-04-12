package org.ue.jobsystem.logic.api;

import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.Inventory;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.general.GeneralEconomyException;
import org.ue.jobsystem.logic.JobSystemException;

public interface JobsystemValidationHandler {

	/**
	 * Checks for a valid breedable entity.
	 * 
	 * @param breedable
	 * @throws GeneralEconomyException
	 */
	public void checkForValidBreedableEntity(EntityType breedable) throws GeneralEconomyException;

	/**
	 * Check for a valid material name.
	 * 
	 * @param material
	 * @throws GeneralEconomyException
	 */
	public void checkForValidMaterial(String material) throws GeneralEconomyException;

	/**
	 * Check for a valid entity name.
	 * 
	 * @param entityName
	 * @throws GeneralEconomyException
	 */
	public void checkForValidEntityType(String entityName) throws GeneralEconomyException;

	/**
	 * Check for a valid fisher loot type.
	 * 
	 * @param lootType
	 * @throws GeneralEconomyException
	 */
	public void checkForValidFisherLootType(String lootType) throws GeneralEconomyException;

	/**
	 * Check for slot is free.
	 * 
	 * @param inventory
	 * @param slot
	 * @throws EconomyPlayerException
	 */
	public void checkForFreeSlot(Inventory inventory, int slot) throws EconomyPlayerException;

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
