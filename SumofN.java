import java.util.Scanner;

public class SumofN {
    public static void main(String args []) {
        System.out.print("Enter a number to find the sum of natural numbers :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        int i=1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
    System.out.println("The Sum Of natural numbers is: " + sum);
    scanner.close();
    }
}