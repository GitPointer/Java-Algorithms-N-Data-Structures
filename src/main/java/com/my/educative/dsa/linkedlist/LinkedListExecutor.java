package com.my.educative.dsa.linkedlist;

public class LinkedListExecutor {
	public static void main(String[] args) {
		// singlyExecutor();
		doulblyExecutor();

	}

   private static void doulblyExecutor() {
      DoublyLinkedList<String>  doublyLinkedList = new DoublyLinkedList<String>();
      doublyLinkedList.insertAtHead("Tripti");
      doublyLinkedList.insertAtHead("Keshav");
      doublyLinkedList.insertAtHead("vikas");
      doublyLinkedList.insertAtEnd("vikas-E");
      doublyLinkedList.insertAtEnd("Tripti-E");
      doublyLinkedList.insertAtEnd("Keshav-E");
      doublyLinkedList.insertAfter("Ujjval-E", "Tripti-E");
      System.out.println(doublyLinkedList.size());
      //doublyLinkedList.deleteAtHeadEduc();
      doublyLinkedList.deleteAtHead();
      doublyLinkedList.deleteAtEnd();
      doublyLinkedList.deleteWithValue("Tripti-E");;
      if (doublyLinkedList.size() > 0) {
         DoublyLinkedList<String>.Node headNode = doublyLinkedList.getHead();
         while (headNode != null) {
            System.out.println(headNode.data);
            headNode = headNode.nextNode;
         }

     }
     System.out.println(doublyLinkedList.size());



   }

	private static void singlyExecutor() {
		SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();
		System.out.println(singlyLinkedList.isEmpty());

      singlyLinkedList.insertAtHead("Vikas1");
      singlyLinkedList.insertAtHead("Keshav1");

      singlyLinkedList.insertAtEnd("Vikas");
      singlyLinkedList.insertAtEnd("Keshav");
      singlyLinkedList.insertAfter("Tripti", "Keshav1");
      System.out.println("Search Result:"+singlyLinkedList.searchNode("Vikas1"));
      System.out.println(singlyLinkedList.isEmpty());

      if (singlyLinkedList.size() > 0) {
           SinglyLinkedList<String>.Node headNode = singlyLinkedList.getHead();
           while (headNode != null) {
              System.out.println(headNode.data);
              headNode = headNode.nextNode;
           }

       }
       singlyLinkedList.deleteWithValue("Keshav");
       System.out.println("After delete");
       if (singlyLinkedList.size() > 0) {
         SinglyLinkedList<String>.Node headNode = singlyLinkedList.getHead();
         while (headNode != null) {
            System.out.println(headNode.data);
            headNode = headNode.nextNode;
         }
      }
  }
}
   
