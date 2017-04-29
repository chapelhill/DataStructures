package Stack;

import Node.Node;

public class Stack {
	public Node top;
	
	public void add(Node N){
		N.next = top;
		top = N;
	}
	public int peek(){
		return top.getData();
	}
	
}
