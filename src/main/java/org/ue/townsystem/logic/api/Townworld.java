package org.ue.townsystem.logic.api;

import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.ue.bank.logic.api.BankException;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.economyplayer.logic.api.EconomyPlayerException;

public interface Townworld {

	/**
	 * Returns the townlist.
	 * 
	 * @return List
	 */
	public List<Town> getTownList();

	/**
	 * Founds a new town in this townworld, if player has enough money. Player money
	 * decreases if player has enough money.
	 * 
	 * @param townName
	 * @param location
	 * @param player
	 * @throws TownsystemException
	 * @throws BankException
	 * @throws EconomyPlayerException
	 */
	public void foundTown(String townName, Location location, EconomyPlayer player)
			throws TownsystemException, EconomyPlayerException, BankException;

	/**
	 * Dissolves a entire town. The Chunks are not resettet.
	 * 
	 * @param ecoPlayer
	 * @param town
	 * @throws TownsystemException
	 * @throws EconomyPlayerException
	 */
	public void dissolveTown(EconomyPlayer ecoPlayer, Town town) throws TownsystemException, EconomyPlayerException;

	/**
	 * Returns town by chunk.
	 * 
	 * @param chunk
	 * @return Town
	 * @throws TownsystemException
	 */
	public Town getTownByChunk(Chunk chunk) throws TownsystemException;

	/**
	 * Returns the Town World name.
	 * 
	 * @return String
	 */
	public String getWorldName();

	/**
	 * Returns a town by townname.
	 * 
	 * @param townName
	 * @return Town
	 * @throws TownsystemException
	 */
	public Town getTownByName(String townName) throws TownsystemException;

	/**
	 * Returns a list of all townnames in this townworld.
	 * 
	 * @return List
	 */
	public List<String> getTownNameList();

	/**
	 * Set the FoundationPrice for a town in this townworld.
	 * 
	 * @param foundationPrice
	 * @throws TownsystemException
	 */
	public void setFoundationPrice(double foundationPrice) throws TownsystemException;

	/**
	 * Returns the founding price of this townworld.
	 * 
	 * @return double
	 */
	public double getFoundationPrice();

	/**
	 * Set the ExpandPrice for a town in this townworld.
	 * 
	 * @param expandPrice
	 * @throws TownsystemException
	 */
	public void setExpandPrice(double expandPrice) throws TownsystemException;

	/**
	 * Returns the expand price for a town in this townworld.
	 * 
	 * @return double
	 */
	public double getExpandPrice();

	/**
	 * Despawns all town villagers in this townworld.
	 * 
	 */
	public void despawnAllTownVillagers();

	/**
	 * Returns true if the chunk is not claimed by any town.
	 * 
	 * @param chunk
	 * @return boolean
	 */
	public boolean isChunkFree(Chunk chunk);

	/**
	 * Deletes all save files and towns.
	 */
	public void delete();
}
