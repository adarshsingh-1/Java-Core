package Scanner;

class UserInput {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.printf("Enter your Name: ");
        String name = s.nextLine();
        System.out.printf("Enter your age: ");
        int age = s.nextInt();
        System.out.printf("\nName: %s \nAge: %d", name, age);
    }
}
