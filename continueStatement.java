import java.util.Scanner;

public class continueStatement {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

             do{
            System.out.print("Enter Your Number :");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Num Is :" + n);

            }while(true);
        }
    }       
}

