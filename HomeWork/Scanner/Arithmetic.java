package Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();
        System.out.println("\n\n Arithmetic Operation: \n1.Add \n2.Substract \n3.Multiplication \n4.Division");
        System.out.print("Enter the choice: ");
        int ch = s.nextInt();
        switch (ch) {
            case 1:
                int sum = a + b;
                System.out.println("Addition: " + sum);
                break;
            case 2:
                int sub = a + b;
                System.out.println("Substract: " + sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println("Multiplication: " + mul);
                break;
            case 4:
                int div = a / b;
                System.out.println("Division: " + div);
                break;
            default:
                System.out.println("Enter the valid choice...");
                break;
        }

    }
}
