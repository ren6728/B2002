public class VariableDemo81 {
  public static void main(String[ ] args) {
    VariableDemo82 myObj = new VariableDemo82();
    myObj.setName("John");
    System.out.println(myObj.getName());
    myObj.setName("ren");
    System.out.println(myObj.getName());
    myObj.setName("Jack");
    System.out.println(myObj.getName());
    myObj.setName("Jacob");
    System.out.println(myObj.getName());
/*Encapsulation. This is the practice of keeping fields within a class private, 
then providing access to them via public methods. It’s a protective barrier that keeps the data and code safe within the class itself. 
This way, we can re-use objects like code components or variables without allowing open access to the data system-wide. */
   
  }
}
