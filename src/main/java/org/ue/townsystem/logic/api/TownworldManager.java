package org.ue.townsystem.logic.api;

import java.util.List;

import org.bukkit.Location;
import org.ue.economyplayer.logic.api.EconomyPlayer;

public interface TownworldManager {

	/**
	 * Returns a townworld by it's name.
	 * 
	 * @param name
	 * @return Townworld
	 * @throws TownsystemException 
	 */
	public Townworld getTownWorldByName(String name) throws TownsystemException;

	/**
	 * Returns a town by townname.
	 * 
	 * @param townName
	 * @return Town
	 * @throws TownsystemException 
	 */
	public Town getTownByName(String townName) throws TownsystemException;

	/**
	 * This method returns a list of all townworlds.
	 * 
	 * @return List of TownWorlds
	 */
	public List<Townworld> getTownWorldList();

	/**
	 * Despawns all town villager from all townworlds.
	 */
	public void despawnAllVillagers();

	/**
	 * Returns a list of all townworld names.
	 * 
	 * @return list of strings
	 */
	public List<String> getTownWorldNameList();

	/**
	 * Returns true, if the world is an townworld.
	 * 
	 * @param worldName
	 * @return boolean
	 */
	public boolean isTownWorld(String worldName);

	/**
	 * This method should be used to create/enble a new townworld.
	 * 
	 * @param world
	 * @throws TownsystemException
	 */
	public void createTownWorld(String world) throws TownsystemException;

	/**
	 * This method should be used to delete/disable a townworld.
	 * 
	 * @param world
	 * @throws TownsystemException 
	 */
	public void deleteTownWorld(String world) throws TownsystemException;

	/**
	 * This method loads all townworlds from the save file. Loads all towns and
	 * plots in the townworld as well. EconomyPlayers have to be loaded first.
	 * 
	 */
	public void loadAllTownWorlds();

	/**
	 * Handles the townworld location check, if the player is online.
	 * 
	 * @param ecoPlayer
	 * @param location if the location is different from the player
	 * @param ecoPlayer
	 */
	public void performTownWorldLocationCheck(EconomyPlayer ecoPlayer, Location location);

	/**
	 * Returns the town name list.
	 * 
	 * @return town names
	 */
	public List<String> getTownNameList();

	/**
	 * Performs the townworld location check for all online players.
	 */
	public void performTownworldLocationCheckAllPlayers();
}
