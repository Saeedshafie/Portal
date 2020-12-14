package Frames;

import FileManager.FileManager;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JFrameCloseClass extends javax.swing.JFrame {

    Path ClassesPathTemp = Paths.get("src/Files", "Classes.txt"); 
    String ClassesPath = String.valueOf(ClassesPathTemp);
    Path SelectUnitPathTemp = Paths.get("src/Files", "SelectUnit.txt"); 
    String SelectUnitPath = String.valueOf(ClassesPathTemp);
    
    private String professorusername;
    public JFrameCloseClass(String ProfessorUsername) {
        initComponents();
        this.professorusername = ProfessorUsername;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ((JLabel)jComboBoxClasses.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.ReadClasses();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxClasses = new javax.swing.JComboBox<>();
        jButtonClose = new javax.swing.JButton();
        jButtonDeleteClass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("لیست کلاس ها:");

        jComboBoxClasses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButtonClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClose.setText("خروج");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonDeleteClass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDeleteClass.setText("حذف کلاس");
        jButtonDeleteClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteClassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButtonDeleteClass, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonDeleteClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteClassActionPerformed
        try {
            FileManager fm = new FileManager(ClassesPath);            
            if(!fm.IsEmpty()){
                String[] result = fm.ReadFile();
                int CountLines = fm.CountLines();
                for(int i = 0; i < CountLines; i++){
                    String data = result[i];
                        int startname = data.indexOf("name=") + 5;
                        int endname = data.indexOf(";",startname);
                        String ClassName = data.substring(startname, endname);

                        if(jComboBoxClasses.getSelectedItem().equals(ClassName))
                        { result[i]=""; break;}
                }
                fm.Clear();
                for(int i = 0 ; i < CountLines; i++){
                  if(result[i] != "")                
                  if(i ==0)
                        fm.FileWriter(result[i], false);
                    else 
                        fm.FileWriter(result[i], true);
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(JFrameCloseClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileManager fm = new FileManager(SelectUnitPath);            
            if(!fm.IsEmpty()){
               String[] result = fm.ReadFile();
                int CountLines = fm.CountLines();

                for(int i = 0; i < CountLines; i++){
                    String data = result[i];
                        int startClassname = data.indexOf("classname=") + 10;
                        int endClassname = data.indexOf(";",startClassname);
                        String ClassName = data.substring(startClassname, endClassname);

                        if(jComboBoxClasses.getSelectedItem().equals(ClassName))
                        { result[i]=""; break;}
                }
                fm.Clear();
                for(int i = 0 ; i < CountLines; i++){
                  if(result[i] != "")                
                  if(i ==0)
                        fm.FileWriter(result[i], false);
                    else 
                        fm.FileWriter(result[i], true);

                }
                JOptionPane.showMessageDialog(new JFrame(), "با موفقیت حذف شد", "Dialog", 
                        JOptionPane.INFORMATION_MESSAGE);
            }            
            } catch (IOException ex) {
            Logger.getLogger(JFrameCloseClass.class.getName()).log(Level.SEVERE, null, ex);
        }    
        this.ReadClasses();
    }//GEN-LAST:event_jButtonDeleteClassActionPerformed

    private void ReadClasses(){
        this.jComboBoxClasses.removeAllItems();
         try {
                FileManager file = new FileManager(ClassesPath);                
                if(!file.IsEmpty()){
                    String[] result = file.ReadFile();
                    int CountLines = file.CountLines();
                    if(CountLines == 0)                    
                        return;
                    String[] Classes = new String[CountLines];
                    for(int i = 0; i < CountLines; i++)
                    {
                        String data = result[i];
                        int startuser = data.indexOf("masterusername=");
                        int enduser = data.indexOf(";", startuser);
                        String Username = data.substring(startuser + 15, enduser);
                        int startClass = data.indexOf("name=");
                        int endClass = data.indexOf(";", startClass);
                        String Class = data.substring(startClass + 5, endClass);
                        if(this.professorusername.equals(Username))
                            Classes[i] = Class;
                    }

                    for(int i = 0; i < CountLines; i++)               
                        if(Classes[i] == null) {} 
                        else
                            jComboBoxClasses.addItem(Classes[i]);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(JFrameCloseClass.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }
    
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
            java.util.logging.Logger.getLogger(JFrameCloseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCloseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCloseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCloseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCloseClass(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonDeleteClass;
    private javax.swing.JComboBox<String> jComboBoxClasses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
