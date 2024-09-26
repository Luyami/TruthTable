package com.mycompany.tabelaverdade.Model;

/**
 * Armazena as informações relativas à função e a precedência de um operador em uma expressão lógica
 */
public class LogicOperations{
    /**
     * Representa a prioridade de cada operador
     */
    public enum Priority{
        NOT(4, '~'),
        AND(3, '*'),
        OR(2, '+'),
        IMP(1, '>'),
        EQ(0, '=');

        public int priority;
        public char identifier;

        Priority(int priority, char identifier) {
            this.priority = priority;
            this.identifier = identifier;
        }

        public int getPriority() {return this.priority;}
    }

    /***
     * @param operator
     * @return Precedência de um operador
     */
    public static int getPriority(char operator){
        for (Priority p: Priority.values()){
            if (p.identifier == operator) return p.priority;
        }

        return -1;
    }


    /**
     * Realiza a operação (~A)
     * @param val
     * @return Negação de uma expressão
     */
    public static LogicValue NOT(LogicValue val){
        LogicValue result = new LogicValue(0);

        if (val.get() == 0) result.set(1);
        
        return result;
    }


    /**
     * Realiza a operação (A e B)
     * @param left
     * @param right
     * @return Conjunção de uma expressão
     */
    public static LogicValue AND(LogicValue left, LogicValue right){
        LogicValue result = new LogicValue(0);

        if (left.get() == 1 && right.get() == 1) result.set(1);

        return result;
    }

    /**
     * Realiza a operação (A ou B)
     * @param left
     * @param right
     * @return Disjunção de uma expressão
     */
    public static LogicValue OR(LogicValue left, LogicValue right){
        LogicValue result = new LogicValue(0);

        if (left.get() == 1 || right.get() == 1) result.set(1);

        return result;
    }

    /**
     * Realiza a operação (A -> B)
     * @param left
     * @param right
     * @return Implicação de uma expressão
     */
    public static LogicValue IMP(LogicValue left, LogicValue right){
        LogicValue result = new LogicValue(0);

        if (OR( NOT(left), right ).get() == 1) result.set(1);
        
        return result;
    }
    
    /**
     * Realiza a operação (A <-> B)
     * @param left
     * @param right
     * @return Equivalência de uma expressão
     */
    public static LogicValue EQ(LogicValue left, LogicValue right){
        LogicValue result = new LogicValue(0);

        if (left.get() == right.get()) result.set(1);

        return result;
    }
}
