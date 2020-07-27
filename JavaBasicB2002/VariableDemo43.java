public class VariableDemo43 {
  static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }else if (age>16){
      throw new ArithmeticException("Access granted one time! ");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(17); // Set age to 15 (which is below 18...)
  }
}