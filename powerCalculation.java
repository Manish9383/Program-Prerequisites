import java.util.Scanner;

public class powerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
		int exponent = sc.nextInt();
        System.out.println("Calculated Expression: " + (int)Math.pow(base,exponent));
		
    }
}