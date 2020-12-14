package Frames;

import javax.swing.JFrame;

public class JFrameAdmin extends javax.swing.JFrame {
    
    public JFrameAdmin() {
        initComponents();   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrameAdmin.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAddMaster = new javax.swing.JButton();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonSetting = new javax.swing.JButton();
        jButtonFoodPlan = new javax.swing.JButton();
        jButtonListClass = new javax.swing.JButton();
        jButtonListStudents = new javax.swing.JButton();
        jButtonListMasters = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddMaster.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAddMaster.setText("افزودن استاد");
        jButtonAddMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMasterActionPerformed(evt);
            }
        });

        jButtonAddStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAddStudent.setText("افزودن دانشجو");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jButtonSetting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSetting.setText("تنظیمات");
        jButtonSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingActionPerformed(evt);
            }
        });

        jButtonFoodPlan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonFoodPlan.setText("تنظیم برنامه غذایی");
        jButtonFoodPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodPlanActionPerformed(evt);
            }
        });

        jButtonListClass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonListClass.setText("کلاس های ارایه شده");
        jButtonListClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListClassActionPerformed(evt);
            }
        });

        jButtonListStudents.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonListStudents.setText("لیست دانشجویان");
        jButtonListStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListStudentsActionPerformed(evt);
            }
        });

        jButtonListMasters.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonListMasters.setText("لیست اساتید");
        jButtonListMasters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListMastersActionPerformed(evt);
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
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonListClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFoodPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListMasters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButtonSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFoodPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListMasters, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButtonAddMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
       JFrameAddStudent fa = new JFrameAddStudent();
       fa.setVisible(true);
    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonFoodPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodPlanActionPerformed
       JFrameFoodPlan fa = new JFrameFoodPlan();
       fa.setVisible(true);
    }//GEN-LAST:event_jButtonFoodPlanActionPerformed

    private void jButtonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingActionPerformed
        JFrameAdminSetting fa = new JFrameAdminSetting();
        fa.setVisible(true);
    }//GEN-LAST:event_jButtonSettingActionPerformed

    private void jButtonListStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListStudentsActionPerformed
        FrameListStudent fa = new FrameListStudent();
        fa.setVisible(true);
    }//GEN-LAST:event_jButtonListStudentsActionPerformed

    private void jButtonListMastersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListMastersActionPerformed
        JFrameListProfessors fa = new JFrameListProfessors();
        fa.setVisible(true);
    }//GEN-LAST:event_jButtonListMastersActionPerformed

    private void jButtonListClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListClassActionPerformed
        JFrameListClasses fa = new JFrameListClasses();
                fa.setVisible(true);
    }//GEN-LAST:event_jButtonListClassActionPerformed

    private void jButtonAddMasterActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       JFrameAddProfessor fa = new JFrameAddProfessor();
       fa.setVisible(true);
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
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddMaster;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonFoodPlan;
    private javax.swing.JButton jButtonListClass;
    private javax.swing.JButton jButtonListMasters;
    private javax.swing.JButton jButtonListStudents;
    private javax.swing.JButton jButtonSetting;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
