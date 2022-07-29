package library;

import library.items.*;

public class Runner {

	public static void main(String[] args) {
		
		Inventory libraryInventory = new Inventory();
		int itemIdCount = 0;
		int personIdCount = 0;
		
		libraryInventory.add(new Book(++itemIdCount, "A Game of Thrones", "George R. R. Martin", 30));
		libraryInventory.add(new Book(++itemIdCount, "Macbeth", "William Shakespeare", 25));
		libraryInventory.add(new Book(++itemIdCount, "American Gods", "Neil Gaiman", 24));
		libraryInventory.add(new Diss(++itemIdCount, "Diss 1", "John Smith", "Dr. Joe Bloggs"));
		libraryInventory.add(new Diss(++itemIdCount, "Diss 2", "Jim Jimothy", "Prof. Mandy Jones"));
		libraryInventory.add(new Diss(++itemIdCount, "Diss 3", "Henrietta Henrietta", "Dr. Jane Gray"));
		libraryInventory.add(new GovDoc(++itemIdCount, "The Secret to Staying Prime Minister", "B. Johnson", "Cabinet", ClassificationLevel.SECRET));
		libraryInventory.add(new GovDoc(++itemIdCount, "How to Deport People", "P. Patel", "Cabinet", ClassificationLevel.SECRET));
		libraryInventory.add(new GovDoc(++itemIdCount, "Is Murder Illegal?", "J. Hunt", "Cabinet", ClassificationLevel.TOP_SECRET));
		
		libraryInventory.printLibrary();
		System.out.println();
		
		libraryInventory.getItemById(4).setTitle("Changed Title");
		libraryInventory.remove(libraryInventory.getItemById(7));
		
		libraryInventory.printLibrary();
		System.out.println();
		
		
		Person person1 = new Person(++personIdCount, "Jim Jones");
		Person person2 = new Person(++personIdCount, "Smith Smithson");
		
		person1.checkOut(libraryInventory.getItemById(4), libraryInventory);
		System.out.println();
		
		person2.checkOut(libraryInventory.getItemById(6), libraryInventory);
		System.out.println();
		
		person1.checkIn(person1.getItemById(2), libraryInventory);
	}

}
