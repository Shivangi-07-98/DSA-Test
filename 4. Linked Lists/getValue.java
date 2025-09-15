/* 
1. add value = add first, add last, add at index
2. get value = get first, get last, get at index
3. remove value = remove first, remove last, remove at index
*/

import java.io.*;
import java.util.*;

public class getValue {

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
      } 
      else if (idx < 0 || idx > size) {
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

    int getFirst(){
      if(size == 0){
        System.out.println("list is empty");
        return -1;
      }
      else{
        return head.data;
      }
    }

    int getLast(){
      if(size == 0){
        System.out.println("list is empty");
        return -1;
      }
      else{
        return tail.data;
      }
    }

    int getAt(int idx){
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      }
      else if(idx == 0){
        return head.data;
      }
      else if(idx == size - 1){
        return tail.data;
      }
      else if (idx < 0 || idx >= size) {
        System.out.println("invalid arguments");
        return -1;
      }
      else{
        Node temp = head;
        for(int i = 0; i < idx; i++){
          temp = temp.next;
        }
        return temp.data;
      }
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

  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    // list.addFirst(100);
    // list.display();
    // list.addAt(3, 200);
    // list.display();
    int val = list.getAt(2);
    System.out.println(val); // 30


  }
}