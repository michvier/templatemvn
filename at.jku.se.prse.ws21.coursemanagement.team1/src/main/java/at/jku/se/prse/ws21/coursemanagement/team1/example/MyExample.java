package at.jku.se.prse.ws21.coursemanagement.team1.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyExample {
	
	public List<String> allItems = new ArrayList<>();
	
	/**
	 * Add a new item to the list, only if the item is not in the list already.
	 * @param itemName The item to be added.
	 * @throws IllegalArgumentException if the item is already in the list.
	 */
	public void addItem(String itemName) throws IllegalArgumentException{
		if (allItems.contains(itemName)) {
			throw new IllegalArgumentException(String.format("Item %s already in the list!", itemName));
		}
		allItems.add(itemName);
	}

	/**
	 * 
	 * @return The list of items.
	 */
	public List<String> getItems() {
		return Collections.unmodifiableList(allItems);
	}

}
