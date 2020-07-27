public class VariableDemo92 {
  static int plusMethod(int x, int y) {
    return x - y + 5 ;
  }
  
  static double plusMethod(double x, double y) {
    return x - y + 8;
  }
  static String plusMethod(String fname, String lname){
    return fname + lname ;
  }
  public static void main(String[] args) {
    int myNum1 = plusMethod(3, 2);
    double myNum2 = plusMethod(4.6, 6.27);
    String fulname = plusMethod("ren ", "xing");
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
     System.out.println("fulname: " + fulname);
  }
}