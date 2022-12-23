package com.my.educative.dsa.linkedlist;

public class SinglyLinkedList<T> implements LinkedListInterface<T> {

	public class Node {
		T data;
		Node nextNode;
	}

	Node headNode;
	private int size;

	public SinglyLinkedList() {
		headNode = null;
		size = 0;
	}

	public Node getHead() {
		return headNode;
	}

	@Override
	public void insertAtHead(T data) {
		Node node = new Node();
		node.data = data;

		node.nextNode = headNode;
		headNode = node;
		size++;

	}

	public void insertAtEndAndLinkTo(T insertData,T LinkData){
		Node linkToNode=searchAndGetNode(LinkData);
		Node insertedNode=insertAtAndGetEndNode(insertData);
		insertedNode.nextNode=linkToNode;
	}

	public Node insertAtAndGetEndNode(T data) {
		Node node = new Node();
		node.data = data;
		if (headNode == null) {
			headNode = node;
		} else {
			Node temp = headNode;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = node;
		}

		size++;
		return node;
	}

	@Override
	public void insertAtEnd(T data) {
		Node node = new Node();
		node.data = data;
		if (headNode == null) {
			headNode = node;
		} else {
			Node temp = headNode;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = node;
		}

		size++;

	}

	@Override
	public void insertAfter(T data, T previous) {
		Node node = new Node();
		node.data = data;

		Node currentNode = headNode;
		while (currentNode != null && !currentNode.data.equals(previous)) {
			currentNode = currentNode.nextNode;
		}

		if (currentNode != null) {
			node.nextNode = currentNode.nextNode;
			currentNode.nextNode = node;
			size++;
		}

	}

	@Override
	public boolean searchNode(T data) {
		Node currNode = headNode;
		while (currNode != null) {
			if (currNode.data.equals(data)) {
				return true;
			}
			currNode = currNode.nextNode;
		}
		return false;
	}

	public Node searchAndGetNode(T data) {
		Node currNode = headNode;
		while (currNode != null) {
			if (currNode.data.equals(data)) {
				return currNode;
			}
			currNode = currNode.nextNode;
		}
		return null;
	}

	@Override
	public void deleteAtHead() {
		if (headNode != null) {
			headNode = headNode.nextNode;
			size--;
		}

	}

	@Override
	public void deleteWithValue(T data) {
		Node currNode = headNode;
		Node prevNode = null;
		if (isEmpty()) {
			return;
		}
		if (currNode.data.equals(data)) {
			deleteAtHead();
			size--;
			return;
		}
		while (currNode != null) {
			if (currNode.data.equals(data)) {
				prevNode.nextNode = currNode.nextNode;
				size--;
				return;
			}
			prevNode = currNode;
			currNode = currNode.nextNode;
		}

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Boolean isEmpty() {
		if (headNode == null)
			return true;
		return false;
	}

	@Override
	public void deleteAtEnd() {
		Node currNode = headNode;
		Node prevNode = null;

		if (!isEmpty()) {
			if (size() == 1) {
				deleteAtHead();
				return;
			}
			while (currNode.nextNode != null) {
				prevNode = currNode;
				currNode = currNode.nextNode;
			}
			prevNode.nextNode = null;
			size--;
		}

	}

	public void reverseLinkedList() {

		  // justheadNode = headNode; // 4
          // headNode = startingPointer; // 6
          // headNode.next = justheadNode; // 4
          // prevPointer.next = startingPointer.next; // 5
          // startingPointer = startingPointer.next; // 5
          Node prevNode = null;
		  Node current = headNode;
		  Node next = null ;

		  while (current!= null) {
			 next = current.nextNode;
			 current.nextNode = prevNode;
			 prevNode = current;
			 current = next;			 
		  }
		  headNode = prevNode;
	}

}
