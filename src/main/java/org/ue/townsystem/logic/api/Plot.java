package org.ue.townsystem.logic.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.townsystem.logic.TownSystemException;

public interface Plot {

    /**
     * Sets this plot for sale with saving it in the file. Spawns a SellVillager at
     * playerposition.
     * 
     * @param salePrice
     * @param playerLocation
     * @param player
     * @throws TownSystemException
     * @throws EconomyPlayerException
     */
    public void setForSale(double salePrice, Location playerLocation, EconomyPlayer player)
	    throws TownSystemException, EconomyPlayerException;
    
    /**
     * Moves a sale villager to a new location.
     * 
     * @param newLocation
     * @throws EconomyPlayerException
     * @throws TownSystemException 
     */
    public void moveSaleVillager(Location newLocation) throws EconomyPlayerException, TownSystemException;

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
     * @throws TownSystemException
     */
    public void addResident(EconomyPlayer player) throws TownSystemException;

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
     * @throws TownSystemException
     */
    public void removeResident(EconomyPlayer player) throws TownSystemException;

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
     * Despawns the sale villager.
     * 
     */
    public void despawnSaleVillager();

    /**
     * Removes a plot from sale. Removes also the saleVillager.
     * 
     * @param player
     * @throws EconomyPlayerException 
     */
    public void removeFromSale(EconomyPlayer player) throws EconomyPlayerException;

    /**
     * Opens the inventory of the saleManager.
     * 
     * @param player
     * @throws TownSystemException 
     */
    public void openSaleVillagerInv(Player player) throws TownSystemException;
    
    /**
     * Returns the town of the plot.
     * @return town
     */
    public Town getTown();
}