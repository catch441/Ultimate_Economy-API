package org.ue.shopsystem.logic.api;

import java.util.List;

import org.bukkit.Location;
import org.ue.economyplayer.logic.api.EconomyPlayer;

public interface PlayershopManager {

	/**
	 * Returns a free unique id for a playershop.
	 * 
	 * @return String
	 */
	public String generateFreePlayerShopId();

	/**
	 * This method returns a list of playershop names. name = name_owner for unique
	 * names
	 * 
	 * @return List of Strings
	 */
	public List<String> getPlayerShopUniqueNameList();

	/**
	 * This method returns a playershop by it's name. name = name_owner unique names
	 * 
	 * @param name
	 * @return PlayerShop
	 * @throws ShopsystemException
	 */
	public Playershop getPlayerShopByUniqueName(String name) throws ShopsystemException;

	/**
	 * This method returns a PlayerShop by it's id.
	 * 
	 * @param id
	 * @return PlayerShop
	 * @throws ShopsystemException
	 */
	public Playershop getPlayerShopById(String id) throws ShopsystemException;

	/**
	 * Returns all player shops.
	 * 
	 * @return list of playershops
	 */
	public List<Playershop> getPlayerShops();

	/**
	 * Returns a list of all player shop ids.
	 * 
	 * @return list of playershop ids
	 */
	public List<String> getPlayershopIdList();

	/**
	 * This method should be used to create a new playershop.
	 * 
	 * @param name
	 * @param spawnLocation
	 * @param size
	 * @param ecoPlayer
	 * @throws ShopsystemException
	 */
	public void createPlayerShop(String name, Location spawnLocation, int size, EconomyPlayer ecoPlayer)
			throws ShopsystemException;

	/**
	 * This method should be used to delete a playershop.
	 * 
	 * @param playershop
	 * @throws ShopSystemException
	 */
	public void deletePlayerShop(Playershop playershop);

	/**
	 * This method despawns all playershop villager.
	 */
	public void despawnAllVillagers();

	/**
	 * This method loads all playerShops. EconomyPlayer have to be loaded first.
	 * 
	 */
	public void loadAllPlayerShops();
}
