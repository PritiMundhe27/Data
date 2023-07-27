package practice;

public class Stack<Integer> {
private int []arr;
private int size;
private int top;
public Stack(int size) {
	top=-1;
	this.size=size;
	arr=new int [size];
}
public boolean isEmpty() {
	return top==-1;
}
public boolean isFull() {
	return top==(size-1);
}
public boolean push(int data) {
	if(isFull()) {
		return false;
	}
	arr[++top]=data;
	return true;
	
}
public int pop() {
	if(isEmpty()) {
		return -1;
	}
	return arr[top--];
}
public int peek() {
	if(isEmpty()) {
		return -1;
	}
	return arr[top];
}


}
