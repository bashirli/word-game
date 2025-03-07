
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Bashirli
 */
public class AnaSehife extends javax.swing.JFrame {
String oyuncu=null;
int sayac=1;
    /**
     * Creates new form AnaSehife
     */
    public AnaSehife() {
        initComponents();
     Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
         while(true){
           LocalTime lt=LocalTime.now();
           LocalDate ld=LocalDate.now();
           saat.setText(lt.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        tarix.setText(ld.format(DateTimeFormatter.ofPattern("d/M/yyyy")));
         }
            }
     });
     t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ad_daxil_et = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        Qaydalar = new javax.swing.JButton();
        ad_sil = new javax.swing.JButton();
        basla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tarix = new javax.swing.JLabel();
        saat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№", "Ad", "Vaxt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        ad_daxil_et.setText("Oyunçu yarat");
        ad_daxil_et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_daxil_etActionPerformed(evt);
            }
        });

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Qaydaları qebul edirem.");

        Qaydalar.setText("Qaydalar");
        Qaydalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QaydalarActionPerformed(evt);
            }
        });

        ad_sil.setText("Oyunçu sil");
        ad_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_silActionPerformed(evt);
            }
        });

        basla.setText("Oyuna başla");
        basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setText("Xoş geldiniz!");

        ad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Ad");

        tarix.setBackground(new java.awt.Color(255, 51, 102));
        tarix.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tarix.setForeground(new java.awt.Color(255, 51, 51));

        saat.setBackground(new java.awt.Color(255, 51, 51));
        saat.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        saat.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tarix, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(saat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(399, 399, 399)
                                .addComponent(ad_daxil_et)
                                .addGap(118, 118, 118)
                                .addComponent(ad_sil))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jCheckBox1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(Qaydalar)
                                .addGap(358, 358, 358)
                                .addComponent(basla))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(423, 423, 423)
                                .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(525, 525, 525)
                                .addComponent(jLabel2)))
                        .addGap(0, 410, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad_daxil_et)
                    .addComponent(ad_sil))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qaydalar)
                    .addComponent(basla))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tarix, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saat, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ad_daxil_etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_daxil_etActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        if(problem_tapma(ad.getText().toString())==1){
            return;
        }
        LocalDateTime ldt=LocalDateTime.now();
        Object []data={sayac,ad.getText().toString(),ldt.format(DateTimeFormatter.ofPattern("dd:MM:yy HH:mm:ss"))};
       model.addRow(data);
        sayac++;
    
        ad.setText("");
    }//GEN-LAST:event_ad_daxil_etActionPerformed

    private void adKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_adKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int in=jTable1.getSelectedRow();
        oyuncu=model.getValueAt(in, 1).toString();
        ad.setText(oyuncu);
    }//GEN-LAST:event_jTable1MouseClicked

    private void baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslaActionPerformed
        // TODO add your handling code here:
        if(oyuncu==null){
            JOptionPane.showMessageDialog(this, "Oyunçu seçilmeyib. \nSeçmek üçün tablodan oyunçunu klikleyin.");
            return;
        }
        if(!jCheckBox1.isSelected()){
              JOptionPane.showMessageDialog(this, "Şertler qebul edilmeyib.");
            return;
        }
        
        // OYUN BASLAMA KODU:
        Oyun oyun=new Oyun();
        oyun.oyuncu=oyuncu;
        oyun.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_baslaActionPerformed

    private void ad_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_silActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int in=jTable1.getSelectedRow();
       if(in==-1){
               JOptionPane.showMessageDialog(this, "Oyunçu seçilmeyib. \nSilmek üçün tablodan oyunçunu klikleyin.");
            return;
            
        }else{
            ad.setText("");
            oyuncu=null;
            model.removeRow(in);
           
        }
        
    }//GEN-LAST:event_ad_silActionPerformed

    private void QaydalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QaydalarActionPerformed
        //QAYDALAR OLAN HISSE:
        Qayda qayda=new Qayda();
        qayda.setVisible(true);
        
      
    }//GEN-LAST:event_QaydalarActionPerformed

    int problem_tapma(String str){
       if(str.length()==0){
           JOptionPane.showMessageDialog(this, "Ad boş buraxılıb");
           return 1;
       }
        return 0;
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AnaSehife.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSehife.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSehife.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSehife.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new AnaSehife().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Qaydalar;
    private javax.swing.JTextField ad;
    private javax.swing.JButton ad_daxil_et;
    private javax.swing.JButton ad_sil;
    private javax.swing.JButton basla;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel saat;
    private javax.swing.JLabel tarix;
    // End of variables declaration//GEN-END:variables
}
