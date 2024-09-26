/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tabelaverdade.View;

import com.mycompany.tabelaverdade.Controller.Formula;
import com.mycompany.tabelaverdade.Model.Repository;

/**
 *
 * @author luizc
 */
public class Calculadora extends javax.swing.JFrame {        
    /**
     * Creates new form InterfaceGrafica
     */
    public Calculadora() {
        initComponents();
    }
    
    static{
        Repository.loadFormulas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ExpressionTextField = new javax.swing.JTextField();
        OrButton = new javax.swing.JButton();
        AndButton = new javax.swing.JButton();
        EvaluateButton = new javax.swing.JButton();
        IfButton = new javax.swing.JButton();
        NotButton = new javax.swing.JButton();
        CVarButton = new javax.swing.JButton();
        AVarButton = new javax.swing.JButton();
        RPVarButton = new javax.swing.JButton();
        BVarButton = new javax.swing.JButton();
        DVarButton = new javax.swing.JButton();
        EVarButton = new javax.swing.JButton();
        LPVarButton = new javax.swing.JButton();
        SavedFormulasButton = new javax.swing.JButton();
        EQVarButton = new javax.swing.JButton();
        BackspaceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Expressões");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 204, 0));
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 500));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NotButton1KeyPressed(evt);
            }
        });

        ExpressionTextField.setBackground(new java.awt.Color(204, 204, 255));
        ExpressionTextField.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        OrButton.setBackground(new java.awt.Color(51, 51, 51));
        OrButton.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        OrButton.setForeground(new java.awt.Color(255, 255, 255));
        OrButton.setText("+");
        OrButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                OrButtonMouseReleased(evt);
            }
        });
        OrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrButtonActionPerformed(evt);
            }
        });

        AndButton.setBackground(new java.awt.Color(51, 51, 51));
        AndButton.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        AndButton.setForeground(new java.awt.Color(255, 255, 255));
        AndButton.setText("*");
        AndButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AndButtonMouseReleased(evt);
            }
        });
        AndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndButtonActionPerformed(evt);
            }
        });

        EvaluateButton.setBackground(new java.awt.Color(51, 255, 51));
        EvaluateButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        EvaluateButton.setText("✓");
        EvaluateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EvaluateButtonMouseReleased(evt);
            }
        });
        EvaluateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvaluateButtonActionPerformed(evt);
            }
        });

        IfButton.setBackground(new java.awt.Color(51, 51, 51));
        IfButton.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        IfButton.setForeground(new java.awt.Color(255, 255, 255));
        IfButton.setText(">");
        IfButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                IfButtonMouseReleased(evt);
            }
        });
        IfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IfButtonActionPerformed(evt);
            }
        });

        NotButton.setBackground(new java.awt.Color(51, 51, 51));
        NotButton.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        NotButton.setForeground(new java.awt.Color(255, 255, 255));
        NotButton.setText("~");
        NotButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NotButtonMouseReleased(evt);
            }
        });
        NotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotButtonActionPerformed(evt);
            }
        });

        CVarButton.setBackground(new java.awt.Color(51, 51, 51));
        CVarButton.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        CVarButton.setForeground(new java.awt.Color(255, 255, 255));
        CVarButton.setText("C");
        CVarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CVarButtonMouseReleased(evt);
            }
        });
        CVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVarButtonActionPerformed(evt);
            }
        });

        AVarButton.setBackground(new java.awt.Color(51, 51, 51));
        AVarButton.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        AVarButton.setForeground(new java.awt.Color(255, 255, 255));
        AVarButton.setText("A");
        AVarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AVarButtonMouseReleased(evt);
            }
        });
        AVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AVarButtonActionPerformed(evt);
            }
        });

        RPVarButton.setBackground(new java.awt.Color(51, 51, 51));
        RPVarButton.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        RPVarButton.setForeground(new java.awt.Color(255, 255, 255));
        RPVarButton.setText("(");
        RPVarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RPVarButtonMouseReleased(evt);
            }
        });
        RPVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPVarButtonActionPerformed(evt);
            }
        });

        BVarButton.setBackground(new java.awt.Color(51, 51, 51));
        BVarButton.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        BVarButton.setForeground(new java.awt.Color(255, 255, 255));
        BVarButton.setText("B");
        BVarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BVarButtonMouseReleased(evt);
            }
        });
        BVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVarButtonActionPerformed(evt);
            }
        });

        DVarButton.setBackground(new java.awt.Color(51, 51, 51));
        DVarButton.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        DVarButton.setForeground(new java.awt.Color(255, 255, 255));
        DVarButton.setText("D");
        DVarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DVarButtonMouseReleased(evt);
            }
        });
        DVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DVarButtonActionPerformed(evt);
            }
        });

        EVarButton.setBackground(new java.awt.Color(51, 51, 51));
        EVarButton.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        EVarButton.setForeground(new java.awt.Color(255, 255, 255));
        EVarButton.setText("E");
        EVarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EVarButtonMouseReleased(evt);
            }
        });
        EVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVarButtonActionPerformed(evt);
            }
        });

        LPVarButton.setBackground(new java.awt.Color(51, 51, 51));
        LPVarButton.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        LPVarButton.setForeground(new java.awt.Color(255, 255, 255));
        LPVarButton.setText(")");
        LPVarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LPVarButtonMouseReleased(evt);
            }
        });
        LPVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPVarButtonActionPerformed(evt);
            }
        });

        SavedFormulasButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SavedFormulasButton.setText("Fórmulas Salvas");
        SavedFormulasButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SavedFormulasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SavedFormulasButtonMouseReleased(evt);
            }
        });

        EQVarButton.setBackground(new java.awt.Color(51, 51, 51));
        EQVarButton.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        EQVarButton.setForeground(new java.awt.Color(255, 255, 255));
        EQVarButton.setText("=");
        EQVarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EQVarButtonMouseReleased(evt);
            }
        });
        EQVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQVarButtonActionPerformed(evt);
            }
        });

        BackspaceButton.setBackground(new java.awt.Color(255, 0, 51));
        BackspaceButton.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        BackspaceButton.setText("←");
        BackspaceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackspaceButtonMouseReleased(evt);
            }
        });
        BackspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackspaceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(SavedFormulasButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpressionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AndButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EQVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RPVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LPVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackspaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EvaluateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(ExpressionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AndButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EQVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RPVarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackspaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvaluateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(SavedFormulasButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrButtonActionPerformed

    private void AndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AndButtonActionPerformed

    private void EvaluateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvaluateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EvaluateButtonActionPerformed

    private void IfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IfButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IfButtonActionPerformed

    private void NotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotButtonActionPerformed

    private void CVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CVarButtonActionPerformed

    private void AVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AVarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AVarButtonActionPerformed

    private void RPVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPVarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RPVarButtonActionPerformed

    private void BVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BVarButtonActionPerformed

    private void DVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DVarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DVarButtonActionPerformed

    private void NotButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NotButton1KeyPressed
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "~");
    }//GEN-LAST:event_NotButton1KeyPressed

    private void EVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EVarButtonActionPerformed

    private void LPVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPVarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LPVarButtonActionPerformed

    private void OrButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "+");
    }//GEN-LAST:event_OrButtonMouseReleased

    private void IfButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IfButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + ">");
    }//GEN-LAST:event_IfButtonMouseReleased

    private void AndButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AndButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "*");
    }//GEN-LAST:event_AndButtonMouseReleased

    private void NotButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "~");
    }//GEN-LAST:event_NotButtonMouseReleased

    private void AVarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AVarButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "A");
    }//GEN-LAST:event_AVarButtonMouseReleased

    private void BVarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVarButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "B");
    }//GEN-LAST:event_BVarButtonMouseReleased

    private void CVarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CVarButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "C");
    }//GEN-LAST:event_CVarButtonMouseReleased

    private void DVarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DVarButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "D");
    }//GEN-LAST:event_DVarButtonMouseReleased

    private void EVarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EVarButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "E");
    }//GEN-LAST:event_EVarButtonMouseReleased

    private void RPVarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RPVarButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "(");
    }//GEN-LAST:event_RPVarButtonMouseReleased

    private void LPVarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPVarButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + ")");
    }//GEN-LAST:event_LPVarButtonMouseReleased

    @SuppressWarnings("unused")
    private void EvaluateButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EvaluateButtonMouseReleased
        Formula f = null;
        
        ResultadoExpressao r = new ResultadoExpressao(this.ExpressionTextField.getText());
    }//GEN-LAST:event_EvaluateButtonMouseReleased

    @SuppressWarnings("unused")
    private void SavedFormulasButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavedFormulasButtonMouseReleased
        FormulasSalvas fs = new FormulasSalvas();
    }//GEN-LAST:event_SavedFormulasButtonMouseReleased

    private void EQVarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EQVarButtonMouseReleased
        String currentText = ExpressionTextField.getText();
        ExpressionTextField.setText(currentText + "=");
    }//GEN-LAST:event_EQVarButtonMouseReleased

    private void EQVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQVarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EQVarButtonActionPerformed

    private void BackspaceButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackspaceButtonMouseReleased
        String currentText = this.ExpressionTextField.getText();
        if (currentText.length() == 0) return; 
        
        String lastCharRemoved = currentText.substring(0, currentText.length() - 1);
        
        this.ExpressionTextField.setText(lastCharRemoved);
    }//GEN-LAST:event_BackspaceButtonMouseReleased

    private void BackspaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackspaceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackspaceButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AVarButton;
    private javax.swing.JButton AndButton;
    private javax.swing.JButton BVarButton;
    private javax.swing.JButton BackspaceButton;
    private javax.swing.JButton CVarButton;
    private javax.swing.JButton DVarButton;
    private javax.swing.JButton EQVarButton;
    private javax.swing.JButton EVarButton;
    private javax.swing.JButton EvaluateButton;
    private javax.swing.JTextField ExpressionTextField;
    private javax.swing.JButton IfButton;
    private javax.swing.JButton LPVarButton;
    private javax.swing.JButton NotButton;
    private javax.swing.JButton OrButton;
    private javax.swing.JButton RPVarButton;
    private javax.swing.JButton SavedFormulasButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
