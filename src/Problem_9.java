/**
 * Created by jensv on 2/24/2017.
 */
public class Problem_9 {
    public static void main(String[] args) {
        int solution = 0;
        int sum = 0;

        loop:
        for(int a = 0; a < 1000; a++){ //a
            for(int b = 0; b < 1000; b++){ //b
                if(a < b)
                    for(int c = 0; c < 1000; c++){ //c
                        if(b < c)
                        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a+b+c == 1000){
                            solution = a*b*c;
                            break loop;
                        }
                    }
            }
        }
        System.out.println(solution);
    }
}
