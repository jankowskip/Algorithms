package dataStructures;

public class LinkList<E> {
	private Node<E> head;
	private int size = 0;

	public LinkList() {
		head = new Node<E>(null);
	}

	public boolean add(E e) {
		Node<E> node = new Node<E>(e);
		Node<E> current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(node);
		size++;
		return true;
	
	}

	public boolean add(E e, int index) {
		if (index >= size || index < 0) {
			return false;
		}
		Node<E> node = new Node<E>(e);
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		Node<E> temp = current.getNext();
		current.setNext(node);
		node.setNext(temp);
		size++;
		return true;
	}

	public boolean remove(int index) {
		if (index >= size || index < 0) {
			return false;
		}
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());

		size--;
		return true;
	}

	public int size() {
		return size;
	}
	
	public E get(int index){
		checkRange(index);
		Node<E> current = head;
		for (int i = 0; i <= index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}


	public String toString() {
		Node<E> current = head;
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


	private class Node<E> {
		Node<E> next;
		E data;

		public Node(E e) {
			next = null;
			this.data = e;
		}

		public E getData() {
			return data;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
}