// EX5 - Elisa Costa

import java.util.Scanner;

class Factor {
  public static void main(String[] args){
    Scanner NumInput = new Scanner(System.in);
    int N = NumInput.nextInt();
    int factN = 1;
    if (N < 1){
      System.out.println("Não foi possível achar o fatorial");
      System.out.println("-1");
    } 
    else{
      for(int i = 1; i <= N; i++){
        factN *= i;
      }
      System.out.println(factN);
    }
  }
}
