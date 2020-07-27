public class VariableDemo94 {
  int x = 0;
  double y = 1.00;
  String name;

  public static void main(String[] args) {
    VariableDemo94 myObj = new VariableDemo94();
    System.out.println(myObj.x);
    System.out.println(myObj.y);
    myObj.name = "ren";
    System.out.println(myObj.name);
    VariableDemo94 myObj1 = new VariableDemo94();
     myObj1.name = "abby";
    System.out.println(myObj1.x);
    System.out.println(myObj1.y);
    System.out.println(myObj1.name);
  }
}
