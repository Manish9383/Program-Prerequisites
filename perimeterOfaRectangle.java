import java.util.Scanner;

public class perimeterOfaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
		int width = sc.nextInt();
        System.out.println("Perimeter: " + 2*(length+width));
    }
}