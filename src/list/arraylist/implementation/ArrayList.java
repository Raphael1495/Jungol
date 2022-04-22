package list.arraylist.implementation;

public class ArrayList {

	private int size = 0; // List의 인덱스 값이 됨.
	// 오브젝트 데이터타입의 배열을 생성해서 엘리멘트데이터 인스턴스 변수에 할당 (100칸)
	private Object[] elementData = new Object[100];

	public boolean addFirst(Object element) {
		// add method를 사용하기 때문에 알아서 뒤로 밀린다.
		return add(0, element);
	}

	public boolean addlast(Object element) {
		elementData[size] = element;
		size++; // size = 1;
		return true;
	}

	public boolean add(int index, Object element) {
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}

	// toString Method를 직접 구현.
	public String toString() {
		String str = "["; // "[" 선언;
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1) { // 맨 마지막 "," 제외;
				str += ","; // element 뒤의 ","로 구분;
			}
		}
		return str + "]"; // "]" 선언;
	}

	public Object remove(int index) {
		// 삭제하려는 데이터의 값을 써놓는다. (이해가 안됨)
		Object removed = elementData[index]; // 값 [

		for (int i = index + 1; i <= size - 1; i++) {
			// element가 한칸씩 앞으로 이동.
			elementData[i - 1] = elementData[i];
		}
		size--;
		// 맨 뒤의 element를 삭제.
		elementData[size] = null;
		// remove Method의 기본 동작 방법은 return값이 존재.
		return removed;
	}

	public Object removeFirst() {
		return remove(0);
	}

	public Object removeLast() {
		return remove(size - 1);
	}

	// 배열의 index로 접근한다는 장점이 있음.
	public Object get(int index) {
		return elementData[index];
	}

	// 외부에서 size 변수 값을 함부로 수정못하게 하려고.
	public int size() {
		return size;
	}

	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			// o와 element가 같다면 현재 index값을 리턴
			// for문 강제종
			if (o.equals(elementData[i])) {
				return i;
			}
		}
		// 찾을 수 없다면 -1 return
		return -1;
	}

	// ListIterator = dataType
	public ListIterator listIterator() {
		return new ListIterator();
	}

	class ListIterator {
		private int nextIndex = 0;

		public boolean hasNext() {
			return nextIndex < size();
		}

		public Object next() {
			// next가 호출될때마다 하나씩 return.
//			Object returnData = elementData[nextIndex];
//			nextIndex++;
//			return returnData;

			// 더 깔끔하게.
			// nextIndex 초기화값이 사용되고 +1 되는 순서.
			// 위와 동일
			return elementData[nextIndex++];
		}

		public Object previous() {
			return elementData[--nextIndex];
		}

		public boolean hasPrevious() {
			return nextIndex > 0;
		}

		public void add(Object element) {
			ArrayList.this.add(nextIndex++, element);
		}
		// 현재의 next를 삭제하는 것이기 때문에
		// 한번도 next를 호출하지 않았으면 코드가 실행되지 않음.
		public void remove() {
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
}
