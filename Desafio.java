import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];

        Scanner inp = new Scanner(System.in);
        System.out.println("\f");

        System.out.println("Por favor, insira os valores da matriz 6x6");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor;
                do {
                    System.out.printf("Insira o valor para a posição [%d][%d]", i, j);
                    valor = inp.nextInt();
                } while (valor < 1);
                matriz[i][j] = valor;
            }
        }

        int cont = 0;
        do{
            espaco();
            System.out.println("MENU");
            System.out.println("");
            System.out.println("- sair (digite 0)");
            System.out.println("- nova matriz (digite 1)");
            System.out.println("- Quantidade de números pares e ímpares existentes na matriz. (digite 2)");
            System.out.println("- Quantidade de números divisíveis por 11 existentes na matriz. (digite 3)");
            System.out.println("- Quantidade de números primos existentes na matriz. (digite 4)");
            System.out.println("- Quantidade de números perfeitos existentes na matriz. (digite 5)");
            System.out.println("- Soma dos números armazenados nas posições das linhas ímpares da matriz.(digite 6)");
            System.out.println("- Produto dos números armazenados nos índices pares das linhas pares da matriz. (digite 7)");
            System.out.println("- Verificar se a média aritmética dos valores ímpares armazenados na matriz é menor ou maior que a média aritmética dos valores pares. (digite 8)");
            System.out.println("- Escrever o maior valor armazenado na linha onde existe o menor valor armazenado na matriz. (digite 9)");
            System.out.println("- Escrever a matriz com seus valores. (digite 10)");

            cont = inp.nextInt();

            switch(cont) {
                case 1:
                espaco();
                System.out.println("Por favor, insira os valores da matriz 6x6:");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        int valor;
                        do {
                            System.out.printf("Insira o valor para a posição [%d][%d]: ", i, j);
                            valor = inp.nextInt();
                        } while (valor < 1 || valor > 9);
                        matriz[i][j] = valor;
                    }
                }
                espaco();
                  break;
                case 2:
                  espaco();
                  ParImpar.parImpar(matriz);
                  espaco();
                  break;
                case 3:
                  espaco();
                  Divisivel11.divisivel11(matriz);
                  espaco();
                  break;
                case 4:
                  espaco();
                  NumPrimos.numPrimos(matriz);
                  espaco();
                  break;
                case 5:
                  espaco();
                  numPerfeitos.contarPerfeitos(matriz);
                  espaco();
                  break;
                case 6:
                  espaco();
                  SomaLinhasImpares.somasLinhasImpares(matriz);
                  espaco();
                  break;
                case 7:
                  espaco();
                  ProdutoIndicesParesMatriz.produtoIndicesParesMatriz(matriz);
                  espaco();
                  break;
                case 8:
                  espaco();
                  MediaAritmeticaImparesPares.mediaAritmeticaImparesPares(matriz);
                  espaco();
                  break;
                case 9:
                  espaco();
                  MaiorValorNaLinhaDoMenorValor.maiorValorNaLinhaDoMenorValor(matriz);
                  espaco();
                  break;
                case 10:
                  espaco();
                  MostrarMatriz.mostraMatriz(matriz);
                  espaco();
                  break;
                default:
                  // code block
              }
        
        } while(cont != 0);
        
        System.out.println("Encerrando programa...");

        inp.close();
      }

      public static void espaco (){
          System.out.println("");
      }
}

                    
            


    
