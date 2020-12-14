package Frames;

import FileManager.FileManager;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;   

public class JFrameFoodPlan extends javax.swing.JFrame {
    
   Path FoodPlanPathTemp = Paths.get("src/Files", "FoodPaln.txt"); 
   String FoodPlanPath = String.valueOf(FoodPlanPathTemp);

    public JFrameFoodPlan() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButtonOK = new javax.swing.JButton();
        jButtonCansel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldSatBreak = new javax.swing.JTextField();
        jTextFieldSunBreak = new javax.swing.JTextField();
        jTextFieldMonBreak = new javax.swing.JTextField();
        jTextFieldTuseBreak = new javax.swing.JTextField();
        jTextFieldWedBreak = new javax.swing.JTextField();
        jTextFieldThursBreak = new javax.swing.JTextField();
        jTextFieldFriBreak = new javax.swing.JTextField();
        jTextFieldWedBreakPrice = new javax.swing.JTextField();
        jTextFieldMonBreakPrice = new javax.swing.JTextField();
        jTextFieldTuseBreakPrice = new javax.swing.JTextField();
        jTextFieldSatBreakPrice = new javax.swing.JTextField();
        jTextFieldThursBreakPrice = new javax.swing.JTextField();
        jTextFieldFriBreakPrice = new javax.swing.JTextField();
        jTextFieldSunBreakPrice = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldFriLunch = new javax.swing.JTextField();
        jTextFieldThursLunch = new javax.swing.JTextField();
        jTextFieldWedLunch = new javax.swing.JTextField();
        jTextFieldTuseLunch = new javax.swing.JTextField();
        jTextFieldMonLunch = new javax.swing.JTextField();
        jTextFieldSunLunch = new javax.swing.JTextField();
        jTextFieldSatLunch = new javax.swing.JTextField();
        jTextFieldSunLunchPrice = new javax.swing.JTextField();
        jTextFieldMonLunchPrice = new javax.swing.JTextField();
        jTextFieldTuseLunchPrice = new javax.swing.JTextField();
        jTextFieldWedLunchPrice = new javax.swing.JTextField();
        jTextFieldSatLunchPrice = new javax.swing.JTextField();
        jTextFieldFriLunchPrice = new javax.swing.JTextField();
        jTextFieldThursLunchPrice = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldSatDinner = new javax.swing.JTextField();
        jTextFieldSunDinner = new javax.swing.JTextField();
        jTextFieldMonDinner = new javax.swing.JTextField();
        jTextFieldTuseDinner = new javax.swing.JTextField();
        jTextFieldWedDinner = new javax.swing.JTextField();
        jTextFieldThursDinner = new javax.swing.JTextField();
        jTextFieldFriDinner = new javax.swing.JTextField();
        jTextFieldSunDinnerPrice = new javax.swing.JTextField();
        jTextFieldSatDinnerPrice = new javax.swing.JTextField();
        jTextFieldMonDinnerPrice = new javax.swing.JTextField();
        jTextFieldWedDinnerPrice = new javax.swing.JTextField();
        jTextFieldThursDinnerPrice = new javax.swing.JTextField();
        jTextFieldFriDinnerPrice = new javax.swing.JTextField();
        jTextFieldTuseDinnerPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("صبحانه");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("ناهار");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("قیمت");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("قیمت");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("شام");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("قیمت");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(92, 92, 92)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addGap(128, 128, 128)
                .addComponent(jLabel6)
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("شنبه");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("یکشنبه");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("دوشنبه");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("سه شنبه");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("چهارشنبه");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("جمعه");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("پنجشنبه");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(28, 28, 28)
                .addComponent(jLabel33)
                .addGap(33, 33, 33)
                .addComponent(jLabel34)
                .addGap(29, 29, 29)
                .addComponent(jLabel35)
                .addGap(31, 31, 31)
                .addComponent(jLabel36)
                .addGap(28, 28, 28)
                .addComponent(jLabel38)
                .addGap(36, 36, 36)
                .addComponent(jLabel37)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonOK.setText("تایید");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCansel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCansel.setText("انصراف");
        jButtonCansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanselActionPerformed(evt);
            }
        });

        jTextFieldSatBreak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSunBreak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMonBreak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldTuseBreak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldWedBreak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldThursBreak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldFriBreak.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldFriBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFriBreakActionPerformed(evt);
            }
        });

        jTextFieldWedBreakPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMonBreakPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldTuseBreakPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSatBreakPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldThursBreakPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldFriBreakPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSunBreakPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldWedBreakPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextFieldMonBreakPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextFieldTuseBreakPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextFieldThursBreakPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextFieldSatBreakPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextFieldFriBreakPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jTextFieldSunBreakPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSatBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSunBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTuseBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWedBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldThursBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFriBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSatBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSatBreakPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSunBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSunBreakPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMonBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonBreakPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTuseBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTuseBreakPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldWedBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWedBreakPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldThursBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldThursBreakPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFriBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFriBreakPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTextFieldFriLunch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldThursLunch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldWedLunch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldTuseLunch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMonLunch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSunLunch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSatLunch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSunLunchPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMonLunchPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldTuseLunchPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldWedLunchPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSatLunchPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldFriLunchPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldThursLunchPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldMonLunchPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMonLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldTuseLunchPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTuseLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldWedLunchPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWedLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFriLunchPrice)
                            .addComponent(jTextFieldThursLunchPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldThursLunch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFriLunch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSatLunchPrice)
                            .addComponent(jTextFieldSunLunchPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSunLunch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSatLunch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSatLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSatLunchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSunLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSunLunchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMonLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonLunchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTuseLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTuseLunchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldWedLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWedLunchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldThursLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldThursLunchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFriLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFriLunchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        jTextFieldSatDinner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSunDinner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMonDinner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldTuseDinner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldWedDinner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldThursDinner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldFriDinner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSunDinnerPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldSatDinnerPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldMonDinnerPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldWedDinnerPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldThursDinnerPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldFriDinnerPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldTuseDinnerPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSunDinnerPrice)
                    .addComponent(jTextFieldSatDinnerPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jTextFieldMonDinnerPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jTextFieldWedDinnerPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jTextFieldThursDinnerPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jTextFieldFriDinnerPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jTextFieldTuseDinnerPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldThursDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFriDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWedDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTuseDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSunDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSatDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSatDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSatDinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSunDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSunDinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMonDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonDinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTuseDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTuseDinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldWedDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWedDinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldThursDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldThursDinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFriDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFriDinnerPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCansel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFriBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFriBreakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFriBreakActionPerformed

    private void jButtonCanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanselActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCanselActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed

        if(jTextFieldSatBreak.getText().trim().equals("")|| jTextFieldSatBreakPrice.getText().trim().equals("")||
           jTextFieldSatLunch.getText().trim().equals("")|| jTextFieldSatLunchPrice.getText().trim().equals("")||
           jTextFieldSatDinner.getText().trim().equals("")|| jTextFieldSatDinnerPrice.getText().trim().equals("")||
                
           jTextFieldSunBreak.getText().trim().equals("")|| jTextFieldSunBreakPrice.getText().trim().equals("")||
           jTextFieldSunLunch.getText().trim().equals("")|| jTextFieldSunLunchPrice.getText().trim().equals("")||
           jTextFieldSunDinner.getText().trim().equals("")|| jTextFieldSunDinnerPrice.getText().trim().equals("")||
                
           jTextFieldMonBreak.getText().trim().equals("")|| jTextFieldMonBreakPrice.getText().trim().equals("")||
           jTextFieldMonLunch.getText().trim().equals("")|| jTextFieldMonLunchPrice.getText().trim().equals("")||
           jTextFieldMonDinner.getText().trim().equals("")|| jTextFieldMonDinnerPrice.getText().trim().equals("")||
                
           jTextFieldTuseBreak.getText().trim().equals("")|| jTextFieldTuseBreakPrice.getText().trim().equals("")||
           jTextFieldTuseLunch.getText().trim().equals("")|| jTextFieldTuseLunchPrice.getText().trim().equals("")||
           jTextFieldTuseDinner.getText().trim().equals("")|| jTextFieldTuseDinnerPrice.getText().trim().equals("")||
                
           jTextFieldWedBreak.getText().trim().equals("")|| jTextFieldWedBreakPrice.getText().trim().equals("")||
           jTextFieldWedLunch.getText().trim().equals("")|| jTextFieldWedLunchPrice.getText().trim().equals("")||
           jTextFieldWedDinner.getText().trim().equals("")|| jTextFieldWedDinnerPrice.getText().trim().equals("")||
                
           jTextFieldThursBreak.getText().trim().equals("")|| jTextFieldThursBreakPrice.getText().trim().equals("")||
           jTextFieldThursLunch.getText().trim().equals("")|| jTextFieldThursLunchPrice.getText().trim().equals("")||
           jTextFieldThursDinner.getText().trim().equals("")|| jTextFieldThursDinnerPrice.getText().trim().equals("")||
                
           jTextFieldFriBreak.getText().trim().equals("")|| jTextFieldFriBreakPrice.getText().trim().equals("")||
           jTextFieldFriLunch.getText().trim().equals("")|| jTextFieldFriLunchPrice.getText().trim().equals("")||
           jTextFieldFriDinner.getText().trim().equals("")|| jTextFieldFriDinnerPrice.getText().trim().equals(""))
            {JOptionPane.showMessageDialog(new JFrame(), "همه فیلدها را باید پر کنید", 
                "Dialog", JOptionPane.ERROR_MESSAGE);
             return;}
        
        FileManager fm = new FileManager(FoodPlanPath);
        String Saturday = "day=saturday;"  + "breakfast=" + jTextFieldSatBreak.getText() + 
                ";breakfastprice=" + jTextFieldSatBreakPrice.getText() + 
                ";lunch=" + jTextFieldSatLunch.getText() +
                ";lunchprice=" + jTextFieldSatLunchPrice.getText() +
                ";dinner=" + jTextFieldSatDinner.getText() +
                ";dinnerprice=" + jTextFieldSatDinnerPrice.getText() + ";";
        String Sunday = "day=sunday;"  + "breakfast=" + jTextFieldSunBreak.getText() + 
                ";breakfastprice=" + jTextFieldSunBreakPrice.getText() + 
                ";lunch=" + jTextFieldSunLunch.getText() +
                ";lunchprice=" + jTextFieldSunLunchPrice.getText() +
                ";dinner=" + jTextFieldSunDinner.getText() +
                ";dinnerprice=" + jTextFieldSunDinnerPrice.getText() + ";";        
        String Monday = "day=monday;"  + "breakfast=" + jTextFieldMonBreak.getText() + 
                ";breakfastprice=" + jTextFieldMonBreakPrice.getText() + 
                ";lunch=" + jTextFieldMonLunch.getText() +
                ";lunchprice=" + jTextFieldMonLunchPrice.getText() +
                ";dinner=" + jTextFieldMonDinner.getText() +
                ";dinnerprice=" + jTextFieldMonDinnerPrice.getText() + ";";         
        String Tuseday = "day=tuseday;"  + "breakfast=" + jTextFieldTuseBreak.getText() + 
                ";breakfastprice=" + jTextFieldTuseBreakPrice.getText() + 
                ";lunch=" + jTextFieldTuseLunch.getText() +
                ";lunchprice=" + jTextFieldTuseLunchPrice.getText() +
                ";dinner=" + jTextFieldTuseDinner.getText() +
                ";dinnerprice=" + jTextFieldTuseDinnerPrice.getText() + ";";            
        String Wednesday = "day=wednesday;"  + "breakfast=" + jTextFieldWedBreak.getText() + 
                ";breakfastprice=" + jTextFieldWedBreakPrice.getText() + 
                ";lunch=" + jTextFieldWedLunch.getText() +
                ";lunchprice=" + jTextFieldWedLunchPrice.getText() +
                ";dinner=" + jTextFieldWedDinner.getText() +
                ";dinnerprice=" + jTextFieldWedDinnerPrice.getText() + ";";         
        String Thursday = "day=thursday;"  + "breakfast=" + jTextFieldThursBreak.getText() + 
                ";breakfastprice=" + jTextFieldThursBreakPrice.getText() + 
                ";lunch=" + jTextFieldThursLunch.getText() +
                ";lunchprice=" + jTextFieldThursLunchPrice.getText() +
                ";dinner=" + jTextFieldThursDinner.getText() +
                ";dinnerprice=" + jTextFieldThursDinnerPrice.getText() + ";";  
        String Friday = "day=friday;"  + "breakfast=" + jTextFieldFriBreak.getText() + 
                ";breakfastprice=" + jTextFieldFriBreakPrice.getText() + 
                ";lunch=" + jTextFieldFriLunch.getText() +
                ";lunchprice=" + jTextFieldFriLunchPrice.getText() +
                ";dinner=" + jTextFieldFriDinner.getText() +
                ";dinnerprice=" + jTextFieldFriDinnerPrice.getText() + ";";  
        try {
            fm.FileWriter(Saturday, false);
            fm.FileWriter(Sunday, true);
            fm.FileWriter(Monday, true);
            fm.FileWriter(Tuseday, true);
            fm.FileWriter(Wednesday, true);
            fm.FileWriter(Thursday, true);
            fm.FileWriter(Friday, true);
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "تایید", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(JFrameFoodPlan.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_jButtonOKActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameFoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFoodPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFoodPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCansel;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextFieldFriBreak;
    private javax.swing.JTextField jTextFieldFriBreakPrice;
    private javax.swing.JTextField jTextFieldFriDinner;
    private javax.swing.JTextField jTextFieldFriDinnerPrice;
    private javax.swing.JTextField jTextFieldFriLunch;
    private javax.swing.JTextField jTextFieldFriLunchPrice;
    private javax.swing.JTextField jTextFieldMonBreak;
    private javax.swing.JTextField jTextFieldMonBreakPrice;
    private javax.swing.JTextField jTextFieldMonDinner;
    private javax.swing.JTextField jTextFieldMonDinnerPrice;
    private javax.swing.JTextField jTextFieldMonLunch;
    private javax.swing.JTextField jTextFieldMonLunchPrice;
    private javax.swing.JTextField jTextFieldSatBreak;
    private javax.swing.JTextField jTextFieldSatBreakPrice;
    private javax.swing.JTextField jTextFieldSatDinner;
    private javax.swing.JTextField jTextFieldSatDinnerPrice;
    private javax.swing.JTextField jTextFieldSatLunch;
    private javax.swing.JTextField jTextFieldSatLunchPrice;
    private javax.swing.JTextField jTextFieldSunBreak;
    private javax.swing.JTextField jTextFieldSunBreakPrice;
    private javax.swing.JTextField jTextFieldSunDinner;
    private javax.swing.JTextField jTextFieldSunDinnerPrice;
    private javax.swing.JTextField jTextFieldSunLunch;
    private javax.swing.JTextField jTextFieldSunLunchPrice;
    private javax.swing.JTextField jTextFieldThursBreak;
    private javax.swing.JTextField jTextFieldThursBreakPrice;
    private javax.swing.JTextField jTextFieldThursDinner;
    private javax.swing.JTextField jTextFieldThursDinnerPrice;
    private javax.swing.JTextField jTextFieldThursLunch;
    private javax.swing.JTextField jTextFieldThursLunchPrice;
    private javax.swing.JTextField jTextFieldTuseBreak;
    private javax.swing.JTextField jTextFieldTuseBreakPrice;
    private javax.swing.JTextField jTextFieldTuseDinner;
    private javax.swing.JTextField jTextFieldTuseDinnerPrice;
    private javax.swing.JTextField jTextFieldTuseLunch;
    private javax.swing.JTextField jTextFieldTuseLunchPrice;
    private javax.swing.JTextField jTextFieldWedBreak;
    private javax.swing.JTextField jTextFieldWedBreakPrice;
    private javax.swing.JTextField jTextFieldWedDinner;
    private javax.swing.JTextField jTextFieldWedDinnerPrice;
    private javax.swing.JTextField jTextFieldWedLunch;
    private javax.swing.JTextField jTextFieldWedLunchPrice;
    // End of variables declaration//GEN-END:variables
}
