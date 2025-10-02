package vezerlo;

import modell.EmberModell;
import nezet.JopNezet;

public class JopVezerlo {
    private EmberModell modell;
    private JopNezet nezet;

    public JopVezerlo(EmberModell modell, JopNezet nezet) {
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
