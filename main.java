import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose one: ");
        System.out.println("1. Rupee to Dollar: ");
        System.out.println("2. Dollar to Rupee: ");
        System.out.println("3. Rupee to Euro: ");
        System.out.println("4. Euro to Rupee");
        System.out.println("5. Euro to Dollar");
        System.out.println("6. Dollar to Euro");
        double a = input.nextDouble();

        if (a == 1) {
            System.out.print("Enter the currency in rupee: ");
            double b = input.nextDouble();
            double c = (b * 0.012);
            System.out.println("The given currency in dollar is: " + c);

        }
    }
}