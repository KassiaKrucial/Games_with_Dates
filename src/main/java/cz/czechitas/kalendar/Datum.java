package cz.czechitas.kalendar;

import javax.swing.border.*;
import sun.font.*;

public class Datum {
    
    private int rok;
    private int mesic;
    private int den;
    
    public String toString() {
        return "Datum " +  den + ". " + getNazevMesice() + " " + rok;
    }

    public void setRok(int newValue) {
        rok = newValue;
    }

    public void setMesic(int newValue) {
        if (newValue > 0 && newValue < 13) {
            mesic = newValue;
        } else {
            System.out.println("Neplatna hodnota mesice " + newValue);
        }

    }

    public void setDen(int newValue) {
        if (newValue > 0 && newValue < 32) {
            den = newValue;
        } else {
            System.out.println("Neplatna hodnota dne " + newValue);
        }

    }

    public int getRok() {
        return rok;
    }

    public int getMesic() {
        return mesic;
    }

    public int getDen() {
        return den;
    }

    public String getNazevMesice() {
        if (mesic == 1) {
            return "leden";
        }
        if (mesic == 2) {
            return "unor";
        }
        if (mesic == 3) {
            return "brezen";
        }
        if (mesic == 4) {
            return "duben";
        }
        if (mesic == 5) {
            return "kveten";
        }
        if (mesic == 6) {
            return "cerven";
        }
        if (mesic == 7) {
            return "cervenec";
        }
        if (mesic == 8) {
            return "srpen";
        }
        if (mesic == 9) {
            return "zari";
        }
        if (mesic == 10) {
            return "rijen";
        }
        if (mesic == 11) {
            return "listopad";
        }
        if (mesic == 12) {
            return "prosinec";
        }
        else {
            return "NEPLATNY_MESIC_0";
        }
    }

    public boolean jeVPrestupnemRoce() {
        if (rok % 100 == 0 && (rok % 400) != 0) {
            return false;
        }
        if ((rok % 4) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getPocetDni() {
        if (mesic == 1) {
            return 31;
        }
        if (mesic == 2) {
            if (jeVPrestupnemRoce() == true) {
                return 29;
            } else {
                return 28;
            }
        }
        if (mesic == 3) {
            return 31;
        }
        if (mesic == 4) {
            return 30;
        }
        if (mesic == 5) {
            return 31;
        }
        if (mesic == 6) {
            return 30;
        }
        if (mesic == 7) {
            return 31;
        }
        if (mesic == 8) {
            return 31;
        }
        if (mesic == 9) {
            return 30;
        }
        if (mesic == 10) {
            return 31;
        }
        if (mesic == 11) {
            return 30;
        } else {
            return 31;
        }
    }

}
