import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Ge on 2016/11/7.
 * 204. Count Primes
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class Q204 {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        for(int i = 2; i < n; i++){
            if(prime[i] == true) { //if a prime, make its times be non-prime
                for (int j = 2 * i; j < n; j = j + i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++){
            if(prime[i]){
                count++;
            }
        }
        return count - 1;
    }
}
