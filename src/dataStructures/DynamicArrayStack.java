package dataStructures;

public class DynamicArrayStack {
	private DynamicArray array;
	private int topIndex = -1;
	
	public DynamicArrayStack(){
		array = new DynamicArray();
	}
	
	public DynamicArrayStack(int size) {
		array = new DynamicArray(size);
	}
	
	
	public void push(int value){
		array.add(value);
		topIndex++;
	}
	
	public int pop(){
		int result = array.get(topIndex);
		array.remove(topIndex);
		topIndex--;
		return result;
		
	}
	
	public String toString(){
		return array.toString();
	}
}
