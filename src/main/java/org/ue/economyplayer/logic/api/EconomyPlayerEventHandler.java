package org.ue.economyplayer.logic.api;

import org.bukkit.event.player.PlayerJoinEvent;
import org.ue.economyplayer.logic.EconomyPlayerException;
import org.ue.general.GeneralEconomyException;

public interface EconomyPlayerEventHandler {

	/**
	 * Handles the player join event for the economy player.
	 * 
	 * @param event
	 * @throws EconomyPlayerException
	 * @throws GeneralEconomyException 
	 */
	public void handleJoin(PlayerJoinEvent event) throws EconomyPlayerException, GeneralEconomyException;
}
