package dataStructures;

public class LinkList {
	private Node head;
	private int size = 0;

	public LinkList() {
		head = new Node(null);
	}

	public void add(Object o) {
		Node node = new Node(o);
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(node);
		size++;
	}

	public void add(Object o, int index) {
		checkRange(index);
		Node node = new Node(o);
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		Node temp = current.getNext();
		current.setNext(node);
		node.setNext(temp);
		size++;
	}

	public void remove(int index) {
		checkRange(index);
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());

		size--;
	}

	public int size() {
		return size;
	}
	
	public Object get(int index){
		checkRange(index);
		Node current = head;
		for (int i = 0; i <= index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}


	public String toString() {
		Node current = head;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			current = current.getNext();
			sb.append(current.getData().toString());
			if (i == size - 1) {
				sb.append("]");
			} else {
				sb.append(", ");
			}
		}
		return sb.toString();
	}
	
	private void checkRange(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
	}

	private class Node {
		Node next;
		Object data;

		public Node(Object data) {
			next = null;
			this.data = data;
		}

		public Object getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}