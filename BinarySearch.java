public class BinarySearch {
    public static int binary_search(int numbers[], int key) {
    
        int start = 0, end = numbers.length-1;
        while (start <= end) {
            int mid = (start + end) / 2 ;

            //compare
            if (numbers[mid]== key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  
    }
    public static void main(String[] args) {
        int numbers[] = {2, 5, 8,12, 16, 23, 48, 56, 72, 91};
        int key = 23;

        System.out.println( "The Index Of Array is : " + binary_search(numbers, key));
    }
}
