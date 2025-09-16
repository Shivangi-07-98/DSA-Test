import java.io.*;
import java.util.*;

public class intersectionPoint {

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

    Node getNodeAt(int idx) {
      Node temp = head;
      for (int i = 0; i < idx; i++) {
        temp = temp.next;
      }
      return temp;
    }

    void removeDuplicates() {
      LinkedList ans = new LinkedList();

      while (size() > 0) {
        int val = getFirst();
        removeFirst();
        if (ans.size() == 0 || val != ans.tail.data) {
          ans.addLast(val);
        } 
      }

      head = ans.head;
      tail = ans.tail;
      size = ans.size;

    }

    static int intersection(LinkedList list1, LinkedList list2){
      int gap = Math.abs(list1.size() - list2.size());
      Node one = list1.head;
      Node two = list2.head;
      if(list1.size() > list2.size()){
        for(int i = 0; i < gap; i++){
          one = one.next;
        }
      }
      else{
        for(int i = 0; i < gap; i++){
          two = two.next;
        }
      }

      while(one != two){
        one = one.next;
         two = two.next;
      }

      return one.data;
    }

  }

  public static void main(String[] args) {
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();

    // Create common nodes that will be shared
    Node commonNode1 = new Node();
    Node commonNode2 = new Node();
    Node commonNode3 = new Node();
    commonNode1.data = 50;
    commonNode2.data = 60;
    commonNode3.data = 70;

    commonNode1.next = commonNode2;
    commonNode2.next = commonNode3;
    commonNode3.next = null;

    // 10, 20, 30, 40, 50, 60, 70
    list1.addLast(10);
    list1.addLast(20);
    list1.addLast(30);
    list1.addLast(40);
    list1.tail.next = commonNode1;
    list1.tail = commonNode3;
    list1.size += 3;

    // 100, 200, 50, 60, 70
    list2.addLast(100);
    list2.addLast(200);
    list2.tail.next = commonNode1;
    list2.tail = commonNode3;
    list2.size += 3;


    int ans = LinkedList.intersection(list1, list2);
    System.out.println(ans);

  }
}