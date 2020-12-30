import java.util.Scanner;

public class NamaBulan {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String[] Bulan = {
      "Nomor tidak valid",
        "Januari",
        "Februari",
        "Maret",
        "April",
        "Mei",
        "Juni",
        "Juli",
        "Agustus",
        "September",
        "Oktober",
        "November",
        "Desember",
    };
    
    // Input bulan
        System.out.print("");
        int nomorBulan = input.nextInt();
        
        if (nomorBulan <= 12){
          System.out.println("" + Bulan[nomorBulan-0]);
        }
        else {
        
        System.out.println( "Nomor tidak valid");
}
    }
}
