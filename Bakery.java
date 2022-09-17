import javax.swing.JOptionPane;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Bakery {
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("##.###");
        fmt.setRoundingMode(RoundingMode.DOWN);
        for (int i = 1; i < 11; i++) {
            String product = JOptionPane.showInputDialog(null, "Escreva o nome do " + i + "° produto", "Padaria do Joaquim", JOptionPane.INFORMATION_MESSAGE);
            double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço desse produto", "Padaria do Joaquim", JOptionPane.INFORMATION_MESSAGE)) * 0.5;
            JOptionPane.showMessageDialog(null, "Após um desconto de 50%, o produto " + product.toLowerCase() + " está custando R$ " + fmt.format(price), "Padaria do Joaquim", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
