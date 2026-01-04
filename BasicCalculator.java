import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A :");
        int a = scanner.nextInt();
        System.out.println("Enter B :");
        int b = scanner.nextInt();
        System.out.println("Enter Opertor :");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
            case '%':System.out.println(a%b);
                break;
            default: 
        }
    scanner.close(); 
    }
}