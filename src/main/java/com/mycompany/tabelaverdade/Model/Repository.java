package com.mycompany.tabelaverdade.Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

import com.mycompany.tabelaverdade.Util;
import com.mycompany.tabelaverdade.View.FormulasSalvas;

/**
 * Controla todas as operações relativas ao salvamento e carregamento de fórmulas salvas da calculadora
 */
public class Repository {
    private static HashSet<String> savedFormulas = new HashSet<String>();
    private static final String filename = "FormulasSalvas.ser";

    public static HashSet<String> getSavedFormulas() { return Repository.savedFormulas; }
    
    private static void serializeFormulas(){
        try{   
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
             
            out.writeObject(savedFormulas);
             
            out.close();
            file.close();
        } catch(Exception e) {}
    }
    
    @SuppressWarnings("unchecked")
    private static void deserializeFormulas(){
        try{   
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
             
            Repository.savedFormulas = (HashSet<String>)in.readObject();
             
            in.close();
            file.close();
        } catch (Exception e) {}
    }
    
    @SuppressWarnings("unused")
    private static void clearSerializedFormulas(){
        Repository.savedFormulas = new HashSet<String>();
        Repository.serializeFormulas();
    }
    
    /**
     * Retira uma fórmula do banco de fórmulas
     * @param formula
     */
    public static void deleteFormula(String formula){
        if (!Repository.savedFormulas.contains(formula)) return;
        
        Repository.savedFormulas.remove(formula);
        Repository.serializeFormulas();
        
        FormulasSalvas.updateListModel(formula, "DEL");
    }
    
    /**
     * Adiciona uma nova fórmula ao banco de fórmulas
     * @param formula
     */
    public static void saveFormula(String formula){
        if (Repository.savedFormulas.contains(formula)) Util.ERROR("Fórmula já salva!");
        else{
            Repository.savedFormulas.add(formula);
            Repository.serializeFormulas();
            
            FormulasSalvas.updateListModel(formula, "ADD");
            
            Util.WARNING("Fórmula salva com sucesso!");
        }
    }
    
    /**
     * Deserializa as fórmulas armazenadas no banco de fórmulas e atualiza elas na interface gráfica
     */
    public static void loadFormulas(){
        Repository.deserializeFormulas();
        
        FormulasSalvas.loadListModel();
    }
}
