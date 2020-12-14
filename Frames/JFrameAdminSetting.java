package Frames;

import FileManager.FileManager;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrameAdminSetting extends javax.swing.JFrame {
    
   Path AdminPathTemp = Paths.get("src/Files", "Admin.txt");
   Path StudentsPathTemp = Paths.get("src/Files", "Students.txt");
   Path ProfessorsPathTemp = Paths.get("src/Files", "Professors.txt");   
   String AdminPath = String.valueOf(AdminPathTemp);
   String StudentsPath = String.valueOf(StudentsPathTemp);
   String ProfessorsPath = String.valueOf(ProfessorsPathTemp);
    
    public JFrameAdminSetting() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNewUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jButtonCansel = new javax.swing.JButton();
        jPasswordFieldNewPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("تغییر نام کاربری و رمز عبور");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("نام کاربری جدید:");

        jTextFieldNewUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("رمز عبور جدید:");

        jButtonOk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonOk.setText("تایید");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonCansel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCansel.setText("انصراف");
        jButtonCansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanselActionPerformed(evt);
            }
        });

        jPasswordFieldNewPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldNewPass)
                            .addComponent(jTextFieldNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean IsRepepetiveUsername(String Username){
        boolean IsRepepetive = false;                
        try {
        FileManager file = new FileManager(StudentsPath);
        
        if(!file.IsEmpty()){
            String[] result = file.ReadFile();
            int CountLines = file.CountLines();
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startuser = data.indexOf("username=");
                int enduser = data.indexOf(";", startuser);
                String _username = data.substring(startuser + 9, enduser);

                if(Username.equals(_username))
                    {IsRepepetive = true; break;}
            }
        }
        
        } catch (IOException ex) {
            Logger.getLogger(JFrameAdminSetting.class.getName()).log(Level.SEVERE, null, ex);            
        } 
        
        try {
        FileManager file = new FileManager(ProfessorsPath);
        
        if(!file.IsEmpty()){
            String[] result = file.ReadFile();
            int CountLines = file.CountLines();
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startuser = data.indexOf("username=");
                int enduser = data.indexOf(";", startuser);
                String _username = data.substring(startuser + 9, enduser);

                if(Username.equals(_username))
                    {IsRepepetive = true; break;}
                } 
        }
          
        } catch (IOException ex) {
            Logger.getLogger(JFrameAdminSetting.class.getName()).log(Level.SEVERE, null, ex);            
            } 
        
        try {
        FileManager file = new FileManager(AdminPath);        
        if(!file.IsEmpty()){
            String[] result = file.ReadFile();
            int CountLines = file.CountLines();
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startuser = data.indexOf("username=");
                int enduser = data.indexOf(";", startuser);
                String _username = data.substring(startuser + 9, enduser);

                if(Username.equals(_username))
                    {IsRepepetive = true; break;}
                }
        }           
            } catch (IOException ex) {
                Logger.getLogger(JFrameAdminSetting.class.getName()).log(Level.SEVERE, null, ex);
                
            }                 
        return IsRepepetive;
    }
    
    private void jButtonCanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanselActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCanselActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        if(jTextFieldNewUsername.getText().trim().length() < 3)
        {
               JOptionPane.showMessageDialog(null,"نام کاربری نمی تواند کمتر از 3 حرف باشد", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        if(jPasswordFieldNewPass.getText().trim().length() < 8)
        {
               JOptionPane.showMessageDialog(null, "پسورد نمی تواند کمتر از 8 کاراکتر باشد", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        if(IsRepepetiveUsername(jTextFieldNewUsername.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "این نام کاربری قبلا انتخاب شده است", 
            "Dialog", JOptionPane.ERROR_MESSAGE);            
        return;
        }         
        
        try {
            FileManager fm = new FileManager(AdminPath);
            String EditAdmin = "username=" + jTextFieldNewUsername.getText() + ";password=" +
               new String(jPasswordFieldNewPass.getPassword());
            fm.FileWriter(EditAdmin, false);
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(JFrameAdminSetting.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }//GEN-LAST:event_jButtonOkActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAdminSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdminSetting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCansel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldNewPass;
    private javax.swing.JTextField jTextFieldNewUsername;
    // End of variables declaration//GEN-END:variables
}
