public class AssignmentOperator {
    public static void main(String[] args) {
        int p = 10;
        int q;
        q = p; // Assignment operator
        System.out.println("Value of q: " + q); 

        p +=q; // Compound assignment operator
        System.out.println("Value of p after p += q: " + p);
        p -=q; // Compound assignment operator
        System.out.println("Value of p after p -= q: " + p);
        p *=q; // Compound assignment operator
        System.out.println("Value of p after p *= q: " + p);
        p /=q; // Compound assignment operator
        System.out.println("Value of p after p /= q: " + p);
        p %=q; // Compound assignment operator
        System.out.println("Value of p after p %= q: " + p);
    }
}
