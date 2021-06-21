// EX8 da Lista - Elisa Costa

import java.util.Scanner;

class MagicSquare {
  public static void main(String[] args){
    Scanner NumInput = new Scanner(System.in);
    System.out.println("Digite n: ");
    int n = NumInput.nextInt();
    int[][] Matriz = new int[n][n];
    for (int a = 0; a < n; a++){
      for (int b = 0; b < n; b++){
        System.out.println("Digite o próximo número da matriz: ");
        Matriz[a][b] = NumInput.nextInt();
      }
    }
    int colunas[] = new int[n];
    int linhas[] = new int[n];
    int diagonalP = 0;
    int diagonalSec = 0;
    for (int e = 0; e < n; e++){
      for (int l = 0; l < n; l++){
        linhas[e] += Matriz[e][l];
        colunas[e] += Matriz[l][e];
      }
      diagonalP += Matriz[e][e];
      diagonalSec += Matriz[e][n-e-1];
    }
    if (diagonalP == diagonalSec){
      for (int i = 0; i < n; i++){
        if (linhas[i] != diagonalP || linhas[i] != colunas[i]){
          System.out.println("A matriz não é um quadrado mágico");
          break;
        }
        if (i == (n - 1)){
          System.out.println("A matriz é um quadrado mágico");
        }
      }
    }
    else{
      System.out.println("A matriz não é um quadrado mágico");
    }
  }
}
