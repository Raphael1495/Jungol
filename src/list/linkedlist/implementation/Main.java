package list.linkedlist.implementation;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("add(값)");
		System.out.println(numbers);

		numbers.add(1, 50);
		System.out.println("\nadd(인덱스, 값)");
		System.out.println(numbers);

		numbers.remove(2);
		System.out.println("\nremove(인덱스)");
		System.out.println(numbers);

		System.out.println("\nget(인덱스)");
		System.out.println(numbers.get(2));

		System.out.println("\nsize()");
		System.out.println(numbers.size());

		System.out.println("\nindexOf()");
		System.out.println(numbers.indexOf(30));

		Iterator it = numbers.iterator();
		System.out.println("\niterator");
		while (it.hasNext()) { // 값이 있을 때 까지 while 실행;
			int value = (int) it.next(); // 기본적으로 object type이기 때문에 (int)로 변환;
			if (value == 30) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);

		System.out.println("\nfor each");
		for (int value : numbers) { // numbers의 value를 value에 하나씩 저
			System.out.println(value); // value를 하나씩 출력;
		}

		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

	}

}