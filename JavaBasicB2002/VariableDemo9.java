public class VariableDemo9{
   public static void main(String[] args){

if (20 > 18) {
  System.out.println("20 is greater than 18");
}
  System.out.println("**********break1************");

  int x = 20;
  int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}
  System.out.println("**********break2************");

  int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
  System.out.println("**********break3************");
  
  int time1 = 22;
if (time1 < 10) {
  System.out.println("Good morning.");
} else if (time1 < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
System.out.println("**********break4************");
  
  int time2 = 20;
if (time2 < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
System.out.println("**********break5************");
int time3 = 20;
String result = (time3 < 18) ? "Good day." : "Good evening.";
System.out.println(result);
System.out.println("**********break6************");
   }
}