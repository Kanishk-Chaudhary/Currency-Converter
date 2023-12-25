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

        }else  if (a == 2) {
            System.out.print("Enter the currency in dollar: ");
            double b = input.nextDouble();
            double c = (b * 83.33);
            System.out.println("The given currency in rupee is: " + c);

        }else  if (a == 3) {
            System.out.print("Enter the currency in rupee: ");
            double b = input.nextDouble();
            double c = (b * 0.011);
            System.out.println("The given currency in euro is: " + c);

        }else  if (a == 4) {
            System.out.print("Enter the currency in euro: ");
            double b = input.nextDouble();
            double c = (b * 91.57);
            System.out.println("The given currency in rupee is: " + c);

        }else  if (a == 5) {
            System.out.print("Enter the currency in euro: ");
            double b = input.nextDouble();
            double c = (b * 1.10);
            System.out.println("The given currency in dollar is: " + c);

        }else  if (a == 6) {
            System.out.print("Enter the currency in dollar: ");
            double b = input.nextDouble();
            double c = (b * 0.91);
            System.out.println("The given currency in euro is: " + c);

        }
            
        }
    }
}