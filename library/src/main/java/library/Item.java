package library;

public abstract class Item {
	
	private int id = -1;
	private String title = "";
	private ItemType itemType = null;
	private String author = "";

	public Item(int id, String title, ItemType itemType, String author) {
		super();
		this.id = id;
		this.title = title;
		this.itemType = itemType;
		this.author = author;
	}
	
	public String print () {
		return " [ID: " + this.id + ", Title: " + this.title + ", ItemType: " + this.itemType + ", Author: " + this.author + "] ";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
