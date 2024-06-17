public class MostrarMatriz {

  public static void mostraMatriz(int[][]matriz){

    for (int i = 0; i < matriz.length; i++) {
      System.out.println("");
      for (int j = 0; j < matriz[i].length; j++) {
          System.out.print("["+ matriz[i][j]+"]" + " " );
      }
      System.out.println();
  }
  }
}
