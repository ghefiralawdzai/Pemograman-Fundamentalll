import java.util.Scanner;

public class HitungUmur {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        System.out.print("");
        int lahir =sc.nextInt();
        int umur = 2020 - lahir;
        System.out.println( "Umur anda " + umur + " tahun" );

    }
}