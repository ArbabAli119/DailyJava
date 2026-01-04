public class primeInRanges {
    public static boolean isPrime(int n){
        //corner case
        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i ==0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
         for (int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
         }
         System.out.println();
    }

    // public static void main(String[] args) {
    //     System.out.println(isPrime(2));
    //     System.out.println(isPrime(3));
    //     System.out.println(isPrime(8));
    // }

    public static void main(String[] args) {
        primeInRange(25);
    }
}

