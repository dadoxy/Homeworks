public class LinkedListDouble {

	private Node start;

	public LinkedListDouble() {
		start = null;
	}

	public LinkedListDouble (LinkedListDouble o){
		for(int i = 0; i < o.getSize(); i++){
			add(o.get(i));
		}
	}
	
	public double getMiddle(){
		if(start == null){
			return -1;
		}
		Node temp = start;
		int size = getSize() / 2;
		for (int i = 0; i < size; i++){
			temp = temp.getNext();
		}
		return temp.getValue();
	}

	public void add(double element) {
		if (start == null) {
			start = new Node(element);
		}
		Node last = getLast();
		last.setNext(new Node(element));
	}
	
	public double getFirst(){
		return start.getValue();
	}
	
	public void deleteFirst(){
		Node first = start;
		first = first.getNext();
		start = first;
	}
	public void deleteLast(){
		Node last = getLast();
		Node previous = getPrevious(last);
		last = previous;
	}

	public int getSize(){
		if(start == null){
			return 0;
		}
		int counter = 0;
		Node temp = start;
		while(temp.getNext() != null){
			temp = temp.getNext();
			counter++;
		}
		return counter;
	}
	private Node getLast() {
		if (start == null) {
			return null;
		}
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}

	public void remove(int index) {
		Node temp = start;
		for(int i = 0; i < index; i++){
			temp = temp.getNext();
		}
		Node previous = getPrevious(temp);
		previous.setNext(temp.getNext());
	}
	
	public Node getPrevious(Node element){
		if(start == null){
			return null;
		}
		Node temp = start;
		while(temp.getNext() != element){
			temp = temp.getNext();
		}
		return temp;
	}
	public Double get(int index){
		Node temp = start;
		for(int i = 0; i < index; i++){
			temp = temp.getNext();
		}
		return temp.getValue();
	}

	public class Node {

		private double value;
		private Node next;

		public Node(double value) {
			this.value = value;
		}

		public double getValue() {
			return value;
		}

		public void setValue(double value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}

	}
}
