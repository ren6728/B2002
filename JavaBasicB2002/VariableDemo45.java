public class VariableDemo45 {
  static void myMethod() {
    System.out.println("I just got executed!");
  }
static void myMethod1() {
    System.out.println("I just got 2nd executed!");
  }
  static void myMethod2() {
    System.out.println("I just got 3rd executed!");
  }
  public static void main(String[] args) {
    myMethod();
    myMethod1();
    myMethod2();
  }
}
