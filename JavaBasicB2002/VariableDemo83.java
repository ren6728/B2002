public class VariableDemo83 {
  public static void main(String[] args) {
    int x = 5;
    ++x;
    System.out.println(x);
    int y= 5;
    --y;
    System.out.println(y);
    System.out.println(x == y); // returns true
    System.out.println("--------------------");
    System.out.println(x % y);
    int z = 5;
    System.out.println(z > 3 && z < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
}
}
