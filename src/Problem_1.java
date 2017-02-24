/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_1 {
    public static void main(String[] args) {
        int solution = 0;
        for(int i = 0; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                solution+=i;
            }
        }
        System.out.println(solution);
    }
}
