package org.ue.economyplayer.logic.api;

import org.bukkit.event.player.PlayerJoinEvent;
import org.ue.bank.logic.api.BankException;

public interface EconomyPlayerEventHandler {

	/**
	 * Handles the player join event for the economy player.
	 * 
	 * @param event
	 * @throws EconomyPlayerException
	 * @throws BankException
	 */
	public void handleJoin(PlayerJoinEvent event) throws EconomyPlayerException, BankException;
}
