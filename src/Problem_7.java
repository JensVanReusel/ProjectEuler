/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_7 {
    public static void main(String[] args) {
        int solution = 0;
        int counter = 1;
        int i = 1;
        while(counter <= 10001){
            if(isPrime(i)) {
                solution = i;
                counter++;
            }
            i++;
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
