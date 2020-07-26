public class VariableDemo8{
   public static void main(String[] args){
   for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
System.out.println("**********break1************"); 

    for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}
  System.out.println("**********break2************");
   
   String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
  System.out.println("**********break3************"); 
// above is for loop

   int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
  System.out.println("**********break4************");
   int ii = 0;
do {
  System.out.println(ii);
  ii++;
}
while (ii < 5);
 System.out.println("**********break5************");  
   
   // above is while loop
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
System.out.println("**********break6************");  

 int day2 = 4;
switch (day2) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
System.out.println("**********break7************"); 
   // above is switch
   
   }
   
   }