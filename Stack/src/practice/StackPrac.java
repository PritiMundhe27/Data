package practice;

public class StackPrac {
int top;
int size;
int []arr;
public StackPrac(int size) {
	this.size=size;
	arr=new int[size];
	top=-1;
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

public void display() {
	for(int i:arr) {
		System.out.print(i+" ");
	}
}


}
