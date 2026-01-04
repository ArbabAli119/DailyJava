import java.util.Scanner;


//If The Number Is Divisible by 10 then exit from the loop else print Number.
public class BreakStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            if(n % 10 == 0){
                break;
            }         System.out.println(n);    
        }while(true);
        scanner.close();
    }
}
