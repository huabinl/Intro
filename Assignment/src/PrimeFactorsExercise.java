/*
 * Created by hbliu.
 */
import java.util.*;

public class PrimeFactorsExercise {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please set the value of N: ");
        int n = sc.nextInt();
        primeFactors(n);
    }

    private static void primeFactors(int n) {
        List<Integer> primes = findPrime(n);
        List<String> factors = new ArrayList<>();
        for (Integer prime : primes) {
            if (n % prime == 0) {
                factors.add(prime.toString());
            }
        }
        System.out.println(String.join(",", factors));
    }

    private static List<Integer> findPrime(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}

