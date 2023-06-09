
package tugaspbo1;

import java.sql.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;

public class admin extends javax.swing.JFrame {


    public admin() {
        initComponents();
        lihat_data();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        txtkeluar = new javax.swing.JButton();
        txtNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi Pendataan Siswa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("STZhongsong", 0, 14)); // NOI18N
        jLabel10.setText("Data Siswa SMAN 2 Bontang");

        btnCari.setBackground(new java.awt.Color(0, 102, 51));
        btnCari.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(0, 102, 51));
        btnHapus.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nis", "Nama", "JK", "T. Lahir", "TGL. Lahir", "Alamat", "N. Ayah", "N. Ibu"
            }
        ));
        table1.setShowGrid(true);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        txtkeluar.setBackground(new java.awt.Color(0, 102, 51));
        txtkeluar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        txtkeluar.setForeground(new java.awt.Color(255, 255, 255));
        txtkeluar.setText("Keluar");
        txtkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeluarActionPerformed(evt);
            }
        });

        txtNo.setToolTipText("");
        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });

        jLabel2.setText("Data Ke");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnHapus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91)
                        .addComponent(txtkeluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(txtkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        btnCari.getAccessibleContext().setAccessibleName("btnCari");

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void lihat_data(){
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("No");
        table.addColumn("Nis");
        table.addColumn("Nama");
        table.addColumn("JK");
        table.addColumn("T. Lahir");
        table.addColumn("TGL Lahir");
        table.addColumn("Alamat");
        table.addColumn("N. Ayah");
        table.addColumn("N. Ibu");
        
        String cari = txtCari.getText();
        try{
            java.sql.Connection conn=(Connection)config.configDB();
            String sql = "select *from tbsiswa where Nama like '%"+cari+"%'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            while(rs.next())
            {
                table.addRow(new Object[]{
                    rs.getString(1),
                      rs.getString(2),
                        rs.getString(3),
                          rs.getString(4),
                            rs.getString(5),
                              rs.getString(6),
                                rs.getString(7),
                                  rs.getString(8),
                                    rs.getString(9)});
            }
            table1.setModel(table);
        }
       catch (Exception e){
           JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan");
            System.out.println(e.getMessage());
       } 
    }
                   
    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
    
    }//GEN-LAST:event_table1MouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("No");
        table.addColumn("Nis");
        table.addColumn("Nama");
        table.addColumn("JK");
        table.addColumn("T. Lahir");
        table.addColumn("TGL Lahir");
        table.addColumn("Alamat");
        table.addColumn("N. Ayah");
        table.addColumn("N. Ibu");
        
        String Nomor = txtNo.getText();
        try{
            String sql = "DELETE FROM tbsiswa WHERE id='"+txtNo.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();  
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            lihat_data();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Hapus Data gagal");
            System.out.println(e.getMessage());
        
    }                    
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        lihat_data();
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeluarActionPerformed
        this.setVisible(false);
        new Loginadmin().setVisible(true);
    }//GEN-LAST:event_txtkeluarActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNo;
    private javax.swing.JButton txtkeluar;
    // End of variables declaration//GEN-END:variables
}
