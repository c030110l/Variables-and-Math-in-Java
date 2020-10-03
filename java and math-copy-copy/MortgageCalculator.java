import java.util.Scanner;

class MortgageCalculator {

    public static void main (String[] args) {
        //1.declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        double p=0; //principle
        double r=0; // rate
        double n=0; // number of years
        double i=0; // interest
        
        //2. get user input
        System. out. println("Investment Calculator");
        System. out. println("--------------------");
        System. out. println(" ");
        System. out. print("Enter the investment's principle amount in dollars: $");
        p= sc. nextDouble();
        System. out. print("Enter the investment's interest rate (between 0 and 1):");
        r= sc. nextDouble();
        System. out. print("Enter the numbe of years the investment will accumulate wealth:");
        n= sc. nextDouble();
        
        //3. calculate and display answer
        i= p* Math.pow(1+r,n);
        System.out. println("This investment will be worth $ "+ i +" ");
    }
}