public class VariableDemo11{
    public static void multiply(){
        int a,b,result;
        a=10;
        b=12;
        result=a*b;
        System.out.println("the result is " + result);
    }
    public static void main(String[] args){
    multiply();
     System.out.println("**********break1************");
    float incomeInDollars, taxToPay, taxRate;
    incomeInDollars=5000;
    taxRate=0.15f;
    taxToPay= incomeInDollars * taxRate;
    System.out.println(taxToPay);
    System.out.println("Here is my tax : " + taxToPay);
    System.out.println("**********break2************");
    float myPay;
    myPay=incomeInDollars - taxToPay ;
    System.out.println("Here is my pay : $"+ myPay);
    System.out.println("**********break3************");
    }
    }