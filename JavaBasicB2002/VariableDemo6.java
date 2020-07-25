public class VariableDemo6{
   public static void main(String[] args){

   String[] cars= {"Volvo", "BMW", "Ford", "Mazda"};
   System.out.println(cars[0]);
   System.out.println(cars.length);
   cars[0] = "Opel";
   System.out.println(cars[0]);
   System.out.println(cars.length);
   System.out.println("**********************");
   for (int i = 0; i < cars.length; i++) {
   System.out.println(cars[i]);
   }
   System.out.println("**********************");
  //System.out.println(cars[4]);
  for (String i : cars) {
  System.out.println(i);
   }
   int[] myNum = {10, 20, 30, 40};
   System.out.println(myNum[3]);
   System.out.println("**********************");
   int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
   int x = myNumbers[1][2];
   System.out.println(x);
   System.out.println("**********************");
   int[][] myNumber = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumber.length; ++i) {
      for(int j = 0; j < myNumber[i].length; ++j) {
        System.out.println(myNumber[i][j]);
      }
    }
   
   
   }
}