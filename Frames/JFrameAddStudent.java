package Frames;

import FileManager.FileManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class JFrameAddStudent extends javax.swing.JFrame {

   Path AdminPathTemp = Paths.get("src/Files", "Admin.txt");
   String AdminPath = String.valueOf(AdminPathTemp);
   Path StudentsPathTemp = Paths.get("src/Files", "Students.txt");
   String StudentsPath = String.valueOf(StudentsPathTemp);
   Path ProfessorsPathTemp = Paths.get("src/Files", "Professors.txt"); 
   String ProfessorsPath = String.valueOf(ProfessorsPathTemp);

    public JFrameAddStudent() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StudentNumberValidation();
        ((JLabel)jComboBoxCourse.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void StudentNumberValidation()
    {
        jLabelStudentNumberWarning.setText("");
       jTextFieldStudentNumber.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = jTextFieldStudentNumber.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               jTextFieldStudentNumber.setEditable(true);
               jLabelStudentNumberWarning.setText("");
            } else {
               jTextFieldStudentNumber.setEditable(false);
               jLabelStudentNumberWarning.setText("فقط اعداد ");
            }
         }
      });
    }            
    
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
            Logger.getLogger(JFrameAddStudent.class.getName()).log(Level.SEVERE, null, ex);            
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
            Logger.getLogger(JFrameAddStudent.class.getName()).log(Level.SEVERE, null, ex);            
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
                Logger.getLogger(JFrameAddStudent.class.getName()).log(Level.SEVERE, null, ex);
                
            }                 
        return IsRepepetive;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFamily = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldStudentNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCourse = new javax.swing.JComboBox<>();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonCansel = new javax.swing.JButton();
        jLabelStudentNumberWarning = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCourse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("نام:");

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("نام خانوادگی:");

        jTextFieldFamily.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("شماره دانشجویی:");

        jTextFieldStudentNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("مقطع تحصیلی:");

        jComboBoxCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "کاردانی", "کارشناسی", "کارشناسی ارشد", "دکتری", "دکتری حرفه ای" }));

        jButtonAddStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAddStudent.setText("افزودن");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jButtonCansel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCansel.setText("انصراف");
        jButtonCansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanselActionPerformed(evt);
            }
        });

        jLabelStudentNumberWarning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStudentNumberWarning.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStudentNumberWarning.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("رشته تحصیلی:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("رمز عبور:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("نام کاربری:");

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelStudentNumberWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldCourse)
                                .addComponent(jComboBoxCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldFamily, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldStudentNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(42, 42, 42))
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStudentNumberWarning)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        if(jTextFieldName.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا نام را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
         
        if(jTextFieldFamily.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا نام خانوادگی را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        if(jTextFieldStudentNumber.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفا شماره دانشجویی را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        if(jTextFieldCourse.getText().trim().length() == 0)
        {
               JOptionPane.showMessageDialog(null, "لطفارشته تحصیلی را وارد کنید", 
                    "هشدار", JOptionPane.WARNING_MESSAGE);
            this.setVisible(true);
            return;
        }        
        
        if(jTextFieldUsername.getText().trim().equals("")){
           JOptionPane.showMessageDialog(new JFrame(), "نام کاربری را وارد کنید", 
                        "Dialog", JOptionPane.ERROR_MESSAGE);
                 return;
        }
        
        if(jTextFieldPassword.getText().trim().length() < 8){
           JOptionPane.showMessageDialog(new JFrame(), "رمز عبور نباید کمتر از 8 کاراکتر باشد", 
                        "Dialog", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(IsRepepetiveUsername(jTextFieldUsername.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "این نام کاربری قبلا انتخاب شده است", 
                    "Dialog", JOptionPane.ERROR_MESSAGE);            
            return;
        }
            
            FileManager fm = new FileManager(StudentsPath);
            String student = "name=" + jTextFieldName.getText() + " " + jTextFieldFamily.getText() + ";"+                    
                    "username=" + jTextFieldUsername.getText().trim()+ ";" +
                    "password=" + jTextFieldPassword.getText() + ";" +
                    "studentnumber=" + jTextFieldStudentNumber.getText().trim() + ";" +
                    "course=" + jTextFieldCourse.getText() + ";" + 
                    "grade=" + jComboBoxCourse.getSelectedItem() + ";" + 
                    "credit=0;reservefood=000000000000000000000;";
            try {
                fm.FileWriter(student, true);
                jTextFieldUsername.setText("");
                jTextFieldCourse.setText("");
                jTextFieldFamily.setText("");
                jTextFieldName.setText("");
                jTextFieldPassword.setText("");
                jTextFieldStudentNumber.setText("");
                
            JOptionPane.showMessageDialog(null,"دانشجو با موفقیت ثبت شد", 
                    "موفق", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(JFrameAddStudent.class.getName()).log(Level.SEVERE, null, ex);
            }     // this.setVisible(true);
    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jButtonCanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanselActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonCanselActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonCansel;
    private javax.swing.JComboBox<String> jComboBoxCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelStudentNumberWarning;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldFamily;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldStudentNumber;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
