import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter num3: ");
		int num3= sc.nextInt();
		double answer=(num1+num2+num3)/3;
        System.out.println("Average : " + answer);
		
    }
}