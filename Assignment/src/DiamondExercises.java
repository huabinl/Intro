/*
 * Created by hbliu.
 */
import java.util.*;

public class DiamondExercises {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        isoscelesTriangle();
        diamond();
        diamondName();
    }

    private static void isoscelesTriangle() {
        System.out.print("Please set the number n for a centered triangle: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            printHorizontal(n - i - 1, " ");
            printHorizontal(2 * i + 1, "*");
            System.out.println();
        }
    }

    private static void printHorizontal(int number, String letter) {
        for (int i = 0; i < number; i++) {
            System.out.print(letter);
        }
    }

    private static void diamond() {
        System.out.print("Please set the number n for a centered diamond: ");
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            int j =  (i < n) ? i : 2 * n - 2 - i;
            printHorizontal(n - j - 1, " ");
            printHorizontal(Math.abs(n + j - 1) + 2 - n + j, "*");
            System.out.println();
        }
    }

    private static void diamondName() {
        System.out.print("Please set the number n for a centered diamond: ");
        int n = sc.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            if (i == n - 1) {
                System.out.println("Ellie");
                continue;
            }
            int j =  (i < n) ? i : 2 * n - 2 - i;
            printHorizontal(n - j - 1, " ");
            printHorizontal(Math.abs(n + j - 1) + 2 - n + j, "*");
            System.out.println();
        }
    }

}
