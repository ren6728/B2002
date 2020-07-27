public class VariableDemo96 {
  int x;
  public VariableDemo96() {
    x = 5;
  }
  int modelYear;
  String modelName;

  public VariableDemo96(int year, String name) {
    modelYear = year;
    modelName = name;
  }
  public static void main(String[] args) {
    VariableDemo96 myObj = new VariableDemo96();
    System.out.println(myObj.x);
    VariableDemo96 myObj1 = new VariableDemo96(2020, "Mustang");
    System.out.println(myObj1.modelYear + " " + myObj1.modelName);
  }
}
