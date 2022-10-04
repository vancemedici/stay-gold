Algoritmo "SumArray"

Var

array: vetor[1..10,1..10] de inteiro
i,j,sum: inteiro

Inicio

Para i de 1 Até 10 Faça
     Para j de 1 Até 10 Faça
          Escreva ("Insira o número da" ,i, "ª linha e da" ,j, "ª coluna ")
          Leia (array[i,j])
          FimPara
          FimPara
Para i de 1 Até 2 Faça
     Para j de 1 Até 2 Faça
          sum <- sum + array[i,j]
          FimPara
          FimPara
Escreva ("A soma de todos os elementos da matriz é igual à",sum)

Fimalgoritmo