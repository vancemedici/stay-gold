package covidbrasil;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Brian Fumagali
 */
public class CovidBrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##,###,###");
        DecimalFormat fmt = new DecimalFormat("##.####%");
        String regiãoBrasil;
        System.out.println("Escreva o nome da região do Brasil");
        regiãoBrasil = input.next();
        int númeroCasos;
        System.out.println("Digite o número de casos de Covid-19 nessa região");
        númeroCasos = input.nextInt();
        System.out.println("A região " + regiãoBrasil + " têm um total de " + df.format(númeroCasos) + " casos");
        int casosTotais;
        casosTotais = 34368909;
        System.out.println("Atualmente, no Brasil, há " + df.format(casosTotais) + " casos aproximadamente");
        double percCasos;
        percCasos = ((double) númeroCasos / casosTotais);
        System.out.println("Os casos da região " + regiãoBrasil + " correspondem à, aproximadamente, " + fmt.format(percCasos) + " do valor total de casos no Brasil.");
    }

}
