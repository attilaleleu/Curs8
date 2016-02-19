package Test9;

/**
 * Created by leleluattila on 26/01/16.
 */
public class Calculator {
    Sursa pwr;
    PlacaVid gpu;
    boolean start;

    Calculator(int p, String g){
        pwr = new Sursa(p);
        gpu = new PlacaVid(g);
    }

    void onOff(){
        if (start == false){
            start = true;
            pwr.powerOn();
            gpu.afiseaza();
        }else {
            start = false;
            pwr.powerOff();
        }
    }
}

class Sursa{
    int watt;

    Sursa(int watt){
        this.watt = watt;
    }

    void powerOn(){
        System.out.println("Power ON!");

    }

    void powerOff(){
        System.out.println("Power OFF!");
    }
}

class PlacaVid{
    String nume;

    PlacaVid(String marca){
        nume = marca;
    }

    void afiseaza(){
        System.out.println("AMD Radeon HD 7850");
    }
}
