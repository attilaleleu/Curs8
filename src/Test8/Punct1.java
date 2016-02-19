package Test8;

/**
 * Created by leleluattila on 26/01/16.
 */
public class Punct1 {
    int x;

    Punct1(int x){
        this.x = x;
    }

    void deseneaza(){
        System.out.println("pct: " + x);
    }
}

class Cerc extends Punct1{
    int rza;

    Cerc (int x, int rza){
        super(x);
        this.rza = rza;
    }

    void deseneaza(){
        System.out.println();
        super.deseneaza();
        System.out.println("R: " +rza);
    }

}
