import java.io.*;
import java.util.*;

public class Q10_RemoveDuplicatesInASortedLL {

  public static class Node {
    int data; // value
    Node next; // address of next node
  }

  public static class LinkedList {
    Node head; // address of first node
    Node tail; // address of last node
    int size; // value

    int size() {
      return size;
    }

    // O(1)
    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    // O(n)
    void display() {
      if (size == 0) {
        return;
      }
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    // O(1)
    void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    // O(1)
    int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    // O(n)
    void removeDuplicates() {
      LinkedList res = new LinkedList();
      while (size() > 0) {
        int val = getFirst();
        removeFirst();
        if (res.size == 0 || res.tail.data != val) {
          res.addLast(val);
        }
      }
      // because this = res allowed nhi hota
      head = res.head;
      tail = res.tail;
      size = res.size;
    }

  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(40);
    list.addLast(40);
    list.addLast(40);
    list.addLast(40);
    list.addLast(40);
    list.addLast(40);
    list.addLast(50);
    list.addLast(55);
    list.addLast(55);
    list.addLast(55);
    list.addLast(55);
    list.addLast(55);

    list.display(); // 40 40 40 40 40 40 50 55 55 55 55 55 
    list.removeDuplicates();
    list.display(); // 40 50 55
  }

}
