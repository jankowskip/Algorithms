package dataStructures;

public class LinkStack {
	private LinkList<Integer> list;
	private int topIndex = -1;

	public LinkStack() {
		list = new LinkList<Integer>();
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
