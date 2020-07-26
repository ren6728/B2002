public class VariableDemo15{
public static void main(String[] args){
        double local_tex_rate = 0.0888;
        double credit_percentage = 0.05;
        int gross = 1000;
        int non_taxeble =200;
        double pen_and_int = 10.00;
        int taxeble = gross -non_taxeble;
        double pre_tax = taxeble * local_tex_rate;
        double vendore_credit = pre_tax * credit_percentage;
        double tax_due = pre_tax - vendore_credit + pen_and_int;
        System.out.println("tex due = " + tax_due);
        System.out.println("here is fatema class!");
        System.out.println("A good calculation of this class!");
    }
}