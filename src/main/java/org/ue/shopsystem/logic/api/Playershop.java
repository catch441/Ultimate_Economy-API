package org.ue.shopsystem.logic.api;

import org.bukkit.Location;
import org.ue.economyplayer.logic.api.EconomyPlayer;

public interface Playershop extends AbstractShop {

	/**
	 * Setup a new playershop.
	 * 
	 * @param name
	 * @param owner
	 * @param shopId
	 * @param spawnLocation
	 * @param size
	 */
	public void setupNew(String name, EconomyPlayer owner, String shopId, Location spawnLocation, int size);

	/**
	 * This method sets the owner of this shop. The owner and the shopname are
	 * validated.
	 * 
	 * @param newOwner
	 * @throws ShopsystemException 
	 */
	public void changeOwner(EconomyPlayer newOwner) throws ShopsystemException;

	/**
	 * Returns true if the ecoPlayer is the owner of this shop.
	 * 
	 * @param ecoPlayer
	 * @return boolean
	 */
	public boolean isOwner(EconomyPlayer ecoPlayer);

	/**
	 * Returns the shop owner.
	 * 
	 * @return EconomyPlayer
	 */
	public EconomyPlayer getOwner();

	/**
	 * This method decreases the stock of an shopitem in a playershop.
	 * 
	 * @param slot
	 * @param stock positive
	 * @throws ShopsystemException 
	 */
	public void decreaseStock(int slot, int stock) throws ShopsystemException;

	/**
	 * This method increases the stock of an shopitem in a playershop.
	 * 
	 * @param slot
	 * @param stock positive
	 * @throws ShopsystemException 
	 */
	public void increaseStock(int slot, int stock) throws ShopsystemException;

	/**
	 * This method returns true, if the stock of this item greater then the item
	 * amount.
	 * 
	 * @param slot
	 * @return booelan
	 * @throws ShopsystemException 
	 */
	public boolean isAvailable(int slot) throws ShopsystemException;
}
