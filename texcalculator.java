import java.util.*;

public class texcalculator {
  
    public static void main(String[] args) {
       
        Scanner src = new Scanner(System.in);
        float tax = 0;
        System.out.println("Enter your income in Lacs: ");
        float income = src.nextFloat();
        if (income < 2.5){
            tax = tax + 0;
        }
        else if(income > 2.5 && income < 5.0){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income >= 5.0 && income < 10.0){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);
        }
        else{
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 2.5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The tax to be paid: "+tax);
    }

}
    

