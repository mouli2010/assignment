package com.regnent.datastructer;

public class LinkedlistApp {

	public static void main(String[] args) {
		LinkedlistEx list=new LinkedlistEx();

		list.add(12);
		list.add(25);
		list.add(40);
		list.addAtStart(30);
		list.addAt(2, 10);
		//list.deleteAt(1);
		list.show();
		

	}

}
