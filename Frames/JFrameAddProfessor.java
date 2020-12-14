package Frames;

import FileManager.FileManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrameAddProfessor extends javax.swing.JFrame {
    
   Path AdminPathTemp = Paths.get("src/Files", "Admin.txt");
   Path StudentsPathTemp = Paths.get("src/Files", "Students.txt");
   String StudentsPath = String.valueOf(StudentsPathTemp);
   Path ProfessorsPathTemp = Paths.get("src/Files", "Professors.txt");   
   String AdminPath = String.valueOf(AdminPathTemp);   
   String ProfessorsPath = String.valueOf(ProfessorsPathTemp);

    public JFrameAddProfessor() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        MasterTelNumberValidation();
    }

    private void MasterTelNumberValidation()
    {
        jLabelMasterTelWarning.setText("");
       jTextFieldTel.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = jTextFieldTel.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               jTextFieldTel.setEditable(true);
               jLabelMasterTelWarning.setText("");
            } else {
               jTextFieldTel.setEditable(false);
               jLabelMasterTelWarning.setText("فقط اعداد ");
            }
         }
      });
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFamily = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonCansel = new javax.swing.JButton();
        jTextFieldDegree = new javax.swing.JTextField();
        jTextFieldUniversity = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jLabelMasterTelWarning = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("نام:");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldName.setToolTipText("");
        jTextFieldName.setDoubleBuffered(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("نام خانوادگی:");
        jLabel2.setToolTipText("");

        jTextFieldFamily.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("مدرک تحصیلی:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("از دانشگاه:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("شماره تماس:");

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAdd.setText("افزودن");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonCansel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCansel.setText("انصراف");
        jButtonCansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanselActionPerformed(evt);
            }
        });

        jTextFieldDegree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldUniversity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelMasterTelWarning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMasterTelWarning.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMasterTelWarning.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("نام کاربری:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("رمز عبور:");

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(jTextFieldDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelMasterTelWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                                .addComponent(jTextFieldTel))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(17, 17, 17)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelMasterTelWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
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

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(jTextFieldName.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا نام استاد را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        if(jTextFieldFamily.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا نام خانوادگی استاد را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        if(jTextFieldDegree.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا مدرک تحصیلی استاد را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        if(jTextFieldUniversity.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا دانشگاه تحصیل استاد را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        if(jTextFieldTel.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا شماره را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        if(jTextFieldUsername.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا نام کاربری را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        if(jTextFieldPassword.getText().trim().length() < 8)
        {
               JOptionPane.showMessageDialog(null, "پسورد نباید کمتر از 8 کاراکتر باشد", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        
        if(IsRepepetiveUsername(jTextFieldUsername.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "این نام کاربری قبلا انتخاب شده است", 
                    "Dialog", JOptionPane.ERROR_MESSAGE);            
            return;
        }    
                
        FileManager fm = new FileManager(ProfessorsPath);
        String Master = "name=" + jTextFieldName.getText() + " " + jTextFieldFamily.getText() + ";"+                    
            "username=" + jTextFieldUsername.getText().trim() + ";" +
            "password=" + jTextFieldPassword.getText() + ";" +
            "mail=" + jTextFieldTel.getText() + ";" +
            "degree=" + jTextFieldDegree.getText() + ";" + 
            "university=" + jTextFieldUniversity.getText() + ";";
            try {
                fm.FileWriter(Master, true);
                jTextFieldUsername.setText("");
                jTextFieldTel.setText("");
                jTextFieldFamily.setText("");
                jTextFieldName.setText("");
                jTextFieldPassword.setText("");
                jTextFieldDegree.setText("");
                jTextFieldUniversity.setText("");
                
                JOptionPane.showMessageDialog(null,"اطلاعات استاد ثبت شد", 
                    "ثبت موفق", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(JFrameAddProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_jButtonAddActionPerformed

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
            Logger.getLogger(JFrameAddProfessor.class.getName()).log(Level.SEVERE, null, ex);            
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
            Logger.getLogger(JFrameAddProfessor.class.getName()).log(Level.SEVERE, null, ex);            
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
                Logger.getLogger(JFrameAddProfessor.class.getName()).log(Level.SEVERE, null, ex);
                
            }                 
        return IsRepepetive;
    }
    
    
    private void jButtonCanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanselActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCanselActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAddProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCansel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelMasterTelWarning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDegree;
    private javax.swing.JTextField jTextFieldFamily;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldUniversity;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
