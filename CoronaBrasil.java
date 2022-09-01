/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronabrasil;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class CoronaBrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("##,###,###");
        DecimalFormat pct = new DecimalFormat("##.#####%");

        String[] region = new String[5];
        int[] casesRegion = new int[5];
        int totalCases = 0;
        double[] pctRegion = new double[5];

        for (int i = 0; i < 5; ++i) {
            System.out.println("Escreva o nome da região do Brasil");
            region[i] = input.next();
            System.out.println("Digite o número de casos de Covid-19 nessa região");
            casesRegion[i] = input.nextInt();
            System.out.println("A região " + region[i] + " têm um total de " + fmt.format(casesRegion[i]) + " casos");
            totalCases += casesRegion[i];
                pctRegion[i] = casesRegion[i] / totalCases;
            

            System.out.println("Os casos da região " + region[i] + " correspondem à, aproximadamente, " + pct.format(pctRegion[i]) + " do valor total de casos no Brasil");
            System.out.println("Atualmente, no Brasil, há " + fmt.format(totalCases) + " casos aproximadamente");
        }

    }
}
