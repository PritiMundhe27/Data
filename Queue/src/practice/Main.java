package practice;

public class Main {

	public static void main(String[] args) {
		CircularQueue cq=new CircularQueue(5);
		
	System.out.println(cq.isEmpty());
	System.out.println(cq.isFull());
	System.out.println(cq.insert(10));
	System.out.println(cq.insert(50));
	System.out.println(cq.insert(15));
	System.out.println(cq.delete());
	cq.display();
//	for(int i:cq) {
//		System.out.println(i+" ");
//	}

	}

}
