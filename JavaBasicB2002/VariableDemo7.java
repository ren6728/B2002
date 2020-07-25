public class VariableDemo7{
   public static void main(String[] args){
   for (int i = 0; i < 10; i++) {
   if (i == 4) {
   break;
               }
   System.out.println(i);
                                 }

  System.out.println("**********break1************");  
  for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
              }
  System.out.println(i);
                                  }
   System.out.println("**********break2************");
   
   int i = 0;
   while (i < 10) {
   System.out.println(i);
   i++;
   if (i == 4) {
    break;
  }
}
   System.out.println("**********break3************");
int ii = 0;
while (ii < 10) {
  if (ii == 4) {
    ii++;
    continue;
  }
  System.out.println(ii);
  ii++;
}
System.out.println("**********break4************");

   }
}