package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import modell.EmberModell;
import nezet.GuiNezet4;

public class GuiVezerlo4 {

    private EmberModell modell;
    private GuiNezet4 nezet;

    public GuiVezerlo4(EmberModell modell, GuiNezet4 nezet) {
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
        JRadioButton rdbNev = nezet.getRdbNev();
        JRadioButton rdbKor = nezet.getRdbKor();

        JCheckBox chb = nezet.getCmbMindentMutat();
        chb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (chb.isSelected()) {
                    String nev = modell.getNev();
                    int kor = modell.getKor();
                    rdbNev.setEnabled(false);
                    rdbKor.setEnabled(false);
                    nezet.getButtonGroup1().clearSelection();
                    nezet.mutat("%d (%d éves)".formatted(nev, kor));

                } else {
                    rdbNev.setEnabled(true);
                    rdbKor.setEnabled(true);
                }

            }
        });
        rdbNev.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                mutatSzurAdat(e);
            }

            private void mutatSzurAdat(ItemEvent e) {
                JRadioButton rdb = (JRadioButton) e.getItem();
                String mutat = "";
                if (rdb.getActionCommand().contains("Név")) {
                    mutat = "Név: " + modell.getNev();

                } else {
                    mutat = "Kor: " + modell.getKor();
                }
                nezet.mutat(mutat);
            }
        });
    }
}
