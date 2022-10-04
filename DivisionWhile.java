package divisionwhile;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class DivisionWhile {

    public static void main(String[] args) {
        double num1, num2, division;
        DecimalFormat fmt = new DecimalFormat("#.###");
        do {
            num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 1° número", "Divisão matemática", JOptionPane.INFORMATION_MESSAGE));
            num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o 2° número", "Divisão matemática", JOptionPane.INFORMATION_MESSAGE));
            if (num2 == 0) {
                break;
            }
            division = num1 / num2;
            JOptionPane.showMessageDialog(null, "A divisão de " + fmt.format(num1) + " por " + fmt.format(num2) + " é igual à " + fmt.format(division), "Divisão definida", JOptionPane.INFORMATION_MESSAGE);
        } while (num2 != 0);
    }
}
