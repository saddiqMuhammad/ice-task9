/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.work;

import javax.swing.JOptionPane;

/**
 *
 * @author TECH DEALZ
 */
public class Work {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your First number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second number"));
    
        int choice = 1;
        
        while(choice!=0){
            choice = Integer.parseInt(JOptionPane.showInputDialog("Choose an operation:\n.Add\n2.Subtract\n3.Divide\n4.Multiply\n0.Exit"));
        switch(choice){
            case 1:
                
        JOptionPane.showMessageDialog(null,"Result:" + calculator.add(num1,num2));
                break;
                case 2:
                    
        JOptionPane.showMessageDialog(null,"Result:" + calculator.subtract(num1,num2));
                break;
                case 3:
        
        JOptionPane.showMessageDialog(null,"Result:" + calculator.divide(num1,num2)); 
                break;
                case 4:
                    
        JOptionPane.showMessageDialog(null,"Result:" + calculator.multiply(num1,num2)); 
                break;
                case 0:
        
        JOptionPane.showMessageDialog(null,"Invalid calculator...");
                break;
                default:
                    
        JOptionPane.showMessageDialog(null,"Invalid choice.Please try again.");
        
        }
        }
    }
}
                            
                           
                
                    
        
        
        
   
