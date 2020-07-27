public class VariableDemo90 {
  static void myMethod() {
    System.out.println("I just got executed!");
    System.out.println("---------------------!");
  }
  
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
    System.out.println("---------------------!");
  }
  static void myMethod(String fname, int age) { 
    System.out.println(fname + " is " + age);
    System.out.println("---------------------!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
    myMethod("Fatema");
    myMethod("Kiran");
    myMethod("Sana");
    myMethod("Bintia");
    myMethod("Sadaf");
    myMethod("Sabuj", 5);
    myMethod("Imran", 8);
    myMethod("kashem",3);
  }
}
