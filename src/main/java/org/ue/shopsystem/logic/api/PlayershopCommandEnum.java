package org.ue.shopsystem.logic.api;

public enum PlayershopCommandEnum {

	CREATE,
	DELETE,
	DELETEOTHER,
	RENAME,
	MOVE,
	CHANGEOWNER,
	EDITSHOP,
	UNKNOWN;

	/**
	 * Returns a enum. Returns PlayershopCommandEnum.UNKNOWN, if no enum is found.
	 * 
	 * @param value
	 * @return playershop command enum
	 */
	public static PlayershopCommandEnum getEnum(String value) {
		for (PlayershopCommandEnum command : values()) {
			if (command.name().equalsIgnoreCase(value)) {
				return command;
			}
		}
		return PlayershopCommandEnum.UNKNOWN;
	}
}
