

public class numPerfeitos {
  public static boolean isNumeroPerfeito(int num) {
    if (num < 2) {
        return false;
    }
    
    int soma = 1; // 1 é sempre um divisor
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            soma += i;
        }
    }
    
    return soma == num;
  }

  public static void contarPerfeitos(int[][] matriz) {
    int count = 0;
    for (int[] linha : matriz) {
        for (int valor : linha) {
            if (isNumeroPerfeito(valor)) {
                count++;
            }
        }
    }
    System.out.printf("Perfeitos: %d\n", count);
}
}
