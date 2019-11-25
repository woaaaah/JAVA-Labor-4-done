import com.paveldejimas.isvestine.Automobilis;
import com.paveldejimas.isvestine.AutomobilisI;
import com.paveldejimas.bazine.Transportas;
import com.paveldejimas.bazine.TransportasI;


class main {

    public static void main(String[] args) {

        Transportas lektuvas = new Transportas("Oro", true , 1980);
        Transportas traukinys = new Transportas("sausumos", true , 2000);
        Transportas jachta = new Transportas("vandens", false, 1988);
        Transportas kateris = new Transportas("oro", true , 1999);
        Transportas autobusas = new Transportas("sausumos", true, 1970);

        Automobilis pirmas = new Automobilis("BMW", 5, true);
        Automobilis antras = new Automobilis("Chrysler", 6, false);
        Automobilis trecias = new Automobilis("FORD", 4, true);
        Automobilis ketvirtas = new Automobilis("AUDI", 5, true);
        Automobilis penktas = new Automobilis("LADA", 1, false);


        Transportas transportai[] = new Transportas[10];
        transportai[0] = pirmas;
        transportai[1] = antras;
        transportai[2] = trecias;
        transportai[3] = ketvirtas;
        transportai[4] = penktas;
        transportai[5] = jachta;
        transportai[6] = kateris;
        transportai[7] = traukinys;
        transportai[8] = lektuvas;
        transportai[9] = autobusas;
        System.out.println("Automobiliai varomi elektra");
        for (Transportas automobiliss : transportai) {
            if (automobiliss instanceof Automobilis) {
                if (((Automobilis) automobiliss).getvaromasElektra()) {
                    System.out.println(automobiliss);
                }
            }


        }


    }
}
