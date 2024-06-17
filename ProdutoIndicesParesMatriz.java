public class ProdutoIndicesParesMatriz {
  public static void produtoIndicesParesMatriz (int[][] matriz) {
        
    int produtoIndicesPares = 1;
        for (int i = 0; i < matriz.length; i += 2) {
            for (int j = 0; j < matriz[i].length; j += 2) {
                produtoIndicesPares *= matriz[i][j]; 
             }
         }
            
            System.out.println("O produto dos números armazenados nos índices pares das linhas pares da matriz é: " + produtoIndicesPares);
    } 
}
