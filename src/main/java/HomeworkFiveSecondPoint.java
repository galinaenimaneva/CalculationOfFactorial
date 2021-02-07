public class HomeworkFiveSecondPoint {
    public static void main(String[] args) {
        int[] myArray = {1,5,6,8,19,55,98};
        int sum = 0;
        int avg;
        for (int element : myArray){
            sum+=element;
        }
        avg=sum/myArray.length;
        System.out.println(avg);
    }
}
