/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valecard;

import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class ValeCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int license_plate;
        do {
            license_plate = Integer.parseInt(JOptionPane.showInputDialog("Informe o último dígito da placa de seu veículo"));
            switch (license_plate) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Pagamento até 30/04", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/05", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Pagamento até 30/06", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/07", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/08", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Pagamento até 30/09", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/10", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Pagamento até 30/11", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 9: case 0:
                    JOptionPane.showMessageDialog(null, "Pagamento até 31/12", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Dígito inválido!", "Vencimento do IPVA", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (license_plate >=10);
    }

}
