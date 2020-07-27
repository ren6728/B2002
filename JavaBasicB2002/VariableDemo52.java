public class VariableDemo52 {
  int x = 5;
  String name="abby";
  public static void main(String[] args) {
    VariableDemo52 myObj1 = new VariableDemo52 ();  // Object 1
    VariableDemo52  myObj2 = new VariableDemo52 ();  // Object 2
    myObj2.x = 25;
    myObj2.name= "ren";
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
 System.out.println(myObj1.name);
 System.out.println(myObj2.name);
  }
}