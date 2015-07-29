package SortedLinkList;

public class SortedIntList {
	
	private Node start;
	
	public void add(int value){
		Node newNode = new Node(value);
		if(start == null){
			start = newNode;
		}else {
			Node temp = start;
			if(temp.getValue() > newNode.getValue()){
				newNode.setNext(start);
				start = newNode;
				return;
			}
			while(temp.getNext() != null){
				if (newNode.getValue() < temp.getNext().getValue()){
					newNode.setNext(temp.getNext());
					temp.setNext(newNode);
					return;
				}
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}
	public int[] toArray(){
		int length = getLength();
		int[] array = new int[length];
		Node temp = start;
		for(int i = 0; i < length; i++){
			array[i] = temp.getValue();
			temp = temp.getNext();
		}
		return array;
	}
	public int getLength(){
		if(start == null){
			return 0;
		}
		return getLengthRecursion(start);
	}
	public int getLengthRecursion(Node node){
		if(node.getNext() == null){
			return 1;
		}
		return getLengthRecursion(node.getNext()) + 1;
	}
	public class Node{
		private int value;
		private Node next;
		
		public Node(int value){
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
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
			return "Node [value=" + value + ", next=" + next + "]";
		}
		
		
	}
}
