package sumarray;
import javax.swing.JOptionPane;

public class SumArray {
    public static void main(String[] args) {
        int array[][]=new int[10][10],i,j,sum=0;
        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                array[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o n�mero da " + (i+1) + "� linha e da "+(j+1)+"� coluna", "Matriz 10x10", JOptionPane.INFORMATION_MESSAGE));
            }
        }
        for(i=0; i<10; i++){
            for(j=0; j<10; j++){
                sum+=array[i][j];
            }
        }JOptionPane.showMessageDialog(null, "A soma de todos os elementos da matriz � igual � " + sum, "Matriz 10x10", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
