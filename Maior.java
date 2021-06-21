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
    // Soma dos números
    float Sum = R + S + T;
    // Printar a soma
    System.out.println("A soma dos números é " + Sum);
  }
}
