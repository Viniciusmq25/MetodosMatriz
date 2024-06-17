public class MediaAritmeticaImparesPares {
  public static void mediaAritmeticaImparesPares(int[][] matriz) {
    int somaImpares = 0, somaPares = 0, countImpares = 0, countPares = 0;
    for (int[] linha : matriz) {
        for (int valor : linha) {
            if (valor % 2 == 0) {
                somaPares += valor;
                countPares++;
            } else {
                somaImpares += valor;
                countImpares++;
            }
        }
    }
    double mediaImpares = (double) somaImpares / countImpares;
    double mediaPares = (double) somaPares / countPares;
    System.out.printf("Média aritmética dos ímpares: %.2f\n", mediaImpares);
    System.out.printf("Média aritmética dos pares: %.2f\n", mediaPares);
    if (mediaImpares > mediaPares) {
        System.out.println("Média dos ímpares é maior que a dos pares.");
    } else {
        System.out.println("Média dos ímpares é menor ou igual à dos pares.");
    }
}
}
