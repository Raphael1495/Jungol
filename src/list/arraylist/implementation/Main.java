package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		numbers.addlast(10);
		numbers.addlast(20);
		numbers.addlast(30);
		numbers.addlast(40);
		// 20 index에 15, 뒤로 한칸씩 밀림;
//		numbers.add(1, 15); //(index, element)
//		numbers.addFirst(5); // [0]index에 element추가.

		// index[1]의 20이 삭제되므로 20이 return.
//		System.out.println(numbers.remove(1));

		// 첫번째, 마지막 element 삭
//		numbers.removeFirst();
//		numbers.removeLast();

		// 값 불러오기.
//		System.out.println(numbers.get(0));
//		System.out.println(numbers.get(1));
//		System.out.println(numbers.get(2));
//		System.out.println(numbers.get(3));

		// size Method
//		System.out.println(numbers.size());

		// numbers내에 20이 몇번째냐.
		// 존재 = 1, 미존재 = -1
//		System.out.println(numbers.indexOf(50));

		// toString의 약속된 이름의 method호출.
//		System.out.println(numbers);

// ============= Iterator ============================

		// for문을 활용한 반복문.
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}

		// 다음 element를 찾는 기능;
//		ArrayList.ListIterator li = numbers.listIterator();
//		while (li.hasNext()) { // return 값이 없을때 까지 return.
//			System.out.println(li.next());
//		}
//		ArrayList.ListIterator li = numbers.listIterator();
//		while (li.hasNext()) {
//			System.out.println(li.next());
//		}
//		while (li.hasPrevious()) {
//			System.out.println(li.previous());
//		}

		// add로 추가하기.
//		ArrayList.ListIterator li = numbers.listIterator();
//		while (li.hasNext()) {
//			int number = (int) li.next(); //li는 object라 (int)로 형변환.
//			if (number == 30) {
//				li.add(35);
//			}
//			System.out.println(numbers);
//		}
//		System.out.println(numbers);
		
		// add로 추가하기.
		ArrayList.ListIterator li = numbers.listIterator();
		while (li.hasNext()) {
			int number = (int) li.next(); //li는 object라 (int)로 형변환.
			if (number == 30) {
				li.remove();
			}
//			System.out.println(numbers);
		}
		System.out.println(numbers);
	}

}
