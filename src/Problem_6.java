/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_6 {
    public static void main(String[] args) {
        int solution = 0;
        int sumOfSquares = 0;
        int squareOfSums = 0;
        int sum = 0;

        for(int i = 1; i <= 100; i++){
            sumOfSquares += Math.pow(i, 2);
            sum += i;
        }
        squareOfSums = (int)Math.pow(sum, 2);

        System.out.println(squareOfSums - sumOfSquares);
    }
}
