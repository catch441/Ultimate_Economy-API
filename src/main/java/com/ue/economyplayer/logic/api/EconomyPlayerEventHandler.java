package com.ue.economyplayer.logic.api;

import org.bukkit.event.player.PlayerJoinEvent;

import com.ue.economyplayer.logic.EconomyPlayerException;
import com.ue.general.GeneralEconomyException;

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
