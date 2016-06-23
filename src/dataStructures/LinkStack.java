package dataStructures;

public class LinkStack {
	private LinkList list;
	private int topIndex = -1;

	public LinkStack() {
		list = new LinkList();
	}
	
	public void push(int value){
		list.add(value);
		topIndex++;
	}
	
	public Object pop(){
		Object result = list.get(topIndex);
		list.remove(topIndex);
		topIndex--;
		return result;
	}
	
	public String toString(){
		return list.toString();
	}

}
