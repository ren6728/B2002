public class VariableDemo91 {
  static int myMethod(int x) {
    return 5 + x;
  }
  static void checkAge(int age) {
  if (age < 18) {
      System.out.println("Access denied - You are not old enough!"); 
      System.out.println("AAAAAAAAAAAAA!"); 
      } else {
      System.out.println("Access granted - You are old enough!"); 
      System.out.println("BBBBBBBBBBBBB!");
    }
    } 

  public static void main(String[] args) {
    System.out.println(myMethod(6));
    System.out.println("******************!");
    System.out.println(myMethod(3));
    System.out.println("******************!");
    checkAge(22);
    System.out.println("******************!");
    checkAge(2);
  }
}
