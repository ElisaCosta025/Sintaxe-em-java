// EXERCÍCIO 2 DA LISTA - ELISA COSTA

import java.util.Scanner;

class Maior{
  public static void main(String[] args){
    // Scanner para pegar input de números
    Scanner NumInput = new Scanner(System.in);
    // Input dos números
    System.out.println("Digite R: ");
    float R = NumInput.nextInt();
    System.out.println("Digite S: ");
    float S = NumInput.nextInt();
    System.out.println("Digite T: ");
    float T = NumInput.nextInt();
    // Definir e printar o maior.
    if (R > S && R > T) {
      System.out.println("O maior é " + R);
    }
    else if (S > R && S > T) {
      System.out.println("O maior é " + S);
    }
    else if (T > R && T > S) {
      System.out.println("O maior é " + T);
    }
    else {
      System.out.println("Não há um maior");
  }
}
