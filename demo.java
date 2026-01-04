import java.util.Scanner;

public class demo {

    public static int binary_search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array size
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();

        int numbers[] = new int[n];

        // Array elements (must be sorted for binary search)
        System.out.println("Enter array elements (in sorted order):");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Key
        System.out.print("Enter key to search: ");
        int key = scanner.nextInt();

        int result = binary_search(numbers, key);

        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + result);
        }

        scanner.close();
    }
}
