package com.company;

import apple.laf.JRSUIUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//		1
		appendHashSet("vuy", set);
		//		2

		set.add("234");

		set.add("456");
		set.add("123");


		HashSet<String> set1 = new HashSet<>(set);
		set.add("345");

		intersectionOfSets(set, set1);

		System.out.println(areSetsIdentical(set, set1));

		Iterator iterator = iterateOverSet(set);

		//		3
		System.out.println(getHashSetSize(set));

		//		4
		emptyTheSet(set);
		System.out.println(set.size());

		//		cloneSet(set).forEach(v-> System.out.println(v));

		convertHashSetToTreeSet(set).forEach(v -> System.out.println(v));

		HashMap<String, Integer> original = new HashMap<String, Integer>() {{
			put("asd", 123);
			put("qwe", 234);
		}};

		System.out.println(isMapContainingKeyValue(original, "asd", 234));
		System.out.println((setFromMap(original).getClass().getSimpleName()));
		System.out.println(valuesOfMap(original));
	}

	//1
	public static void appendHashSet(String element, Set<String> set) {
		if (set.contains(element)) {
			//			I know that it's not necessary, just want to use it
			return;
		}
		set.add(element);
	}

	//2
	public static Iterator iterateOverSet(Set set) {
		Iterator iterator = set.iterator();
		return iterator;
	}

	//3
	public static int getHashSetSize(Set set) {
		return set.size();
	}

	//4
	public static void emptyTheSet(Set set) {
		set.clear();
	}

	//5
	public boolean isSetEmpty(Set set) {
		return set.size() == 0;
	}

	//	6
	public static HashSet cloneSet(Set set) {
		return new HashSet(set);
	}

	//7
	public static Object[] convertSetIntoArray(Set set) {
		return set.toArray();
	}

	//8
	public static TreeSet convertHashSetToTreeSet(Set set) {
		return new TreeSet(set);
	}

	//9
	public static ArrayList convertSetToArrayList(Set set) {
		return new ArrayList(set);
	}

	//10
	public static boolean areSetsIdentical(Set toCompare, Set compareWith) {
		return toCompare.size() == compareWith.size() && !toCompare.retainAll(compareWith);
	}

	//11
	public static Set intersectionOfSets(Set set1, Set set2) {
		if (!set1.retainAll(set2)) {System.out.println("They are the same");}
		set1.retainAll(set2);
		return set1;
	}

	//	12
	public static Set removeAllElements(Set set) {
		set.removeAll(set);
		return set;
	}

	//13
	public static void addKeyValuetoMap(Map map, String key, String value) {
		map.put(key, value);
	}

	//14
	public static int getMapSize(Map map) {
		return map.size();
	}

	//15
	public static Map cloneMap(Map original) {
		HashMap map = new HashMap();
		map.putAll(original);
		return map;
	}

	//16
	public static void removeAllElementsFromMap(Map map) {
		map.clear();
	}

	//	17
	public static boolean isMapContainingKeyValue(Map map, String key, int value) {
		return map.containsKey(key) && map.get(key).equals(value);
	}
//	18
	public static Map copyMap(Map map){
		return new HashMap(map);
	}
//	19
	public static boolean isMapContainingKey(Map map, Object key){
		return map.containsKey(key);
	}

//	20
	public static boolean isMapContainsValue(Map map, Object value){
		return map.containsValue(value);
	}
//	21
	 public static Set setFromMap(Map map){
		return new HashSet(map.entrySet());
	 }

	 public static Object getValueOfKeyInMap(Map map, Object key){
		return map.get(key);
	 }

	 public static Set keysOfMap(Map map){
		return new HashSet(map.keySet());
	 }

	 public static List valuesOfMap(Map map){
		return new ArrayList(map.values());
	 }

}