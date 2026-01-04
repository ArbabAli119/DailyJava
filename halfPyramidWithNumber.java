public class halfPyramidWithNumber {

    public static void hfPyd_WithNumber(int n) {
        for(int i=1; i<=n; i++){
            //inner
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hfPyd_WithNumber(8);
    }
}
