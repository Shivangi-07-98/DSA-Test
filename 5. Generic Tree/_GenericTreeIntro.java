import java.util.*;

public class _GenericTreeIntro {

  public static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();

    Node(int data) {
      this.data = data;
    }
  }

  static void levelOrder(Node root) {
    Queue<Node> queue = new ArrayDeque<Node>();
    queue.add(root);
    while (queue.size() > 0) {
      Node val = queue.remove();
      System.out.print(val.data + " ");
      for (Node child : val.children) {
        queue.add(child);
      }
    }
    System.out.println();
  }

  static void levelOrderLinewise(Node root){
    Queue<Node> queue = new ArrayDeque<Node>();
    Queue<Node> cqueue = new ArrayDeque<Node>();
    queue.add(root);
    while (queue.size() > 0) {
      Node abc = queue.remove();
      System.out.print(abc.data + " ");
      for(Node child: abc.children){
        cqueue.add(child);
      }

      if(queue.size() == 0){
        queue = cqueue;
        cqueue = new ArrayDeque<Node>();
        System.out.println();
      }
    }
  }

  static Node construct(int[] arr) {
    Node root = null;
    Stack<Node> stack = new Stack<>();
    for (int val : arr) {
      if (val != -1) {
        Node abc = new Node(val);
        stack.push(abc);
      } else {
        Node def = stack.pop();
        if(stack.size() > 0){
          Node parent = stack.peek();
          parent.children.add(def);
        }
        else{
          root = def;
        }
      }

    }
    return root;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
    Node root = construct(arr);

    // levelOrder(root);
    levelOrderLinewise(root);
  }

}
