import java.io.*;
import java.util.*;

public class Q5_Mid {

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

    int mid1() {
      Node fast = head;
      Node slow = head;
      // 1st condition to handle odd size and second for even size
      while (fast.next != null && fast.next.next != null) { 
        // while(fast != tail && fast.next != tail){
        fast = fast.next.next;
        slow = slow.next;
      }
      return slow.data;
    }

  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);
    list.addLast(60);
    list.addLast(70);

    int ans = list.mid1();
    System.out.println(ans);
  }

}
