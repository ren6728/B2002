public class VariableDemo95 {
  int x = 10;
  String fname = "John";
  String lname = "Doe";
  int age = 24;
  static void myMethod(int a) {
    System.out.println(a);
  }
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
 public static void main(String[] args) {
    VariableDemo95 myObj = new VariableDemo95();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
    myMethod(10);
    myObj.fullThrottle();
    myObj.speed(300);
  }
}