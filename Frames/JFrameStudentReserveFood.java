package Frames;

import FileManager.FileManager;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrameStudentReserveFood extends javax.swing.JFrame {

    Path FoodPalnPathTemp = Paths.get("src/Files", "FoodPaln.txt");
    String FoodPalnPath = String.valueOf(FoodPalnPathTemp);
    Path StudentsPathTemp = Paths.get("src/Files", "Students.txt");
    String StudentsPath = String.valueOf(StudentsPathTemp);    
    
    private String Credit;
    
    public JFrameStudentReserveFood(String Credit) {       
        initComponents();      
        this.Credit = Credit;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ReadFoodPlan();
        ReadSelectedFoods();
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }

    String SatBreakfastPrice,SatLunchPrice,SatDinnerPrice,SunBreakfastPrice,SunLunchPrice,SunDinnerPrice,MonBreakfastPrice,MonLunchPrice,
      MonDinnerPrice,TuseBreakfastPrice,TuseLunchPrice,TuseDinnerPrice,WedBreakfastPrice,WedLunchPrice,WedDinnerPrice,ThursBreakfastPrice,
            ThursLunchPrice,ThursDinnerPrice,FriBreakfastPrice,FriLunchPrice,FriDinnerPrice;
    private void ReadFoodPlan(){
         try {
         FileManager file = new FileManager(FoodPalnPath);
         String[] result = file.ReadFile();

         //شنبه
         String Saturday = result[0];     
         int startSatBreak = Saturday.indexOf("breakfast=") + 10;
         int endSatBreak = Saturday.indexOf(";", startSatBreak);
         String SatBreakfast = Saturday.substring(startSatBreak, endSatBreak);

         int startSatBreakPrice = Saturday.indexOf("breakfastprice=") + 15;
         int endSatBreakPrice = Saturday.indexOf(";", startSatBreakPrice);
         SatBreakfastPrice = Saturday.substring(startSatBreakPrice, endSatBreakPrice);

         int startSatLunch = Saturday.indexOf("lunch=") + 6;
         int endSatLunch = Saturday.indexOf(";", startSatLunch);
         String SatLunch = Saturday.substring(startSatLunch, endSatLunch);

         int startSatLunchPrice = Saturday.indexOf("lunchprice=") + 11;
         int endSatLunchPrice = Saturday.indexOf(";", startSatLunchPrice);
         SatLunchPrice = Saturday.substring(startSatLunchPrice, endSatLunchPrice);

         int startSatDinner = Saturday.indexOf("dinner=") + 7;
         int endSatDinner = Saturday.indexOf(";", startSatDinner);
         String SatDinner = Saturday.substring(startSatDinner, endSatDinner);

         int startSatDinnerPrice = Saturday.indexOf("dinnerprice=") + 12;
         int endSatDinnerPrice = Saturday.indexOf(";", startSatDinnerPrice);
         SatDinnerPrice = Saturday.substring(startSatDinnerPrice, endSatDinnerPrice);

         jCheckBoxSatBreak.setText(SatBreakfast + " " + SatBreakfastPrice);
         jCheckBoxSatLunch.setText(SatLunch + " " + SatLunchPrice);
         jCheckBoxSatDinner.setText(SatDinner + " " + SatDinnerPrice);

         //یکشنیه
         String Sunday = result[1];     
         int startSunBreak = Sunday.indexOf("breakfast=") + 10;
         int endSunBreak = Sunday.indexOf(";", startSunBreak);
         String SunBreakfast = Sunday.substring(startSunBreak, endSunBreak);

         int startSunBreakPrice = Sunday.indexOf("breakfastprice=") + 15;
         int endSunBreakPrice = Sunday.indexOf(";", startSunBreakPrice);
         SunBreakfastPrice = Sunday.substring(startSunBreakPrice, endSunBreakPrice);

         int startSunLunch = Sunday.indexOf("lunch=") + 6;
         int endSunLunch = Sunday.indexOf(";", startSunLunch);
         String SunLunch = Sunday.substring(startSunLunch, endSunLunch);

         int startSunLunchPrice = Sunday.indexOf("lunchprice=") + 11;
         int endSunLunchPrice = Sunday.indexOf(";", startSunLunchPrice);
         SunLunchPrice = Sunday.substring(startSunLunchPrice, endSunLunchPrice);

         int startSunDinner = Sunday.indexOf("dinner=") + 7;
         int endSunDinner = Sunday.indexOf(";", startSunDinner);
         String SunDinner = Sunday.substring(startSunDinner, endSunDinner);

         int startSunDinnerPrice = Sunday.indexOf("dinnerprice=") + 12;
         int endSunDinnerPrice = Sunday.indexOf(";", startSunDinnerPrice);
         SunDinnerPrice = Sunday.substring(startSunDinnerPrice, endSunDinnerPrice);

         jCheckBoxSunBreak.setText(SunBreakfast + " " + SunBreakfastPrice);
         jCheckBoxSunLunch.setText(SunLunch + " " + SunLunchPrice);
         jCheckBoxSunDinner.setText(SunDinner + " " + SunDinnerPrice);

         //دوشنبه
         String Monday = result[2];

         int startMonBreak = Monday.indexOf("breakfast=") + 10;
         int endMonBreak = Monday.indexOf(";", startMonBreak);
         String MonBreakfast = Monday.substring(startMonBreak, endMonBreak);

         int startMonBreakPrice = Monday.indexOf("breakfastprice=") + 15;
         int endMonBreakPrice = Monday.indexOf(";", startMonBreakPrice);
         MonBreakfastPrice = Monday.substring(startMonBreakPrice, endMonBreakPrice);

         int startMonLunch = Monday.indexOf("lunch=") + 6;
         int endMonLunch = Monday.indexOf(";", startMonLunch);
         String MonLunch = Monday.substring(startMonLunch, endMonLunch);

         int startMonLunchPrice = Monday.indexOf("lunchprice=") + 11;
         int endMonLunchPrice = Monday.indexOf(";", startMonLunchPrice);
         MonLunchPrice = Monday.substring(startMonLunchPrice, endMonLunchPrice);

         int startMonDinner = Monday.indexOf("dinner=") + 7;
         int endMonDinner = Monday.indexOf(";", startMonDinner);
         String MonDinner = Monday.substring(startMonDinner, endMonDinner);

         int startMonDinnerPrice = Monday.indexOf("dinnerprice=") + 12;
         int endMonDinnerPrice = Monday.indexOf(";", startMonDinnerPrice);
         MonDinnerPrice = Monday.substring(startMonDinnerPrice, endMonDinnerPrice);

         jCheckBoxMonBreak.setText(MonBreakfast + " " + MonBreakfastPrice);
         jCheckBoxMonLunch.setText(MonLunch + " " + MonLunchPrice);
         jCheckBoxMonDinner.setText(MonDinner + " " + MonDinnerPrice);

         //سه شنبه
              String Tuseday = result[3];

         int startTuseBreak = Tuseday.indexOf("breakfast=") + 10;
         int endTuseBreak = Tuseday.indexOf(";", startTuseBreak);
         String TuseBreakfast = Tuseday.substring(startTuseBreak, endTuseBreak);

         int startTuseBreakPrice = Tuseday.indexOf("breakfastprice=") + 15;
         int endTuseBreakPrice = Tuseday.indexOf(";", startTuseBreakPrice);
         TuseBreakfastPrice = Tuseday.substring(startTuseBreakPrice, endTuseBreakPrice);

         int startTuseLunch = Tuseday.indexOf("lunch=") + 6;
         int endTuseLunch = Tuseday.indexOf(";", startTuseLunch);
         String TuseLunch = Tuseday.substring(startTuseLunch, endTuseLunch);

         int startTuseLunchPrice = Tuseday.indexOf("lunchprice=") + 11;
         int endTuseLunchPrice = Tuseday.indexOf(";", startTuseLunchPrice);
         TuseLunchPrice = Tuseday.substring(startTuseLunchPrice, endTuseLunchPrice);

         int startTuseDinner = Tuseday.indexOf("dinner=") + 7;
         int endTuseDinner = Tuseday.indexOf(";", startTuseDinner);
         String TuseDinner = Tuseday.substring(startTuseDinner, endTuseDinner);

         int startTuseDinnerPrice = Tuseday.indexOf("dinnerprice=") + 12;
         int endTuseDinnerPrice = Tuseday.indexOf(";", startTuseDinnerPrice);
         TuseDinnerPrice = Tuseday.substring(startTuseDinnerPrice, endTuseDinnerPrice);

         jCheckBoxTuseBreak.setText(TuseBreakfast + " " + TuseBreakfastPrice);
         jCheckBoxTuseLunch.setText(TuseLunch + " " + TuseLunchPrice);
         jCheckBoxTuseDinner.setText(TuseDinner + " " + TuseDinnerPrice);

         //چهارشنبه
         String Wedday = result[4];     
         int startWedBreak = Wedday.indexOf("breakfast=") + 10;
         int endWedBreak = Wedday.indexOf(";", startWedBreak);
         String WedBreakfast = Wedday.substring(startWedBreak, endWedBreak);

         int startWedBreakPrice = Wedday.indexOf("breakfastprice=") + 15;
         int endWedBreakPrice = Wedday.indexOf(";", startWedBreakPrice);
         WedBreakfastPrice = Wedday.substring(startWedBreakPrice, endWedBreakPrice);

         int startWedLunch = Wedday.indexOf("lunch=") + 6;
         int endWedLunch = Wedday.indexOf(";", startWedLunch);
         String WedLunch = Wedday.substring(startWedLunch, endWedLunch);

         int startWedLunchPrice = Wedday.indexOf("lunchprice=") + 11;
         int endWedLunchPrice = Wedday.indexOf(";", startWedLunchPrice);
         WedLunchPrice = Wedday.substring(startWedLunchPrice, endWedLunchPrice);

         int startWedDinner = Wedday.indexOf("dinner=") + 7;
         int endWedDinner = Wedday.indexOf(";", startWedDinner);
         String WedDinner = Wedday.substring(startWedDinner, endWedDinner);

         int startWedDinnerPrice = Wedday.indexOf("dinnerprice=") + 12;
         int endWedDinnerPrice = Wedday.indexOf(";", startWedDinnerPrice);
         WedDinnerPrice = Wedday.substring(startWedDinnerPrice, endWedDinnerPrice);

         jCheckBoxWedBreak.setText(WedBreakfast + " " + WedBreakfastPrice);
         jCheckBoxWedLunch.setText(WedLunch + " " + WedLunchPrice);
         jCheckBoxWedDinner.setText(WedDinner + " " + WedDinnerPrice);

         //پنجشنبه
         String Thursday = result[5];     
         int startThursBreak = Thursday.indexOf("breakfast=") + 10;
         int endThursBreak = Thursday.indexOf(";", startThursBreak);
         String ThursBreakfast = Thursday.substring(startThursBreak, endThursBreak);

         int startThursBreakPrice = Thursday.indexOf("breakfastprice=") + 15;
         int endThursBreakPrice = Thursday.indexOf(";", startThursBreakPrice);
         ThursBreakfastPrice = Thursday.substring(startThursBreakPrice, endThursBreakPrice);

         int startThursLunch = Thursday.indexOf("lunch=") + 6;
         int endThursLunch = Thursday.indexOf(";", startThursLunch);
         String ThursLunch = Thursday.substring(startThursLunch, endThursLunch);

         int startThursLunchPrice = Thursday.indexOf("lunchprice=") + 11;
         int endThursLunchPrice = Thursday.indexOf(";", startThursLunchPrice);
         ThursLunchPrice = Thursday.substring(startThursLunchPrice, endThursLunchPrice);

         int startThursDinner = Thursday.indexOf("dinner=") + 7;
         int endThursDinner = Thursday.indexOf(";", startThursDinner);
         String ThursDinner = Thursday.substring(startThursDinner, endThursDinner);

         int startThursDinnerPrice = Thursday.indexOf("dinnerprice=") + 12;
         int endThursDinnerPrice = Thursday.indexOf(";", startThursDinnerPrice);
         ThursDinnerPrice = Thursday.substring(startThursDinnerPrice, endThursDinnerPrice);

         jCheckBoxThursBreak.setText(ThursBreakfast + " " + ThursBreakfastPrice);
         jCheckBoxThursLunch.setText(ThursLunch + " " + ThursLunchPrice);
         jCheckBoxThursDinner.setText(ThursDinner + " " + ThursDinnerPrice);

         //جمعه
         String Friday = result[6];     
         int startFriBreak = Friday.indexOf("breakfast=") + 10;
         int endFriBreak = Friday.indexOf(";", startFriBreak);
         String FriBreakfast = Friday.substring(startFriBreak, endFriBreak);

         int startFriBreakPrice = Friday.indexOf("breakfastprice=") + 15;
         int endFriBreakPrice = Friday.indexOf(";", startFriBreakPrice);
         FriBreakfastPrice = Friday.substring(startFriBreakPrice, endFriBreakPrice);

         int startFriLunch = Friday.indexOf("lunch=") + 6;
         int endFriLunch = Friday.indexOf(";", startFriLunch);
         String FriLunch = Friday.substring(startFriLunch, endFriLunch);

         int startFriLunchPrice = Friday.indexOf("lunchprice=") + 11;
         int endFriLunchPrice = Friday.indexOf(";", startFriLunchPrice);
         FriLunchPrice = Friday.substring(startFriLunchPrice, endFriLunchPrice);

         int startFriDinner = Friday.indexOf("dinner=") + 7;
         int endFriDinner = Friday.indexOf(";", startFriDinner);
         String FriDinner = Friday.substring(startFriDinner, endFriDinner);

         int startFriDinnerPrice = Friday.indexOf("dinnerprice=") + 12;
         int endFriDinnerPrice = Friday.indexOf(";", startFriDinnerPrice);
         FriDinnerPrice = Friday.substring(startFriDinnerPrice, endFriDinnerPrice);

         jCheckBoxFriBreak.setText(FriBreakfast + " " + FriBreakfastPrice);
         jCheckBoxFriLunch.setText(FriLunch + " " + FriLunchPrice);
         jCheckBoxFriDinner.setText(FriDinner + " " + FriDinnerPrice);

         } catch (IOException ex) {
            Logger.getLogger(JFrameStudentReserveFood.class.getName()).log(Level.SEVERE, null, ex);
         }         
    }    
    
    private void ReadSelectedFoods(){
        String ReserveFood = null;
        int CountLines = 0;
        try {
            FileManager fm = new FileManager(StudentsPath);
            String[] result = fm.ReadFile();
            CountLines = fm.CountLines();
            int studentRow;            
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startuser = data.indexOf("username=");
                int enduser = data.indexOf(";", startuser);
                String Username = data.substring(startuser + 9, enduser);
                int startFood = data.indexOf("reservefood=");
                int endFood = data.indexOf(";", startFood);
                ReserveFood = data.substring(startFood + 12, endFood);
                if(JFrameStudent.studentusername.equals(Username))
                    { break;}
            }
            
        if(ReserveFood.substring(0, 1).equals("1"))
            jCheckBoxSatBreak.setSelected(true);
        else
            jCheckBoxSatBreak.setSelected(false);
        
        if(ReserveFood.substring(1, 2).equals("1"))
            jCheckBoxSatLunch.setSelected(true);
        else
            jCheckBoxSatLunch.setSelected(false);    
        
        if(ReserveFood.substring(2, 3).equals("1"))
            jCheckBoxSatDinner.setSelected(true);
        else
            jCheckBoxSatDinner.setSelected(false);
        
        if(ReserveFood.substring(3, 4).equals("1"))
            jCheckBoxSunBreak.setSelected(true);
        else
            jCheckBoxSunBreak.setSelected(false);
        
        if(ReserveFood.substring(4, 5).equals("1"))
            jCheckBoxSunLunch.setSelected(true);
        else
            jCheckBoxSunLunch.setSelected(false);    
        
        if(ReserveFood.substring(5, 6).equals("1"))
            jCheckBoxSunDinner.setSelected(true);
        else
            jCheckBoxSunDinner.setSelected(false);
        
        if(ReserveFood.substring(6, 7).equals("1"))
            jCheckBoxMonBreak.setSelected(true);
        else
            jCheckBoxMonBreak.setSelected(false);
        
        if(ReserveFood.substring(7, 8).equals("1"))
            jCheckBoxMonLunch.setSelected(true);
        else
            jCheckBoxMonLunch.setSelected(false);    
        
        if(ReserveFood.substring(8, 9).equals("1"))
            jCheckBoxMonDinner.setSelected(true);
        else
            jCheckBoxMonDinner.setSelected(false);
        
        if(ReserveFood.substring(9, 10).equals("1"))
            jCheckBoxTuseBreak.setSelected(true);
        else
            jCheckBoxTuseBreak.setSelected(false);
        
        if(ReserveFood.substring(10, 11).equals("1"))
            jCheckBoxTuseLunch.setSelected(true);
        else
            jCheckBoxTuseLunch.setSelected(false);    
        
        if(ReserveFood.substring(11, 12).equals("1"))
            jCheckBoxTuseDinner.setSelected(true);
        else
            jCheckBoxTuseDinner.setSelected(false);

        if(ReserveFood.substring(12, 13).equals("1"))
            jCheckBoxWedBreak.setSelected(true);
        else
            jCheckBoxWedBreak.setSelected(false);
        
        if(ReserveFood.substring(13, 14).equals("1"))
            jCheckBoxWedLunch.setSelected(true);
        else
            jCheckBoxWedLunch.setSelected(false);    
        
        if(ReserveFood.substring(14, 15).equals("1"))
            jCheckBoxWedDinner.setSelected(true);
        else
            jCheckBoxWedDinner.setSelected(false);
        
        if(ReserveFood.substring(15, 16).equals("1"))
            jCheckBoxThursBreak.setSelected(true);
        else
            jCheckBoxThursBreak.setSelected(false);
        
        if(ReserveFood.substring(16, 17).equals("1"))
            jCheckBoxThursLunch.setSelected(true);
        else
            jCheckBoxThursLunch.setSelected(false);    
        
        if(ReserveFood.substring(17, 18).equals("1"))
            jCheckBoxThursDinner.setSelected(true);
        else
            jCheckBoxThursDinner.setSelected(false);

        if(ReserveFood.substring(18, 19).equals("1"))
            jCheckBoxFriBreak.setSelected(true);
        else
            jCheckBoxFriBreak.setSelected(false);
        
        if(ReserveFood.substring(19, 20).equals("1"))
            jCheckBoxFriLunch.setSelected(true);
        else
            jCheckBoxFriLunch.setSelected(false);    
        
        if(ReserveFood.substring(20, 21).equals("1"))
            jCheckBoxFriDinner.setSelected(true);
        else
            jCheckBoxFriDinner.setSelected(false);
        

            
//Student.username = this.username = jTextFieldNewUsername.getText();
            
//JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(JFrameStudentReserveFood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonClose = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jCheckBoxSatLunch = new javax.swing.JCheckBox();
        jCheckBoxSatDinner = new javax.swing.JCheckBox();
        jCheckBoxSatBreak = new javax.swing.JCheckBox();
        jCheckBoxSunBreak = new javax.swing.JCheckBox();
        jCheckBoxSunLunch = new javax.swing.JCheckBox();
        jCheckBoxSunDinner = new javax.swing.JCheckBox();
        jCheckBoxMonBreak = new javax.swing.JCheckBox();
        jCheckBoxMonLunch = new javax.swing.JCheckBox();
        jCheckBoxMonDinner = new javax.swing.JCheckBox();
        jCheckBoxTuseBreak = new javax.swing.JCheckBox();
        jCheckBoxTuseLunch = new javax.swing.JCheckBox();
        jCheckBoxTuseDinner = new javax.swing.JCheckBox();
        jCheckBoxWedBreak = new javax.swing.JCheckBox();
        jCheckBoxWedLunch = new javax.swing.JCheckBox();
        jCheckBoxWedDinner = new javax.swing.JCheckBox();
        jCheckBoxThursBreak = new javax.swing.JCheckBox();
        jCheckBoxThursLunch = new javax.swing.JCheckBox();
        jCheckBoxThursDinner = new javax.swing.JCheckBox();
        jCheckBoxFriBreak = new javax.swing.JCheckBox();
        jCheckBoxFriLunch = new javax.swing.JCheckBox();
        jCheckBoxFriDinner = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelCredit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("برنامه غذایی");

        jButtonClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClose.setText("خروج");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonOK.setText("تایید");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jCheckBoxSatLunch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxSatLunch.setText("وعده ناهار");
        jCheckBoxSatLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSatLunchActionPerformed(evt);
            }
        });

        jCheckBoxSatDinner.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxSatDinner.setText("وعده شام");
        jCheckBoxSatDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSatDinnerActionPerformed(evt);
            }
        });

        jCheckBoxSatBreak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxSatBreak.setText("وعده صبحانه");
        jCheckBoxSatBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSatBreakActionPerformed(evt);
            }
        });

        jCheckBoxSunBreak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxSunBreak.setText("وعده صبحانه");
        jCheckBoxSunBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSunBreakActionPerformed(evt);
            }
        });

        jCheckBoxSunLunch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxSunLunch.setText("وعده ناهار");
        jCheckBoxSunLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSunLunchActionPerformed(evt);
            }
        });

        jCheckBoxSunDinner.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxSunDinner.setText("وعده شام");
        jCheckBoxSunDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSunDinnerActionPerformed(evt);
            }
        });

        jCheckBoxMonBreak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxMonBreak.setText("وعده صبحانه");
        jCheckBoxMonBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMonBreakActionPerformed(evt);
            }
        });

        jCheckBoxMonLunch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxMonLunch.setText("وعده ناهار");
        jCheckBoxMonLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMonLunchActionPerformed(evt);
            }
        });

        jCheckBoxMonDinner.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxMonDinner.setText("وعده شام");
        jCheckBoxMonDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMonDinnerActionPerformed(evt);
            }
        });

        jCheckBoxTuseBreak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxTuseBreak.setText("وعده صبحانه");
        jCheckBoxTuseBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTuseBreakActionPerformed(evt);
            }
        });

        jCheckBoxTuseLunch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxTuseLunch.setText("وعده ناهار");
        jCheckBoxTuseLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTuseLunchActionPerformed(evt);
            }
        });

        jCheckBoxTuseDinner.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxTuseDinner.setText("وعده شام");
        jCheckBoxTuseDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTuseDinnerActionPerformed(evt);
            }
        });

        jCheckBoxWedBreak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxWedBreak.setText("وعده صبحانه");
        jCheckBoxWedBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxWedBreakActionPerformed(evt);
            }
        });

        jCheckBoxWedLunch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxWedLunch.setText("وعده ناهار");
        jCheckBoxWedLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxWedLunchActionPerformed(evt);
            }
        });

        jCheckBoxWedDinner.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxWedDinner.setText("وعده شام");
        jCheckBoxWedDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxWedDinnerActionPerformed(evt);
            }
        });

        jCheckBoxThursBreak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxThursBreak.setText("وعده صبحانه");
        jCheckBoxThursBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxThursBreakActionPerformed(evt);
            }
        });

        jCheckBoxThursLunch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxThursLunch.setText("وعده ناهار");
        jCheckBoxThursLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxThursLunchActionPerformed(evt);
            }
        });

        jCheckBoxThursDinner.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxThursDinner.setText("وعده شام");
        jCheckBoxThursDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxThursDinnerActionPerformed(evt);
            }
        });

        jCheckBoxFriBreak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxFriBreak.setText("وعده صبحانه");
        jCheckBoxFriBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFriBreakActionPerformed(evt);
            }
        });

        jCheckBoxFriLunch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxFriLunch.setText("وعده ناهار");
        jCheckBoxFriLunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFriLunchActionPerformed(evt);
            }
        });

        jCheckBoxFriDinner.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxFriDinner.setText("وعده شام");
        jCheckBoxFriDinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFriDinnerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxFriDinner)
                    .addComponent(jCheckBoxThursDinner)
                    .addComponent(jCheckBoxWedDinner)
                    .addComponent(jCheckBoxTuseDinner)
                    .addComponent(jCheckBoxSunDinner)
                    .addComponent(jCheckBoxMonDinner)
                    .addComponent(jCheckBoxSatDinner))
                .addGap(146, 146, 146)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxSunLunch)
                    .addComponent(jCheckBoxMonLunch)
                    .addComponent(jCheckBoxSatLunch)
                    .addComponent(jCheckBoxTuseLunch)
                    .addComponent(jCheckBoxWedLunch)
                    .addComponent(jCheckBoxThursLunch)
                    .addComponent(jCheckBoxFriLunch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxSatBreak)
                    .addComponent(jCheckBoxSunBreak)
                    .addComponent(jCheckBoxMonBreak)
                    .addComponent(jCheckBoxTuseBreak)
                    .addComponent(jCheckBoxWedBreak)
                    .addComponent(jCheckBoxThursBreak)
                    .addComponent(jCheckBoxFriBreak))
                .addGap(70, 70, 70))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSatLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSatDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSatBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSunLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSunDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxSunBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxMonBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMonLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxMonDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxTuseLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxTuseDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxTuseBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxWedBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBoxWedLunch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxWedDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxThursBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxThursLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxThursDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxFriLunch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxFriDinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxFriBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("صبحانه");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("ناهار");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("شنبه");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("یکشنبه");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("دوشنبه");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("سه شنبه");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("چهارشنبه");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("جمعه");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("پنجشنبه");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabelCredit.setText("jLabel7");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("شام");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabelCredit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabelCredit)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxThursLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxThursLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxThursLunch.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxThursLunch.setSelected(!jCheckBoxThursLunch.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxThursLunchActionPerformed

    private void jCheckBoxFriLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFriLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxFriLunch.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxFriLunch.setSelected(!jCheckBoxFriLunch.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxFriLunchActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jCheckBoxSatBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSatBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxSatBreak.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxSatBreak.setSelected(!jCheckBoxSatBreak.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSatBreakActionPerformed

    private void jCheckBoxSunBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSunBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxSunBreak.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxSunBreak.setSelected(!jCheckBoxSunBreak.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSunBreakActionPerformed

    private void jCheckBoxMonBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMonBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxMonBreak.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxMonBreak.setSelected(!jCheckBoxMonBreak.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxMonBreakActionPerformed

    private void jCheckBoxTuseBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTuseBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxTuseBreak.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxTuseBreak.setSelected(!jCheckBoxTuseBreak.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxTuseBreakActionPerformed

    private void jCheckBoxWedBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxWedBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxWedBreak.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxWedBreak.setSelected(!jCheckBoxWedBreak.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxWedBreakActionPerformed

    private void jCheckBoxThursBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxThursBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxThursBreak.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxThursBreak.setSelected(!jCheckBoxThursBreak.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxThursBreakActionPerformed

    private void jCheckBoxFriBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFriBreakActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxFriBreak.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxFriBreak.setSelected(!jCheckBoxFriBreak.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxFriBreakActionPerformed

    private void jCheckBoxSatLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSatLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxSatLunch.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxSatLunch.setSelected(!jCheckBoxSatLunch.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSatLunchActionPerformed

    private void jCheckBoxSunLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSunLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxSunLunch.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxSunLunch.setSelected(!jCheckBoxSunLunch.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSunLunchActionPerformed

    private void jCheckBoxMonLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMonLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxMonLunch.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxMonLunch.setSelected(!jCheckBoxMonLunch.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxMonLunchActionPerformed

    private void jCheckBoxTuseLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTuseLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxTuseLunch.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxTuseLunch.setSelected(!jCheckBoxTuseLunch.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxTuseLunchActionPerformed

    private void jCheckBoxWedLunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxWedLunchActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxWedLunch.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxWedLunch.setSelected(!jCheckBoxWedLunch.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxWedLunchActionPerformed

    private void jCheckBoxSatDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSatDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxSatDinner.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxSatDinner.setSelected(!jCheckBoxSatDinner.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSatDinnerActionPerformed

    private void jCheckBoxSunDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSunDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxSunDinner.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxSunDinner.setSelected(!jCheckBoxSunDinner.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxSunDinnerActionPerformed

    private void jCheckBoxMonDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMonDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxMonDinner.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxMonDinner.setSelected(!jCheckBoxMonDinner.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxMonDinnerActionPerformed

    private void jCheckBoxTuseDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTuseDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxTuseDinner.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxTuseDinner.setSelected(!jCheckBoxTuseDinner.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxTuseDinnerActionPerformed

    private void jCheckBoxWedDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxWedDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxWedDinner.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxWedDinner.setSelected(!jCheckBoxWedDinner.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxWedDinnerActionPerformed

    private void jCheckBoxThursDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxThursDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxThursDinner.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxThursDinner.setSelected(!jCheckBoxThursDinner.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxThursDinnerActionPerformed

    private void jCheckBoxFriDinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFriDinnerActionPerformed
        int _credit = Integer.valueOf(this.Credit);
        int _price = Integer.valueOf(this.ThursLunchPrice);        
        if(jCheckBoxFriDinner.isSelected()){

            if(_credit - _price < 0){
            JOptionPane.showMessageDialog(new JFrame(), "موجودی شما کافی نیست", "Dialog", JOptionPane.ERROR_MESSAGE);
            jCheckBoxFriDinner.setSelected(!jCheckBoxFriDinner.isSelected());
            return;
            }
            this.Credit = String.valueOf(_credit - _price);                   
        }
        else
            this.Credit = String.valueOf(_credit + _price);  
            
        jLabelCredit.setText("موجودی شما: " + this.Credit);
    }//GEN-LAST:event_jCheckBoxFriDinnerActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        String ReservedFood = "";
        if(jCheckBoxSatBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSatLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSatDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSunBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSunLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxSunDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxMonBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxMonLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxMonDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxTuseBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxTuseLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxTuseDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxWedBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxWedLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxWedDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxThursBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxThursLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxThursDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxFriBreak.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxFriLunch.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        if(jCheckBoxFriDinner.isSelected())
            ReservedFood += "1";
        else
            ReservedFood += "0";
        
        int CountLines = 0;
        String Credit = null, Username, Food = null;
        try {
            FileManager fm = new FileManager(StudentsPath);
            String[] result = fm.ReadFile();
            CountLines = fm.CountLines();
            int studentRow;            
            for(studentRow = 0; studentRow < CountLines; studentRow++){
                String data = result[studentRow];
                int startuser = data.indexOf("username=");
                int enduser = data.indexOf(";", startuser);
                Username = data.substring(startuser + 9, enduser);
                int startcredit = data.indexOf("credit=");
                int endCredit = data.indexOf(";", startcredit);
                Credit = data.substring(startcredit + 7, endCredit);
                int startFood = data.indexOf("reservefood=");
                int endFood = data.indexOf(";", startFood);
                Food = data.substring(startFood + 12, endFood);
                
                if(JFrameStudent.studentusername.equals(Username))
                    { break;}
            }
            String FoundStudent = result[studentRow];
            //int NewCredit = Integer.valueOf(Credit) + Integer.valueOf(jTextFieldCredit.getText());
            FoundStudent = FoundStudent.replace("credit=" + Credit, "credit=" + this.Credit);
            FoundStudent = FoundStudent.replace("reservefood=" + Food, "reservefood=" + ReservedFood);
            
            //JOptionPane.showMessageDialog(new JFrame(), FoundStudent, "Dialog", JOptionPane.INFORMATION_MESSAGE);
            result[studentRow] = FoundStudent;
            for(int i = 0 ; i < CountLines; i++){
                if(i ==0)
                    fm.FileWriter(result[i], false);
                else 
                    fm.FileWriter(result[i], true);
            }
            //this. = jTextFieldNewUsername.getText();
            
            JOptionPane.showMessageDialog(new JFrame(), "با موفقیت ثبت شد", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(JFrameStudentReserveFood.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(JFrameStudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameStudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameStudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameStudentReserveFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameStudentReserveFood(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBoxFriBreak;
    private javax.swing.JCheckBox jCheckBoxFriDinner;
    private javax.swing.JCheckBox jCheckBoxFriLunch;
    private javax.swing.JCheckBox jCheckBoxMonBreak;
    private javax.swing.JCheckBox jCheckBoxMonDinner;
    private javax.swing.JCheckBox jCheckBoxMonLunch;
    private javax.swing.JCheckBox jCheckBoxSatBreak;
    private javax.swing.JCheckBox jCheckBoxSatDinner;
    private javax.swing.JCheckBox jCheckBoxSatLunch;
    private javax.swing.JCheckBox jCheckBoxSunBreak;
    private javax.swing.JCheckBox jCheckBoxSunDinner;
    private javax.swing.JCheckBox jCheckBoxSunLunch;
    private javax.swing.JCheckBox jCheckBoxThursBreak;
    private javax.swing.JCheckBox jCheckBoxThursDinner;
    private javax.swing.JCheckBox jCheckBoxThursLunch;
    private javax.swing.JCheckBox jCheckBoxTuseBreak;
    private javax.swing.JCheckBox jCheckBoxTuseDinner;
    private javax.swing.JCheckBox jCheckBoxTuseLunch;
    private javax.swing.JCheckBox jCheckBoxWedBreak;
    private javax.swing.JCheckBox jCheckBoxWedDinner;
    private javax.swing.JCheckBox jCheckBoxWedLunch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCredit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
