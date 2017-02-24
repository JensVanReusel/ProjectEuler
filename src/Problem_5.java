/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_5 {
    public static void main(String[] args) {
        int solution = 0;
        int number = 1;
        while(true){
            boolean dividable = true;
            for(int i = 1; i <= 20; i++){
                if(number%i != 0)
                    dividable = false;
            }
            if(dividable){
                solution = number;
                break;
            }
            number++;
        }
        System.out.println(solution);
    }
}
