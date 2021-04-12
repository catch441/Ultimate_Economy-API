package com.ue.shopsystem.logic.api;

import org.bukkit.inventory.ItemStack;

public interface ShopItem {

	/**
	 * Returns the item stack with a amount of one.
	 * 
	 * @return ItemStack
	 */
	public ItemStack getItemStack();
	
	/**
	 * Set the item stack with a amount of one.
	 * 
	 * @param itemStack
	 */
	public void setItemStack(ItemStack itemStack);
	
	/**
	 * Returns the item amount.
	 * 
	 * @return integer
	 */
	public int getAmount();
	
	/**
	 * Set the item amout.
	 * 
	 * @param amount
	 */
	public void setAmount(int amount);
	
	/**
	 * Returns the sell price.
	 * 
	 * @return double
	 */
	public double getSellPrice();
	
	/**
	 * Set the item sell price.
	 * 
	 * @param sellPrice
	 */
	public void setSellPrice(double sellPrice);
	
	/**
	 * Returns the buy price.
	 * 
	 * @return double
	 */
	public double getBuyPrice();
	
	/**
	 * Set the buy price.
	 * 
	 * @param buyPrice
	 */
	public void setBuyPrice(double buyPrice);
	
	/**
	 * Returns the unique item hash.
	 * 
	 * @return item hash
	 */
	public int getItemHash();
	
	/**
	 * Returns the item stock.
	 * 
	 * @return stock
	 */
	public int getStock();
	
	/**
	 * Set the item stock.
	 * 
	 * @param stock
	 */
	public void setStock(int stock);
	
	/**
	 * Returns the slot.
	 * 
	 * @return slot
	 */
	public int getSlot();
}
