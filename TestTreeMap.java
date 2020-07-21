package mj.programs.java8_Practice;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * A TreeMap is sorted by keys.It implements SortedMap interface .
 * 
 * Since TreeMaps are sorted by keys, the object for key has to be able to
 * compare with each other, that's why it has to implement Comparable interface.
 * 
 * For example, you use String as key, because String implements Comparable
 * interface.
 * 
 * 
 * 
 * @author Mihir
 *
 */
class Dog1 implements Comparable<Dog1> {
	String color;
	int size;

	Dog1(String c, int s) {
		color = c;
		size = s;
	}

	public String toString() {
		return color + " dog";
	}

	@Override
	public int compareTo(Dog1 o) {
		return o.size - this.size;
	}
}

public class TestTreeMap {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1("red", 30);
		Dog1 d2 = new Dog1("black", 20);
		Dog1 d3 = new Dog1("white", 10);
		Dog1 d4 = new Dog1("white", 10);
		TreeMap<Dog1, Integer> treeMap = new TreeMap<Dog1, Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
		for (Entry<Dog1, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
