package ConstruvtoInjection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		al.stream().forEach(e -> System.out.println(tripleit(e)));

		System.out.println("HEllo");
		al.stream().forEach(Test::doubleit);

	}

	public static int tripleit(int i) {
		return i * 3;

	}

	public static void doubleit(int i) {
		System.out.println(i * 2);

	}

}
