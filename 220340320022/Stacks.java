
import java.util.Scanner;

class Stacks{
	 int top1;
	 int top2;
	Stacks(){
		top1=-1;
		top2=n+1;
	}
	
	Scanner sc = new Scanner(System.in);
	
	//int n = sc.nextInt();
	 int stack[] = new int[11];
		int n = stack.length;
	public  boolean isFull(){
		return top1 == top2;
	}
	public  boolean isEmpty(){
		return (top1 == -1 && top2 == n+1);
	}
	public  void push1(int data){
		if(isFull()){
			return;
		}
		else{
			top1 = top1 + 1;
			stack[top1] =data;
		}
	}
	public  void push2(int data){
		if(isFull()){
			return;
		}
		else{
			top2 = top2 - 1;
			stack[top2] =data;
		}
	}
	public  void pop1(){
		if(isEmpty()){
			return;
		}
		else{
			int element = stack[top1];
			System.out.println("Popped element from stack1 is "+element);
			top1 = top1 - 1;
			
		}
	}
	public  void pop2(){
		if(isEmpty()){
			return;
		}
		else{
			int element = stack[top2];
			System.out.println("Popped element from stack2 is "+element);
			top2 = top2 + 1;
			
		}
	}
	public static void main(String...args){
		Stacks s = new Stacks();
		
		s.push1(5); 
		s.push2(10); 
		s.push2(15); 
		s.push1(11); 
		s.push2(7); 
		s.push2(40);
		s.pop1();
		s.pop2();
	}
}