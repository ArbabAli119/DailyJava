public class PairOfArray {
    public static void printPair(int nums[]){
        int tp = 0;
        for(int i=0; i<nums.length; i++){
            int curr=nums[i];
        for(int j=i+1; j<nums.length; j++){
            System.out.print("(" + curr + ", " + nums[j] + ")");
            tp++;
        }
        System.out.println();
        }
        System.out.println("Total Pair " + tp);
    }
    public static void main(String[] args) {
        int nums[] ={2,4,6,8,10};
        printPair(nums);
    }
}
