package org.ue.economyplayer.dataaccess.api;

import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.ue.jobsystem.logic.api.Job;

public interface EconomyPlayerDao {

	/**
	 * Creates a new savefile if no one exists and loads an existing file if the
	 * savefile already exists.
	 * 
	 */
	public void setupSavefile();

	/**
	 * Loads the player list.
	 * 
	 * @return player names as String List
	 */
	public List<String> loadPlayerList();

	/**
	 * Deletes a economy player from the savefile.
	 * 
	 * @param playerName
	 */
	public void deleteEconomyPlayer(String playerName);

	/**
	 * Saves a home location. If location is null, then the location gets deleted.
	 * 
	 * @param playerName
	 * @param homeName
	 * @param location
	 */
	public void saveHome(String playerName, String homeName, Location location);

	/**
	 * Saves the bank iban.
	 * 
	 * @param playerName
	 * @param iban
	 */
	public void saveBankIban(String playerName, String iban);

	/**
	 * Save the joined job list.
	 * 
	 * @param playerName
	 * @param jobList
	 */
	public void saveJoinedJobsList(String playerName, List<Job> jobList);

	/**
	 * Saves the joined town list.
	 * 
	 * @param playerName
	 * @param joinedTowns
	 */
	public void saveJoinedTowns(String playerName, List<String> joinedTowns);

	/**
	 * Saves the scoreboard visible value.
	 * 
	 * @param playerName
	 * @param visible
	 */
	public void saveScoreboardObjectiveVisible(String playerName, Boolean visible);

	/**
	 * Loads the bank iban.
	 * 
	 * @param playerName
	 * @return iban
	 */
	public String loadBankIban(String playerName);

	/**
	 * Loads the name list of all joined jobs.
	 * 
	 * @param playerName
	 * @return list of joined jobs
	 */
	public List<String> loadJobsList(String playerName);

	/**
	 * Load all homes.
	 * 
	 * @param playerName
	 * @return home map
	 */
	public Map<String, Location> loadHomeList(String playerName);

	/**
	 * Load the scoreboard visible value.
	 * 
	 * @param playerName
	 * @return boolean
	 */
	public boolean loadScoreboardObjectiveVisible(String playerName);

	/**
	 * Loads the joined towns name list.
	 * 
	 * @param playerName
	 * @return list of joined towns
	 */
	public List<String> loadJoinedTowns(String playerName);
}
