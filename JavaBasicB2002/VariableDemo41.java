public class VariableDemo41{
  
  int x;
  int y;

  // Constructor with a parameter
  public VariableDemo41(int x) {
    this.x = x;
    this.y =y;
  }

  // Call the constructor
  public static void main(String[] args) {
    VariableDemo41 myObj = new VariableDemo41(5);
    System.out.println("Value of x = " + myObj.x);
    System.out.println("Value of Y = " + myObj.y);
  }

}