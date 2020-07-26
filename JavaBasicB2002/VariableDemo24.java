public class VariableDemo24 { 
    enum Level {
  LOW,
  MEDIUM,
  HIGH
}
  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    Level mYvAR =Level.HIGH;
    System.out.println(myVar); 
    System.out.println(mYvAR); 
    System.out.println("An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final-->unchangeable - cannot be overridden.");
  
  } 
}
