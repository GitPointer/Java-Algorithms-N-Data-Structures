package com.my.educative.dsa.linkedlist;

public interface LinkedListInterface<T> {
    
    void insertAtHead(T data);
    void insertAtEnd(T data);
    void insertAfter(T data, T previous);

	boolean searchNode(T data);
    void deleteAtHead();
    void deleteAtEnd();
    void deleteWithValue(T data);
    int size();
    Boolean isEmpty();
}
