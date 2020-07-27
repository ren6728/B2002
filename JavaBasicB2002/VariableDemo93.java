public class VariableDemo93 {
  public static void main(String[] args) {
    int result = sum(-9);
    System.out.println(result);
    System.out.println("**************");
    int resultTotal = sum(5, 10);
    System.out.println(resultTotal);
    System.out.println("**************");
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
    }
  public static int sum(int k) {
    if (k < 0) {
      return k + sum(k + 1);
    } else {
      return 0;
    }
  }
}