package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//		1. Convert to uppercase
		List<String> tarberCase = Arrays.asList("qwe", "qasd", "zxc", "wer");
		List<String> upperCase = tarberCase.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCase);

		//		2. Only four shall pass
		List<String> randomSize = Arrays.asList("qwqweqw", "asa", "asdqw", "as", "xfsd", "qweqweasd", "as", "s", "fgf", "1312", "as");
		List<String> fourSized = randomSize.stream().filter(el -> el.length() < 4).collect(Collectors.toList());
		System.out.println(fourSized);

		//		3. Flatten multidimensional creature
		List<List<String>> dormamu = Arrays.asList(tarberCase, upperCase, randomSize, fourSized);
		System.out.println(dormamu);
		List<String> flatten = dormamu.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(flatten);

		//		4. Oldest guy
		List<Person> ceranoc = new ArrayList<Person>() {{
			add(new Person(82, "Hamo"));
			add(new Person(84, "Abul"));
			add(new Person(81, "Vram"));
			add(new Person(94, "Gaspar"));
			add(new Person(12, "Garegincho"));
			add(new Person(77, "Albert"));
			add(new Person(89, "Sofia Petrovna"));
		}};

		Person oldest = ceranoc.stream().reduce(ceranoc.get(0), (sub, el) -> sub.getAge() > el.getAge() ? sub : el);
		System.out.println(oldest.getName());

		//		5. Sum all elements
		List<Integer> noSum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		int saxObshi = noSum.stream().reduce(0, (thisOne, element) -> thisOne + element);


		//		6. Get kids
		List<Person> people = Arrays.asList(new Person(12, "Gayane"),
			new Person(10, "Abul"),
			new Person(20, "Vahramik"),
			new Person(18, "Hasmik"),
			new Person(29, "Soful"),
			new Person(13, "Hmayak"),
			new Person(14, "Sapog"),
			new Person(15, "Ashtarak"),
			new Person(16, "Popoq"),
			new Person(17, "Hmayak Jan")
		);

		List<Person> pedofilist = people.stream().filter(el -> el.getAge() < 18).collect(Collectors.toList());
		pedofilist.forEach(el -> System.out.print(el.getName() + "||"));

		//		7. Separate kids from adults to avoid Filial cannibalism
		Map<Boolean, List<Person>> sayNoToFilialCannibalism = people.stream().collect(Collectors.groupingBy(el -> el.getAge() >= 18));
		System.out.println("\n");
		sayNoToFilialCannibalism.get(true).forEach(el -> System.out.print(el.getAge() + "||" + el.getName() + "||"));

		//		8. group by nationality
		List<Person> dastakertBattleInvitationList = Arrays.asList(
			new Person("Hayk", "Armenian"),
			new Person("Marduk", "Babylonian"),
			new Person("Nebuchadnezzar", "Babylonian"),
			new Person("Aramanyak", "Armenian"),
			new Person("Vital", "Babylonian"),
			new Person("Amasya", "Armenian"),
			new Person("Ara", "Armenian"),
			new Person("Torgom", "Armenian"),
			new Person("Bel", "Babylonian"));

		Map<String, List<Person>> battleSides = dastakertBattleInvitationList.stream().collect(Collectors.groupingBy(el -> el.getNationality()));
		System.out.println("\n");
		battleSides.get("Babylonian").forEach(el -> System.out.print(el.getName() + "||"));
//		9. Comma separated peoples name
		String dastakertToString = dastakertBattleInvitationList.stream().map(Person::getName).collect(Collectors.joining(", "));

		System.out.println("\n" + dastakertToString);
	}
}