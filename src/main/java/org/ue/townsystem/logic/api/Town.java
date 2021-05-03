package org.ue.townsystem.logic.api;

import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.ue.bank.logic.api.BankException;
import org.ue.common.logic.api.EconomyVillager;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.economyplayer.logic.api.EconomyPlayerException;

public interface Town extends EconomyVillager<TownsystemException> {

	/**
	 * Removes a chunk from a town.
	 * 
	 * @param plot
	 * @throws TownsystemException
	 */
	public void deletePlot(Plot plot) throws TownsystemException;

	/**
	 * Return true if chunk is connected to this town.
	 * 
	 * @param chunkX
	 * @param chunkZ
	 * @return boolean
	 */
	public boolean isChunkConnectedToTown(int chunkX, int chunkZ);

	/**
	 * Returns the tax of the town.
	 * 
	 * @return double
	 */
	public double getTax();

	/**
	 * Sets the tax.
	 * 
	 * @param tax
	 * @throws TownsystemException
	 */
	public void setTax(double tax) throws TownsystemException;

	/**
	 * Returns the town bank amount.
	 * 
	 * @return double
	 */
	public double getTownBankAmount();

	/**
	 * Decrease the town bank amount.
	 * 
	 * @param amount
	 * @throws TownsystemException
	 * @throws BankException
	 */
	public void decreaseTownBankAmount(double amount) throws TownsystemException, BankException;

	/**
	 * Increase the town bank amount.
	 * 
	 * @param amount
	 * @throws BankException
	 */
	public void increaseTownBankAmount(double amount) throws BankException;
	
	/**
	 * Change the location of the townmanager with permission check.
	 * @param location
	 * @param player
	 * @throws TownsystemException 
	 */
	public void changeLocation(Location location, EconomyPlayer player) throws TownsystemException;

	/**
	 * Set a player as deputy of a town.
	 * 
	 * @param player the player has to be a citizen of the town
	 * @throws TownsystemException
	 * @throws EconomyPlayerException 
	 */
	public void addDeputy(EconomyPlayer player) throws TownsystemException, EconomyPlayerException;

	/**
	 * Removes a deputy from the town.
	 * 
	 * @param player the player has to be a deputy of the town
	 * @throws TownsystemException
	 */
	public void removeDeputy(EconomyPlayer player) throws TownsystemException;

	/**
	 * Returns true if player is the mayor, deputy, plot owner or plot resident.
	 * 
	 * @param player can be any player
	 * @param plot
	 * @return boolean
	 */
	public boolean hasBuildPermissions(EconomyPlayer player, Plot plot);

	/**
	 * Returns true if player is mayor or deputy.
	 * 
	 * @param player the player has to be a citizen of the town
	 * @return boolean
	 */
	public boolean hasDeputyPermissions(EconomyPlayer player);

	/**
	 * Returns true, if the town has enough money.
	 * 
	 * @param amount
	 * @return boolean
	 */
	public boolean hasEnoughMoney(double amount);

	/**
	 * Returns true if player is a citizen of this town.
	 * 
	 * @param player
	 * @return boolean
	 */
	public boolean isPlayerCitizen(EconomyPlayer player);

	/**
	 * Get list of citizens.
	 * 
	 * @return List of EconomyPlayers
	 */
	public List<EconomyPlayer> getCitizens();

	/**
	 * Returns true if player is mayor.
	 * 
	 * @param player the player has to be a citizen of the town
	 * @return boolean
	 */
	public boolean isMayor(EconomyPlayer player);

	/**
	 * Get mayor.
	 * 
	 * @return String
	 */
	public EconomyPlayer getMayor();

	/**
	 * Returns true if player is a deputy of this town.
	 * 
	 * @param player the player has to be a citizen of the town
	 * @return boolean
	 */
	public boolean isDeputy(EconomyPlayer player);

	/**
	 * Get a list of deputys of the town.
	 * 
	 * @return List of EconomyPlayers
	 */
	public List<EconomyPlayer> getDeputies();

	/**
	 * Expands a town by a new chunk.
	 * 
	 * @param chunk
	 * @param player the player who want to use this method
	 * @throws TownsystemException 
	 * @throws BankException 
	 */
	public void expandTown(Chunk chunk, EconomyPlayer player) throws TownsystemException, BankException;

	/**
	 * Renames this town.
	 * 
	 * @param newName
	 * @param player  the player who want to use this method
	 * @throws TownsystemException 
	 * @throws EconomyPlayerException 
	 */
	public void renameTown(String newName, EconomyPlayer player) throws TownsystemException, EconomyPlayerException;

	/**
	 * Joins a player to a town.
	 * 
	 * @param player the player who wants to join the town
	 * @throws TownsystemException
	 * @throws EconomyPlayerException
	 */
	public void joinTown(EconomyPlayer player) throws TownsystemException, EconomyPlayerException;

	/**
	 * Leaves a player from a town.
	 * 
	 * @param player have to be a citizen
	 * @throws TownsystemException
	 * @throws EconomyPlayerException
	 */
	public void leaveTown(EconomyPlayer player) throws TownsystemException, EconomyPlayerException;

	/**
	 * Despawns all town villagers.
	 * 
	 */
	public void despawnAllVillagers();

	/**
	 * Buy a plot in a town if the plot is for sale. Did not handle payment.
	 * 
	 * @param player the player who wants to by the plot, have to be a citizen of
	 *               the town
	 * @param chunkX
	 * @param chunkZ
	 * @throws TownsystemException
	 */
	public void buyPlot(EconomyPlayer player, int chunkX, int chunkZ) throws TownsystemException;

	/**
	 * Returns a Plot by chunk coords.
	 * 
	 * @param chunkCoords Format X/Z
	 * @return Plot
	 * @throws TownsystemException
	 */
	public Plot getPlotByChunk(String chunkCoords) throws TownsystemException;

	/**
	 * Get town name.
	 * 
	 * @return String
	 */
	public String getTownName();

	/**
	 * Returns true if the cunk is owned by any town.
	 * 
	 * @param chunk
	 * @return boolean
	 */
	public boolean isClaimedByTown(Chunk chunk);

	/**
	 * Returns the townworld.
	 * 
	 * @return Townworld
	 */
	public Townworld getTownworld();

	/**
	 * Set the town spawn location. Deputy mayor permission needed.
	 * 
	 * @param townSpawn
	 * @param ecoPlayer the player who wants to change the townspawn
	 * @throws TownsystemException
	 */
	public void changeTownSpawn(Location townSpawn, EconomyPlayer ecoPlayer) throws TownsystemException;

	/**
	 * Get the town spawn location.
	 * 
	 * @return Location
	 */
	public Location getTownSpawn();
}
