package practice;

public class Main {

	public static void main(String[] args) {
	//	Stack<Integer> stack=new Stack<Integer>(5);
		StackPrac stack=new StackPrac(5);
	System.out.println(stack.isEmpty());
	System.out.println(stack.push(10));	
	System.out.println(stack.isFull());	
	System.out.println(stack.push(20));	
	System.out.println(stack.push(30));	
	System.out.println(stack.push(40));
	System.out.println(stack.push(50));	
	System.out.println(stack.push(60));	
	stack.display();
	
	}

}
