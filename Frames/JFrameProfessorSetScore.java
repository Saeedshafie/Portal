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

public class JFrameProfessorSetScore extends javax.swing.JFrame {

    Path StudentsPathTemp = Paths.get("src/Files", "Students.txt");
    String StudentsPath = String.valueOf(StudentsPathTemp);
    Path SelectUnitPathTemp = Paths.get("src/Files", "SelectUnit.txt");
    String SelectUnitPath = String.valueOf(SelectUnitPathTemp);
    
    private String professorusername, stdname, stdnum, classname;
    public JFrameProfessorSetScore(String ProfessorUsername, String STDName, String STDNum, String ClassName) {
        initComponents();
        this.professorusername = ProfessorUsername;
        this.stdname = STDName;
        this.stdnum = STDNum;
        this.classname = ClassName;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.jTextFieldSTDName.setText(this.stdname);
        this.jTextFieldSTDNum.setText(this.stdnum);
        this.jTextFieldClassName.setText(this.classname);
        CheckScore();
    }

    private void CheckScore(){
       jTextFieldScore.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = jTextFieldScore.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               jTextFieldScore.setEditable(true);
            } else {
               jTextFieldScore.setEditable(false);
               JOptionPane.showMessageDialog(new JFrame(), "نمره فقط به عدد قابل قبول است", 
                       "Dialog", JOptionPane.INFORMATION_MESSAGE); 
            }
         }
      });
    }    
    
    private String GetStudentUsername(String Name, String STDNumber){
      String _Username = null;  
      try {
            FileManager file = new FileManager(StudentsPath);
            String[] result = file.ReadFile();
            int CountLines = file.CountLines();
            for(int i = 0; i < CountLines; i++){
                String data = result[i];
                int startuser = data.indexOf("username=");
                int enduser = data.indexOf(";", startuser);
                _Username = data.substring(startuser + 9, enduser);
                    
                int startname = data.indexOf("name=");
                int endname = data.indexOf(";", startname);
                String _Name = data.substring(startname + 5, endname);
                    
                int startnum = data.indexOf("studentnumber=");
                int endnum = data.indexOf(";", startnum);
                String _StudentNumber = data.substring(startnum + 14, endnum);
                    
                if(jTextFieldSTDName.getText().equals(_Name) &&
                    jTextFieldSTDNum.getText().equals(_StudentNumber))
                    { break;}
                }
                
            } catch (IOException ex) {
                Logger.getLogger(JFrameProfessorSetScore.class.getName()).log(Level.SEVERE, null, ex);
            }      
      return _Username;
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSTDName = new javax.swing.JTextField();
        jTextFieldSTDNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldClassName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldScore = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonCansel = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("نام و نام خانوادگی دانشجو:");

        jTextFieldSTDName.setEditable(false);
        jTextFieldSTDName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldSTDNum.setEditable(false);
        jTextFieldSTDNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("شماره دانشجویی:");

        jTextFieldClassName.setEditable(false);
        jTextFieldClassName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("اسم کلاس:");

        jTextFieldScore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("نمره:");

        jButtonCansel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCansel.setText("انصراف");

        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonOK.setText("تایید");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldSTDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldSTDName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSTDName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldSTDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if(jTextFieldScore.getText().trim().equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "لطفا نمره را وارد کنید", "Dialog", JOptionPane.INFORMATION_MESSAGE); 
            return;
        }
        int CountLines = 0;
        String _StudentUsername;
        try {
            FileManager fm = new FileManager(SelectUnitPath);
            String[] result = fm.ReadFile();
            CountLines = fm.CountLines();
            int studentRow;            
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startuser = data.indexOf("studentusername=");
                int enduser = data.indexOf(";", startuser);
                _StudentUsername = data.substring(startuser + 16, enduser);
                
                int startMasterUsername = data.indexOf("masterusername=");
                int endMasterUsername = data.indexOf(";", startMasterUsername);
                String _MasterUsername = data.substring(startMasterUsername + 15, endMasterUsername);
                
                int startClassname = data.indexOf("classname=");
                int endClassname = data.indexOf(";", startClassname);
                String _ClassName = data.substring(startClassname + 10, endClassname);
                
                if(this.professorusername.equals(_MasterUsername) && 
                    this.GetStudentUsername(this.jTextFieldSTDName.getText(), jTextFieldSTDNum.getText()).equals(_StudentUsername)
                        && this.jTextFieldClassName.getText().equals(_ClassName))
                    { break;}
            }
            String FoundStudent = result[studentRow];
            int startScore = FoundStudent.indexOf("score=");
            int endScore = FoundStudent.indexOf(";", startScore);
            String OldScore = FoundStudent.substring(startScore + 6, endScore);
            FoundStudent = FoundStudent.replace("score=" + OldScore, "score=" + this.jTextFieldScore.getText());
            result[studentRow] = FoundStudent;
            for(int i = 0 ; i < CountLines; i++){
                if(i ==0)
                    fm.FileWriter(result[i], false);
                else 
                    fm.FileWriter(result[i], true);
            }
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(JFrameProfessorSetScore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOKActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameProfessorSetScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProfessorSetScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProfessorSetScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProfessorSetScore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameProfessorSetScore(null, null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCansel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldClassName;
    private javax.swing.JTextField jTextFieldSTDName;
    private javax.swing.JTextField jTextFieldSTDNum;
    private javax.swing.JTextField jTextFieldScore;
    // End of variables declaration//GEN-END:variables
}
