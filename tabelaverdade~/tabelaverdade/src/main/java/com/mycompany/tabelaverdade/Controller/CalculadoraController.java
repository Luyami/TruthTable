package com.mycompany.tabelaverdade.Controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

import com.mycompany.tabelaverdade.Util;
import com.mycompany.tabelaverdade.View.FormulasSalvas;

public class CalculadoraController {
    private static HashSet<String> savedFormulas = new HashSet<String>();
    private static final String filename = "FormulasSalvas.ser";

    public static HashSet<String> getSavedFormulas() { return CalculadoraController.savedFormulas; }
    
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
             
            CalculadoraController.savedFormulas = (HashSet<String>)in.readObject();
             
            in.close();
            file.close();
        } catch (Exception e) {}
    }
    
    @SuppressWarnings("unused")
    private static void clearSerializedFormulas(){
        CalculadoraController.savedFormulas = new HashSet<String>();
        CalculadoraController.serializeFormulas();
    }
    
    public static void deleteFormula(String formula){
        if (!CalculadoraController.savedFormulas.contains(formula)) return;
        
        CalculadoraController.savedFormulas.remove(formula);
        CalculadoraController.serializeFormulas();
        
        FormulasSalvas.updateListModel(formula, "DEL");
    }
    
    public static void saveFormula(String formula){
        if (CalculadoraController.savedFormulas.contains(formula)) Util.ERROR("Fórmula já salva!");
        else{
            CalculadoraController.savedFormulas.add(formula);
            CalculadoraController.serializeFormulas();
            
            FormulasSalvas.updateListModel(formula, "ADD");
            
            Util.WARNING("Fórmula salva com sucesso!");
        }
    }
    
    public static void loadFormulas(){
        CalculadoraController.deserializeFormulas();
        
        FormulasSalvas.loadListModel();
    }
}
