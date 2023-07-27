package practice;

public class LinearQueue {
private int []arr;
private int front, rear;
private int size;
 
 public LinearQueue(int size) {
	this.size=size;
	front=rear=-1;
arr=new int[size];	
}
 
 public boolean isEmpty() {
	 return ((front==-1 && rear==-1) || (front>rear));
 }
 public boolean isFull() {
	 return rear==size-1;
 }
 
 public boolean insert(int data) {
	 if(isFull()) {
		 return false;
	 }
	 arr[++rear]=data;
	 if(front==-1) {
		 front=0;
	 }
	 
	 return true;
 }
  public int delete() {
	  if(isEmpty()) {
		  return -1;
	  }
	  return arr[front++];
  }
 	
	
}
