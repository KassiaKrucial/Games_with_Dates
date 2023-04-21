package cz.czechitas.kalendar;

import javax.sound.midi.*;

public class SpousteciTrida {

    public static void main(String[] args) {

        Datum dnesek = new Datum();
        dnesek.setRok(2020);
        dnesek.setMesic(10);
        dnesek.setDen(28);

        System.out.println(dnesek);
        System.out.println("Mesic: " + dnesek.getNazevMesice());
        System.out.println(dnesek.jeVPrestupnemRoce());
        System.out.println();

        Datum letosniVanoce = new Datum();
        letosniVanoce.setRok(2020);
        letosniVanoce.setMesic(12);
        letosniVanoce.setDen(24);

        System.out.println(letosniVanoce);

        Datum letosniSilvester = new Datum();
        letosniSilvester.setRok(2020);
        letosniSilvester.setMesic(12);
        letosniSilvester.setDen(31);

        System.out.println(letosniSilvester);

        if (letosniVanoce.getMesic() == letosniSilvester.getMesic()) {
            System.out.println("Vanoce a Silvester jsou ve stejnem mesici.");
        } else {
            System.out.println("Vanoce a Silvester NEJSOU ve stejnem mesici.");
        }

        System.out.println();

        Datum nesmyslnyMesic = new Datum();
        nesmyslnyMesic.setRok(2020);
        nesmyslnyMesic.setMesic(13);
        nesmyslnyMesic.setDen(11);

        System.out.println(nesmyslnyMesic);
        System.out.println();

        Datum nesmyslnyMesic2 = new Datum();
        nesmyslnyMesic2.setRok(2021);
        nesmyslnyMesic2.setMesic(-1);
        nesmyslnyMesic2.setDen(5);
        System.out.println(nesmyslnyMesic2);
        System.out.println(nesmyslnyMesic2.jeVPrestupnemRoce());
        System.out.println();

        Datum nesmyslnyDen = new Datum();
        nesmyslnyDen.setRok(2022);
        nesmyslnyDen.setMesic(12);
        nesmyslnyDen.setDen(40);

        System.out.println(nesmyslnyDen);
        System.out.println();

        Datum nesmyslnyDen2 = new Datum();
        nesmyslnyDen2.setRok(2023);
        nesmyslnyDen2.setMesic(3);
        nesmyslnyDen2.setDen(-2);

        System.out.println(nesmyslnyDen2);
        System.out.println();

        Datum neprestupnyRok = new Datum();
        neprestupnyRok.setRok(2020);
        neprestupnyRok.setMesic(2);
        neprestupnyRok.setDen(6);
        System.out.println(neprestupnyRok);
        System.out.println(neprestupnyRok.jeVPrestupnemRoce());
        System.out.println(neprestupnyRok.getPocetDni());


    }

}
