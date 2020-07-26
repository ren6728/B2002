import java.util.Scanner;
public class VariableDemo32{
   public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);   
    System.out.println("*******************");   
    VariableDemo32 obj= new VariableDemo32();
    System.out.println(obj instanceof VariableDemo32); // returns true     
  }
}