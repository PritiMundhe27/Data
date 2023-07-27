package practice;

public class SinglyLinkedList {

private Node head;


public boolean insertAtFirst(int data) {
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		return true;
	}
	head=head.getNext();
	newNode.setNext(head);	
	return true;
}
public boolean insertAtEnd(int data) {
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		return true;
	}
	Node temp=head;
	while(temp.getNext()!=null) {
		temp=temp.getNext();
	}
temp.setNext(newNode);
 	newNode.setNext(null);
	return true;
}

public boolean insertAtPosition(int position,int data) {
	Node newNode=new Node(data);
	if(position<=-1) {
		return false;
	}
	if(position==1) {
		newNode.setNext(head);
		head=newN	
}
public void display() {
	Node current=head;
	while(current!=null) {
		System.out.print(current.getData()+" ");
		current=current.getNext();
	}
	System.out.println("null");
	
}



}
