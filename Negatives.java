// QUESTÃO NÚMERO 1 DA FICHA DE SINTAXE - ELISA COSTA

import java.util.Scanner;

class Negatives {
  public static void main(String[] args) {
    // Variável para número de negativos
    int negatives = 0;
    // Scanner para pegar input de números
    Scanner NumInput = new Scanner(System.in);
    // Input do número de números a serem lidos
    System.out.println("Digite n: ");
    int n = NumInput.nextInt();
    // Loop para iterar sobre os números
    for (int e = 0; e < n; e++){
      // input dos números
      System.out.println("Digite um número: ");
      int l = NumInput.nextInt();
      // Checar se é negativo
      if (l < 0){
        negatives += 1;
      }
    }
    // Printar o número de negativos
    System.out.println("O número de negativos é: " + negatives);
  }
}
