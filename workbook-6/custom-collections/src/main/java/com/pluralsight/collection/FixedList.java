package com.pluralsight.collection;

import java.util.*;
// a blueprint with a (T) placeholder type
public class FixedList<T> {
	private int maxSize;
	// T is a (generic) type parameter.
	//  allows list to store any type when FixedList object is created
	private List<T> items = new ArrayList<>();

	// This is a constructor
	public FixedList(int maxSize){
		this.maxSize = maxSize;
	}
	public void add(T item){
		// checking to see if the current size of array is less than the maxSize.
		if (items.size() < maxSize) {
			items.add(item);
		}
		else {FullList.handleListFull();}   // printing
	}

	public List<T> getItems(){
		return items;       // list of items that're stored in FixedList
	}
}