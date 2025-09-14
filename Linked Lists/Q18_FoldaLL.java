import java.io.*;
import java.util.*;

public class Q18_FoldaLL {

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

    void foldHelper(Node right, int floor) {
      if (right == null) {
        return;
      }
      foldHelper(right.next, floor + 1);
      if (floor > size / 2) { // 1 2 3 4 5 6 => 1 6 2 5 3 4
        Node temp = left.next;
        left.next = right;
        right.next = temp;
        left = temp;
      } else if (floor == size / 2) {
        tail = right;
        tail.next = null;
      }
    }

    Node left = null;
    void fold() {
      left = head;
      foldHelper(head, 0);
    }

  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    list.addLast(6);

    list.display(); // 1, 2, 3, 4, 5, 6
    list.fold();
    list.display(); // 1, 6, 2, 5, 3, 4
    // 1 2 3 4 5 6 => 1 6 2 5 3 4
  }

}

/*
 * QUESTION: Fold a Linked List
 * - Take first element, then last element, then second element, then second
 * last element, and so on
 * - Example: 1->2->3->4->5 becomes 1->5->2->4->3
 * - Example: 1->2->3->4->5->6 becomes 1->6->2->5->3->4
 * 
 * APPROACH:
 * 1. Use recursion to reach the end (right pointer)
 * 2. Use class variable 'left' to track from start
 * 3. On returning from recursion:
 * - If floor > size/2: Insert right node after left node
 * - If floor == size/2: Set tail and end list (for odd size)
 * 4. Move left forward after each insertion
 */
