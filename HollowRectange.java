public class HollowRectange {
    public static void hollow_rectangle(int totRow , int totCol) {
        //outer loop
        for (int i=1; i<=totRow; i++){
            //inner loop
            for(int j=1; j<=totCol; j++){
                //cell - (i,j)
                if(i==1 || i == totRow || j==1 || j==totCol){
                    //boundry cell
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(10, 16);
    }
}
