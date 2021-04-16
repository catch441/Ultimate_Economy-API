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
	 * @param itemHash
	 * @param sellPrice
	 */
	public void saveShopItemSellPrice(int itemHash, double sellPrice);

	/**
	 * Saves a shop item buy price.
	 * 
	 * @param itemHash
	 * @param buyPrice
	 */
	public void saveShopItemBuyPrice(int itemHash, double buyPrice);

	/**
	 * Saves a shop item amount.
	 * 
	 * @param itemHash
	 * @param amount
	 */
	public void saveShopItemAmount(int itemHash, int amount);

	/**
	 * Saves the stock for a item.
	 * 
	 * @param itemHash
	 * @param stock
	 */
	public void saveStock(int itemHash, int stock);

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
	 * @param itemHash
	 * @return shop item
	 */
	public ShopItem loadItem(int itemHash);

	/**
	 * Loads the item hash list.
	 * 
	 * @return list of integers
	 */
	public List<Integer> loadItemHashList();

	/**
	 * Loads the stock of a item.
	 * 
	 * @param itemHash
	 * @return stock
	 */
	public int loadStock(int itemHash);

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
	 * @param itemHash
	 * @return true, if corrupted found and removed
	 * @deprecated removed items, that are corrupted. The newer savefile system
	 *             cannot handle old corrupted items, that are ignored before.
	 */
	@Deprecated
	public boolean removeIfCorrupted(int itemHash);
}
