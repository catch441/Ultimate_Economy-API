package org.ue.shopsystem.logic.api;

import org.bukkit.Location;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.general.GeneralEconomyException;
import org.ue.shopsystem.logic.ShopSystemException;

public interface Playershop extends AbstractShop {

	/**
	 * Setup a new playershop.
	 * 
	 * @param name
	 * @param owner
	 * @param shopId
	 * @param spawnLocation
	 * @param size
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 */
	public void setupNew(String name, EconomyPlayer owner, String shopId, Location spawnLocation, int size)
			throws GeneralEconomyException, EconomyPlayerException;

	/**
	 * This method sets the owner of this shop. The owner and the shopname are
	 * validated.
	 * 
	 * @param newOwner
	 * @throws EconomyPlayerException
	 * @throws ShopSystemException
	 */
	public void changeOwner(EconomyPlayer newOwner) throws EconomyPlayerException, ShopSystemException;

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
	 * @exception GeneralEconomyException
	 * @throws ShopSystemException
	 * @throws EconomyPlayerException
	 */
	public void decreaseStock(int slot, int stock)
			throws GeneralEconomyException, ShopSystemException, EconomyPlayerException;

	/**
	 * This method increases the stock of an shopitem in a playershop.
	 * 
	 * @param slot
	 * @param stock positive
	 * @exception GeneralEconomyException
	 * @throws ShopSystemException
	 * @throws EconomyPlayerException
	 */
	public void increaseStock(int slot, int stock)
			throws GeneralEconomyException, ShopSystemException, EconomyPlayerException;

	/**
	 * This method returns true, if the stock of this item greater then the item
	 * amount.
	 * 
	 * @param slot
	 * @return booelan
	 * @exception ShopSystemException
	 * @throws GeneralEconomyException
	 * @throws EconomyPlayerException
	 */
	public boolean isAvailable(int slot) throws ShopSystemException, GeneralEconomyException, EconomyPlayerException;
}
