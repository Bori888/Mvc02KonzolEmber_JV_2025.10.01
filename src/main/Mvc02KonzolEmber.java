package main;

import javax.swing.SwingUtilities;
import modell.EmberModell;
import nezet.CuiNezet;
import nezet.GuiNezet1;
import nezet.GuiNezet2;
import nezet.GuiNezet3;
import nezet.GuiNezet4;
import nezet.JopNezet;
import vezerlo.CuiVezerlo;
import vezerlo.GuiVezerlo1;
import vezerlo.GuiVezerlo2;
import vezerlo.GuiVezerlo3;
import vezerlo.GuiVezerlo4;
import vezerlo.JopVezerlo;

public class Mvc02KonzolEmber {

    public Mvc02KonzolEmber() {
        //CuiNezet nezet = new CuiNezet();
        //JopNezet nezet = new JopNezet();

        //EmberModell modell = new EmberModell(nezet.getNev(), nezet.getKor());
        EmberModell modell = new EmberModell();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //GuiNezet1 nezet = new GuiNezet1();
                /* itt is lehet, de inkább a vezérlő tegye*/
                //nezet.setVisible(true);
                //GuiVezerlo1 vezerlo = new GuiVezerlo1(modell, nezet);
                //vezerlo.feladat();

//                GuiNezet2 nezet = new GuiNezet2();
//                GuiVezerlo2 vezerlo = new GuiVezerlo2(modell, nezet);
//                vezerlo.feladat();
//                GuiNezet3 nezet = new GuiNezet3();
//                GuiVezerlo3 vezerlo = new GuiVezerlo3(modell, nezet);
//                vezerlo.feladat();
                GuiNezet4 nezet = new GuiNezet4();
                GuiVezerlo4 vezerlo = new GuiVezerlo4(modell, nezet);
                vezerlo.feladat();
            }
        });

        //CuiVezerlo vezerlo = new CuiVezerlo(modell, nezet);
        //JopVezerlo vezerlo = new JopVezerlo(modell, nezet);
        //vezerlo.feladat();
    }

    public static void main(String[] args) {
        new Mvc02KonzolEmber();
    }
}
