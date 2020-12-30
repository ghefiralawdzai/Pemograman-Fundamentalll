import java.util.Scanner;

public class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
    
    int i, j, k, l;
    int angka[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    
    Scanner sc = new Scanner(System.in);
    k = 5;
    l = 5;
    
    for (i = 0; i < k; i++){
      for (j = 0; j < l; j++){
        angka[i][j] = sc.nextInt();
      } 
    }
    
    System.out.println(angka[0][0] + angka[0][1] + angka[0][2] + angka[0][3] + angka[0][4]);
    System.out.println(angka[1][0] + angka[1][1] + angka[1][2] + angka[1][3] + angka[1][4]);
    System.out.println(angka[2][0] + angka[2][1] + angka[2][2] + angka[2][3] + angka[2][4]);
    System.out.println(angka[3][0] + angka[3][1] + angka[3][2] + angka[3][3] + angka[3][4]);
    System.out.println(angka[4][0] + angka[4][1] + angka[4][2] + angka[4][3] + angka[4][4]);
  }
}