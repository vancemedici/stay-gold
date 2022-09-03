/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newinfo;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class NewInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        if (age < 60) {
            JOptionPane.showMessageDialog(null, "Vá para a fila comum");
        } else if (age >= 60 && age <= 80) {
            JOptionPane.showMessageDialog(null, "Vá para a fila prioritária");
        }
        else{
            JOptionPane.showMessageDialog(null, "Vá para a fila 80+");
        }
    }

}
