public class VariableDemo59 {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    VariableDemo59 myObj = new VariableDemo59(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}
 
 

