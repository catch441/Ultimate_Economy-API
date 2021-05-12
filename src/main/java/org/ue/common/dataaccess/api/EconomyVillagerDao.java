package org.ue.common.dataaccess.api;

import org.bukkit.Location;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.entity.Villager.Type;

public interface EconomyVillagerDao {

	/**
	 * Save the villager location.
	 * 
	 * @param prefix a prefix for the save path
	 * @param location
	 */
	public void saveLocation(String prefix, Location location);
	
	/**
	 * Saves the villager biome type.
	 * 
	 * @param prefix a prefix for the save path
	 * @param biomeType
	 */
	public void saveBiomeType(String prefix, Type biomeType);

	/**
	 * Saves the villager profession.
	 * 
	 * @param prefix a prefix for the save path
	 * @param profession
	 */
	public void saveProfession(String prefix, Profession profession);

	/**
	 * Saves the inventory size.
	 * 
	 * @param prefix a prefix for the save path
	 * @param size
	 */
	public void saveSize(String prefix, int size);

	/**
	 * Saves the is visible value.
	 * 
	 * @param prefix a prefix for the save path
	 * @param visible
	 */
	public void saveVisible(String prefix, boolean visible);

	/**
	 * Loads the is visible value.
	 * 
	 * @param prefix a prefix for the load path
	 * @return visible
	 */
	public boolean loadVisible(String prefix);

	/**
	 * Loads the villager profession.
	 * 
	 * @param prefix a prefix for the load path
	 * @return profession
	 */
	public Profession loadProfession(String prefix);
	
	/**
	 * Loads the villager biome type.
	 * 
	 * @param prefix a prefix for the load path
	 * @return biome type
	 */
	public Type loadBiomeType(String prefix);

	/**
	 * Loads the villager location. Returns null, if no location was saved.
	 * 
	 * @param prefix a prefix for the load path
	 * @return location
	 */
	public Location loadLocation(String prefix);

	/**
	 * Loads the inventory size.
	 * 
	 * @param prefix a prefix for the load path
	 * @return shop size
	 */
	public int loadSize(String prefix);
}
