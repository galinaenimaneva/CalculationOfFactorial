public class While {
    public static void main(String[] args) {
        calculateFactorial(5);

    }

    private static void calculateFactorial(int number) {
        int factorial = 1;
        while (number > 1) {
            factorial *= number;
            number--;
        }
        System.out.println(factorial);
    }
}

   
