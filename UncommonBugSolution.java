public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 0;
        while (x < 5) {
            try {
                int y = 5 / x; // Potential ArithmeticException
                System.out.println(y);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            } finally {
                System.out.println("Always executes");
            }
            x++; // Incrementing x outside finally block
        }
    }
}