/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tabelaverdade.View;

import com.mycompany.tabelaverdade.Util;
import com.mycompany.tabelaverdade.Controller.Formula;
import com.mycompany.tabelaverdade.Controller.FormulaValidator;
import com.mycompany.tabelaverdade.Model.LogicValue;
import com.mycompany.tabelaverdade.Model.Repository;

import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author luizc
 */
public class ResultadoExpressao extends javax.swing.JFrame {
    public static final HashSet<String> openedFormulas = new HashSet<String>();
    public static final int MAX_VARIAVEIS = 5;
    
    private static boolean isFormulaAlreadyOpen(String formula){ return ResultadoExpressao.openedFormulas.contains(formula); }
    
    /**
     * Creates new form ResultadoExpressao
     */
    
    Formula formula = null;
    
    private String[] variables;
    
    private String[][] variablesTruthValues = null;
    @SuppressWarnings("unused")
    private String[] formulaTruthValues = null; //De acordo com cada linha da tabela verdade
    
    private String expression;
    
    private void populateVariablesTruthValues(){
        String truthValues[][] = new String[(int)Math.pow(2, this.variables.length)][this.variables.length];
        int totalIterationsPerRow = (int)Math.pow(2, this.variables.length);
        
        for (int i = 0; i < this.variables.length; i++){
            int interval = (int)Math.pow(2, this.variables.length - (i + 1));
            String value = "Verdadeiro";
            
            int counter = 0;
            for (int j = 0; j < totalIterationsPerRow; j++){
                if (counter == interval){
                    if (value.equals("Verdadeiro")) value = "Falso";
                    else if (value.equals("Falso")) value = "Verdadeiro";
                    
                    counter = 0;
                }
                
                truthValues[j][i] = value;
                counter += 1;
            }
        }
        
        this.variablesTruthValues = truthValues;
    }
    
    private void evaluateFormula(){
        if (this.variablesTruthValues == null) return;
       
        for (int row = 0; row < this.variablesTruthValues.length; row++){
            HashMap<Character, LogicValue> atomicValues = new HashMap<>();
            
            for (int column = 0; column < this.variables.length; column++){
                int logicValue = 0;
                
                if (this.TabelaVerdade.getValueAt(row, column).equals("Verdadeiro")) logicValue = 1;
         
                atomicValues.put(this.variables[column].charAt(0), new LogicValue(logicValue));
            }
            
            LogicValue result = this.formula.evaluate(atomicValues);
            
            if (result.get() == 1) this.TabelaVerdade.setValueAt("Verdadeiro", row, this.variables.length);
            else this.TabelaVerdade.setValueAt("Falso", row, this.variables.length);
        }
    }
    
    public void setTruthTable(){
        String labels[] = new String[this.variables.length + 1];
        populateVariablesTruthValues();
        
        //Populando os rótulos da tabela
        labels[this.variables.length] = this.expression;
        for (int i = 0; i < this.variables.length; i++) labels[i] = this.variables[i];
        
        DefaultTableModel m = new DefaultTableModel(this.variablesTruthValues, labels){
            @Override
            public boolean isCellEditable(int row, int column) { return false; } // Fazendo com que não seja possível modificar as células da tabela
        };
        this.TabelaVerdade.setModel(m);
        
        evaluateFormula();
    } 
    
    private void setCellsColor(){
        if (this.variablesTruthValues == null) return;
        
        TableCellRenderer coloredCells = new CustomRendererForTruthTable();
        this.TabelaVerdade.setDefaultRenderer(Object.class, coloredCells);
    }
   
    private boolean extractVariables(){
        FormulaValidator.ValidationInfo formulaInfos = this.formula.getFormulaInfos();
        
        HashSet<String> variablesSet = new HashSet<String>();
        for (Character c: formulaInfos.atomicIdxs.values()){variablesSet.add(c.toString());}
        
        if (variablesSet.size() > ResultadoExpressao.MAX_VARIAVEIS) { Util.ERROR("Quantidade de fórmulas atómicas deve ser menor ou igual a 5!"); return false; }
        
        this.variables = new String[variablesSet.size()];
        variablesSet.toArray(this.variables);
        
        return true;
    }
    
    private void save(){
        Repository.saveFormula(this.expression);
    }
    
    public ResultadoExpressao(String formula) {
        Formula f = null;
        
        try {f = new Formula(formula);} 
        catch (Exception e) { Util.ERROR("Fórmula inválida!"); return; }
        
        if (ResultadoExpressao.isFormulaAlreadyOpen(f.getFormula())){
            Util.ERROR("Já existe uma tabela verdade para esta fórmula aberta!");
            return;
        }
        
        this.formula = f;
        if (!extractVariables()) return;
        this.expression = f.getFormula();

        initComponents();
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.TabelaVerdade.getTableHeader().setReorderingAllowed(false);
        
        super.setVisible(true);
        setTruthTable();
        setCellsColor();
        
        ResultadoExpressao.openedFormulas.add(this.expression);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaVerdade = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabela Verdade");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        TabelaVerdade.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        TabelaVerdade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelaVerdade);

        SaveButton.setBackground(new java.awt.Color(102, 204, 0));
        SaveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Salvar");
        SaveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SaveButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveButton)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseReleased
        this.save();
    }//GEN-LAST:event_SaveButtonMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ResultadoExpressao.openedFormulas.remove(this.expression);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveButton;
    private javax.swing.JTable TabelaVerdade;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
