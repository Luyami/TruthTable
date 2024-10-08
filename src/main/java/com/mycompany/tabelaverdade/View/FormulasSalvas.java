/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tabelaverdade.View;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import com.mycompany.tabelaverdade.Model.Repository;

/**
 * Representa a interface gráfica do gerenciador de fórmulas salvas
 */
public class FormulasSalvas extends javax.swing.JFrame {
    private static FormulasSalvas activeWindow = null;
    private static final DefaultListModel<String> loadedFormulasModel = new DefaultListModel<String>();
    
    /**
     * Carrega todas as fórmulas salvas na interface gráfica
     */
    public static void loadListModel(){
        for (String c: Repository.getSavedFormulas()) FormulasSalvas.loadedFormulasModel.addElement(c);
    }
    
    /**
     * Adiciona ou Deleta uma fórmula da interface gráfica (atualizando-a em seguida)
     * @param formula fórmula a ser adicionada ou deletada
     * @param Operation Operação de adicionar fórmula ("ADD") ou deletar fórmula ("DEL")
     */
    public static void updateListModel(String formula, String Operation){
        if (Operation == "ADD"){
            if (FormulasSalvas.loadedFormulasModel.contains(formula)) return;
            
            FormulasSalvas.loadedFormulasModel.addElement(formula);
            if (FormulasSalvas.activeWindow != null) FormulasSalvas.activeWindow.ListaFormulas.setModel(FormulasSalvas.loadedFormulasModel);
        }
        else if (Operation == "DEL"){
            if (!FormulasSalvas.loadedFormulasModel.contains(formula)) return;
            
            FormulasSalvas.loadedFormulasModel.removeElement(formula);
            if (FormulasSalvas.activeWindow != null) FormulasSalvas.activeWindow.ListaFormulas.setModel(FormulasSalvas.loadedFormulasModel);
        }
    }
    
    /**
     * Creates new form FormulasSalvas
     */
    public FormulasSalvas() {
        if (FormulasSalvas.activeWindow != null) return;
        
        initComponents();
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        super.setVisible(true);
        this.ListaFormulas.setModel(FormulasSalvas.loadedFormulasModel);
        this.ListaFormulas.setCellRenderer(new CustomRendererForFormulasList());
        
        FormulasSalvas.activeWindow = this;    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaFormulas = new javax.swing.JList<>();
        OpenFormulaButton = new javax.swing.JButton();
        DeleteFormulaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fórmulas Salvas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ListaFormulas.setBackground(new java.awt.Color(0, 0, 0));
        ListaFormulas.setBorder(null);
        ListaFormulas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaFormulas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListaFormulas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(ListaFormulas);

        OpenFormulaButton.setBackground(new java.awt.Color(102, 255, 102));
        OpenFormulaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OpenFormulaButton.setForeground(new java.awt.Color(255, 255, 255));
        OpenFormulaButton.setText("Abrir");
        OpenFormulaButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OpenFormulaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                OpenFormulaButtonMouseReleased(evt);
            }
        });

        DeleteFormulaButton.setBackground(new java.awt.Color(255, 51, 51));
        DeleteFormulaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteFormulaButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteFormulaButton.setText("Deletar");
        DeleteFormulaButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteFormulaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DeleteFormulaButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OpenFormulaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(DeleteFormulaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpenFormulaButton)
                    .addComponent(DeleteFormulaButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FormulasSalvas.activeWindow = null;
    }//GEN-LAST:event_formWindowClosing

    @SuppressWarnings("unused")
    private void OpenFormulaButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenFormulaButtonMouseReleased
        if (this.ListaFormulas.getSelectedValue() == null) return;
        
        ResultadoExpressao r = new ResultadoExpressao(this.ListaFormulas.getSelectedValue());
    }//GEN-LAST:event_OpenFormulaButtonMouseReleased

    private void DeleteFormulaButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteFormulaButtonMouseReleased
        Repository.deleteFormula(this.ListaFormulas.getSelectedValue());
    }//GEN-LAST:event_DeleteFormulaButtonMouseReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteFormulaButton;
    private javax.swing.JList<String> ListaFormulas;
    private javax.swing.JButton OpenFormulaButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
