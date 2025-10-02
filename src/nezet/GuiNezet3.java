package nezet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiNezet3 extends javax.swing.JFrame {

    public GuiNezet3() {
        initComponents();
    }

    public JButton getBtnBeallit() {
        return btnBeallit;
    }

    public JButton getBtnMutat() {
        return btnMutat;
    }

    //public void setTxaMutat(String uzenet) {
    public void mutat(String uzenet) {
        txtaMegjegyzes.setText(uzenet);
    }

    public JComboBox<String> getCmbNev() {
        return cmbNev;
    }

    public JTextArea getTxtaMegjegyzes() {
        return txtaMegjegyzes;
    }

    public JTextField getTxtfKor() {
        return txtfKor;
    }

    public JSlider getSldKorBeallit() {
        return sldKorBeallit;
    }

    //public JTextField getTxtKor() {
    public int korBeker() {
        return Integer.valueOf(txtfKor.getText());
    }

    //public JTextField getTxtNev() {
    public String nevBeker() {
        return (String)cmbNev.getSelectedItem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBeallit = new javax.swing.JButton();
        btnMutat = new javax.swing.JButton();
        cmbNev = new javax.swing.JComboBox<>();
        txtfKor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMegjegyzes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        sldKorBeallit = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Név:");

        jLabel2.setText("Kor:");

        btnBeallit.setText("Modellt beállít");

        btnMutat.setText("Modellt mutat");

        cmbNev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Róka Rudi", "Recip Róka", "Süke Bóka" }));

        txtaMegjegyzes.setColumns(20);
        txtaMegjegyzes.setRows(5);
        jScrollPane1.setViewportView(txtaMegjegyzes);

        jLabel3.setText("Kor Beállítása:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMutat)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtfKor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBeallit)
                            .addGap(6, 6, 6))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbNev, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(sldKorBeallit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfKor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBeallit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(sldKorBeallit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMutat)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeallit;
    private javax.swing.JButton btnMutat;
    private javax.swing.JComboBox<String> cmbNev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sldKorBeallit;
    private javax.swing.JTextArea txtaMegjegyzes;
    private javax.swing.JTextField txtfKor;
    // End of variables declaration//GEN-END:variables
}
