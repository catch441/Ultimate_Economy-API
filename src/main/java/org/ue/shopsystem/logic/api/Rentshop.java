package org.ue.shopsystem.logic.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.ue.bank.logic.api.BankException;
import org.ue.economyplayer.logic.api.EconomyPlayer;
import org.ue.economyplayer.logic.api.EconomyPlayerException;

public interface Rentshop extends Playershop {

	/**
	 * Setup a new rentshop.
	 * 
	 * @param shopId
	 * @param spawnLocation
	 * @param size
	 * @param rentalFee
	 */
	public void setupNew(String shopId, Location spawnLocation, int size, double rentalFee);

	/**
	 * Returns the expires at time in minecraft ticks.
	 * 
	 * @return rentUntil
	 */
	public long getExpiresAt();

	/**
	 * Returns true, if this shop is not rented by a other player.
	 * 
	 * @return rentable
	 */
	public boolean isRentable();

	/**
	 * Resets the entire shop. Sets the shop back to the "rentable" state. Removes
	 * all items from the shop.
	 * @throws ShopsystemException 
	 * 
	 */
	public void resetShop() throws ShopsystemException;

	/**
	 * Change the rental fee of this shop. Does not affect a active rent.
	 * 
	 * @param fee
	 * @throws ShopsystemException
	 */
	public void changeRentalFee(double fee) throws ShopsystemException;

	/**
	 * Rent this shop for a given player.
	 * 
	 * @param player
	 * @param duration
	 * @throws ShopsystemException
	 * @throws EconomyPlayerException if the player has not enough money
	 * @throws BankException
	 */
	public void rentShop(EconomyPlayer player, int duration)
			throws ShopsystemException, BankException, EconomyPlayerException;

	/**
	 * Opens the rentshop GUI, if the shop is not rented.
	 * 
	 * @param player
	 * @throws ShopsystemException
	 */
	public void openRentGUI(Player player) throws ShopsystemException;

	/**
	 * Returns the rental fee amount.
	 * 
	 * @return rentalFee
	 */
	public double getRentalFee();
}
