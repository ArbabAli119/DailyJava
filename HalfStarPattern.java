import java.util.Scanner;

public class HalfStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();

        for (int line=1; line <=n; line++) {

            for(int star=1; star<=line; star++){ // For Opposite patten star<=n-line+1;
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }     
} 