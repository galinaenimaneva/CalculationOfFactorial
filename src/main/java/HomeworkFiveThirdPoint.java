public class HomeworkFiveThirdPoint {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0)
            positive+=myArray[i];
            else
                negative+=myArray[i];


        }
        System.out.println("Positive" + " " + positive);
        System.out.println("Negative" + " " + negative);
    }
}
