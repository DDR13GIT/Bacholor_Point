/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hello iT
 */
public class AUST_CGPA3 extends javax.swing.JFrame {

    /**
     * Creates new form AUST_CGPA2
     */
    public AUST_CGPA3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ELL = new javax.swing.JTextField();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        SD = new javax.swing.JTextField();
        L3 = new javax.swing.JLabel();
        DSL = new javax.swing.JTextField();
        L4 = new javax.swing.JLabel();
        DLL = new javax.swing.JTextField();
        Submit2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        HUMT = new javax.swing.JTextField();
        T2 = new javax.swing.JLabel();
        MATHT = new javax.swing.JTextField();
        T3 = new javax.swing.JLabel();
        ETT = new javax.swing.JTextField();
        T4 = new javax.swing.JLabel();
        DST = new javax.swing.JTextField();
        T5 = new javax.swing.JLabel();
        DLDT = new javax.swing.JTextField();
        T6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        DepLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        semLabel = new javax.swing.JLabel();
        CGLabel = new javax.swing.JLabel();
        Comment = new javax.swing.JLabel();
        formPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 10, 0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("AUST");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel2.setText("CGPA CALCULATOR");

        jLabel7.setFont(new java.awt.Font("vtks distress", 0, 24)); // NOI18N
        jLabel7.setText("CGPA FORM 2 year 1 semester");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("vtks distress", 0, 36)); // NOI18N
        jLabel8.setText("LAB PART:");

        ELL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ELL.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        L1.setText("EEE_II:");

        L2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        L2.setText("SD_II:");

        SD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SD.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        L3.setText("Data Structure Lab:");

        DSL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DSL.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        L4.setText("Digital Logic Lab:");

        DLL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DLL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLLActionPerformed(evt);
            }
        });

        Submit2.setBackground(new java.awt.Color(0, 255, 102));
        Submit2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Submit2.setText("Submit");
        Submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L1)
                    .addComponent(L2)
                    .addComponent(L3)
                    .addComponent(L4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SD, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DLL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ELL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(DSL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ELL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(SD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3)
                    .addComponent(DSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4)
                    .addComponent(DLL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submit2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel10.setFont(new java.awt.Font("vtks distress", 0, 36)); // NOI18N
        jLabel10.setText("Theory PART:");

        HUMT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        HUMT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HUMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HUMTActionPerformed(evt);
            }
        });

        T2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        T2.setText("MATH-III:");

        MATHT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MATHT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        T3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        T3.setText("EEE_II:");

        ETT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ETT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        T4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        T4.setText("Data Structure:");

        DST.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DST.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSTActionPerformed(evt);
            }
        });

        T5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        T5.setText("Digital Logic Design:");

        DLDT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DLDT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        T6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        T6.setText("HUM:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T2)
                    .addComponent(T3)
                    .addComponent(T4)
                    .addComponent(T5)
                    .addComponent(T6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DST)
                    .addComponent(HUMT)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ETT, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(MATHT))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(DLDT))
                .addGap(121, 121, 121))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HUMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T2)
                    .addComponent(MATHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T3)
                    .addComponent(ETT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T4)
                    .addComponent(DST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T5)
                    .addComponent(DLDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("vtks distress", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("RESULT");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Name:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Department:");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("ID:");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("Semester:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("CGPA:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("Comment:");

        NameLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        DepLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DepLabel.setText("Name:");

        idLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        idLabel.setText("Name:");

        semLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        semLabel.setText("Name:");

        CGLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CGLabel.setText("Name:");

        Comment.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Comment.setText("Name:");

        formPage.setBackground(new java.awt.Color(51, 51, 255));
        formPage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        formPage.setText("Form Page");
        formPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Comment)
                            .addComponent(CGLabel)
                            .addComponent(semLabel)
                            .addComponent(idLabel)
                            .addComponent(DepLabel)
                            .addComponent(NameLabel)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(formPage)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(DepLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(semLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(CGLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Comment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formPage)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DSTActionPerformed

    private void HUMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HUMTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HUMTActionPerformed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed
        // TODO add your handling code here:
        //AUST_CGPA a = new AUST_CGPA();

        double humt = Double.parseDouble(HUMT.getText());
        double matht = Double.parseDouble(MATHT.getText());
        double ett = Double.parseDouble(ETT.getText());
        double dst = Double.parseDouble(DST.getText());
        double dldt = Double.parseDouble(DLDT.getText());

        double ell = Double.parseDouble(ELL.getText());
        double sd = Double.parseDouble(SD.getText());
        double dsl = Double.parseDouble(DSL.getText());
        double dll = Double.parseDouble(DLL.getText());

        //        Double d = new Double(javat);
        //        Double dm = new Double(dmt);
        //        Double me = new Double(met);
        //        Double math = new Double(mt);
        //        Double eee = new Double(eeet);

        double totalcg=(((humt*3.00)+(matht*3.00)+(ett*3.00)+(dst*3.00)+(dldt*3.00))+((ell*1.5)+(1.5*dsl)+(sd*0.75)+(1.5*dll)))/(20.25);

        if(totalcg==4.00)
        Comment.setText(AUST_CGPA.name+" Google google sob bhai tomar jonno");
        else if(totalcg>=3.80)
        {
            Comment.setText(AUST_CGPA.name+" Google Amazon e job niye cinta nai lege thako");
        }
       else if(totalcg>=3.60)
        {
            Comment.setText(AUST_CGPA.name+" Aust er gorbo tumi ar lege thako");
        }
       else if(totalcg>=3.5)
        {
            Comment.setText(AUST_CGPA.name+" tomar future ache carkti niye cinta nai");
        }
       else if(totalcg>=3)
        {
            Comment.setText(AUST_CGPA.name+" Skill jodi thake tahole cakri niye cinta nai");
        }
       else if(totalcg<3)
        {
            Comment.setText(AUST_CGPA.name+" doya kore Arittra er moto hoiyo na samne aro hard work koro");
        }
        NameLabel.setText("" + AUST_CGPA.name);
        DepLabel.setText("" + AUST_CGPA.dep);
        idLabel.setText("" + AUST_CGPA.id);
        semLabel.setText("" + AUST_CGPA.sem);
        CGLabel.setText(""+totalcg);

    }//GEN-LAST:event_Submit2ActionPerformed

    private void DLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DLLActionPerformed

    private void formPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formPageActionPerformed
        AUST_CGPA aust = new AUST_CGPA();
        aust.setVisible(true);
        dispose();
    }//GEN-LAST:event_formPageActionPerformed
    //work on submit button
    
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
            java.util.logging.Logger.getLogger(AUST_CGPA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AUST_CGPA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AUST_CGPA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AUST_CGPA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AUST_CGPA2().setVisible(true);
            }
        });
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CGLabel;
    private javax.swing.JLabel Comment;
    private javax.swing.JTextField DLDT;
    private javax.swing.JTextField DLL;
    private javax.swing.JTextField DSL;
    private javax.swing.JTextField DST;
    private javax.swing.JLabel DepLabel;
    private javax.swing.JTextField ELL;
    private javax.swing.JTextField ETT;
    private javax.swing.JTextField HUMT;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JTextField MATHT;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField SD;
    private javax.swing.JButton Submit2;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JLabel T5;
    private javax.swing.JLabel T6;
    private javax.swing.JButton formPage;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel semLabel;
    // End of variables declaration//GEN-END:variables
}
