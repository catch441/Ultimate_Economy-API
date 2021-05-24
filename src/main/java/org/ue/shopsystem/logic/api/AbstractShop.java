package org.ue.shopsystem.logic.api;

import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.economyplayer.logic.api.EconomyPlayerException;
import org.ue.economyvillager.logic.api.EconomyVillager;
import org.ue.bank.logic.api.BankException;
import org.ue.common.logic.api.InventoryGuiHandler;

public abstract interface AbstractShop extends EconomyVillager<ShopsystemException> {

	/**
	 * Setup an existing shop.
	 * 
	 * @param shopId
	 * @throws EconomyPlayerException if the shop owner is not an known economy
	 *                                player
	 */
	public void setupExisting(String shopId) throws EconomyPlayerException;

	/**
	 * Returns the name of this shop.
	 * 
	 * @return name
	 */
	public String getName();

	/**
	 * Returns the itemslist of this shop.
	 * 
	 * @return list of ShopItems
	 */
	public List<ShopItem> getItemList();

	/**
	 * Returns a itemstack by a given slot.
	 * 
	 * @param slot
	 * @return itemstack
	 * @throws ShopsystemException
	 */
	public ShopItem getShopItem(int slot) throws ShopsystemException;

	/**
	 * Returns a shop item.
	 * 
	 * @param stack
	 * @return ShopItem
	 * @throws ShopsystemException
	 */
	public ShopItem getShopItem(ItemStack stack) throws ShopsystemException;

	/**
	 * This method adds a item to this shop.
	 * 
	 * @param slot      intern
	 * @param sellPrice
	 * @param buyPrice
	 * @param itemStack
	 * @throws ShopsystemException
	 */
	public void addShopItem(int slot, double sellPrice, double buyPrice, ItemStack itemStack)
			throws ShopsystemException;

	/**
	 * This method removes a item from this shop.
	 * 
	 * @param slot intern
	 * @throws ShopsystemException
	 */
	public void removeShopItem(int slot) throws ShopsystemException;

	/**
	 * This method edits an existing item in this shop.
	 * 
	 * @param slot      intern
	 * @param amount    null, if not changed
	 * @param sellPrice null, if not changed
	 * @param buyPrice  null, if not changed
	 * @return String
	 * @throws ShopsystemException
	 */
	public String editShopItem(int slot, Integer amount, Double sellPrice, Double buyPrice) throws ShopsystemException;

	/**
	 * Buy the shop item from a specific slot for the given economy player. The
	 * economy player have to be online to recieve the items.
	 * 
	 * @param slot
	 * @param ecoPlayer
	 * @param sendMessage
	 * @throws ShopsystemException
	 * @throws EconomyPlayerException
	 * @throws BankException
	 */
	public void buyShopItem(int slot, EconomyPlayer ecoPlayer, boolean sendMessage)
			throws ShopsystemException, BankException, EconomyPlayerException;

	/**
	 * Sells a shopitem to this shop. Make sure, that the player has the amount of
	 * items in his inventory. There is no validation for that.
	 * 
	 * @param slot
	 * @param amount
	 * @param ecoPlayer
	 * @param sendMessage
	 * @throws ShopsystemException
	 * @throws BankException          when the calculated sellprice is negative
	 *                                (shopItem.getSellPrice() /
	 *                                shopItem.getAmount() * amount;)
	 * @throws EconomyPlayerException
	 */
	public void sellShopItem(int slot, int amount, EconomyPlayer ecoPlayer, boolean sendMessage)
			throws ShopsystemException, BankException, EconomyPlayerException;

	/**
	 * Change the name of a shop. Name gets checked, if a shop with this name
	 * already exists.
	 * 
	 * @param name Forbidden char is "_"
	 * @throws ShopsystemException
	 */
	public abstract void changeShopName(String name) throws ShopsystemException;

	/**
	 * Despawns the shop villager.
	 */
	public void deleteShop();

	/**
	 * Returns the editor GUI handler.
	 */
	public InventoryGuiHandler getEditorHandler();

	/**
	 * Returns the slot editor GUI handler setup for a given slot.
	 * 
	 * @return slot
	 * @throws ShopsystemException
	 */
	public InventoryGuiHandler getSlotEditorHandler(int slot) throws ShopsystemException;
}
