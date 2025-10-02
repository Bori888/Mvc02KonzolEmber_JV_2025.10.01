package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.EmberModell;
import nezet.GuiNezet1;

public class GuiVezerlo1 {
    private EmberModell modell;
    private GuiNezet1 nezet;

    public GuiVezerlo1(EmberModell modell, GuiNezet1 nezet) {
        this.modell = modell;
        this.nezet = nezet;
        nezet.setVisible(true);
    }
    
    public void feladat() {
        /* beállító gomb feladatai: */
        JButton btnBeallit = nezet.getBtnBeallit();
        btnBeallit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nev = nezet.nevBeker();
                int kor = nezet.korBeker();
                modell.setNev(nev);
                modell.setKor(kor);
                nezet.mutat("modell beállítva");
            }
        });
        
        /* a mutató gomb feladatai: */
        JButton btnMutat = nezet.getBtnMutat();
        btnMutat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kimenet = "%s kora: %d\n".formatted(modell.getNev(), modell.getKor());
                nezet.mutat(kimenet);
            }
        }); 
    }
}
