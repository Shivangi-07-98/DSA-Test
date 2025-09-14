import java.io.*;
import java.util.*;

public class Q16_ReverseLLDataRecursive {

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

    void reverseDRHelper(Node right, int floor) {
      if (right == null) {
        return;
      }
      reverseDRHelper(right.next, floor + 1);
      if (floor >= size / 2) {
        int temp = left.data;
        left.data = right.data;
        right.data = temp;
        left = left.next; // right-- by recursion
      }
    }

    Node left = null; // see line 12 13 14 it will be found in linked list class when we make one
    // IMPORTANT: Cannot initialize as 'left = head' here because head is null when object is created. Must set left = head inside method when head has real value!
    // Now head points to node with value 10, But left is still null! It was set when head was null
    void reverseDataRecursive() {
      left = head;
      reverseDRHelper(head, 0);
    }

  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);

    list.display(); // 10, 20, 30, 40, 50
    list.reverseDataRecursive();
    list.display(); // 50, 40, 30, 20, 10
  }

}
