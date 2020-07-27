// Create a  class
public class VariableDemo55 {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public VariableDemo55() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    VariableDemo55 myObj = new VariableDemo55(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5