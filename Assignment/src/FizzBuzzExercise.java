/**
 * Created by hbliu.
 */
public class FizzBuzzExercise {
    public static void main(String args[]) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        final int LOWEST_VALUE = 1;
        final int HIGHEST_VALUE = 100;

        for (int i = LOWEST_VALUE; i <= HIGHEST_VALUE; i++) {
            boolean dividThree = i % 3 == 0;
            boolean dividFive = i % 5 == 0;
            if (dividThree && dividFive) {
                System.out.println("FizzBuzz");
            } else if (dividThree) {
                System.out.println("Fizz");
            } else if (dividFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
