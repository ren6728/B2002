//VariableDemo4.java
public class VariableDemo4{
   
  public static void main(String[] args) {
  String txt1 = "We are the so-called \"Vikings\" from the north.";
  String txt2 = "It\'s alright.";
  String txt3 = "The character \\ is called backslash.";
   System.out.println(txt1);
   System.out.println(txt2);
   System.out.println(txt3);

   String x = "10";
   String y = "20";
   String z = x + y;
   System.out.println(z);

   String x1 = "10";
   int y1 = 20;
   String z1 = x + y;   
   System.out.println(z1);

   Math.max(5, 10);
   Math.min(5, 10);
   Math.sqrt(64);
   System.out.println(Math.max(5, 10));
   System.out.println(Math.min(5, 10));
   System.out.println(Math.sqrt(5, 10));

   int x2= 10;
   int y2 = 9;
   System.out.println(x2 > y2);

   int x3 = 10;
   System.out.println(x3 == 10);

   System.out.println(10 == 15); 

   if (20 > 18) {
  System.out.println("20 is greater than 18");
}
   int x4 = 20;
   int y4 = 18;
   if (x4 > y4) {
   System.out.println("x4 is greater than y4");
}

int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}


  
  }
  
  
  
  }