package exempleTest2;
import java.util.Random;

/**
 * Created by leleluattila on 26/01/16.
 */
public class Aleatoriu {
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println(x);
    }
}
