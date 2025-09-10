public class upperCase {
  public static void main(String[] args) {
    String str = "my name is shivangi";

    char[] val = str.toCharArray();
    System.out.println(val);

    if(val.length > 0 && val[0] != ' '){
      val[0] = Character.toUpperCase(val[0]);
    }
    System.out.println(val);

  }
}
