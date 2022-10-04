package sumarray;
import javax.swing.JOptionPane;

public class SumArray {
    public static void main(String[] args) {
        int array[][]=new int[10][10],i,j,sum=0;
        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                array[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número da " + (i+1) + "ª linha e da "+(j+1)+"ª coluna", "Matriz 10x10", JOptionPane.INFORMATION_MESSAGE));
            }
        }
        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                sum+=array[i][j];
            }
        }JOptionPane.showMessageDialog(null, "A soma de todos os elementos da matriz é igual à " + sum, "Matriz 10x10", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
