import java.io.*;
import java.util.*;

public class reverseLLPointerIterative {

  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    int size() {
      return size;
    }

    void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;

      if (size() == 0) {
        head = tail = temp;
      } else {
        temp.next = head;
        head = temp;
      }

      size++;
    }

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;

      if (size() == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    void addAt(int idx, int val) {
      if (idx == 0) {
        addFirst(val);
      } else if (idx == size) {
        addLast(val);
      } else if (idx < 0 || idx > size) {
        System.out.println("invalid arguments");
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        Node next = temp.next;
        Node prev = temp;

        Node ans = new Node();
        ans.data = val;

        ans.next = next;
        prev.next = ans;

        size++;
      }

    }

    int getFirst() {
      if (size == 0) {
        System.out.println("list is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    int getLast() {
      if (size == 0) {
        System.out.println("list is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx == 0) {
        return head.data;
      } else if (idx == size - 1) {
        return tail.data;
      } else if (idx < 0 || idx >= size) {
        System.out.println("invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    void removeFirst() {
      if (size == 0) {
        System.out.println("list is empty");
      } else if (size == 1) {
        head = tail = null;
      } else {
        head = head.next;
      }
      size--;
    }

    void removeLast() {
      if (size == 0) {
        System.out.println("list is empty");
      } else if (size == 1) {
        head = tail = null;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }
        tail = temp;
        temp.next = null;
      }
      size--;
    }

    void removeAt(int idx) {
      if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else if (idx < 0 || idx >= size) {
        System.out.println("invalid arguments");
      } else if (size == 0) {
        System.out.println("list is empty");
      } else if (size == 1) {
        head = tail = null;
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        Node val1 = temp;
        Node val2 = temp.next.next;
        val1.next = val2;
      }
      size--;
    }

    void displayReverseHelper(Node temp) {
      if (temp == null) {
        return;
      }
      displayReverseHelper(temp.next);
      System.out.print(temp.data + " ");
    }

    void displayReverse() {
      displayReverseHelper(head);
      System.out.println();
    }

    int mid() {
      Node fast = head;
      Node slow = head;

      while (fast.next != null && fast.next.next != null) {
        fast = fast.next.next;
        slow = slow.next;
      }

      return slow.data;
    }

    void display() {
      if (size == 0) {
        return;
      }
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    

    void reverseLLPointerIterative() {
      Node prev = null;
      Node curr = head;
      while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      Node temp = head;
      head = tail;
      tail = temp;
    }

  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);

    list.display();
    System.out.println(list.head.data + " " + list.tail.data);
    list.reverseLLPointerIterative();
    list.display();
    System.out.println(list.head.data + " " + list.tail.data);
    
  }
}