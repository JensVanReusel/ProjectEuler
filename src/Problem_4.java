/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_4 {
    public static void main(String[] args) {
        int solution = 0;

        for(int i = 999; i > 99; i--){
            for(int j = 999; j > 99; j--){
                String string = i*j+"";
                if(string.equals(new StringBuilder(string).reverse().toString())) {
                    int num = Integer.parseInt(string);
                    if(solution < num)
                        solution = num;
                }
            }
        }
        System.out.println(solution);
    }
}
