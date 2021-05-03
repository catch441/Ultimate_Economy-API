package org.ue.townsystem.logic.api;

import java.util.List;
import java.util.Map;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.ue.bank.logic.api.BankAccount;
import org.ue.common.logic.api.EconomyVillagerValidationHandler;
import org.ue.economyplayer.logic.api.EconomyPlayer;

public interface TownsystemValidationHandler extends EconomyVillagerValidationHandler<TownsystemException> {

	/**
	 * Check for world exists on server.
	 * 
	 * @param world
	 * @throws TownsystemException
	 */
	public void checkForWorldExists(String world) throws TownsystemException;

	/**
	 * Check for location is inside plot.
	 * 
	 * @param chunkCoords
	 * @param newLocation
	 * @throws TownsystemException
	 */
	public void checkForLocationInsidePlot(String chunkCoords, Location newLocation) throws TownsystemException;

	/**
	 * Check for player is not resident of the plot.
	 * 
	 * @param residents
	 * @param player
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsNotResidentOfPlot(List<EconomyPlayer> residents, EconomyPlayer player)
			throws TownsystemException;

	/**
	 * Check for player is resident of the plot.
	 * 
	 * @param residents
	 * @param player
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsResidentOfPlot(List<EconomyPlayer> residents, EconomyPlayer player)
			throws TownsystemException;

	/**
	 * Check for player is plot owner.
	 * 
	 * @param owner
	 * @param player
	 * @throws TownsystemException
	 */
	public void checkForIsPlotOwner(EconomyPlayer owner, EconomyPlayer player) throws TownsystemException;

	/**
	 * @Override Check for plot is not for sal@Override e.
	 * 
	 * @param isForSale
	 * @throws TownsystemException
	 */
	public void checkForPlotIsNotForSale(boolean isForSale) throws TownsystemException;

	/**
	 * Check for player is a deputy.
	 * 
	 * @param deputies
	 * @param player
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsDeputy(List<EconomyPlayer> deputies, EconomyPlayer player) throws TownsystemException;

	/**
	 * Check for player is citizen.
	 * 
	 * @param citizens
	 * @param player
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsCitizen(List<EconomyPlayer> citizens, EconomyPlayer player) throws TownsystemException;

	/**
	 * Check for town has enough money.
	 * 
	 * @param townBankAmount
	 * @param amount
	 * @throws TownsystemException
	 */
	public void checkForTownHasEnoughMoney(double townBankAmount, double amount) throws TownsystemException;

	/**
	 * Check for location is in town.
	 * 
	 * @param chunkList
	 * @param townSpawn
	 * @throws TownsystemException
	 */
	public void checkForLocationIsInTown(Map<String, Plot> chunkList, Location townSpawn) throws TownsystemException;

	/**
	 * Check for player is not plot owner.
	 * 
	 * @param citizen
	 * @param plot
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsNotPlotOwner(EconomyPlayer citizen, Plot plot) throws TownsystemException;

	/**
	 * Check for plot is for sale.
	 * 
	 * @param isForSale
	 * @throws TownsystemException
	 */
	public void checkForPlotIsForSale(boolean isForSale) throws TownsystemException;

	/**
	 * Check for player is citizen with personal error.
	 * 
	 * @param citizens
	 * @param citizen
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsCitizenPersonalError(List<EconomyPlayer> citizens, EconomyPlayer citizen)
			throws TownsystemException;

	/**
	 * Check for player is mayor.
	 * 
	 * @param mayor
	 * @param player
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsMayor(EconomyPlayer mayor, EconomyPlayer player) throws TownsystemException;

	/**
	 * Check for player is not mayor.
	 * 
	 * @param mayor
	 * @param player
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsNotMayor(EconomyPlayer mayor, EconomyPlayer player) throws TownsystemException;

	/**
	 * Check for chunk is not claimed by the town.
	 * 
	 * @param chunkList
	 * @param chunkCoords
	 * @throws TownsystemException
	 */
	public void checkForChunkIsNotClaimedByThisTown(Map<String, Plot> chunkList, String chunkCoords)
			throws TownsystemException;

	/**
	 * Check for chunk is claimed by the town.
	 * 
	 * @param chunkList
	 * @param chunkCoords
	 * @throws TownsystemException
	 */
	public void checkForChunkIsClaimedByThisTown(Map<String, Plot> chunkList, String chunkCoords)
			throws TownsystemException;

	/**
	 * Check for player did not reached max joined towns.
	 * 
	 * @param ecoPlayer
	 * @throws TownsystemException
	 */
	public void checkForPlayerDidNotReachedMaxTowns(EconomyPlayer ecoPlayer) throws TownsystemException;

	/**
	 * Check for player is not citizen with personal error.
	 * 
	 * @param citizens
	 * @param newCitizen
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsNotCitizenPersonal(List<EconomyPlayer> citizens, EconomyPlayer newCitizen)
			throws TownsystemException;

	/**
	 * Check for player is not deputy.
	 * 
	 * @param deputies
	 * @param player
	 * @throws TownsystemException
	 */
	public void checkForPlayerIsNotDeputy(List<EconomyPlayer> deputies, EconomyPlayer player)
			throws TownsystemException;

	/**
	 * Check for chunk is not claimed.
	 * 
	 * @param townworld
	 * @param chunk
	 * @throws TownsystemException
	 */
	public void checkForChunkNotClaimed(Townworld townworld, Chunk chunk) throws TownsystemException;

	/**
	 * Check for player has deputy permission.
	 * 
	 * @param hasDeputyPermissions
	 * @throws TownsystemException
	 */
	public void checkForPlayerHasDeputyPermission(boolean hasDeputyPermissions) throws TownsystemException;

	/**
	 * Check for chunk is connected to town.
	 * 
	 * @param isChunkConnectedToTown
	 * @throws TownsystemException
	 */
	public void checkForChunkIsConnectedToTown(boolean isChunkConnectedToTown) throws TownsystemException;

	/**
	 * Check for townworld does not exist.
	 * 
	 * @param townworlds
	 * @param world
	 * @throws TownsystemException
	 */
	public void checkForTownworldDoesNotExist(Map<String, Townworld> townworlds, String world)
			throws TownsystemException;

	/**
	 * Check for townworld does exist.
	 * 
	 * @param townworlds
	 * @param world
	 * @throws TownsystemException
	 */
	public void checkForTownworldExists(Map<String, Townworld> townworlds, String world) throws TownsystemException;

	/**
	 * Check for chunk is free.
	 * 
	 * @param townworld
	 * @param location
	 * @throws TownsystemException
	 */
	public void checkForChunkIsFree(Townworld townworld, Location location) throws TownsystemException;

	/**
	 * Check for player has permissions on a plot.
	 * 
	 * @param location
	 * @param ecoPlayer
	 * @throws TownsystemException
	 */
	public void checkForTownworldPlotPermission(Location location, EconomyPlayer ecoPlayer) throws TownsystemException;

	/**
	 * Check for bank account has enough money.
	 * 
	 * @param account
	 * @param amount
	 * @param personal
	 * @throws TownsystemException
	 */
	public void checkForEnoughMoney(BankAccount account, double amount, boolean personal) throws TownsystemException;
}
