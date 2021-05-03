package org.ue.common.logic.api;

public enum EconomyVillagerType {

	ADMINSHOP("adminshop"),
	PLAYERSHOP("playershop"),
	RENTSHOP("rentshop"),
	PLOTSALE("plotsale"),
	TOWNMANAGER("townmanager"),
	JOBCENTER("jobcenter"),
	UNDEFINED("undefined");

	private String value;

	private EconomyVillagerType(String value) {
		this.value = value;
	}

	private String getValue() {
		return value;
	}

	/**
	 * Returns a economy villager enum. Return UNDEFINED, if no enum found.
	 * 
	 * @param value
	 * @return economy villager type
	 */
	public static EconomyVillagerType getEnum(String value) {
		for (EconomyVillagerType v : values()) {
			if (v.getValue().equalsIgnoreCase(value)) {
				return v;
			}
		}	
		return EconomyVillagerType.UNDEFINED;
	}
}
