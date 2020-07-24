//VariableDemo3.java
public class VariableDemo3{
   
  public static void main(String[] args) {
    int myNum = 15;
    myNum = 20;  // myNum is now 20
    System.out.println(myNum);

   // final int myNum1 = 15;
    //myNum1 = 20;  // will generate an error: cannot assign a value to a final variable 
   // System.out.println(myNum1);

    String firstName = "John ";
    String lastName = "Doe";
    String fullName = firstName + lastName;
    System.out.println(fullName);

    int x = 5, y = 6, z = 50;
    System.out.println(x + y + z);
    int minutesPerHour = 60;
    // OK, but not so easy to understand what m actually is
    int m = 60;
    System.out.println(minutesPerHour);
    System.out.println(m);

    long myNum2 = 15000000000L;
    System.out.println(myNum2);

    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);

    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);    
    System.out.println(isFishTasty);

    char myGrade = 'B';
    System.out.println(myGrade); 

    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    System.out.println(myInt);
    System.out.println(myDouble);

    double myDouble1 = 9.78;
    int myInt1 = (int) myDouble1; // Manual casting: double to int
    System.out.println(myDouble1);   // Outputs 9.78
    System.out.println(myInt1);   
  
    int sum1 = 100 + 50;        // 150 (100 + 50)
    int sum2 = sum1 + 250;      // 400 (150 + 250)
    int sum3 = sum2 + sum2;
    System.out.println(sum1 + ":" + sum2 + ":" + sum3);

    int a = 10;
    a += 5;
    System.out.println(a);
    System.out.println("x**************************X");

    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());

    String txt1 = "Hello World";
    System.out.println(txt1.toUpperCase()); 
    System.out.println(txt1.toLowerCase()); 

    String txt2 = "Please locate where 'locate' occurs!";
    System.out.println(txt2.indexOf("locate"));

  }
}