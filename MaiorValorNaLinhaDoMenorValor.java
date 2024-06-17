public class MaiorValorNaLinhaDoMenorValor {
  public static void maiorValorNaLinhaDoMenorValor (int [][]matriz ){
    int menorValor = matriz[0][0];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] < menorValor) {
                        menorValor = matriz[i][j];
                    }
                }
            }
            
            int linhaMenorValor = 0;
            int maiorValorNaLinhaDoMenor = matriz[0][0];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == menorValor) {
                        linhaMenorValor = i;
                        break;
                    }
                }
            }
            for (int j = 0; j < matriz[linhaMenorValor].length; j++) {
                if (matriz[linhaMenorValor][j] > maiorValorNaLinhaDoMenor) {
                    maiorValorNaLinhaDoMenor = matriz[linhaMenorValor][j];
                }
            }
            
            System.out.println("O maior valor na linha onde está o menor valor na matriz é: " + maiorValorNaLinhaDoMenor);
        }  
}
