package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test17 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		ListIterator iterator = list.listIterator();
		iterator.next();
		iterator.add("addString");
		iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " " + iterator.nextIndex());
		}
	}
}
