package exempleTest3;
import java.util.Random;

/**
 * Created by leleluattila on 26/01/16.
 */
public class Aleatoriu2 {
    public static void main(String[] args){
        Random aleatoriu = new Random();
        int x = aleatoriu.nextInt(20);
        int y = aleatoriu.nextInt(20);
        System.out.println("Numereel sunt: " + x + " " + y);

        if (x>y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}
