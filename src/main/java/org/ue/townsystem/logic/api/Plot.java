package org.ue.townsystem.logic.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.economyplayer.logic.api.EconomyPlayerException;
import org.ue.economyvillager.logic.api.EconomyVillager;

public interface Plot extends EconomyVillager<TownsystemException> {

	/**
	 * Setup a new plot.
	 * 
	 * @param owner
	 * @param town
	 * @param chunkCoords
	 */
	public void setupNew(EconomyPlayer owner, Town town, String chunkCoords);

	/**
	 * Setup an existing plot.
	 * 
	 * @param town
	 * @param chunkCoords
	 * @throws EconomyPlayerException
	 */
	public void setupExisting(Town town, String chunkCoords) throws EconomyPlayerException;

	/**
	 * Sets this plot for sale with saving it in the file. Spawns a SellVillager at
	 * player position.
	 * 
	 * @param salePrice
	 * @param playerLocation
	 * @param player
	 * @throws TownsystemException
	 */
	public void setForSale(double salePrice, Location playerLocation, EconomyPlayer player) throws TownsystemException;

	/**
	 * Returns the salePrice for this slot.
	 * 
	 * @return double
	 */
	public double getSalePrice();

	/**
	 * Get a list of all residents of this plot.
	 * 
	 * @return List
	 */
	public List<EconomyPlayer> getResidents();

	/**
	 * Add a residents to this plot.
	 * 
	 * @param player
	 * @throws TownsystemException
	 */
	public void addResident(EconomyPlayer player) throws TownsystemException;

	/**
	 * Get the chunk coords of this plot. Format X/Z
	 * 
	 * @return String
	 */
	public String getChunkCoords();

	/**
	 * Set the owner of this plot. With saving.
	 * 
	 * @param player
	 */
	public void setOwner(EconomyPlayer player);

	/**
	 * Get the owner of this plot.
	 * 
	 * @return String
	 */
	public EconomyPlayer getOwner();

	/**
	 * Returns true if the player is the owner of this plot.
	 * 
	 * @param player
	 * @return booelan
	 */
	public boolean isOwner(EconomyPlayer player);

	/**
	 * Removes a resident from this plot.
	 * 
	 * @param player
	 * @throws TownsystemException
	 */
	public void removeResident(EconomyPlayer player) throws TownsystemException;

	/**
	 * Returns true if the player is a resident of this plot.
	 * 
	 * @param player
	 * @return boolean
	 */
	public boolean isResident(EconomyPlayer player);

	/**
	 * Returns true if this plot is for sale.
	 * 
	 * @return boolean
	 */
	public boolean isForSale();

	/**
	 * Removes a plot from sale. Removes also the saleVillager.
	 * 
	 * @param player
	 * @throws TownsystemException
	 */
	public void removeFromSale(EconomyPlayer player) throws TownsystemException;

	/**
	 * Returns the town of the plot.
	 * 
	 * @return town
	 */
	public Town getTown();

	/**
	 * Opens the plot sale GUI.
	 * 
	 * @param player
	 * @throws TownsystemException if plot is for sale
	 */
	public void openInventoryWithCheck(Player player) throws TownsystemException;
}
