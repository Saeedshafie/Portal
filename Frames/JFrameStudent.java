package Frames;

import FileManager.FileManager;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameStudent extends javax.swing.JFrame {

    
    Path SelectUnitPathTemp = Paths.get("src/Files", "SelectUnit.txt");
    String SelectUnitPath = String.valueOf(SelectUnitPathTemp);
    Path StudentsPathTemp = Paths.get("src/Files", "Students.txt");
    String StudentsPath = String.valueOf(StudentsPathTemp);
    Path ClassesPathTemp = Paths.get("src/Files", "Classes.txt");
    String ClassesPath = String.valueOf(ClassesPathTemp);
    
    public static String studentusername;
    private String studentpassword;
    
    public JFrameStudent(String StudentUsername, String StudentPassword) {
        initComponents();
        JFrameStudent.studentusername = StudentUsername;
        this.studentpassword = StudentPassword;
        this.jTextFieldUsername.setText(StudentUsername);
        this.jTextFieldPassword.setText(StudentPassword);
        setExtendedState(JFrameAdmin.MAXIMIZED_BOTH);
        SetCredit();       
        ReadClasses();
        SetAverage();
    }

    private void ReadClasses(){
        try {
         FileManager fileOFSelectedClassNames = new FileManager(SelectUnitPath);

         if(!fileOFSelectedClassNames.IsEmpty()){
             String[] resultClassNames = fileOFSelectedClassNames.ReadFile();
            int _CountLines = fileOFSelectedClassNames.CountLines(); 

            String[] _ListClasses = new String[_CountLines];
            int _CountClasses = 0;

            for(int i = 0; i < _CountLines; i++){
               String data = resultClassNames[i];
               int startSTUUserame = data.indexOf("studentusername=") + 16;
               int endSTUUserName = data.indexOf(";", startSTUUserame);
               String _STUDENTUserName = data.substring(startSTUUserame, endSTUUserName);        
               int startClassName = data.indexOf("classname=") + 10;
               int endClassName = data.indexOf(";", startClassName);
               String _ClassName = data.substring(startClassName, endClassName);

               if(JFrameStudent.studentusername.equals(_STUDENTUserName)){
                   _ListClasses[_CountClasses] = _ClassName;
                   _CountClasses++;
               }
            }  

            DefaultTableModel model = (DefaultTableModel) jTableClasses.getModel(); 
            FileManager fileOFSelectedClasses = new FileManager(ClassesPath);
            String[] resultSelectedClasses = fileOFSelectedClasses.ReadFile();
            int _CountLineClasses = fileOFSelectedClasses.CountLines();

            for(int i = 0; i < _CountLineClasses; i++){
               String data = resultSelectedClasses[i];
               int startClassName = data.indexOf("name=") + 5;
               int endSClassName = data.indexOf(";", startClassName);
               String _ClassName = data.substring(startClassName, endSClassName);  

               int startClassDate = data.indexOf("date=") + 5;
               int endClassDate = data.indexOf(";", startClassDate);
               String _ClassDate = data.substring(startClassDate, endClassDate);

               int startCountVahed = data.indexOf("countvahed=") + 11;
               int endCountVahed = data.indexOf(";", startCountVahed);
               String _CountVahed = data.substring(startCountVahed, endCountVahed);

               if(SearchArray(_ListClasses, _ClassName)){

                   model.addRow(new Object[]{_ClassDate, _CountVahed, _ClassName});
               }            
            }
         }

         } catch (IOException ex) {
            Logger.getLogger(JFrameStudent.class.getName()).log(Level.SEVERE, null, ex);
         }         
    }    
    
    private void SetCredit()
    {
       String _Username = null;  
       String _Password = null;
       try {
            FileManager file = new FileManager(StudentsPath);
            String[] result = file.ReadFile();
            int CountLines = file.CountLines();
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startuser = data.indexOf("username=");
                int enduser = data.indexOf(";", startuser);
                _Username = data.substring(startuser + 9, enduser);
                int startpass = data.indexOf("password=");
                int endpass = data.indexOf(";", startpass);
                _Password = data.substring(startpass + 9, endpass);
                if(this.studentusername.equals(_Username) &&
                    this.studentpassword.equals(_Password))
                {
                    int startCredit = data.indexOf("credit=");
                    int endCrdit = data.indexOf(";", startCredit);
                    String _Credeit = data.substring(startCredit + 7, endCrdit);
                    this.jTextFieldCredit.setText(_Credeit); 
                    break;
                }
                }
                
            } catch (IOException ex) {
                Logger.getLogger(JFrameStudent.class.getName()).log(Level.SEVERE, null, ex);
            }         
    }    
    
    private boolean SearchArray(String[] arr, String toSearchValue) 
    { 
        return Arrays.asList(arr).contains(toSearchValue);
    }    
    
    private int GetCountVahed(String ClassName){
        String CountVahed = null;
        try {
            FileManager file = new FileManager(ClassesPath);
            String[] result = file.ReadFile();
            int CountLines = file.CountLines();
            for(int i = 0; i < CountLines; i++)
            {
                String data = result[i];
                int startClassName = data.indexOf("name=");
                int endClassName = data.indexOf(";", startClassName);
                String _ClassName = data.substring(startClassName + 5, endClassName);
                
                int _startCountVahed = data.indexOf("countvahed=");
                int _endCountVahed = data.indexOf(";", _startCountVahed);
                String _CountVahed = data.substring(_startCountVahed + 11, _endCountVahed);
                
                if(ClassName.equals(_ClassName))
                    {CountVahed = _CountVahed; break;}
            }
                
            } catch (IOException ex) {
                Logger.getLogger(JFrameStudent.class.getName()).log(Level.SEVERE, null, ex);
            }     
        return Integer.valueOf(CountVahed);
    }    
    
    private void SetAverage(){
        float AVG = 0;
        int CountVahed = 0;
        try {
            FileManager file = new FileManager(SelectUnitPath);            
            if(!file.IsEmpty()){
                String[] result = file.ReadFile();
                int CountLines = file.CountLines();
                for(int i = 0; i < CountLines; i++)
                {
                    String data = result[i];
                    int startuser = data.indexOf("studentusername=");
                    int enduser = data.indexOf(";", startuser);
                    String _Username = data.substring(startuser + 16, enduser);

                    int _startClass = data.indexOf("classname=");
                    int _endClass = data.indexOf(";", _startClass);
                    String _ClassName = data.substring(_startClass + 10, _endClass);

                    int _startScore = data.indexOf("score=");
                    int _endScore = data.indexOf(";", _startScore);
                    String _Score = data.substring(_startScore + 6, _endScore);

                    if(!_Score.equals("null")){ 
                        int ScoreTemp = Integer.valueOf(_Score);
                        int CountVahedTemp = this.GetCountVahed(_ClassName);
                        AVG = ((AVG * CountVahed) + (ScoreTemp * CountVahedTemp)) / (CountVahed + CountVahedTemp);
                        CountVahed += CountVahedTemp;
                    }
                }
            }
            
            } catch (IOException ex) {
                Logger.getLogger(JFrameStudent.class.getName()).log(Level.SEVERE, null, ex);
            }  
        this.jTextFieldAverage.setText(String.valueOf(AVG));
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSetting = new javax.swing.JButton();
        jButtonAddCredit = new javax.swing.JButton();
        jButtonreserveFood = new javax.swing.JButton();
        jButtonChooseClass = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCredit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldAverage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClasses = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("پنل دانشجو");

        jButtonSetting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSetting.setText("تنظیمات");
        jButtonSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingActionPerformed(evt);
            }
        });

        jButtonAddCredit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAddCredit.setText("افزایش موجودی حساب");
        jButtonAddCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCreditActionPerformed(evt);
            }
        });

        jButtonreserveFood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonreserveFood.setText("رزرو غذا");
        jButtonreserveFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreserveFoodActionPerformed(evt);
            }
        });

        jButtonChooseClass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonChooseClass.setText("انتخاب کلاس جدید");
        jButtonChooseClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseClassActionPerformed(evt);
            }
        });

        jButtonClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClose.setText("خروج");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddCredit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonreserveFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonChooseClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButtonSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonreserveFood, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("موجودی حساب:");

        jTextFieldCredit.setEditable(false);
        jTextFieldCredit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("رمز عبور:");

        jTextFieldPassword.setEditable(false);
        jTextFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("نام کاربری:");

        jTextFieldUsername.setEditable(false);
        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldAverage.setEditable(false);
        jTextFieldAverage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("معدل:");

        jTableClasses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "زمان برگزاری", "تعداد واحد", "اسم کلاس"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableClasses);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsername))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        JFrameStudentSetting fa = new JFrameStudentSetting(JFrameStudent.studentusername);
        fa.setVisible(true);
    }//GEN-LAST:event_jButtonSettingActionPerformed

    private void jButtonAddCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCreditActionPerformed
      JFrameAddCredit fa = new JFrameAddCredit(JFrameStudent.studentusername);
      fa.setVisible(true);
    }//GEN-LAST:event_jButtonAddCreditActionPerformed

    private void jButtonreserveFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreserveFoodActionPerformed
        try {
            Path FoodPalnPathTemp = Paths.get("src/Files", "FoodPaln.txt");
            String FoodPalnPath = String.valueOf(FoodPalnPathTemp);
            FileManager file = new FileManager(FoodPalnPath);
            if(file.IsEmpty()){
                JOptionPane.showMessageDialog(new JFrame(), "لطفا ابتدا برنامه غذایی را وارد کنید",
                        "Dialog", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JFrameStudentReserveFood fa = new JFrameStudentReserveFood(jTextFieldCredit.getText());
            fa.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(JFrameStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonreserveFoodActionPerformed

    private void jButtonChooseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseClassActionPerformed
       JFrameStudentChooseClass fa = new JFrameStudentChooseClass(Float.valueOf(jTextFieldAverage.getText()));
       fa.setVisible(true);
    }//GEN-LAST:event_jButtonChooseClassActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameStudent(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCredit;
    private javax.swing.JButton jButtonChooseClass;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JButton jButtonreserveFood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClasses;
    private javax.swing.JTextField jTextFieldAverage;
    private javax.swing.JTextField jTextFieldCredit;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
