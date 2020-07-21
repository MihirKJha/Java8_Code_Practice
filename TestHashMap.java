package mj.programs.java8_Practice;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * There are 4 commonly used implementations of Map in Java SE - HashMap,
 * TreeMap, Hashtable and LinkedHashMap. 
 * If we use only one sentence to describe
 * each implementation, it would be the following:
 *  HashMap is implemented as a hash table, and there is no ordering on keys or values. 
 *  TreeMap is implemented based on red-black tree structure, and it is ordered by the key.
 *  LinkedHashMap preserves the insertion order 
 *  Hashtable is synchronized, in contrast to HashMap. It has an overhead for synchronization.
 * 
 * This is the reason that HashMap should be used if the program is thread-safe.
 * 
 * The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.
 * 
 * 
 * 
 * @author Mihir
 *
 */

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		hashMap.put(d1, 10);
		hashMap.put(d2, 15);
		hashMap.put(d3, 5);
		hashMap.put(d4, 20);
		// print size
		System.out.println(hashMap.size());
		// loop HashMap
		for (Entry<Dog, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
	}
}
