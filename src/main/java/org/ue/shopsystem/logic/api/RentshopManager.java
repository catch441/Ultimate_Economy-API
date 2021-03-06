package org.ue.shopsystem.logic.api;

import java.util.List;

import org.bukkit.Location;

public interface RentshopManager {

	/**
	 * Starts the rent daily task, that checks, if the rentshop has to be resetted.
	 */
	public void setupRentDailyTask();

	/**
	 * Returns a free unique id for a rentshop.
	 * 
	 * @return String
	 */
	public String generateFreeRentShopId();

	/**
	 * This method returns a rentshop by the shipId.
	 * 
	 * @param id
	 * @return RentShop
	 * @throws ShopsystemException
	 */
	public Rentshop getRentShopById(String id) throws ShopsystemException;

	/**
	 * This method returns a rentshop by a unique name.
	 * <p>
	 * rented: name = name + owner
	 * <p>
	 * not rented: name = RentShop# + shopId
	 * 
	 * @param name
	 * @return RentShop
	 * @throws ShopsystemException
	 */
	public Rentshop getRentShopByUniqueName(String name) throws ShopsystemException;

	/**
	 * This method returns a list of rentshop names. name = name_owner || RentShop#
	 * + id for unique names
	 * 
	 * @return List of Strings
	 */
	public List<String> getRentShopUniqueNameList();

	/**
	 * Returns all rentshops.
	 * 
	 * @return list of rent shops
	 */
	public List<Rentshop> getRentShops();

	/**
	 * This method should be used to create a new rentshop.
	 * 
	 * @param spawnLocation
	 * @param size
	 * @param rentalFee
	 * @return rentshop
	 * @throws ShopsystemException
	 */
	public Rentshop createRentShop(Location spawnLocation, int size, double rentalFee) throws ShopsystemException;

	/**
	 * This method should be used to delete a rentshop.
	 * 
	 * @param rentshop
	 */
	public void deleteRentShop(Rentshop rentshop);

	/**
	 * This method despawns all rentshop villager.
	 */
	public void despawnAllVillagers();

	/**
	 * This method loads all rentShops. EconomyPlayers have to be loaded first.
	 * 
	 * @throws TownsystemException
	 */
	public void loadAllRentShops();
}
