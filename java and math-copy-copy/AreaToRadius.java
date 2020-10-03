import java.util.Scanner;

class AreaToRadius {

    public static void main (String[] args) {

        //1. A=PIr^2 --> r=Math.sqrt(A/PI)
        Scanner sc = new Scanner(System.in);

        int A=0;
        double r=0;

        System.out.println("Area to radius");
        System.out.print("What is the Area of your circle?  ");
        A = sc.nextInt();

        r = Math.sqrt(A/Math.PI);
        System.out.print("The radius is " + r);
    }

}