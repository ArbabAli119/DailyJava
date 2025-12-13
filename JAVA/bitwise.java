public class bitwise {
    public static void main(String[] args) {
        int p = 9, q = 10;

        System.out.println(p | q);  // Bitwise OR
        System.out.println(p & q);  // Bitwise AND
        System.out.println(p ^ q);  // Bitwise XOR
        System.err.println(~p);     // Bitwise NOT
        System.out.println(~q);     // Bitwise NOT

        System.out.println(p << 1); // Left Shift
        System.out.println(p << 2); // Right Shift

        System.out.println(q >> 1); // Right Shift  
        System.out.println(q >> 2); // Right Shift
    }
}
