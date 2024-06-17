public class Divisivel11 {
  public static void divisivel11(int [][]matriz) {	
    int d11 = 0 ;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
                if(matriz [1][j]% 11 == 0) {
                    d11++;
                }
        }
    }
    System.out.println("Diviveis por 11: "+d11);
  }
}
