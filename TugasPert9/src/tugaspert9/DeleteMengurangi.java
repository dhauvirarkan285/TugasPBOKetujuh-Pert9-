/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert9;

/**
 *
 * @author RAISSA
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class DeleteMengurangi extends JDialog {
    private EksekutorFile parentFrame;
    private int rowIndex;
    private JTextField txtIdArmada;

    public DeleteMengurangi(EksekutorFile parent, int rowIndex) {
    super(parent, true);
    this.parentFrame = parent;
    this.rowIndex = rowIndex;

    initComponents(); // jangan diubah

    // Listener tombol
    btnYakin.addActionListener(e -> hapusData());
    btnTidak.addActionListener(e -> dispose());

    loadData(); // isi field
}

// Ambil data dari JTable parent
private void loadData() {
    txtIsiYangKosong.setText(parentFrame.getJTable().getValueAt(rowIndex, 0).toString());
}

// Hapus data
private void hapusData() {
    parentFrame.hapusBaris(rowIndex);
    dispose();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIsiYangKosong = new javax.swing.JTextField();
        btnYakin = new javax.swing.JButton();
        btnTidak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Apakah anda yakin menghapus armada dengan id_armada berikut?");

        txtIsiYangKosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsiYangKosongActionPerformed(evt);
            }
        });

        btnYakin.setText("Yakin");

        btnTidak.setText("Tidak");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIsiYangKosong, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnYakin)
                        .addGap(18, 18, 18)
                        .addComponent(btnTidak)))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtIsiYangKosong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYakin)
                    .addComponent(btnTidak))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIsiYangKosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsiYangKosongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsiYangKosongActionPerformed
    // Contoh main untuk testing (jika ingin standalone)
    public static void main(String[] args) {
        // Misal parent hanya dummy
        EksekutorFile dummyParent = new EksekutorFile();
        SwingUtilities.invokeLater(() -> new DeleteMengurangi(dummyParent, 0).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTidak;
    private javax.swing.JButton btnYakin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtIsiYangKosong;
    // End of variables declaration//GEN-END:variables
}
