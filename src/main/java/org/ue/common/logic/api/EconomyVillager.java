package org.ue.common.logic.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.inventory.Inventory;
import org.ue.economyplayer.logic.api.EconomyPlayerException;

public interface EconomyVillager<T extends GeneralEconomyException> {

	/**
	 * Change the profession of the villager.
	 * 
	 * @param professtion
	 */
	public void changeProfession(Profession professtion);

	/**
	 * Change the location of the villager.
	 * 
	 * @param location
	 * @throws <T>
	 */
	public void changeLocation(Location location) throws T;

	/**
	 * Returns the location of the villager.
	 * 
	 * @return location
	 * @throws EconomyPlayerException
	 */
	public Location getLocation();

	/**
	 * Returns the size of the inventory.
	 * 
	 * @return inventory size
	 */
	public int getSize();

	/**
	 * Despawns the villager. Does not change the visible value.
	 */
	public void despawn();

	/**
	 * Change the size of the inventory;
	 * 
	 * @param newSize
	 * @throws <T>
	 */
	public void changeSize(int newSize) throws T;

	/**
	 * Opens the inventory for the given player.
	 * 
	 * @param player
	 * @throws T
	 */
	public void openInventory(Player player) throws T;

	/**
	 * Creates a inventory with the villager as owning entity.
	 * 
	 * @param size
	 * @param title
	 * @return inventory
	 */
	public Inventory createVillagerInventory(int size, String title);

	/**
	 * Spawns or despawns the villager. If the villager was never spawned before use
	 * {@link EconomyVillager#changeLocation(Location)} to init the spawn location.
	 * 
	 * @param visible
	 * @throws <T>
	 */
	public void setVisible(boolean visible) throws T;
}
