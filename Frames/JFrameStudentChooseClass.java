package Frames;

import FileManager.FileManager;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameStudentChooseClass extends javax.swing.JFrame {

    Path SelectUnitPathTemp = Paths.get("src/Files", "SelectUnit.txt");
    String SelectUnitPath = String.valueOf(SelectUnitPathTemp);
    Path ClassesPathTemp = Paths.get("src/Files", "Classes.txt");
    String ClassesPath = String.valueOf(ClassesPathTemp);    
    
    private float average;
    
    public JFrameStudentChooseClass(float Average) {
        initComponents();
        this.average = Average;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        ((JLabel)jComboBoxClasses.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        FillComBoBox();
        FillTable();
    }

    private void FillTable(){
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
         Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(Level.SEVERE, null, ex);
         }         
    }    

private boolean SearchArray(String[] arr, String toSearchValue) 
    { 
        return Arrays.asList(arr).contains(toSearchValue);
    }
    
    private void FillComBoBox(){    
        try {
         FileManager file = new FileManager(ClassesPath);
         String[] result = file.ReadFile();
         int CountLines = file.CountLines();
         for(int i = 0; i < CountLines; i++)
         {
            String data = result[i];
            int startname = data.indexOf("name=") + 5;
            int endname = data.indexOf(";", startname);
            String name = data.substring(startname, endname);        
            jComboBoxClasses.addItem(name);
         }                
         } catch (IOException ex) {
            Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(Level.SEVERE, null, ex);
         }         
    }      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxClasses = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonChooseClass = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClasses = new javax.swing.JTable();
        jButtonOK = new javax.swing.JButton();
        jButtonCansel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("انتخاب کلاس جدید:");

        jComboBoxClasses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("لیست دروس انتخاب شده:");

        jButtonChooseClass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonChooseClass.setText("انتخاب کلاس");
        jButtonChooseClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseClassActionPerformed(evt);
            }
        });

        jTableClasses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "زمان برزگرای", "تعداد واحد", "اسم کلاس"
            }
        ));
        jScrollPane1.setViewportView(jTableClasses);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jButtonChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 560, 360));

        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonOK.setText("تایید");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 150, 35));

        jButtonCansel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCansel.setText("انصراف");
        jButtonCansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanselActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCansel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanselActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCanselActionPerformed

    private void jButtonChooseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseClassActionPerformed
        if(GetCapasityOfClass(this.jComboBoxClasses.getSelectedItem().toString()) < 1){
            JOptionPane.showMessageDialog(new JFrame(),"ظرفیت کلاس پر است", "Dialog", JOptionPane.ERROR_MESSAGE);        
            return;
        }    

        DefaultTableModel model = (DefaultTableModel) jTableClasses.getModel();        
        try {
         FileManager file = new FileManager(ClassesPath);
         String[] result = file.ReadFile();
         int CountLines = file.CountLines();
         for(int i = 0; i < CountLines; i++)
         {
            String data = result[i];
            int startname = data.indexOf("name=") + 5;
            int endname = data.indexOf(";", startname);
            String name = data.substring(startname, endname);
            int startvahed = data.indexOf("countvahed=") + 11;
            int endvahed = data.indexOf(";", startvahed);
            String countvahed = data.substring(startvahed, endvahed);
            int startcapa = data.indexOf("capasity=") + 9;
            int endcapa = data.indexOf(";", startcapa);
            String capasity = data.substring(startcapa, endcapa);
            int startdate = data.indexOf("date=") + 5;
            int enddate = data.indexOf(";", startdate);
            String date = data.substring(startdate, enddate);

            if(this.CountVahed() + Integer.valueOf(countvahed) > 24 && this.average > 17)
            {
    JOptionPane.showMessageDialog(new JFrame(),"نمیتوانید بیشتر از 24 واحد بردارید", "Dialog", JOptionPane.ERROR_MESSAGE);
                break;
            }

            if(this.CountVahed() + Integer.valueOf(countvahed) > 20 && this.average < 17)
            {
    JOptionPane.showMessageDialog(new JFrame(),"نمیتوانید بیشتر از 20 واحد بردارید", "Dialog", JOptionPane.ERROR_MESSAGE);
                break;
            }

            if(IsRepetitive(name) && jComboBoxClasses.getSelectedItem().equals(name))
                JOptionPane.showMessageDialog(new JFrame(), "این کلاس قبلا انتخاب شده است", "Dialog", JOptionPane.ERROR_MESSAGE);
            else
            if(jComboBoxClasses.getSelectedItem().equals(name))
                {model.addRow(new Object[]{date, countvahed,name}); break;}
         }                
         } catch (IOException ex) {
                Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(Level.SEVERE, null, ex);
         }     
    }//GEN-LAST:event_jButtonChooseClassActionPerformed

    private String GetProfessorUsernameOfClassName(String ClassName){               
        int CountLines = 0;
        String _ProfessorUsername = null, _ClassName;
        try {
            FileManager fm = new FileManager(ClassesPath);
            String[] result = fm.ReadFile();
            CountLines = fm.CountLines();
            int studentRow;            
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                
                int startClassname = data.indexOf("name=");
                int endClassname= data.indexOf(";", startClassname);
                _ClassName = data.substring(startClassname + 5, endClassname);
                
                int startuser = data.indexOf("masterusername=");
                int enduser = data.indexOf(";", startuser);
                _ProfessorUsername = data.substring(startuser + 15, enduser); 
                
                if( ClassName.equals(_ClassName))
                    {break;}
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return _ProfessorUsername;
    }    

    private boolean IsExistLessonForStudent(String ClassName)
    {
        boolean Flag = false;    
        int CountLines = 0;
        String _Username, _ClassName;
        try {
            FileManager fm = new FileManager(SelectUnitPath);
            if(fm.IsEmpty())
                return false;
            String[] result = fm.ReadFile();
            CountLines = fm.CountLines();
            int studentRow;            
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startuser = data.indexOf("studentusername=");
                int enduser = data.indexOf(";", startuser);
                _Username = data.substring(startuser + 16, enduser);
                
                int startClassname = data.indexOf("classname=");
                int endClassname= data.indexOf(";", startClassname);
                _ClassName = data.substring(startClassname + 10, endClassname);
                
                if(JFrameStudent.studentusername.equals(_Username) && ClassName.equals(_ClassName))
                    {Flag = true; break;}
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return Flag;
    }
    
    private boolean IsRepetitive(String ClassName){
        boolean Flag = false;
        for(int i = 0; i < jTableClasses.getRowCount(); i++){
            if(jTableClasses.getModel().getValueAt(i, 2).equals(ClassName))
            { Flag = true; break;}
    }
        return Flag;
}
    private int CountVahed(){
        int sum = 0 ;
        for(int i = 0; i < jTableClasses.getRowCount(); i++)
            sum += Integer.valueOf((String) jTableClasses.getModel().getValueAt(i, 1));                
        return sum;
}
 
    
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        try {
            FileManager fm = new FileManager(SelectUnitPath);
            
            for(int i = 0; i < jTableClasses.getRowCount(); i++){
                String _ClassName = (String) jTableClasses.getModel().getValueAt(i, 2);
                if(IsExistLessonForStudent(_ClassName))
                    continue;
                else
                {
                    String _SelectUnit = "studentusername=" + JFrameStudent.studentusername +
                    ";masterusername=" + this.GetProfessorUsernameOfClassName(_ClassName) +
                    ";classname=" + _ClassName  + 
                    ";score=null;";
                    fm.FileWriter(_SelectUnit, true);
                }                
            }            
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", 
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButtonOKActionPerformed

    private int GetCapasityOfClass(String Classname){
        int CountSelectedClass = 0;
        int _capasity = 0;
        try {
        FileManager file = new FileManager(ClassesPath);

        if(!file.IsEmpty()){
            String[] result = file.ReadFile();
           int CountLines = file.CountLines();
           for(int i = 0; i < CountLines; i++)
           {
              String data = result[i];
              int startname = data.indexOf("name=") + 5;
              int endname = data.indexOf(";", startname);
              String name = data.substring(startname, endname);

              int startcapa = data.indexOf("capasity=") + 9;
              int endcapa = data.indexOf(";", startcapa);
              String capasity = data.substring(startcapa, endcapa);

              if(Classname.equals(name)){
                  _capasity = Integer.valueOf(capasity);
              }
            }
        }

        } catch (IOException ex) {
        Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(new JFrame(), ex, "Dialog", JOptionPane.ERROR_MESSAGE);
        } 

        try {
        FileManager file = new FileManager(SelectUnitPath);

        if(!file.IsEmpty()){
           String[] result = file.ReadFile();
           int CountLines = file.CountLines();
           for(int i = 0; i < CountLines; i++)
           {
              String data = result[i];
              int startname = data.indexOf("classname=") + 10;
              int endname = data.indexOf(";", startname);
              String name = data.substring(startname, endname);

              if(Classname.equals(name)){
                 CountSelectedClass++;
              }
            } 
        }
        } catch (IOException ex) {
            Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(Level.SEVERE, null, ex);
        }
           return _capasity - CountSelectedClass;
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
            java.util.logging.Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameStudentChooseClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameStudentChooseClass(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCansel;
    private javax.swing.JButton jButtonChooseClass;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox<String> jComboBoxClasses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClasses;
    // End of variables declaration//GEN-END:variables
}
