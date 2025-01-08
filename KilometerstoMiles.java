import java.util.Scanner;

public class KilometerstoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in kilometer: ");
        int num1 = sc.nextInt();
		double answer= num1*0.621371;
        System.out.println("Miles : " + answer);
		
    }
}