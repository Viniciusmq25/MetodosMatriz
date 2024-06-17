public class ParImpar {
  public static void parImpar(int[][] matriz) {
		int par = 0;
		int impar = 0;
		
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] % 2==0) {
          par++;
        }
        else {
          impar++;
        }
       }
   }
		System.out.println("Pares: "+par);
		System.out.println("Ímpares: "+impar);
	}
}
