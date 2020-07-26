public class VariableDemo35{
  private String fname = "John";
  private String lname = "Doe";
  private String email = "john@doe.com";
  private int age = 24;
public static void main(String[] args) {
VariableDemo35 myObj = new VariableDemo35();
    System.out.println(myObj.email);
    System.out.println(myObj.fname);
    System.out.println(myObj.lname);
    System.out.println(myObj.age);
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
}
}