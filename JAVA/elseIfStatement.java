public class elseIfStatement {
    public static void main(String[] args) {
    int age = 13;
    if (age >= 18) {
        System.out.println("You are an adult.");
    }else if (age < 18 && age >= 13) {
        System.out.println("Teenagers");
    } else {
        System.out.println("child");
    }
}
}

