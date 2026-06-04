package com.pluralsight.streams;

import com.pluralsight.Person;
import java.util.*;

public class Program {
	public static void main (String[] args) {
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

		List<Person> adults = persons.stream()
				.filter(person -> person.getAge() >= 18)
				.toList();

		/* starts a stream of Person objects
		 * converts all names to lowercase and checks the first name and last name of each person
		 * .filter(...) keeps only the items (first name and last name) that returns true
		 * .toList() collects the matching people into a new list by converting the filtered stream back into a List. */
		List<Person> searchPerson = persons.stream()
				.filter(person ->
						person.getFirstName().toLowerCase().startsWith(name) ||
						person.getLastName().toLowerCase().startsWith(name))
				.toList();

		searchPerson.forEach(person -> System.out.println("Search Result: \n" + person));
		System.out.println();

		/* starts a stream of Person objects
		 * converts each Person into their age as a double
		 * copares the ages and keeps smaller of the two
		 * return 0.0 if the list is empty
		 *
		 * Note:
		 * .map(Person::getAge) == .map(person -> person.getAge())
		 * .min(Double::compare) == .min((age1, age2) -> Double.compare(age1, age2)) */
		Double youngestAge = persons.stream()
				.map(person -> person.getAge())
				.min(Double::compare)
				.orElse(0.0);

		System.out.println(("Youngest: \n" + youngestAge));
		System.out.println();

		Double oldestAge = persons.stream()
				.map(Person::getAge)
				.max(Double::compare)
				.orElse(0.0);

		System.out.println("Oldest: \n" + oldestAge);
		System.out.println();

		/* starts a stream of Person objects
		 * .mapToDouble(...) creates a DoubleStream, which has numeric methods (e.g .average(), .min(), .max(), and .sum())
		    * it converts each Person into their age as a double
		 * .average() calculates the avg of all ages
		 * return 0.0 if the list happens to be empty */
		double averageAge = persons.stream()
				.mapToDouble(Person::getAge)
				.average()
				.orElse(0.0);

		System.out.println("Average Age: \n" + averageAge);
	}
}