package library.items;

import library.ItemType;
import library.Readable;

public class Diss extends library.Item implements Readable {

	private String professorName = "";

	public Diss(int id, String title, String author, String professorName) {
		super(id, title, ItemType.DISS, author);
		this.professorName = professorName;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	
	public String print () {
		return " [ID: " + this.getId() + ", Title: " + this.getTitle() + ", ItemType: " + this.getItemType() + ", Author: " + this.getAuthor() + ", Professor: " + this.professorName + "] ";
	}

	public String read() {
		return "You are now reading the dissertation.";
	}
}
