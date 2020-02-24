package seminar;

import cts.Impozabil;
import cts.Masina;

public class main {

    public static void main(String[] args) {
        Masina m1 = new Masina("Dacia Logan",100,1600);
        m1.setCombustibil(Masina.TipCombustibil.benzina);
        System.out.println(m1.calculeazaImpozit());

        Impozabil x;
        x = m1;
        x.calculeazaImpozit();

    }
}