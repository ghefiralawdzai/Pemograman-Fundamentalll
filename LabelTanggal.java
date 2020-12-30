import java.util.Scanner;

public class LabelTanggal {

	public static void main(String[] args) {
		System.out.print("");
		Scanner gege = new Scanner(System.in);
		String[]bulan = new String[1];
		int[]xx = new int[1];
		System.out.print("");
		xx[0] = gege.nextInt(); 
		
		int[]yy = new int[1];
		System.out.print("");
		yy[0] = gege.nextInt();
		 if (yy[0] == 01) {
			bulan[0] = "Januari";
		} else if (yy[0] == 02) {
			bulan[0] = "Februari";
		} else if (yy[0] == 3) {
			bulan[0] = "Maret";
		} else if (yy[0] == 4) {
			bulan[0] = "April";
		} else if (yy[0] == 5) {
			bulan[0] = "Mei";
		} else if (yy[0] == 6) {
			bulan[0] = "Juni";
		} else if (yy[0] == 7) {
			bulan[0] = "Juli";
		} else if (yy[0] == 8) {
			bulan[0] = "Agustus";
		} else if (yy[0] == 9) {
			bulan[0] = "September";
		} else if (yy[0] == 10) {
			bulan[0] = "Oktober";
		} else if (yy[0] == 11) {
			bulan[0] = "November";
		} else if (yy[0] == 12) {
			bulan[0] = "Desember";
		} else {
			bulan[0] = "TIDAK VALID";
		}
		
		int[]zzzz = new int[1];
		System.out.print("");
			zzzz[0] = gege.nextInt();
		
		System.out.println(xx[0]+" "+bulan[0]+" "+zzzz[0]);
	}

}