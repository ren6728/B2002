public class VariableDemo26 extends VariableDemo25{
private String modelName = "Mustang";  
public static void main(String[] args){

VariableDemo26 obj = new VariableDemo26();

    // Call the honk() method (from the Vehicle class) on the myCar object
    obj.honk();
    

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(obj.brand + " " + obj.modelName);
    System.out.println(obj.brand2+ " " + obj.modelName);
}
}