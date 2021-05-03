package org.ue.common.logic.api;

public enum ExceptionMessageEnum {

	INVALID_PARAMETER("invalid_parameter"), DOES_NOT_EXIST("does_not_exist"), ALREADY_EXISTS("already_exists"),
	NOT_ENOUGH_MONEY("not_enough_money"), SLOT_OCCUPIED("slot_occupied"), SLOT_EMPTY("slot_empty"),
	RESIZING_FAILED("resizing_failed"), PLAYER_IS_ALREADY_OWNER("player_is_already_owner"),
	YOU_HAVE_NO_PERMISSION("you_have_no_permission"), WILDERNESS("wilderness"),
	NO_PERMISSION_ON_PLOT("no_permission_on_plot"), JOB_ALREADY_JOINED("job_already_joined"),
	JOB_NOT_JOINED("job_not_joined"), TOWN_ALREADY_JOINED("town_already_joined"), TOWN_NOT_JOINED("town_not_joined"),
	YOU_ARE_NOT_OWNER("you_are_not_owner"), YOU_ARE_THE_OWNER("you_are_the_owner"),
	OUTSIDE_OF_THE_PLOT("outside_of_the_plot"), YOU_ARE_ALREADY_CITIZEN("you_are_already_citizen"),
	YOU_ARE_NO_CITIZEN("you_are_no_citizen"), MAX_REACHED("max_reached"),
	NOT_ENOUGH_MONEY_PERSONAL("not_enough_money_personal"),
	NOT_ENOUGH_MONEY_NON_PERSONAL("not_enough_money_non_personal"), NOT_ONLINE("not_online"),
	INVENTORY_FULL("inventory_full"), JOB_NOT_EXIST_IN_JOBCENTER("job_not_exist_in_jobcenter"),
	JOB_ALREADY_EXIST_IN_JOBCENTER("job_already_exists_in_jobcenter"),
	PLOT_IS_ALREADY_FOR_SALE("plot_is_already_for_sale"), PLOT_IS_NOT_FOR_SALE("plot_is_not_for_sale"),
	CHUNK_IS_NOT_CONNECTED_WITH_TOWN("chunk_is_not_connected_with_town"),
	CHUNK_ALREADY_CLAIMED("chunk_already_claimed"), CHUNK_NOT_CLAIMED_BY_TOWN("chunk_not_claimed_by_town"),
	CHUNK_NOT_CLAIMED("chunk_not_claimed"), PLAYER_IS_NOT_CITIZEN("player_is_not_citizen"),
	LOCATION_NOT_IN_TOWN("location_not_in_town"), TOWNWORLD_DOES_NOT_EXIST("townworld_does_not_exist"),
	TOWNWORLD_ALREADY_EXIST("townworld_already_exist"), WORLD_DOES_NOT_EXIST("world_does_not_exist"),
	PLAYER_IS_ALREADY_DEPUTY("player_is_already_deputy"), PLAYER_IS_NO_DEPUTY("player_is_no_deputy"),
	PLAYER_IS_ALREADY_RESIDENT("player_is_already_resident"), TOWN_HAS_NOT_ENOUGH_MONEY("town_has_not_enough_money"),
	PLAYER_IS_NO_RESIDENT("player_is_no_resident"), SHOP_CHANGEOWNER_ERROR("shop_changeOwner_error"),
	INVALID_CHAR_IN_SHOP_NAME("invalid_char_in_shop_name"), INVALID_PRICES("invalid_prices"),
	//ITEM_ALREADY_EXISTS("item_already_exists_in_shop")
	ITEM_DOES_NOT_EXIST("item_does_not_exist_in_shop"),
	ITEM_CANNOT_BE_DELETED("item_cannot_be_deleted"), ITEM_UNAVAILABLE("item_unavailable"),
	ERROR_ON_RENAMING("error_on_rename"), ALREADY_RENTED("already_rented"), NOT_RENTED("not_rented"),
	SHOPOWNER_NOT_ENOUGH_MONEY("shopowner_not_enough_money");

	private String value;

	private ExceptionMessageEnum(String value) {
		this.value = value;
	}

	/**
	 * Returns the value of this enum. The value is the name of the message in the
	 * language file.
	 * 
	 * @return string
	 */
	public String getValue() {
		return this.value;
	}
}
