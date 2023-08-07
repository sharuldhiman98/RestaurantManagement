
package project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Restaurants extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operations;
    double[] i = new double[5];

    public Restaurants() {
        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jChicBurger = new javax.swing.JCheckBox();
        jMeal = new javax.swing.JCheckBox();
        JVegBurger = new javax.swing.JCheckBox();
        jtxtcmeal = new javax.swing.JTextField();
        jtxtcbur = new javax.swing.JTextField();
        jtxtveg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCmbDrinks = new javax.swing.JComboBox();
        jchkboxdel = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jBtnTotal = new javax.swing.JButton();
        jBtnReceipt = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        jlblconvert = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtxtconvertor = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlblsubtotal = new javax.swing.JLabel();
        jlbltax = new javax.swing.JLabel();
        jlbltotal = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtarRec = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jBtn7 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jBtn10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlblcost1 = new javax.swing.JLabel();
        jlblcost2 = new javax.swing.JLabel();
        jlblcost3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1376, 841));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jChicBurger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChicBurger.setText("CHICKEN BURGER");
        jChicBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jChicBurgerMouseClicked(evt);
            }
        });
        jChicBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChicBurgerActionPerformed(evt);
            }
        });

        jMeal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMeal.setText("CHICKEN BURGER MEAL");
        jMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMealMouseClicked(evt);
            }
        });
        jMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMealActionPerformed(evt);
            }
        });

        JVegBurger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JVegBurger.setText("VEG BURGER");
        JVegBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JVegBurgerMouseClicked(evt);
            }
        });

        jtxtcmeal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jtxtcbur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtcbur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcburActionPerformed(evt);
            }
        });

        jtxtveg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DRINKS");

        jCmbDrinks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCmbDrinks.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selectDrink", "coke", "pepsi", "coffee", "cold_coffee", " " }));
        jCmbDrinks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCmbDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbDrinksActionPerformed(evt);
            }
        });

        jchkboxdel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jchkboxdel.setText("Home Delivery");
        jchkboxdel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jchkboxdelMouseClicked(evt);
            }
        });
        jchkboxdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkboxdelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jChicBurger)
                            .addComponent(jMeal)
                            .addComponent(JVegBurger)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtxtcmeal, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addComponent(jtxtcbur)
                        .addComponent(jtxtveg))
                    .addComponent(jCmbDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jchkboxdel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChicBurger)
                    .addComponent(jtxtcbur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMeal)
                    .addComponent(jtxtcmeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JVegBurger)
                    .addComponent(jtxtveg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCmbDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jchkboxdel)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnTotal.setText("Total");
        jBtnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnTotalMouseClicked(evt);
            }
        });
        jBtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalActionPerformed(evt);
            }
        });

        jBtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnReceipt.setText("Receipt");
        jBtnReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReceiptMouseClicked(evt);
            }
        });
        jBtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceiptActionPerformed(evt);
            }
        });

        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Save Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jBtnTotal)
                .addGap(85, 85, 85)
                .addComponent(jBtnReceipt)
                .addGap(80, 80, 80)
                .addComponent(jBtnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jBtnExit)
                .addGap(51, 51, 51)
                .addComponent(jButton3)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnTotal)
                    .addComponent(jBtnReceipt)
                    .addComponent(jBtnReset)
                    .addComponent(jBtnExit)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose One...", "Nigerian", "Kenyan", "USA", "Canada", "Brazil", "Philippine", " ", " " }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblconvert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblconvert.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addGap(83, 83, 83)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, 219, Short.MAX_VALUE)
                            .addComponent(jlblconvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtconvertor))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtconvertor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblconvert, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Sub Total");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tax");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Total");

        jlblsubtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblsubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblsubtotal.setText(" ");
        jlblsubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlbltax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbltax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbltax.setText("0");
        jlbltax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlbltax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbltaxMouseClicked(evt);
            }
        });

        jlbltotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbltotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbltotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbltax, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbltax, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtxtarRec.setColumns(20);
        jtxtarRec.setRows(5);
        jScrollPane1.setViewportView(jtxtarRec);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Receipt", jPanel11);

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn5.setFont(jBtn5.getFont().deriveFont(jBtn5.getFont().getStyle() | java.awt.Font.BOLD, jBtn5.getFont().getSize()+3));
        jBtn5.setText("5");

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("C");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText(".");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setText("<--");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("=");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText("+");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setText("-");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setText("*");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("jButton1");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("jButton1");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("/");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.setText("+/-");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jBtn10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn10.setText("5");
        jBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1343, 1343, 1343))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(540, 540, 540))))
        );

        jTabbedPane2.addTab("Calculator", jPanel10);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        jLabel2.setText(" RESTAURANT   MANAGEMENT   SYSTEM ...");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cost Of Drinks");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cost of Meal");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cost of Delivery");

        jlblcost1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblcost1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblcost1.setText("0");
        jlblcost1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblcost2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblcost2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblcost2.setText("0");
        jlblcost2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblcost3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblcost3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblcost3.setText("0");
        jlblcost3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblcost1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblcost2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblcost3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblcost1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblcost2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblcost3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ORDER NO");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CUSTOMER NAME");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("CONTACT NUMBER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 984, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(656, 656, 656))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jtxtDisplay.setText(jtxtDisplay.getText() + jButton10.getText());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn9.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn6.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn3.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
        String backspace = null;
        if (jtxtDisplay.getText().length() > 0) {
            
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
            backspace = strB.toString();
            jtxtDisplay.setText(backspace);

        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "/";

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn7.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn8.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn4.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn10ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn10.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn10ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn1.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn2.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String EnterNumber = jtxtDisplay.getText() + jBtn0.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jtxtDisplay.setText(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if (operations == "+" )
        {
            result = firstnum + secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);

        } else if (operations == "-") {
            result = firstnum - secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);

        } else if (operations == "*") {
            result = firstnum * secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);

        } else if (operations == "/") {
            result = firstnum / secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);

        } else if (operations == "%") {
            result = firstnum % secondnum;
            answer = String.format("%.2f", result);
            jtxtDisplay.setText(answer);

        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double Indian_Rupee = Double.parseDouble(jtxtconvertor.getText());
        if (jComboBox2.getSelectedItem().equals("Nigerian")) {

            String cConvert1 = String.format("N%.2f", Indian_Rupee * 5.26);
            jlblconvert.setText(cConvert1);

        }
        if (jComboBox2.getSelectedItem().equals("Kenyan")) {
            String cConvert2 = String.format("KS%.2f", Indian_Rupee * 1.47);

            jlblconvert.setText(cConvert2);

        }
        if (jComboBox2.getSelectedItem().equals("USA")) {
            String cConvert3 = String.format("$ %.2f", Indian_Rupee * 0.015);
            jlblconvert.setText(cConvert3);

        }
        if (jComboBox2.getSelectedItem().equals("Canada")) {
            String cConvert4 = String.format("C$ %.2f", Indian_Rupee * 0.019);
            jlblconvert.setText(cConvert4);

        }
        if (jComboBox2.getSelectedItem().equals("Brazil")) {
            String cConvert5 = String.format("Bra %.2f", Indian_Rupee * 0.056);
            jlblconvert.setText(cConvert5);

        }

        if (jComboBox2.getSelectedItem().equals("Philippine")) {
            String cConvert7 = String.format("PHP %.2f", Indian_Rupee * 0.78);
            jlblconvert.setText(cConvert7);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCmbDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDrinksActionPerformed

        double coke = 35;
        double pepsi = 35;
        double coffee = 50;
        double cold_coffee = 70;
        double tea = 20;
        double selectDrink = 0;

        if (jCmbDrinks.getSelectedItem().equals("selectDrink")) {
            String cselectDrink = String.format(" %.2f", selectDrink);
            jlblcost1.setText(cselectDrink);

        }

        if (jCmbDrinks.getSelectedItem().equals("coke")) {
            String ccoke = String.format(" %.2f", coke);
            jlblcost1.setText(ccoke);

        }
        if (jCmbDrinks.getSelectedItem().equals("pepsi")) {
            String cpepsi = String.format(" %.2f", pepsi);
            jlblcost1.setText(cpepsi);

        }

        if (jCmbDrinks.getSelectedItem().equals("coffee")) {
            String ccoffee = String.format(" %.2f", coffee);
            jlblcost1.setText(ccoffee);

        }
        if (jCmbDrinks.getSelectedItem().equals("cold_coffee")) {
            String ccold_coffee = String.format(" %.2f", cold_coffee);
            jlblcost1.setText(ccold_coffee);

        }
        if (jCmbDrinks.getSelectedItem().equals("select a drink")) {

            jlblcost1.setText(null);

        }

    }//GEN-LAST:event_jCmbDrinksActionPerformed

    private void jchkboxdelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jchkboxdelMouseClicked
        double iDelivery = 10;
        if (jchkboxdel.isSelected()) {
            String pDelivery = String.format("%.2f", iDelivery);
            jlblcost3.setText(pDelivery);
        } else {
            jlblcost3.setText("0");
        }
    }//GEN-LAST:event_jchkboxdelMouseClicked

    private void jBtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceiptActionPerformed


    }//GEN-LAST:event_jBtnReceiptActionPerformed

    private void jChicBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChicBurgerActionPerformed


    }//GEN-LAST:event_jChicBurgerActionPerformed

    private void jChicBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChicBurgerMouseClicked

        if (jtxtcbur.getText().length() > 0) {

            jChicBurger.isSelected();
        } else {
            JOptionPane.showMessageDialog(this, "Enter the quantity first");
            jChicBurger.setSelected(false);
        }

        double cMeal;

        {

            cMeal = Double.parseDouble(jlblcost2.getText());
            double ChicBurger = Double.parseDouble(jtxtcbur.getText());
            double iChicBurger = 100;

            if (jChicBurger.isSelected()) {

                i[1] = ((ChicBurger * iChicBurger) + cMeal);
                String pMeal = String.format(" %.2f", i[1]);
                jlblcost2.setText(pMeal);
            }
        }

    }//GEN-LAST:event_jChicBurgerMouseClicked


    private void jMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMealMouseClicked
        if (jtxtcmeal.getText().length() > 0) {

            jMeal.isSelected();
        } else {
            JOptionPane.showMessageDialog(this, "Enter the quantity first");
            jMeal.setSelected(false);
        }
        double cMeal = Double.parseDouble(jlblcost2.getText());
        double ChicBurgerMeal = Double.parseDouble(jtxtcmeal.getText());
        double iChicBurgerMeal = 200;

        if (jMeal.isSelected()) {
            i[2] = ((ChicBurgerMeal * iChicBurgerMeal) + cMeal);
            String pMeal = String.format(" %.2f", i[2]);
            jlblcost2.setText(pMeal);
        }
    }//GEN-LAST:event_jMealMouseClicked

    private void JVegBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JVegBurgerMouseClicked
        if (jtxtveg.getText().length() > 0) {

            JVegBurger.isSelected();
        } else {
            JOptionPane.showMessageDialog(this, "Enter the quantity first");
            JVegBurger.setSelected(false);
        }

        double cMeal = Double.parseDouble(jlblcost2.getText());
        double VegBurger = Double.parseDouble(jtxtveg.getText());
        double iVegBurger = 75;

        if (JVegBurger.isSelected()) {
            i[3] = ((VegBurger * iVegBurger) + cMeal);
            String pMeal = String.format(" %.2f", i[3]);
            jlblcost2.setText(pMeal);
        }
    }//GEN-LAST:event_JVegBurgerMouseClicked

    private void jtxtcburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcburActionPerformed

    }//GEN-LAST:event_jtxtcburActionPerformed

    private void jMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMealActionPerformed

    private void jBtnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnTotalMouseClicked
        double Total1 = Double.parseDouble(jlblcost1.getText());
        double Total2 = Double.parseDouble(jlblcost2.getText());
        double Total3 = Double.parseDouble(jlblcost3.getText());
        double Total4 = Double.parseDouble(jlbltax.getText());
        double Total6 = Double.parseDouble(jlblcost1.getText());
        double Total7 = Double.parseDouble(jlblcost2.getText());
        double Total8 = Double.parseDouble(jlblcost3.getText());

        double FinalTotal = (Total6 + Total7 + Total8) / 100;

        String iTotal = String.format(" %.2f", FinalTotal);
        jlbltax.setText(iTotal);

        double subTotal = (Total1 + Total2 + Total3);
        String isubTotal = String.format(" %.2f", subTotal);
        jlblsubtotal.setText(isubTotal);

        double FinalTotal1 = (Total1 + Total2 + Total3 + FinalTotal);
        String iTotal1 = String.format(" %.2f", FinalTotal1);
        jlbltotal.setText(iTotal1);
        jtxtconvertor.setText(jlbltotal.getText());

    }//GEN-LAST:event_jBtnTotalMouseClicked


    private void jBtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalActionPerformed

    }//GEN-LAST:event_jBtnTotalActionPerformed

    private void jlbltaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbltaxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbltaxMouseClicked

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed

        jlblcost1.setText("0");
        jlblsubtotal.setText(null);
        jlbltotal.setText(null);
        jlbltax.setText("0");
        jlblconvert.setText(null);
        jlblcost2.setText("0");
        jlblcost3.setText("0");
        jCmbDrinks.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jtxtarRec.setText(null);

        jChicBurger.setSelected(false);
        jMeal.setSelected(false);

        jchkboxdel.setSelected(false);
        jComboBox2.setSelectedIndex(0);
        jtxtconvertor.setText(null);
        jlblconvert.setText(null);
        JVegBurger.setSelected(false);

        jtxtcbur.setText(null);
        jtxtcmeal.setText(null);
        jtxtveg.setText(null);
        jtxtconvertor.setText(null);
        jlblconvert.setText(null);

        if (jtxtcbur.getText().length() > 0) {

            jChicBurger.isSelected();
        } else {
            JOptionPane.showMessageDialog(this, "Enter the quantity first");
            jChicBurger.setSelected(false);
        }

        double cMeal;

        {

            cMeal = Double.parseDouble(jlblcost2.getText());
            double ChicBurger = Double.parseDouble(jtxtcbur.getText());
            double iChicBurger = 100;

            if (jChicBurger.isSelected()) {

                i[1] = ((ChicBurger * iChicBurger) + cMeal);
                String pMeal = String.format(" %.2f", i[1]);
                jlblcost2.setText(pMeal);

            }
        }
        double Total1 = Double.parseDouble(jlblcost1.getText());
        double Total2 = Double.parseDouble(jlblcost2.getText());
        double Total3 = Double.parseDouble(jlblcost3.getText());
        double Total4 = Double.parseDouble(jlbltax.getText());
        double Total6 = Double.parseDouble(jlblcost1.getText());
        double Total7 = Double.parseDouble(jlblcost2.getText());
        double Total8 = Double.parseDouble(jlblcost3.getText());

        double FinalTotal = (Total6 + Total7 + Total8) / 100;

        String iTotal = String.format("INR %.2f", FinalTotal);
        jlbltax.setText(iTotal);

        double subTotal = (Total1 + Total2 + Total3);
        String isubTotal = String.format("INR %.2f", subTotal);
        jlblsubtotal.setText(isubTotal);

        double FinalTotal1 = (Total1 + Total2 + Total3 + FinalTotal);
        String iTotal1 = String.format("INR %.2f", FinalTotal1);
        jlbltotal.setText(iTotal1);


    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jtxtconvertor.setText(null);
        jlblconvert.setText(null);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBtnReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReceiptMouseClicked

        if (jtxtcbur.getText().length() == 0) {
            jtxtcbur.setText("0");
            jChicBurger.setSelected(true);

        }
        if (jtxtcmeal.getText().length() == 0) {
            jtxtcmeal.setText("0");
            jMeal.setSelected(true);

        }
        if (jtxtveg.getText().length() == 0) {

            jtxtveg.setText("0");
            JVegBurger.setSelected(true);
        }
        double Qty1 = Double.parseDouble(jtxtcbur.getText());
        double Qty2 = Double.parseDouble(jtxtcmeal.getText());
        double Qty3 = Double.parseDouble(jtxtveg.getText());

        jtxtarRec.append(" RESTAURANT MANAGEMENT SYSTEM :\t\t\n\n" + "\nChicken Burger:\t\t"
                + Qty1 + "\nMeal:\t\t\t" + Qty2 + "\nVeg Burger:\t\t\t" + Qty3 + "\n\n\tThankyou!!");

    }//GEN-LAST:event_jBtnReceiptMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jchkboxdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkboxdelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchkboxdelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

