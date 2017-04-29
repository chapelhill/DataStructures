package LinkedList;
import Node.Node;

public class LinkedList {
	private static Node head;
	int i = 0;

	public void appendtotail(int data) {
		Node end = new Node(data);

		i++;
		if (head == null) {
			head = end;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(end);
		}
	}

	public void reverse2(Node head) {
		Node next = null;
		Node prev = null;
		// Node current = head;
		while (head != null) {
			next = head.next;

			head.next = prev;
			prev = head;
			head = next;
		}
		head = prev;
		System.out.println("lol" + head.getData());
		// return head;
		printList(head);
	}

	public Node reverse(Node head) {

		if (head.next == null) {
			return head;
		}
		Node remaining = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return remaining;
	}

	public void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + "->");
			current = current.getNext();
		}
		System.out.println("");
	}

	public void deleteNode(int i) {
		Node current = head;
		if (current.getData() == i) {
			head = head.getNext();
		}
		while (current.next != null) {
			if (i == current.getNext().getData()) {
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
	}

	public Node getHead() {
		return head;
	}

	public int getcount() {
		return i;
	}


}