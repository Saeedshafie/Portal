package Frames;

import FileManager.FileManager;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import  javax.swing.*;

public class JFrameLogin extends javax.swing.JFrame {

   Path AdminPathTemp = Paths.get("src/Files", "Admin.txt");
   Path StudentsPathTemp = Paths.get("src/Files", "Students.txt");
   Path ProfessorsPathTemp = Paths.get("src/Files", "Professors.txt");   
   String AdminPath = String.valueOf(AdminPathTemp);
   String StudentsPath = String.valueOf(StudentsPathTemp);
   String ProfessorsPath = String.valueOf(ProfessorsPathTemp);
   
    public JFrameLogin() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ((JLabel)jComboBoxLogin.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxLogin = new javax.swing.JComboBox<>();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCansel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ورود به عنوان:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("نام کاربری:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("رمز عبور:");

        jComboBoxLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "دانشجو", "استاد", "ادمین" }));
        jComboBoxLogin.setToolTipText("");

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLogin.setText("ورود");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonCansel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCansel.setText("انصراف");
        jButtonCansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanselActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxLogin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCansel, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCansel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButtonCanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanselActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCanselActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
        if(jTextFieldUsername.getText().trim().length() < 3)
        {
            JOptionPane.showMessageDialog(null, "نام کاربری کمتر از 3 حرف نمی تواند باشد", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
              
        if(jPasswordField.getText().trim().length() < 8)
        {
            JOptionPane.showMessageDialog(null, "رمز عبور  کمتر از 8 حرف نمی تواند باشد", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
         
        boolean IsLogined = false;
        switch(jComboBoxLogin.getSelectedIndex())
        {
            case 0:                
                String StudentUsername = null;  
                String StudentPassword = null;
                try {
                FileManager file = new FileManager(StudentsPath);
                if(file.IsEmpty()){
                    JOptionPane.showMessageDialog(null, "این نام کاربری وجود ندارد", 
                            "هشدار", JOptionPane.WARNING_MESSAGE);
                    break;
                }
                    
                String[] result = file.ReadFile();
                int CountLines = file.CountLines();
                for(int i = 0; i < CountLines; i++)
                {
                    String data = result[i];
                    int startuser = data.indexOf("username=");
                    int enduser = data.indexOf(";", startuser);
                    StudentUsername = data.substring(startuser + 9, enduser);
                    int startpass = data.indexOf("password=");
                    int endpass = data.indexOf(";", startpass);
                    StudentPassword = data.substring(startpass + 9, endpass);
                    if(jTextFieldUsername.getText().equals(StudentUsername) &&
                        new String(jPasswordField.getPassword()).equals(StudentPassword))
                    {IsLogined = true; break;}
                }
                
            } catch (IOException ex) {
                Logger.getLogger(JFrameLogin.class.getName()).log(Level.SEVERE, null, ex);                
            } 
                 if(IsLogined){
                    this.dispose();
                    JFrameStudent fs = new JFrameStudent(StudentUsername, StudentPassword);//Create JFrame
                    fs.setVisible(true);//Show JFrame
                 }
                 else
                    JOptionPane.showMessageDialog(new JFrame(), "نام کاربری یا رمز عبور اشتباه است", "Dialog", JOptionPane.ERROR_MESSAGE);              

            break;                
            case 1:
                
                try {
                FileManager file = new FileManager(ProfessorsPath);
                if(file.IsEmpty()){
                    JOptionPane.showMessageDialog(null, "این نام کاربری وجود ندارد", 
                            "هشدار", JOptionPane.WARNING_MESSAGE);
                    break;
                }
                String[] result = file.ReadFile();
                int CountLines = file.CountLines();
                for(int i = 0; i < CountLines; i++)
                {
                    String data = result[i];
                    int startuser = data.indexOf("username=");
                    int enduser = data.indexOf(";", startuser);
                    String Username = data.substring(startuser + 9, enduser);
                    int startpass = data.indexOf("password=");
                    int endpass = data.indexOf(";", startpass);
                    String Password = data.substring(startpass + 9, endpass);
                    if(jTextFieldUsername.getText().equals(Username) &&
                        new String(jPasswordField.getPassword()).equals(Password))
                    {IsLogined = true; break;}
                }
                
            } catch (IOException ex) {
                Logger.getLogger(JFrameLogin.class.getName()).log(Level.SEVERE, null, ex);
            } 
                 if(IsLogined){
                    this.dispose();
                    JFrameProfessor fm = new JFrameProfessor(this.jTextFieldUsername.getText());//Create JFrame
                    fm.setVisible(true);//Show JFrame
                 }
                 else
                    JOptionPane.showMessageDialog(new JFrame(), "نام کاربری یا رمز عبور اشتباه است", "Dialog", JOptionPane.ERROR_MESSAGE);                
            break;            
            case 2:
                
                try {
                FileManager file = new FileManager(AdminPath);
                if(file.IsEmpty()){
                    JOptionPane.showMessageDialog(null, "این نام کاربری وجود ندارد", 
                            "هشدار", JOptionPane.WARNING_MESSAGE);
                    break;
                }
                String[] result = file.ReadFile();
                String data = result[0];
                int startuser = data.indexOf("username=");
                int enduser = data.indexOf(";");
                String Username = data.substring(startuser + 9, enduser);
                int startpass = data.indexOf("password=");
                String Password = data.substring(startpass + 9);
                if(this.jTextFieldUsername.getText().equals(Username) &&
                        new String(jPasswordField.getPassword()).equals(Password))
                    IsLogined = true;
            } catch (IOException ex) {
                Logger.getLogger(JFrameLogin.class.getName()).log(Level.SEVERE, null, ex);
                
            }            
        
                if(IsLogined){
                    this.dispose();
                    JFrameAdmin fa = new JFrameAdmin();//Create JFrame
                    fa.setVisible(true);//Show JFrame
                }
                else
                    JOptionPane.showMessageDialog(new JFrame(), "نام کاربری یا رمز عبور اشتباه است", 
                            "Dialog", JOptionPane.ERROR_MESSAGE);
                
            break;
        }        
    }//GEN-LAST:event_jButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCansel;
    private javax.swing.JButton jButtonLogin;
    public javax.swing.JComboBox<String> jComboBoxLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
