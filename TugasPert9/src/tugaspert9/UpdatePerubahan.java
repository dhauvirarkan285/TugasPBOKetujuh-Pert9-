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

public class UpdatePerubahan extends JDialog {

    private EksekutorFile parentFrame;
    private int rowIndex;

    public UpdatePerubahan(EksekutorFile parent, int rowIndex) {
        super(parent, true);
        this.parentFrame = parent;
        this.rowIndex = rowIndex;
        initComponents();      // Generated Code tetap
        loadData();            // ambil data awal dari JTable

        // Tombol simpan & batal
        btnSimpan.addActionListener(e -> simpanPerubahan());
        btnBatal.addActionListener(e -> dispose());
    }

    // Ambil data dari JTable parentFrame dan set ke JTextField
    private void loadData() {
        txtNomorArmada.setText(parentFrame.getJTable().getValueAt(rowIndex, 0).toString());
        txtJenisArmada.setText(parentFrame.getJTable().getValueAt(rowIndex, 1).toString());
        txtMulaiDinas.setText(parentFrame.getJTable().getValueAt(rowIndex, 2).toString());
        txtPerawatanTerakhir.setText(parentFrame.getJTable().getValueAt(rowIndex, 3).toString());
        txtPerawatanSelanjutnya.setText(parentFrame.getJTable().getValueAt(rowIndex, 4).toString());
    }

    // Validasi & update data
    private void simpanPerubahan() {
        String nomor = txtNomorArmada.getText().trim();
        String jenis = txtJenisArmada.getText().trim();
        String mulaiDinas = txtMulaiDinas.getText().trim();
        String p24Terakhir = txtPerawatanTerakhir.getText().trim();
        String p24Selanjutnya = txtPerawatanSelanjutnya.getText().trim();

        if (nomor.isEmpty() || jenis.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor dan Jenis Armada wajib diisi!");
            return;
        }

        // Update di EksekutorFile
        parentFrame.ubahData(rowIndex, nomor, jenis, mulaiDinas, p24Terakhir, p24Selanjutnya);
        JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomorArmada = new javax.swing.JTextField();
        txtJenisArmada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPerawatanTerakhir = new javax.swing.JTextField();
        txtPerawatanSelanjutnya = new javax.swing.JTextField();
        txtMulaiDinas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNomorArmada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorArmadaActionPerformed(evt);
            }
        });

        txtJenisArmada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisArmadaActionPerformed(evt);
            }
        });

        jLabel1.setText("APA YANG MAU DIUBAH?");

        btnSimpan.setText("Simpan");

        jLabel2.setText("Nomor Armada");

        btnBatal.setText("Batal");

        jLabel3.setText("Jenis Armada");

        jLabel4.setText("Tanggal MD");

        jLabel5.setText("Tanggal P24 MRI/SGU");

        jLabel6.setText("Tanggal P24 YAD");

        txtMulaiDinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMulaiDinasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(0, 139, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtPerawatanTerakhir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(46, 46, 46)
                        .addComponent(txtPerawatanSelanjutnya))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(76, 76, 76)
                        .addComponent(txtMulaiDinas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(67, 67, 67)
                        .addComponent(txtJenisArmada))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(57, 57, 57)
                        .addComponent(txtNomorArmada))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBatal)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomorArmada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJenisArmada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtMulaiDinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtPerawatanTerakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPerawatanSelanjutnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomorArmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorArmadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorArmadaActionPerformed

    private void txtJenisArmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisArmadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisArmadaActionPerformed

    private void txtMulaiDinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMulaiDinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMulaiDinasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtJenisArmada;
    private javax.swing.JTextField txtMulaiDinas;
    private javax.swing.JTextField txtNomorArmada;
    private javax.swing.JTextField txtPerawatanSelanjutnya;
    private javax.swing.JTextField txtPerawatanTerakhir;
    // End of variables declaration//GEN-END:variables
}
