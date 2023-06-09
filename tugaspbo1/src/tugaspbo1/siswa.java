
package tugaspbo1;

import java.sql.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;

public class siswa extends javax.swing.JFrame {


    public siswa() {
        initComponents();
        lihat_data();
        cbJenis.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNis = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTempat = new javax.swing.JTextField();
        cbJenis = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtAyah = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtIbu = new javax.swing.JTextField();
        txtkeluar = new javax.swing.JButton();

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
        jLabel10.setText("Silahkan isi Data di Bawah ini !!");

        btnCari.setBackground(new java.awt.Color(0, 102, 51));
        btnCari.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(0, 102, 51));
        btnSimpan.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 102, 51));
        btnEdit.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 102, 51));
        btnClear.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel12.setText("No                    :");

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        txtNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel13.setText("Nis                    :");

        txtNis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNisKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel14.setText("Nama               :");

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel15.setText("Jenis Kelamin  :");

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel16.setText("Tempat Lahir  :");

        txtTempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempatActionPerformed(evt);
            }
        });
        txtTempat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTempatKeyTyped(evt);
            }
        });

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "Laki-Laki", "Perempuan" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTempat)
                    .addComponent(txtNama)
                    .addComponent(txtNis)
                    .addComponent(cbJenis, 0, 161, Short.MAX_VALUE)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel17.setText("Tanggal Lahir :");

        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel18.setText("Alamat             :");

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel19.setText("Nama Ayah     :");

        txtAyah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAyahKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel20.setText("Nama Ibu        :");

        txtIbu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIbuKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAyah, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtAlamat)
                    .addComponent(txtTanggal)
                    .addComponent(txtIbu))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        txtkeluar.setBackground(new java.awt.Color(0, 102, 51));
        txtkeluar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        txtkeluar.setForeground(new java.awt.Color(255, 255, 255));
        txtkeluar.setText("Keluar");
        txtkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(btnSimpan)
                                .addGap(31, 31, 31)
                                .addComponent(btnEdit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnClear)
                                .addGap(31, 31, 31)
                                .addComponent(txtkeluar))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnClear)
                    .addComponent(txtkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
           
       } 
    }
        
    void clear(){
        txtNo.setText("");
        txtNis.setText("");
        txtNama.setText("");
        cbJenis.setSelectedIndex(0);
        txtTempat.setText("");
        txtTanggal.setText("");
        txtAlamat.setText("");
        txtAyah.setText("");
        txtIbu.setText("");
    }
        
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(txtNo.getText().equals("") || txtNis.getText().equals("") || txtNama.getText().equals("") || txtTempat.getText().equals("") || txtTanggal.getText().equals("") || txtAlamat.getText().equals("") || txtAyah.getText().equals("") || txtIbu.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Isi Data Belum Lengkap");
        }else{
          try{
            String sql = "INSERT INTO tbsiswa VALUES ('"+txtNo.getText()+"','"+txtNis.getText()+"','"+txtNama.getText()+"','"+cbJenis.getSelectedItem()+"','"+txtTempat.getText()+"','"+txtTanggal.getText()+"','"+txtAlamat.getText()+"','"+txtAyah.getText()+"','"+txtIbu.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();  
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
            lihat_data();
            clear();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Simpan Data gagal");
            System.out.println(e.getMessage());
        
    }    
        }
        
    }//GEN-LAST:event_btnSimpanActionPerformed

           
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtTempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempatActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int baris = table1.rowAtPoint(evt.getPoint());
        String No = table1.getValueAt(baris, 0).toString();
        txtNo.setText(No);
        String Nis = table1.getValueAt(baris, 1).toString();
        txtNis.setText(Nis);
        String Nama = table1.getValueAt(baris, 2).toString();
        txtNama.setText(Nama);
        String Tempat = table1.getValueAt(baris, 4).toString();
        txtTempat.setText(Tempat);
        String Tanggal = table1.getValueAt(baris, 5).toString();
        txtTanggal.setText(Tanggal);
        String Alamat = table1.getValueAt(baris, 6).toString();
        txtAlamat.setText(Alamat);
        String Ayah = table1.getValueAt(baris, 7).toString();
        txtAyah.setText(Ayah);
        String Ibu = table1.getValueAt(baris, 8).toString();
        txtIbu.setText(Ibu);
    }//GEN-LAST:event_table1MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            String sql = "UPDATE tbsiswa SET id='"+txtNo.getText()+"', Nis='"+txtNis.getText()+"',Nama='"+txtNama.getText()+"',Jenis_Kelamin='"+cbJenis.getSelectedItem()+"',Tempat_lahir='"+txtTempat.getText()+"',Tanggal_lahir='"+txtTanggal.getText()+"',Alamat='"+txtAlamat.getText()+"',Nama_ayah='"+txtAyah.getText()+"',Nama_ibu='"+txtIbu.getText()+"' WHERE id='"+ txtNo.getText()+"'";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate();  
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
            lihat_data();
            clear();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "edit data gagal");
            System.out.println(e.getMessage());
        
    }                    
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        lihat_data();
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoKeyPressed

    }//GEN-LAST:event_txtNoKeyPressed

    private void txtNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Input dengan Angka");
        }
    }//GEN-LAST:event_txtNoKeyTyped

    private void txtNisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNisKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Input dengan Angka");
        }
    }//GEN-LAST:event_txtNisKeyTyped

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        if (Character.isDigit(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Input dengan Huruf");
        }
    }//GEN-LAST:event_txtNamaKeyTyped

    private void txtTempatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempatKeyTyped
        if (Character.isDigit(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Input dengan Huruf");
        }
    }//GEN-LAST:event_txtTempatKeyTyped

    private void txtAyahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAyahKeyTyped
        if (Character.isDigit(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Input dengan Huruf");
        }
    }//GEN-LAST:event_txtAyahKeyTyped

    private void txtIbuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIbuKeyTyped
       if (Character.isDigit(evt.getKeyChar())){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Input dengan Huruf");
        }
    }//GEN-LAST:event_txtIbuKeyTyped

    private void txtkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeluarActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_txtkeluarActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new siswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAyah;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIbu;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNis;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTempat;
    private javax.swing.JButton txtkeluar;
    // End of variables declaration//GEN-END:variables
}
