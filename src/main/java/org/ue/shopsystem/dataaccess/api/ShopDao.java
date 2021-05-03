package org.ue.shopsystem.dataaccess.api;

import java.util.List;

import org.ue.common.dataaccess.api.EconomyVillagerDao;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.shopsystem.logic.api.ShopItem;

public interface ShopDao extends EconomyVillagerDao {

	/**
	 * Saves the shopname.
	 * 
	 * @param name
	 */
	public void saveShopName(String name);

	/**
	 * Saves a shopitem.
	 * 
	 * @param shopItem
	 * @param delete
	 */
	public void saveShopItem(ShopItem shopItem, boolean delete);

	/**
	 * Saves a shop item sell price.
	 * 
	 * @param slot
	 * @param sellPrice
	 */
	public void saveShopItemSellPrice(int slot, double sellPrice);

	/**
	 * Saves a shop item buy price.
	 * 
	 * @param slot
	 * @param buyPrice
	 */
	public void saveShopItemBuyPrice(int slot, double buyPrice);

	/**
	 * Saves a shop item amount.
	 * 
	 * @param slot
	 * @param amount
	 */
	public void saveShopItemAmount(int slot, int amount);

	/**
	 * Saves the stock for a item.
	 * 
	 * @param slot
	 * @param stock
	 */
	public void saveStock(int slot, int stock);

	/**
	 * Saves the shop owner.
	 * 
	 * @param ecoPlayer
	 */
	public void saveOwner(EconomyPlayer ecoPlayer);

	/**
	 * Saves the expire at time.
	 * 
	 * @param expiresAt
	 */
	public void saveExpiresAt(long expiresAt);

	/**
	 * Saves the rental fee.
	 * 
	 * @param fee
	 */
	public void saveRentalFee(double fee);

	/**
	 * Saves if the shop is rentable.
	 * 
	 * @param isRentable
	 */
	public void saveRentable(boolean isRentable);

	/**
	 * Loads the shop name.
	 * 
	 * @return shop name
	 */
	public String loadShopName();

	/**
	 * Loads a shop item.
	 * 
	 * @param slot
	 * @return shop item
	 */
	public ShopItem loadItem(int slot);

	/**
	 * Loads the item slot list.
	 * 
	 * @return list of integers
	 */
	public List<Integer> loadItemSlotList();

	/**
	 * Loads the stock of a item.
	 * 
	 * @param slot
	 * @return stock
	 */
	public int loadStock(int slot);

	/**
	 * Loads the shop owner.
	 * 
	 * @return owner name
	 */
	public String loadOwner();

	/**
	 * Loads if the shop is rentable.
	 * 
	 * @return rentable
	 */
	public boolean loadRentable();

	/**
	 * Loads the rent until time.
	 * 
	 * @return rent until
	 */
	public long loadExpiresAt();

	/**
	 * Loads the rental fee.
	 * 
	 * @return rental fee
	 */
	public double loadRentalFee();

	/**
	 * Deletes the savefile.
	 */
	public void deleteFile();

	/**
	 * Setup a new savefile.
	 * 
	 * @param shopId
	 */
	public void setupSavefile(String shopId);

	/**
	 * @since 1.2.6
	 * @param slot
	 * @return true, if corrupted found and removed
	 * @deprecated removed items, that are corrupted. The newer savefile system
	 *             cannot handle old corrupted items, that are ignored before.
	 */
	@Deprecated
	public boolean removeIfCorrupted(int slot);
}
