package com.mycompany.tabelaverdade;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Métodos úteis a todas as classes
 */
public class Util {
    /**
     * Exibe uma caixa gráfica de erro
     * @param message Erro a ser exibido
     */
    public static void ERROR(String message){
        JFrame f = new JFrame();
        f.setAlwaysOnTop(true);
        f.requestFocus();
        
        JOptionPane.showMessageDialog(f, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Exibe uma caixa gráfica de aviso
     * @param message Aviso a ser exibido
     */
    public static void WARNING(String message){
        JFrame f = new JFrame();
        f.setAlwaysOnTop(true);
        f.requestFocus();
        
        
        JOptionPane.showMessageDialog(f, message, "Warning", JOptionPane.WARNING_MESSAGE);
    }
}
