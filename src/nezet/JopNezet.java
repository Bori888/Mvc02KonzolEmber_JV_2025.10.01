package nezet;

import javax.swing.JOptionPane;

public class JopNezet {
    
    public void mutat(String uzenet){
        JOptionPane.showMessageDialog(null, uzenet);
    }
    
    public String nevBeker(){
        return JOptionPane.showInputDialog("név: ");
    }
    
    public int korBeker(){
        String k = JOptionPane.showInputDialog("kor: ");
        return  Integer.parseInt(k);
    }
}
