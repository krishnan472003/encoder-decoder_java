
public class dataStructure {
	public static void main(String[] args){
		
}
}
class Node{
	char data;
	int key;
	Node next;
	Node(char data){
		this.data = data;
	}
	Node(int key){
		this.key = key;
	}
	Node(){
		
	}
}

class Stack{
	Node head = new Node();
	int top=-1;
	public void stackPush(char data) {
		top++;
		Node newNode = new Node(data);
		if(head.next == null) {
			head.next = newNode;
		}
		else {
			Node p = head.next;
			head.next = newNode;
			newNode.next = p;
		}
		
	}
	public char stackPop(){
		try {
		top--;
		Node p = head;
		Node out = p.next;
		p.next = p.next.next;
		return(out.data);
		}
		catch(Exception e) {
			System.out.println("Stack out of elements");
			return(' ');
		}
		
	}
	public	boolean stackIsEmpty(){		
		if(top == -1) {
			return(true);
		}
		else {
			return(false);
		}
	}
}
class Queue{
	Node head = new Node();
	int top=-1;
	public void enqueue(char data){
		Node p = head;
		while(p.next != null){
			p = p.next;
		}
		p.next = new Node(data);
		top++;
	}
	public void enqueue(int data){
		Node p = head;
		while(p.next != null){
			p = p.next;
		}
		p.next = new Node(data);
		top++;
	}
	public char dequeue(){
		try {
		top--;
		Node p = head;
		Node out = p.next;
		p.next = p.next.next;
		return(out.data);
		}
		catch(Exception e){
			System.out.println("Queue out of elements");
			return(' ');
		}
		
	}
	public int dequeue(int i){
		try {
		top--;
		Node p = head;
		Node out = p.next;
		p.next = p.next.next;
		return(out.key);
		}
		catch(Exception e){
			System.out.println("Queue out of elements");
			return(' ');
		}
		
	}
	public boolean QueueIsEmpty(){
		if(top==-1) {
			return(true);
		}
		else {
			return(false);
		}
	}
}

	

