package Crack;
import java.util.HashMap;

// my solution to problem 2.1 in the 5th edition of cracking the code interview questions

public class Node {
	Node next;
	int data;
	boolean IsHead = true;
	
	public Node(int value){
		this.data = value;
	}
	
	public void traverseList(Node Head){
		Node Cur = Head;
		
		while(Cur!=null){
			System.out.println(Cur.data);
			Cur = Cur.next;
		}
	}
	
	public void addToList(Node List, int Data){
		if(this.IsHead){
			List = new Node(Data);
			this.IsHead = false;
		}
		else{
			Node Cur = List; // head of the list;
			while(Cur.next != null){
					Cur = Cur.next;
			}
			Cur.next = new Node(Data);
		}
		
	}
	
	public void RemoveDuplicateNodes(Node List){
		
		HashMap NodeMaps = new HashMap();	
		Node Current = List;
		Node Prev = null;
		
		while(Current!= null){
			 if((NodeMaps.put((int)Current.data, (Node)Current)) != null){ // duplicate node
				if(Current.next == null){
					Prev.next = null;
				}
				else{
					Prev.next = Current.next;
					Current.next = null;
					Current = Prev;
				}
			}
			Prev = Current;
			Current = Current.next; 
		
		}
	}
	public static void main(String[] args) {
		Node List = new Node(1);
		
		for(int i =1; i<=5; i++){
			List.addToList(List, i);
		}
		
		List.addToList(List, 1);
		List.addToList(List, 5);
		System.out.println("Initial List");
		List.traverseList(List);
		System.out.println("After Duplicate Removal");
		List.RemoveDuplicateNodes(List);
		List.traverseList(List);

	}

}
