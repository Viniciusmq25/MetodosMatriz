public class NumPrimos {
  static int countPrimesInMatrix(int[][] matrix) {
    int count = 0;
    for (int[] row : matrix) {
        for (int num : row) {
            if (isPrime(num)) {
                count++;
            }
        }
    }
    return count;
  }

  public static void numPrimos(int matriz[][]) {

      int primeCount = countPrimesInMatrix(matriz);
      System.out.println("Quantidade de números primos na matriz: " + primeCount);
  }


  static boolean isPrime(int n) {
    if (n <= 1) {
    return false;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
    return false;
    }
  }

  return true;
  }
}