try
{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///order_s","root","");
            //Connection con = DriverManager.getConnection("jdbc:sqlserver://sharul/.sqlexpress:1434;database=order_s;userName=SHARUL/hp;password=");
            PreparedStatement ps = con.prepareStatement("insert into order_details values (?,?,?,?,?,?)");
            int order_no = Integer.parseInt(jTextField1.getText());
            float Tax = Float.parseFloat(jlbltax.getText());
            float Total = Float.parseFloat(jlbltotal.getText());
            
            ps.setInt(1, order_no);
            ps.setString(2, jTextField2.getText());
            ps.setString(3,  jTextField3.getText());
            
            ps.setString(4, jtxtarRec.getText());
            ps.setFloat(5, Tax);
            ps.setFloat(6, Total);
            ps.execute();
            JOptionPane.showMessageDialog(this, "Successfuly Saved");
            this.dispose();
            
        } 
          catch (Exception ex) {
           JOptionPane.showMessageDialog(this, ex);
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JVegBurger;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn10;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnReceipt;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jChicBurger;
    private javax.swing.JComboBox jCmbDrinks;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox jMeal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JCheckBox jchkboxdel;
    private javax.swing.JLabel jlblconvert;
    private javax.swing.JLabel jlblcost1;
    private javax.swing.JLabel jlblcost2;
    private javax.swing.JLabel jlblcost3;
    private javax.swing.JLabel jlblsubtotal;
    private javax.swing.JLabel jlbltax;
    private javax.swing.JLabel jlbltotal;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextArea jtxtarRec;
    private javax.swing.JTextField jtxtcbur;
    private javax.swing.JTextField jtxtcmeal;
    private javax.swing.JTextField jtxtconvertor;
    private javax.swing.JTextField jtxtveg;
    // End of variables declaration//GEN-END:variables
}
