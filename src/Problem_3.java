import java.util.LinkedList;
import java.util.List;

/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_3 {
    public static void main(String[] args) {
        long solution = 0;
        long number = 600851475143L;

        for (long i = 2; i <= number; i++) {
            if (number%i == 0) {
                while( number%i == 0)
                    number = number/i;
                solution = i;
            }
        }
        System.out.println(solution);
    }
    private static boolean isPrime(long n){
        if (n%2==0) return false;
        for(int j=3;j*j<=n;j+=2) {
            if(n%j==0)
                return false;
        }
        return true;
    }
}
