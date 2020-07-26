public class VariableDemo27{
final int z=13;
final int x = 10;
int y =25;
public static void main(String[] args) {
    VariableDemo27 myObj = new VariableDemo27();
   // myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    myObj.y=20;
    //myObj.z=15;
    System.out.println(myObj.x);
    System.out.println(myObj.y);
    System.out.println(myObj.z);
    System.out.println("final means not able to change");
  }
}


