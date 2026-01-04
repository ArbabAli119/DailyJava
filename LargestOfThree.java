public class LargestOfThree {
    public static void main(String[] args) {
        int A = 20, B = 34 , C = 23;

        if (A >= B && A >= C){
            System.out.println("A is Greater");
        }
        else if (B >= C && B >= A){
            System.out.println("B is Greater");
        }
        else {
            System.out.println("C is Greater");
        }
    }
}
