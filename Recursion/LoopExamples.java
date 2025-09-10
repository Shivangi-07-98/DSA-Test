import java.util.*;

public class LoopExamples {
  public static void main(String[] args) {

    // Integer array
    int[] intArray = { 10, 20, 30, 40, 50 };
    for (int num : intArray) { // num catches each integer element
      System.out.print(num + " ");
    }
    System.out.println();

    for (int i = 0; i < intArray.length; i++) {
      System.out.print(intArray[i] + " ");
    }
    System.out.println();

    // -------------------------------------------------------

    // String array
    String[] stringArray = { "hello", "world", "java" };
    for (String word : stringArray) { // word catches each string element
      System.out.print(word + " ");
    }
    System.out.println();

    for (int i = 0; i < stringArray.length; i++) {
      System.out.print(stringArray[i] + " ");
    }
    System.out.println();

    // -------------------------------------------------------

    // ArrayList of Integers
    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(100);
    intList.add(200);
    intList.add(300);

    for (Integer number : intList) { // number catches each Integer element
      System.out.print(number + " ");
    }
    System.out.println();

    for (int i = 0; i < intList.size(); i++) {
      System.out.print(intList.get(i) + " ");
    }
    System.out.println();

    // -------------------------------------------------------

    // ArrayList of Strings
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("apple");
    stringList.add("banana");
    stringList.add("cherry");

    for (String fruit : stringList) { // fruit catches each String element
      System.out.print(fruit + " ");
    }
    System.out.println();

    for (int i = 0; i < stringList.size(); i++) {
      System.out.print(stringList.get(i) + " ");
    }
    System.out.println();

  }
}
