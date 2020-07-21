package mj.programs.java8_Practice;

public class Dog {
	String color;

	Dog(String c) {
		color = c;
	}

	public boolean equals(Object o) {
		return ((Dog) o).color.equals(this.color);
	}

	public int hashCode() {
		return color.length();
	}

	public String toString() {
		return color + " dog";
	}
}
