package org.ue.economyplayer.logic.api;

import java.util.List;

import org.ue.bank.logic.api.BankAccount;
import org.ue.common.logic.api.GeneralValidator;
import org.ue.jobsystem.logic.api.Job;

public interface EconomyPlayerValidator extends GeneralValidator<EconomyPlayerException> {

	/**
	 * Check for has enough money.
	 * 
	 * @param account
	 * @param amount
	 * @param personal
	 * @throws EconomyPlayerException
	 */
	public void checkForEnoughMoney(BankAccount account, double amount, boolean personal) throws EconomyPlayerException;

	/**
	 * Check for joined town.
	 * 
	 * @param joinedTowns
	 * @param townName
	 * @throws EconomyPlayerException
	 */
	public void checkForJoinedTown(List<String> joinedTowns, String townName) throws EconomyPlayerException;

	/**
	 * Check for town not joined.
	 * 
	 * @param joinedTowns
	 * @param townName
	 * @throws EconomyPlayerException
	 */
	public void checkForTownNotJoined(List<String> joinedTowns, String townName) throws EconomyPlayerException;

	/**
	 * Check for job joined.
	 * 
	 * @param joinedJobs
	 * @param job
	 * @throws EconomyPlayerException
	 */
	public void checkForJobJoined(List<Job> joinedJobs, Job job) throws EconomyPlayerException;

	/**
	 * Checks for job not joined.
	 * 
	 * @param joinedJobs
	 * @param job
	 * @throws EconomyPlayerException
	 */
	public void checkForJobNotJoined(List<Job> joinedJobs, Job job) throws EconomyPlayerException;
}
