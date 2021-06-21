// EX6 da Lista - Elisa Costa

import java.util.Scanner;

class Percentage {
  public static void main(String[] args){
    Scanner numInput = new Scanner(System.in);
    float n = 0;
    float sub25 = 0;
    float sub50 = 0;
    float sub75 = 0;
    float sub100 = 0;
    System.out.println("Escreva sua nota de satisfação: ");
    int input = numInput.nextInt();
    while (input >= 0 && input <= 100) {
      n++;
      if (input <= 25){
        sub25++;
      }
      else if (input <= 50){
        sub50++;
      }
      else if (input <= 75){
        sub75++;
      }
      else if (input <= 100){
        sub100++;
      }
      System.out.println("Escreva sua nota de satisfação: ");
      input = numInput.nextInt();
    }
    float Psub25 = (sub25 / n) * 100;
    float Psub50 = (sub50 / n) * 100;
    float Psub75 = (sub75 / n) * 100;
    float Psub100 = (sub100 / n) * 100;
    System.out.println(n);
    System.out.println("A porcentagem de avaliações péssimas é " + Psub25);
    System.out.println("A porcentagem de avaliações ruins é " + Psub50);
    System.out.println("A porcentagem de avaliações boas é " + Psub75);
    System.out.println("A porcentagem de avaliações ótimas é " + Psub100);
  }
}
