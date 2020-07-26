public class VariableDemo13{
    public static void main(String[] args){
    int marks=23;
    if (marks >=80){
        String text = "A";
        System.out.println(text);
        System.out.println("**********break1************");   
    }else if(marks >=70){
       String text1 ="B";
       System.out.println(text1);
       System.out.println("**********break2************");
    }else if(marks <40){
       String text2 ="C";
       System.out.println(text2);
       System.out.println("********** pls work hard ************");
    }
     else System.out.println("**********invalid************");
    }
}