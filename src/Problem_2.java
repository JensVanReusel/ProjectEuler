/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_2 {
    public static void main(String[] args) {
        int prev = 0;
        int curr = 1;
        int next;
        int solution = 0;

        while (curr < 4000000){
            next = prev + curr;
            prev = curr;
            if(next%2 == 0)
                solution+=next;
            curr = next;
        }
        System.out.println(solution);
    }
}
