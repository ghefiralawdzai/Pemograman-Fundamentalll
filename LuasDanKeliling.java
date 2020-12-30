import java.util.Scanner;

public class LuasDanKeliling {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double panjang = sc.nextDouble();
    double lebar = sc.nextDouble();
    
    double mLuas = LuasDanKeliling.luas(panjang,lebar);
    System.out.println(mLuas);
    
    double mKeliling = LuasDanKeliling.keliling(panjang,lebar);
    System.out.println(mKeliling);
  }
  
  public static double keliling(double panjang, double lebar){
    double keliling = 2 * (panjang+lebar);
    return keliling;
  }
  
  public static double luas(double panjang, double lebar){
    double luas = panjang * lebar;
    return luas;
  }
}