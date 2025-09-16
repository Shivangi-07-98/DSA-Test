import java.util.*;

public class _GenericTreeIntro {

  public static class Node{
    int data;
    ArrayList <Node> children = new ArrayList<>();

    Node(int data){
      this.data = data;
    }
  }

  

  public static void main(String[] args) {
    Node root = new Node(10); // value daal paa rhe hai because of constructor
    Node twenty = new Node(20);
    Node thirty = new Node(30);
    Node forty = new Node(40);
    Node fifty = new Node(50);
    Node sixty = new Node(60);
    Node seventy = new Node(70);
    Node eighty = new Node(80);
    Node hundredten = new Node(110);
    Node hundred = new Node(100);
    Node ninety = new Node(90);
    Node hundredtwenty = new Node(120);
    
    root.children.add(twenty);
    root.children.add(thirty);
    root.children.add(forty);
    twenty.children.add(fifty);
    twenty.children.add(sixty);
    thirty.children.add(seventy);
    thirty.children.add(eighty);
    thirty.children.add(ninety);
    forty.children.add(hundred);
    eighty.children.add(hundredten);
    eighty.children.add(hundredtwenty);

    // levelOrder(root);
    // levelOrderLinewise(root);
  }

}
