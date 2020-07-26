public abstract class VariableDemo17{
   public static String fname = "Ren";
   public static int age = 18 ;
   public abstract void study();
   public static void main(String[] args){ 
System.out.println("An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:");
System.out.println("This is abstarct class: VariableDemo17.java");
/*An abstract method belongs to an abstract class, 
and it does not have a body. The body is provided by the subclass:*/
System.out.println("**********break1************");
System.out.println(fname);
System.out.println(age);
System.out.println("here is the abstract method: *** public abstract void study() ***");

}
}
