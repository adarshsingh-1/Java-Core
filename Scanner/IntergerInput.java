package Scanner;

public class IntergerInput {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter the Integer: ");
        while (s.hasNextInt()) {
            int num = s.nextInt();
        }
        System.out.print("Enter the number only...");
    }
}