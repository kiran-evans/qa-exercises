package library;

import java.util.ArrayList;

public class Inventory implements HoldsItem {
	private ArrayList<Item> inventoryList = new ArrayList<Item>();
	
	public Inventory() {
		super();
	}

	public ArrayList<Item> getInventory() {
		return inventoryList;
	}

	public void setInventory(ArrayList<Item> inventoryList) {
		this.inventoryList = inventoryList;
	}
	
	public void add (Item item) {
		this.inventoryList.add(item);
	}
	
	public void remove (Item item) {
		this.inventoryList.remove(item);
	}
	
	public Item getItemById (int id) {
		
		Item foundItem = null;
		
		for (Item item : this.inventoryList) {
			if (item.getId() == id) {
				foundItem = item;
				break;
			}
		}

		return foundItem;
	}
	
	public void printLibrary () {
		for (Item item : this.inventoryList) {
			System.out.println(item.print());
		}
	}
	
	
}
