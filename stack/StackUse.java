package stacksAndQueues;


public class StackUse {

	
public static void main(String[] args) throws StackEmptyException {
	
	StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();

		stack.push(10);
	
	stack.push(20);
		
stack.push(30);
		
stack.push(40);
		
stack.push(50);
	
		
	
	System.out.println(stack.size());
		
	
	System.out.println(stack.pop());
		
System.out.println(stack.size());
		
System.out.println(stack.pop());
		
System.out.println(stack.pop());
		
System.out.println(stack.pop());
		 
System.out.println(stack.pop());

		
		
System.out.println(stack.size());
		
		
System.out.println(stack.pop());
	
}


}
