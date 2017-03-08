/*
 * Created by hbliu.
 */
import java.util.*;

public class TriangleExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        easiestExercise();
        horizontalLine();
        verticalLine();
        rightTriangle();
    }

    private static void easiestExercise() {
        System.out.println("*");
    }

    private static void horizontalLine() {
        System.out.print("Please set the number n for a horizontal line: ");
        int n = sc.nextInt();
        printHorizontalLine(n);
    }

    private static void printHorizontalLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void verticalLine() {
        System.out.print("Please set the number n for a vertical line: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    private static void rightTriangle() {
        System.out.print("Please set the number n for a right triangle: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            printHorizontalLine(i + 1);
        }
    }
}

