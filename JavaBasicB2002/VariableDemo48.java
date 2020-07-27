import java.util.ArrayList;
import java.util.Collections; 
public class VariableDemo48{
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add("Accer");
    cars.add("Toyota");
    cars.add("Audi");
    for (String i : cars) {
      System.out.println(i);
    }
    cars.size();
    cars.remove(0);
    Collections.sort(cars);
    for (String i : cars) {
      System.out.println(i);
    }

  }
}