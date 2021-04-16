package org.ue.common.dataaccess.api;

import org.bukkit.Location;
import org.bukkit.entity.Villager.Profession;
import org.ue.townsystem.logic.TownSystemException;

public interface EconomyVillagerDao {

	/**
	 * Save the villager location.
	 * 
	 * @param location
	 */
	public void saveLocation(Location location);

	/**
	 * Saves the villager profession.
	 * 
	 * @param profession
	 */
	public void saveProfession(Profession profession);

	/**
	 * Saves the inventory size.
	 * 
	 * @param size
	 */
	public void saveSize(int size);

	/**
	 * Loads the villager profession.
	 * 
	 * @return profession
	 */
	public Profession loadProfession();

	/**
	 * Loads the villager location.
	 * 
	 * @return location
	 * @throws TownSystemException when the world doesn't exist
	 */
	public Location loadLocation() throws TownSystemException;

	/**
	 * Loads the inventory size.
	 * 
	 * @return shop size
	 */
	public int loadSize();
}
