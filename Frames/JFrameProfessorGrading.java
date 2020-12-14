package Frames;

import FileManager.FileManager;
import java.awt.ComponentOrientation;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class JFrameProfessorGrading extends javax.swing.JFrame {

    Path StudentsPathTemp = Paths.get("src/Files", "Students.txt");
    String StudentsPath = String.valueOf(StudentsPathTemp);
    Path SelectUnitPathTemp = Paths.get("src/Files", "SelectUnit.txt");
    String SelectUnitPath = String.valueOf(SelectUnitPathTemp);
    
    private String professorusername;
    public JFrameProfessorGrading(String ProfessorUsername) {
        initComponents();
        this.professorusername = ProfessorUsername;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        jTableStudents.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.ReadStudents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudents = new javax.swing.JTable();
        jButtonOK = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("لیست دانشجویان");

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "نام و نام خانوادگی", "شماره دانشجویی", "نام کلاسی که با استاد دارند", "ثبت نمره"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableStudents);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
        );

        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonOK.setText("تایید");

        jButtonClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClose.setText("خروج");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jTableStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStudentsMouseClicked
        int column = jTableStudents.columnAtPoint(evt.getPoint());
        int row = jTableStudents.rowAtPoint(evt.getPoint());
        
        if(column == 3){
            String stdname = jTableStudents.getModel().getValueAt(row, 0).toString();
            String stdnum = jTableStudents.getModel().getValueAt(row, 1).toString();
            String classname = jTableStudents.getModel().getValueAt(row, 2).toString();
            JFrameProfessorSetScore ss = new JFrameProfessorSetScore(this.professorusername, stdname, stdnum, classname);
            ss.setVisible(true);
        }
        this.ReadStudents();
    }//GEN-LAST:event_jTableStudentsMouseClicked

    private void ReadStudents(){
        DefaultTableModel dtm = (DefaultTableModel) jTableStudents.getModel();
        dtm.setRowCount(0);
        DefaultTableModel model = (DefaultTableModel) jTableStudents.getModel();        
        try {
         FileManager file = new FileManager(SelectUnitPath);     
         if(!file.IsEmpty()){
            String[] result = file.ReadFile();
            int CountLines = file.CountLines();
            for(int i = 0; i < CountLines; i++)
            {
               String data = result[i];
               int startMasterUsername = data.indexOf("masterusername=") + 15;
               int endMasterUsername = data.indexOf(";", startMasterUsername);
               String MasterUsername = data.substring(startMasterUsername, endMasterUsername);

               int startStudentUsername = data.indexOf("studentusername=") + 16;
               int endStudentUsername = data.indexOf(";", startStudentUsername);
               String StudentUsername = data.substring(startStudentUsername, endStudentUsername);

               int startClassName = data.indexOf("classname=") + 10;
               int endClassName = data.indexOf(";", startClassName);
               String ClassName = data.substring(startClassName, endClassName);

               if(this.professorusername.equals(MasterUsername)){

                   FileManager readStudentName = new FileManager(StudentsPath);
                   String[] resultClassNames = readStudentName.ReadFile();
                   int _CountLines = readStudentName.CountLines(); 
                   String[] _ListStudents = new String[_CountLines];
                   for(int j = 0; j < _CountLines; j++){
                      String std = resultClassNames[j];
                      int startSTUUserame = std.indexOf("username=") + 9;
                      int endSTUUserName = std.indexOf(";", startSTUUserame);
                      String _STDUserName = std.substring(startSTUUserame, endSTUUserName);        
                      int _startSTDName = std.indexOf("name=") + 5;
                      int _endSTDName = std.indexOf(";", _startSTDName);
                      String _STDName = std.substring(_startSTDName, _endSTDName);
                      int _startSTDNUM = std.indexOf("studentnumber=") + 14;
                      int _endSTDNUM = std.indexOf(";", _startSTDNUM);
                      String _STDNUM = std.substring(_startSTDNUM, _endSTDNUM);

                       if(StudentUsername.equals(_STDUserName)){
                          model.addRow(new Object[]{_STDName, _STDNUM, ClassName, "ثبت نمره"});
                       }
                   }
               }
            }
         }

         } catch (IOException ex) {
         Logger.getLogger(JFrameProfessorGrading.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(JFrameProfessorGrading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProfessorGrading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProfessorGrading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProfessorGrading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameProfessorGrading(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudents;
    // End of variables declaration//GEN-END:variables
}
