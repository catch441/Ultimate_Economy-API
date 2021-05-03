package org.ue.shopsystem.logic.api;

import java.io.File;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.inventory.Inventory;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.common.logic.api.EconomyVillagerValidationHandler;

public interface ShopValidationHandler extends EconomyVillagerValidationHandler<ShopsystemException> {

	/**
	 * Check for both prices greater then zero.
	 * 
	 * @param sellPrice
	 * @param buyPrice
	 * @throws ShopsystemException
	 */
	public void checkForPricesGreaterThenZero(double sellPrice, double buyPrice) throws ShopsystemException;

	/**
	 * Check for a valid amount.
	 * 
	 * @param amount
	 * @throws ShopsystemException
	 */
	public void checkForValidAmount(int amount) throws ShopsystemException;

	/**
	 * Check for item can be deleted.
	 * 
	 * @param slot
	 * @param size
	 * @throws ShopsystemException
	 */
	public void checkForItemCanBeDeleted(int slot, int size) throws ShopsystemException;

	/**
	 * Check for valid stock decrease.
	 * 
	 * @param entireStock
	 * @param stock
	 * @throws ShopsystemException
	 */
	public void checkForValidStockDecrease(int entireStock, int stock) throws ShopsystemException;

	/**
	 * Check for change owner is possible.
	 * 
	 * @param uniqueShopNameList
	 * @param newOwner
	 * @param shopName
	 * @throws ShopsystemException
	 */
	public void checkForChangeOwnerIsPossible(List<String> uniqueShopNameList, EconomyPlayer newOwner, String shopName)
			throws ShopsystemException;

	/**
	 * Check for a valid shop name.
	 * 
	 * @param name
	 * @throws ShopsystemException
	 */
	public void checkForValidShopName(String name) throws ShopsystemException;

	/**
	 * Check for shop name is available. If the owner is null, then no shop name
	 * suffix (_ownername) is used.
	 * 
	 * @param shopNames
	 * @param name
	 * @param owner
	 * @throws ShopsystemException
	 */
	public void checkForShopNameIsFree(List<String> shopNames, String name, EconomyPlayer owner)
			throws ShopsystemException;

	/**
	 * Check for player has permissions at a specific location.
	 * 
	 * @param location
	 * @param owner
	 * @throws ShopsystemException
	 */
	public void checkForPlayerHasPermissionAtLocation(Location location, EconomyPlayer owner)
			throws ShopsystemException;

	/**
	 * Check for is rentable.
	 * 
	 * @param isRentable
	 * @throws ShopsystemException
	 */
	public void checkForIsRentable(boolean isRentable) throws ShopsystemException;

	/**
	 * Check for is rented.
	 * 
	 * @param isRentable
	 * @throws ShopsystemException
	 */
	public void checkForIsRented(boolean isRentable) throws ShopsystemException;

	/**
	 * Check if player is online.
	 * 
	 * @param ecoPlayer
	 * @throws ShopsystemException
	 */
	public void checkForPlayerIsOnline(EconomyPlayer ecoPlayer) throws ShopsystemException;

	/**
	 * Check if the player inventory is not full.
	 * 
	 * @param inventory
	 * @throws ShopsystemException
	 */
	public void checkForPlayerInventoryNotFull(Inventory inventory) throws ShopsystemException;

	/**
	 * Check if the shop owner has enough money.
	 * 
	 * @param ecoPlayer
	 * @param money
	 * @throws ShopsystemException
	 */
	public void checkForShopOwnerHasEnoughMoney(EconomyPlayer ecoPlayer, double money) throws ShopsystemException;

	/**
	 * Check for renaming is possible.
	 * 
	 * @param newFile
	 * @throws ShopsystemException
	 */
	public void checkForRenamingSavefileIsPossible(File newFile) throws ShopsystemException;

	/**
	 * Check for player reached max playershops.
	 * 
	 * @param shopList
	 * @param ecoPlayer
	 * @throws ShopsystemException
	 */
	public void checkForMaxPlayershopsForPlayer(List<Playershop> shopList, EconomyPlayer ecoPlayer)
			throws ShopsystemException;
}
