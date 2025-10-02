package vezerlo;

import modell.EmberModell;
import nezet.CuiNezet;

public class CuiVezerlo {
    private EmberModell modell;
    private CuiNezet nezet;

    public CuiVezerlo(EmberModell modell, CuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
    }

    public void feladat() {
        String nev = nezet.nevBeker();
        int kor = nezet.korBeker();
        modell.setNev(nev);
        modell.setKor(kor);
        String kimenet = "%s kora: %d\n".formatted(modell.getNev(), modell.getKor());
        nezet.mutat(kimenet);
    }
    
}
