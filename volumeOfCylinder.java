import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Height: ");
        int num2 = sc.nextInt();
        System.out.println("Volume: " + (Math.PI*(num1*num1)*num2));
    }
}