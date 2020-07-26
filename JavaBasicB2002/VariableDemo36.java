public class VariableDemo36{
  short myNum = 5000;
  static void myMethod() {
    System.out.println("I just got executed!");
  }
  static void hisMethod() {
    System.out.println("He just got executed!");
  }
  static void herMethod() {
    System.out.println("she just got executed!");
  }
public static void main(String[] args) {
    short myNum = 5000;
    System.out.println(myNum);
    myMethod();
    hisMethod();
    herMethod();

}
}