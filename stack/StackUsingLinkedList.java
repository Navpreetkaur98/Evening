package stacksAndQueues;


public class StackUsingLinkedList<T> {
	

	private LinkedListNode<T> head;
	
private int counter;
	
	
public void push(T data) {
	
	LinkedListNode<T> newNode = new LinkedListNode<>(data);

		newNode.next = head;
		 
head = newNode;
		
this.counter += 1;
	
}
	
	
public T pop() throws StackEmptyException {
	
	if(this.isEmpty()) {
	
		System.out.println("Satck is Empty!");
	
		throw new StackEmptyException();

		}
		
		
T data = head.data;
	
	head = head.next;
	
	this.counter -= 1;
	
	return data;
	}
	
	
public int size() {
	
	return counter;
	}
	
	
public T top() {
		
return head.data;
	
}
	
	
public boolean isEmpty() {
		
if(head == null) {
			
return true;
		
}
		
return false;
	
}

}
