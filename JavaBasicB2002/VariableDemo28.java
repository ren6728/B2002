public class VariableDemo28{
final int z=13;
final int x = 10;
int y =25;
public static void main(String[] args) {
VariableDemo27 myObj = new VariableDemo27();
System.out.println(myObj.x);
try {
  int[] myNumbers = {1, 2, 3};
  System.out.println(myNumbers[10]);
} catch (Exception e) {
  System.out.println("Something went wrong.");
} finally {
  System.out.println("The 'try catch' is finished.");
}
}
}