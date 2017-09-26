/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author 715583
 */
public class Calculator implements Serializable{
    
    private double first;
    private double second;
    private char operator;

    public Calculator() {
    }

    public Calculator(double first, double second, char operator) {
        this.first = first;
        this.second = second;
        this.operator = operator;
        this.calculate();
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public char getOperator() {
        return operator;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    
    public int calculate()
    {
        double result = 0;
         switch (operator)
            {
                case '+': result = first + second;
                    break;
                case '-': result = first - second;
                    break;
                case '*': result = first * second;
                    break;
                case '%': result = first % second;
                    break;
            }
         return (int)result;
    }
    
}
