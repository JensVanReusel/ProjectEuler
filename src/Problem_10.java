/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_10 {
    public static void main(String[] args) {
        long solution = 0;

        for(int i = 2; i < 2000000; i++){
            if(isPrime(i)) {
                //System.out.println(i);
                solution += i;
            }
        }

        System.out.println(solution);
    }
    private static boolean isPrime(long n){
        if(n==2) return true;
        if (n%2==0) return false;
        for(int j=3;j*j<=n;j+=2) {
            if(n%j==0)
                return false;
        }
        return true;
    }
}
