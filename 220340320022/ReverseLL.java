
import java.util.*;

class ReverseLL{
	static Node head;
	static class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static boolean isEmpty(){
		return head == null;
	}
	public static void addData(int data){
		Node new_node = new Node(data);
		if(isEmpty()){
			head = new_node;
		}
		else{
			new_node.next = head;
			head = new_node;
		}
	}
	public static void display(){
		Node trav = head;
		System.out.print("Linked List is : ");
		while(trav != null){
			System.out.print(trav.data+" ");
			trav = trav.next;
		}
	}
	
	public static Node reverseLL(){
		Stack<Integer> s = new Stack<>();
		Node trav = head;
		while(trav!=null){
			s.push(trav.data);
			trav = trav.next;
		}
		trav = head;
		System.out.print("\nReversed Linked List is : ");
		while(trav!=null){
			System.out.print(s.pop()+" ");
			trav = trav.next;
		}
		return head;
	}
	public static void main(String...args){
		addData(5);
		addData(4);
		addData(3);
		addData(2);
		addData(1);
		display();
		reverseLL();
	}
}