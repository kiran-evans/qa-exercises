package library.items;

import library.ItemType;
import library.Readable;

public class Book extends library.Item implements Readable {
	
	private int chapters = 0;

	public Book(int id, String title, String author, int chapters) {
		super(id, title, ItemType.BOOK, author);
		this.chapters = chapters;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	public String read() {
		return "You are now reading the book.";
	}
	
	public String print () {
		return " [ID: " + this.getId() + ", Title: " + this.getTitle() + ", ItemType: " + this.getItemType() + ", Author: " + this.getAuthor() + ", Chapters: " + this.chapters + "] ";
	}
}
