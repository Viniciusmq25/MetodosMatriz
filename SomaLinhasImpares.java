public class SomaLinhasImpares {
  public static void somasLinhasImpares(int [][]matriz) {

    int somaLinhasImpares = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < matriz[i].length; j++) {
                    somaLinhasImpares += matriz[i][j]; 
                }
            }
        }
        
        System.out.println("A soma dos números armazenados nas posições das linhas ímpares da matriz é: " + somaLinhasImpares);
       } 
}
