package org.ue.townsystem.dataaccess.api;

import java.util.List;

import org.bukkit.Location;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.economyplayer.logic.api.EconomyPlayerException;
import org.ue.economyvillager.dataaccess.api.EconomyVillagerDao;
import org.ue.townsystem.logic.api.TownsystemException;

public interface TownworldDao extends EconomyVillagerDao {

	/**
	 * Saves the owner of the plot.
	 * 
	 * @param townName
	 * @param chunkCoords
	 * @param player
	 */
	public void savePlotOwner(String townName, String chunkCoords, EconomyPlayer player);

	/**
	 * Saves the plot residents.
	 * 
	 * @param townName
	 * @param chunkCoords
	 * @param residents
	 */
	public void savePlotResidents(String townName, String chunkCoords, List<EconomyPlayer> residents);

	/**
	 * Saves the plot is for sale value.
	 * 
	 * @param townName
	 * @param chunkCoords
	 * @param isForSale
	 */
	public void savePlotIsForSale(String townName, String chunkCoords, boolean isForSale);

	/**
	 * Saves the plot sale price.
	 * 
	 * @param townName
	 * @param chunkCoords
	 * @param salePrice
	 */
	public void savePlotSalePrice(String townName, String chunkCoords, double salePrice);

	/**
	 * Saves the town spawn.
	 * 
	 * @param townName
	 * @param location
	 */
	public void saveTownSpawn(String townName, Location location);

	/**
	 * Saves the town deputies.
	 * 
	 * @param townName
	 * @param deputies
	 */
	public void saveDeputies(String townName, List<EconomyPlayer> deputies);

	/**
	 * Saves the town citizens.
	 * 
	 * @param townName
	 * @param citizens
	 */
	public void saveCitizens(String townName, List<EconomyPlayer> citizens);

	/**
	 * Saves the tax value.
	 * 
	 * @param townName
	 * @param tax
	 */
	public void saveTax(String townName, double tax);

	/**
	 * Saves the mayor.
	 * 
	 * @param townName
	 * @param player
	 */
	public void saveMayor(String townName, EconomyPlayer player);

	/**
	 * Removes a plot from the savefile.
	 * 
	 * @param townName
	 * @param chunkCoords
	 */
	public void saveRemovePlot(String townName, String chunkCoords);

	/**
	 * Renames a town in the savefile.
	 * 
	 * @param oldName
	 * @param newName
	 */
	public void saveRenameTown(String oldName, String newName);

	/**
	 * Saves the town bank iban.
	 * 
	 * @param townName
	 * @param iban
	 */
	public void saveTownBankIban(String townName, String iban);

	/**
	 * Loads owner.
	 * 
	 * @param townName
	 * @param chunkCoords
	 * @return economy player
	 * @throws EconomyPlayerException
	 */
	public EconomyPlayer loadPlotOwner(String townName, String chunkCoords) throws EconomyPlayerException;

	/**
	 * Loads the plot sale price.
	 * 
	 * @param townName
	 * @param chunkCoords
	 * @return plot sale price
	 */
	public double loadPlotSalePrice(String townName, String chunkCoords);

	/**
	 * Load the plot is for sale value.
	 * 
	 * @param townName
	 * @param chunkCoords
	 * @return isForSale
	 */
	public boolean loadPlotIsForSale(String townName, String chunkCoords);

	/**
	 * Load all residents of a plot.
	 * 
	 * @param townName
	 * @param chunkCoords
	 * @return list of ecoPlayers
	 */
	public List<EconomyPlayer> loadResidents(String townName, String chunkCoords);

	/**
	 * Loads the chunk coords of all plots of a town.
	 * 
	 * @param townName
	 * @return chunk coord list
	 */
	public List<String> loadTownPlotCoords(String townName);

	/**
	 * Loads the mayor of a town.
	 * 
	 * @param townName
	 * @return mayor
	 * @throws EconomyPlayerException 
	 */
	public EconomyPlayer loadMayor(String townName) throws EconomyPlayerException;

	/**
	 * Loads all deputies of a town.
	 * 
	 * @param townName
	 * @return deputies
	 */
	public List<EconomyPlayer> loadDeputies(String townName);

	/**
	 * Loads the tax of a town.
	 * 
	 * @param townName
	 * @return tax
	 */
	public double loadTax(String townName);

	/**
	 * Loads the townspawn.
	 * 
	 * @param townName
	 * @return townspawn
	 * @throws TownsystemException
	 * @throws NumberFormatException
	 */
	public Location loadTownSpawn(String townName) throws TownsystemException, NumberFormatException;

	/**
	 * Loads the citizens of a town.
	 * 
	 * @param townName
	 * @return citizens
	 */
	public List<EconomyPlayer> loadCitizens(String townName);

	/**
	 * Loads the names of all towns in a townworld.
	 * 
	 * @return town names
	 */
	public List<String> loadTownworldTownNames();

	/**
	 * Loads the town bank iban.
	 * 
	 * @param townName
	 * @return bank iban
	 */
	public String loadTownBankIban(String townName);

	/**
	 * Saves the foundation price.
	 * 
	 * @param foundationPrice
	 */
	public void saveFoundationPrice(double foundationPrice);

	/**
	 * Saves the expand price.
	 * 
	 * @param expandPrice
	 */
	public void saveExpandPrice(double expandPrice);

	/**
	 * Saves the world name.
	 * 
	 * @param world
	 */
	public void saveWorldName(String world);

	/**
	 * Loads the foundation price.
	 * 
	 * @return foundation price
	 */
	public double loadFoundationPrice();

	/**
	 * Loads the expand price.
	 * 
	 * @return extand price
	 */
	public double loadExpandPrice();

	/**
	 * Deletes the savefile.
	 */
	public void deleteSavefile();

	/**
	 * Setup the savefile.
	 * 
	 * @param name
	 */
	public void setupSavefile(String name);
}
