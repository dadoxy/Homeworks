public class LinkedList {

	private Node start;
	private int size;

	public LinkedList() {
		start = null;
		size = 0;
	}

	public void add(Boolean value) {

		if (start == null) {
			start = new Node(value);

		} else {
			Node last = getLast();

			last.next = new Node(value);
		}
		size++;
	}

	public void remove(Boolean element, int index) {
		Node temp = start;
		for(int i = 0; i < index; i++){
			temp = temp.next;
		}
		
		for(int i = index; i < getSize(); i++){
			if(temp.next.value == element){
				temp = temp.next;
				break;
			}else{
				temp = temp.next;
			}
		}
		Node previous = getPrevious(temp);
		previous.setNext(temp.next);
	}

	public boolean contains(boolean element) {
		Node temp = start;
		if (temp.value.equals(element)) {
			return true;
		}
		while (temp != null) {
			if (temp.value.equals(element)) {
				return true;
			}
		}
		return false;
	}

	public boolean isAlternating() {
		Node temp = start;
		while (temp != null) {
			if (temp.value = true && temp.next.value.equals(!temp.value)
					|| temp.value == false
					&& temp.next.value.equals(!temp.value)) {
				return true;
			}
		}
		return false;
	}

	public void remove(int index) {
		Node tmp = start;
		for (int i = 0; i < index; i++) {
			tmp = tmp.next;
		}
		Node tmp1 = start;
		for (int i = 0; i < index + 1; i++) {
			tmp1 = tmp1.next;
		}
		tmp.next = tmp1;
	}

	public void remove(Boolean element) {
		Node temp = start;
		for(int i = 0; i < getSize(); i++){
			if(temp.value == element){
				break;
			}else{
				temp = temp.next;
			}
		}
		Node previous = getPrevious(temp);
		previous.setNext(temp.next);

	}

	public int getSize() {
		if (start == null) {
			return 0;
		}
		int counter = 0;
		Node temp = start;
		while (temp.next != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	private Node getPrevious(Node n) {
		Node temp = start;
		if (n == start) {
			return null;
		}
		while (temp.next != n) {
			temp = temp.next;
		}
		return temp;
	}

	private Node getLast() {
		Node tmp = start;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
	}

	@Override
	public String toString() {
		return "LinkedList [start=" + start + ", size=" + size + "]";
	}

	class Node {
		Boolean value;
		Node next;

		public Node(Boolean value) {
			this.value = value;
			this.next = null;
		}
		
		public void setNext(Node next){
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}

	}
}
