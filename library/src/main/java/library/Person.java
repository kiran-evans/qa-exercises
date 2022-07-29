package library;

import java.util.ArrayList;

public class Person implements HoldsItem {
	private int id = -1;
	private String name = "";
	private ArrayList<Item> checkedOutItems = new ArrayList<Item>();
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Item> getCheckedOutItems() {
		return checkedOutItems;
	}
	public void setCheckedOutItems(ArrayList<Item> checkedOutItems) {
		this.checkedOutItems = checkedOutItems;
	}
	
	public Item getItemById (int id) {
		
		Item foundItem = null;
		
		for (Item item : this.checkedOutItems) {
			if (item.getId() == id) {
				foundItem = item;
				break;
			}
		}

		return foundItem;
	}
	
	public void checkOut (Item item, Inventory inventory) {
		inventory.remove(item);
		this.checkedOutItems.add(item);
		System.out.println(this.name + " checked out the " + item.getItemType() + " '" + item.getTitle() + "'.");
	}
	
	public void checkIn (Item item, Inventory inventory) {
		this.checkedOutItems.remove(item);
		inventory.add(item);
		System.out.println(this.name + " checked in the " + item.getItemType() + " '" + item.getTitle() + "'.");
	}
	
	
}
