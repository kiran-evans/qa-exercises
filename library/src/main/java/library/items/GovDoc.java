package library.items;

import library.ClassificationLevel;
import library.ItemType;
import library.Readable;

public class GovDoc extends library.Item implements Readable {
	
	private String department = "";
	private ClassificationLevel classificationLevel = null;

	

	public GovDoc(int id, String title, String author, String department,
			ClassificationLevel classificationLevel) {
		super(id, title, ItemType.GOVDOC, author);
		this.department = department;
		this.classificationLevel = classificationLevel;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public ClassificationLevel getClassificationLevel() {
		return classificationLevel;
	}

	public void setClassificationLevel(ClassificationLevel classificationLevel) {
		this.classificationLevel = classificationLevel;
	}

	public String read() {
		return "You are now reading the government document.";
	}
	
	public String print () {
		return " [ID: " + this.getId() + ", Title: " + this.getTitle() + ", ItemType: " + this.getItemType() + ", Author: " + this.getAuthor() + ", ClassificationLevel: " + this.classificationLevel + "] ";
	}
}
