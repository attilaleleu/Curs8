package Test7;

/**
 * Created by leleluattila on 26/01/16.
 */
public class Punct {
    int x;

    Punct(){

    }

    Punct(int x){
        this.x = x;
    }

    void deseneaza(){
        System.out.println("pct: " + x + " ");
    }
}

class Cerc extends Punct {
    int raza;

    Cerc (int x, int raza){
        super(x);
        this.raza = raza;
    }

    @Override
    void deseneaza() {
        System.out.println();
        super.deseneaza();
        System.out.println("raza: " + raza);
    }
}
