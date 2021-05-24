package org.ue.common.logic.api;

public enum MessageEnum {

	TOWNWORLD_SETEXPANDPRICE("townworld_setExpandPrice"), TOWNWORLD_SETFOUNDATIONPRICE("townworld_setFoundationPrice"),
	TOWNWORLD_DISABLE("townworld_disable"), TOWNWORLD_ENABLE("townworld_enable"),
	TOWN_PLOT_SETFORSALE("town_plot_setForSale"), TOWN_BANK("town_bank"), TOWN_PAY("town_pay"),
	TOWN_SETTOWNSPAWN("town_setTownSpawn"), TOWN_RENAME("town_rename"), TOWN_EXPAND("town_expand"),
	TOWN_DELETE("town_delete"), TOWN_CREATE("town_create"), RENT_REMINDER("rent_reminder"), RENT_RENTED("rent_rented"),
	SHOP_ADDED_ITEM_SINGULAR("shop_added_item_singular"), SHOP_GOT_ITEM_SINGULAR("shop_got_item_singular"),
	SHOP_ADDED_ITEM_PLURAL("shop_added_item_plural"), SHOP_GOT_ITEM_PLURAL("shop_got_item_plural"),
	SHOP_CHANGEOWNER("shop_changeOwner"), SHOP_CHANGEOWNER1("shop_changeOwner1"), SHOP_SELL_PLURAL("shop_sell_plural"),
	SHOP_SELL_SINGULAR("shop_sell_singular"), SHOP_BUY_SINGULAR("shop_buy_singular"),
	SHOP_BUY_PLURAL("shop_buy_plural"), SHOP_RENAME("shop_rename"), SHOPLIST_INFO("shoplist_info"),
	JOBINFO_FISHINGPRICE("jobinfo_fishingprice"), JOBINFO_KILLPRICE("jobinfo_killprice"),
	JOBINFO_BREEDPRICE("jobinfo_breedprice"), JOBINFO_INFO("jobinfo_info"), JOBLIST_INFO("joblist_info"),
	JOB_LEFT("job_left"), JOB_JOIN("job_join"), CONFIG_CHANGE("config_change"), MONEY_INFO("money_info"),
	MYJOBS_INFO("myjobs_info"), HOME_INFO("home_info"), CREATED("created"), DELETED("deleted"), ADDED("added"),
	REMOVED("removed"), RESTART("restart"), BANK("bank"), GOT_MONEY_WITH_SENDER("got_money_with_sender"),
	GAVE_MONEY("gave_money"), GOT_MONEY("got_money"), DEV_TEST("nothing");

	private String value;

	private MessageEnum(String value) {
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

	/**
	 * Returns SHOP_SELL_SINGULAR for "sell" and SHOP_BUY_SINGULAR for "buy".
	 * 
	 * @param sellBuy
	 * @return MessageEnum
	 */
	public static MessageEnum getSellBuySingularValue(String sellBuy) {
		if (sellBuy.equals("sell")) {
			return SHOP_SELL_SINGULAR;
		} else {
			return SHOP_BUY_SINGULAR;
		}
	}

	/**
	 * Returns SHOP_SELL_PLURAL for "sell" and SHOP_BUY_PLURAL for "buy".
	 * 
	 * @param sellBuy
	 * @return MessageEnum
	 */
	public static MessageEnum getSellBuyPluralValue(String sellBuy) {
		if (sellBuy.equals("sell")) {
			return SHOP_SELL_PLURAL;
		} else {
			return SHOP_BUY_PLURAL;
		}
	}

	/**
	 * Returns SHOP_GOT_ITEM_PLURAL for "got" and SHOP_ADDED_ITEM_PLURAL for
	 * "added".
	 * 
	 * @param sellBuy
	 * @return MessageEnum
	 */
	public static MessageEnum getGotAddedPluralValue(String gotAdded) {
		if (gotAdded.equals("got")) {
			return SHOP_GOT_ITEM_PLURAL;
		} else {
			return SHOP_ADDED_ITEM_PLURAL;
		}
	}

	/**
	 * Returns SHOP_GOT_ITEM_SINGULAR for "got" and SHOP_GOT_ITEM_SINGULAR for
	 * "added".
	 * 
	 * @param sellBuy
	 * @return MessageEnum
	 */
	public static MessageEnum getGotAddedSingularValue(String gotAdded) {
		if (gotAdded.equals("got")) {
			return SHOP_GOT_ITEM_SINGULAR;
		} else {
			return SHOP_ADDED_ITEM_SINGULAR;
		}
	}
}
