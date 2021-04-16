package org.ue.shopsystem.logic.api;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.common.logic.api.EconomyVillager;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.general.GeneralEconomyException;
import org.ue.shopsystem.logic.ShopSystemException;
import org.ue.townsystem.logic.TownSystemException;

public abstract interface AbstractShop extends EconomyVillager {

	/**
	 * Setup an existing shop.
	 * 
	 * @param shopId
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 * @throws TownSystemException
	 */
	public void setupExisting(String shopId)
			throws TownSystemException, GeneralEconomyException, EconomyPlayerException;

	/**
	 * Returns the name of this shop.
	 * 
	 * @return name
	 */
	public String getName();

	/**
	 * Returns the shopId.
	 * 
	 * @return shopId
	 */
	public String getShopId();

	/**
	 * Returns the itemslist of this shop.
	 * 
	 * @return list of ShopItems
	 * @throws ShopSystemException
	 */
	public List<ShopItem> getItemList() throws ShopSystemException;

	/**
	 * Returns a itemstack by a given slot.
	 * 
	 * @param slot
	 * @return itemstack
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 * @throws ShopSystemException
	 */
	public ShopItem getShopItem(int slot) throws GeneralEconomyException, EconomyPlayerException, ShopSystemException;

	/**
	 * Returns a shop item.
	 * 
	 * @param stack
	 * @return ShopItem
	 * @throws ShopSystemException
	 */
	public ShopItem getShopItem(ItemStack stack) throws ShopSystemException;

	/**
	 * This method adds a item to this shop.
	 * 
	 * @param slot      intern
	 * @param sellPrice
	 * @param buyPrice
	 * @param itemStack
	 * @throws ShopSystemException
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 */
	public void addShopItem(int slot, double sellPrice, double buyPrice, ItemStack itemStack)
			throws ShopSystemException, EconomyPlayerException, GeneralEconomyException;

	/**
	 * This method removes a item from this shop.
	 * 
	 * @param slot intern
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 * @throws ShopSystemException
	 */
	public void removeShopItem(int slot) throws GeneralEconomyException, EconomyPlayerException, ShopSystemException;

	/**
	 * This method edits an existing item in this shop.
	 * 
	 * @param slot      intern
	 * @param amount    null, if not changed
	 * @param sellPrice null, if not changed
	 * @param buyPrice  null, if not changed
	 * @return String
	 * @throws ShopSystemException
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException
	 */
	public String editShopItem(int slot, Integer amount, Double sellPrice, Double buyPrice)
			throws ShopSystemException, EconomyPlayerException, GeneralEconomyException;

	/**
	 * Buy the shop item from a specific slot for the given economy player. The
	 * economy player have to be online to recieve the items.
	 * 
	 * @param slot
	 * @param ecoPlayer
	 * @param sendMessage
	 * @throws GeneralEconomyException
	 * @throws EconomyPlayerException
	 * @throws ShopSystemException
	 */
	public void buyShopItem(int slot, EconomyPlayer ecoPlayer, boolean sendMessage)
			throws GeneralEconomyException, EconomyPlayerException, ShopSystemException;

	/**
	 * Sells a shopitem to this shop. Make sure, that the player has the amount of
	 * items in his inventory. There is no validation for that.
	 * 
	 * @param slot
	 * @param amount
	 * @param ecoPlayer
	 * @param sendMessage
	 * @throws GeneralEconomyException
	 * @throws ShopSystemException
	 * @throws EconomyPlayerException
	 */
	public void sellShopItem(int slot, int amount, EconomyPlayer ecoPlayer, boolean sendMessage)
			throws GeneralEconomyException, ShopSystemException, EconomyPlayerException;

	/**
	 * Change the name of a shop. Name gets checked, if a shop with this name
	 * already exists.
	 * 
	 * @param name Forbidden char is "_"
	 * @throws ShopSystemException     thrown, when a shop with this name already
	 *                                 exists or the name contains "_"
	 * @throws GeneralEconomyException
	 */
	public abstract void changeShopName(String name) throws ShopSystemException, GeneralEconomyException;

	/**
	 * Change the size of the shop. Size gets validated. With only the info slot in
	 * the shop. Have to be overridden, if you have more then one reserved shot in
	 * your shop.
	 * 
	 * @param newSize
	 * @throws ShopSystemException
	 * @throws GeneralEconomyException
	 * @throws EconomyPlayerException
	 */
	// public void changeShopSize(int newSize) throws ShopSystemException,
	// GeneralEconomyException, EconomyPlayerException;

	/**
	 * Despawns the shop villager.
	 */
	public void deleteShop();

	/**
	 * Opens the slot editor GUI.
	 * 
	 * @param player
	 * @param slot   internal
	 * @throws ShopSystemException
	 * @throws GeneralEconomyException
	 */
	public void openSlotEditor(Player player, int slot) throws ShopSystemException, GeneralEconomyException;

	/**
	 * Opens the editor GUI with occupied and free slots The 2 last slots are not
	 * used. If you need more then 2 slots for other usage, then override this
	 * method.
	 * 
	 * @param player
	 * @throws ShopSystemException
	 */
	public void openEditor(Player player) throws ShopSystemException;
}
