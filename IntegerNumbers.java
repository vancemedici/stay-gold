/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integernumbers;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class IntegerNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, plus, times;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número inteiro"));
        if (num1 == num2) {
            plus = num1 + num2;
            JOptionPane.showMessageDialog(null, "A soma desses números é igual à " + plus);
        } else {
            times = num1 * num2;
            JOptionPane.showMessageDialog(null, "O produto desses números é igual à " + times);
        }
    }
}
