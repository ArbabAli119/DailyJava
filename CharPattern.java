public class CharPattern {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for(int line=1; line<=n; line++){

            for(int letter=1; letter<=line; letter++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
