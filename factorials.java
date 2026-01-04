public class factorials {
    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }


    public static void main(String[] args) {
        System.out.println(" Fatorial is : " + factorial(5));
        System.out.println(" Fatorial is : " + factorial(6));
        System.out.println(" Fatorial is : " + factorial(7));
        System.out.println(" Fatorial is : " + factorial(8));
    }
}
