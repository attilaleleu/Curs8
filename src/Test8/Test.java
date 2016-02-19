package Test8;
import java.util.*;

/**
 * Created by leleluattila on 26/01/16.
 */
public class Test {
    public static void main(String[] args){
        ArrayList<Punct1> pct1 = new ArrayList<>();

        pct1.add(new Punct1(2));
        pct1.add(new Punct1(4));

        pct1.add(new Cerc(3, 5));
        pct1.add(new Cerc(0, 4));
        pct1.add(new Cerc(10, 8));

        for (int i=0; i<pct1.size(); i++){
            pct1.get(i).deseneaza();
        }

    }
}
