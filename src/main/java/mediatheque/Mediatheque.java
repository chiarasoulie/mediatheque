package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		ItemVisitor printBooksVisitor = new BooksVisitor();
		for (Item i : items) {
			i.accept(printBooksVisitor);
		}
	}

	public void printOnlyCDs() {
		ItemVisitor printCdVisitor = new CdsVisitor();
		for(Item i : items){
			i.accept(printCdVisitor);
		}
	}

}
