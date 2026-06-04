package com.pluralsight;

import java.util.*;

public class Program {
	public static void main (String[] args){
		var persons = new ArrayList<Person>();

		persons.add(new Person("Naruto", "Uzumaki", 33));
		persons.add(new Person("Monkey D.", "Luffy", 19));
		persons.add(new Person("Goku", "Son", 47));
		persons.add(new Person("Ichigo", "Kurosaki", 29));
		persons.add(new Person("Light", "Yagami", 23));
		persons.add(new Person("L", "Lawliet", 24));
		persons.add(new Person("Levi", "Ackerman", 30));
		persons.add(new Person("Satoru", "Gojo", 29));
		persons.add(new Person("Tanjiro", "Kamado", 15));
		persons.add(new Person("Usagi", "Tsukino", 16));

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type the first or last name you are searching for: ");
		String name = scanner.nextLine().trim().toLowerCase();


		/* -------------------------------------------------*/
		/* ------------------ AVERAGE AGE ------------------*/
		/* -------------------------------------------------*/

		double age = 0;
		int count = 0;

		for(Person person : persons){
			age += person.getAge();
			count++;
		}

		double averageAge = age / count;
		System.out.println("Average Age: " + averageAge);



		/* ------------------------------------------------*/
		/* ------------------ OLDEST AGE ------------------*/
		/* ------------------------------------------------*/

		Person oldestAge = persons.get(0);
		for(Person person : persons) {
			if (person.getAge() > oldestAge.getAge()){
				oldestAge = person;
			}
		}

		System.out.println("Oldest: " + oldestAge.toString());


		/* --------------------------------------------------*/
		/* ------------------ YOUNGEST AGE ------------------*/
		/* --------------------------------------------------*/

		Person youngestAge = persons.get(0);
		for(Person person : persons) {
			if (person.getAge() < youngestAge.getAge()){
				youngestAge = person;
			}
		}
		System.out.println("Youngest: " + youngestAge.toString());

	}
}
