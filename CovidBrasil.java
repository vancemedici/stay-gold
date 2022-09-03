/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidbrasil;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class CovidBrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("##,###,###");
        DecimalFormat pct = new DecimalFormat("##.##%");
        int casosCentroOeste, casosNordeste, casosNorte, casosSudeste, casosSul, casosTotais;
        double pctCentroOeste, pctNordeste, pctNorte, pctSudeste, pctSul;

        System.out.println("Digite a quantidade de casos de covid-19 no centro-oeste brasileiro");
        casosCentroOeste = input.nextInt();
        System.out.println("Digite a quantidade de casos de covid-19 no nordeste brasileiro");
        casosNordeste = input.nextInt();
        System.out.println("Digite a quantidade de casos de covid-19 no norte brasileiro");
        casosNorte = input.nextInt();
        System.out.println("Digite a quantidade de casos de covid-19 no sudeste brasileiro");
        casosSudeste = input.nextInt();
        System.out.println("Digite a quantidade de casos de covid-19 no sul brasileiro");
        casosSul = input.nextInt();

        casosTotais = casosCentroOeste + casosNordeste + casosNorte + casosSudeste + casosSul;
        System.out.println("Atualmente, no Brasil, há " + fmt.format(casosTotais) + " casos aproximadamente");

        pctCentroOeste = (double)casosCentroOeste / casosTotais;
        System.out.println("O centro-oeste têm um total de " + fmt.format(casosCentroOeste) + " casos, o equivalente à " + pct.format(pctCentroOeste) + " dos casos totais do Brasil");
        pctNordeste = (double)casosNordeste / casosTotais;
        System.out.println("O nordeste têm um total de " + fmt.format(casosNordeste) + " casos, o equivalente à " + pct.format(pctNordeste) + " dos casos totais do Brasil");
        pctNorte = (double)casosNorte / casosTotais;
        System.out.println("O norte têm um total de " + fmt.format(casosNorte) + " casos, o equivalalente à " + pct.format(pctNorte) + " dos casos totais do Brasil");
        pctSudeste = (double)casosSudeste / casosTotais;
        System.out.println("O sudeste têm um total de " + fmt.format(casosSudeste) + " casos, o equivalalente à " + pct.format(pctSudeste) + " dos casos totais do Brasil");
        pctSul = (double)casosSul / casosTotais;
        System.out.println("O sul têm um total de " + fmt.format(casosSul) + " casos, o equivalalente à " + pct.format(pctSul) + " dos casos totais do Brasil");
    }

}
