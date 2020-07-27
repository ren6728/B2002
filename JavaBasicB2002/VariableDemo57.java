public class VariableDemo57 {
  int modelYear;
  String modelName;

  public VariableDemo57(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    VariableDemo57 myCar = new VariableDemo57(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang