public class VariableDemo78 {
  int y = 10;

  public static void main(String[] args) {
    VariableDemo78 myObj1 = new VariableDemo78();
    VariableDemo78 myObj2 = new VariableDemo78();
    System.out.println(myObj1.y);
    System.out.println(myObj2.y);
    VariableDemo78 myObj3 = new VariableDemo78();
    System.out.println(myObj1.y);
  }
}
