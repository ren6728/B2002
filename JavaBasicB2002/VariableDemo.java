//VariableDemo.java
public class VariableDemo{

public static void main(String[] args){
    System.out.println("Hello everyone!");
    
    int numOfHouse=3;
    int NumOfRoom=6;
    int splitRoomMember = NumOfRoom/numOfHouse;
    System.out.println("Total of splitRoomMber is " + splitRoomMember);

    String nameOfLastTester = "123Ren";
    char RensGrade = 'A';
    System.out.println("nameOfLastTester: " +nameOfLastTester + " RensGrade = " + RensGrade );
    char a = 65, b = 66, c = 67;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);   

    boolean is123RenIsGreatTester = true;
    System.out.println("Is 123Ren Is Great Tester :  " + is123RenIsGreatTester );
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);     
    System.out.println(isFishTasty);

    byte myNum1 = 100;
    System.out.println(myNum1);

    short myNum2 = 5000;
    System.out.println(myNum2);

    long myNum3 = 15000000000L;
    System.out.println(myNum3);

float myNum4 = 5.75f;
System.out.println(myNum4);
double myNum5 = 19.99d;
System.out.println(myNum5);
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1); 


}  
}