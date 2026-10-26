package J05012;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class HoaDon {
    public String maMatHang;
    public String tenMatHang;
    public int soLuongMua;
    public long donGia;
    public long chietKhau;
    public long tongTien;
    public HoaDon(Scanner sc){
        maMatHang = sc.nextLine();
        tenMatHang = sc.nextLine();
        soLuongMua = sc.nextInt();
        donGia = sc.nextLong();
        chietKhau = sc.nextLong();
        sc.nextLine();
        tongTien = (long)soLuongMua*donGia - chietKhau;
    }

    public long getTongTien() {
        return tongTien;
    }

    @Override
    public String toString(){
        return maMatHang+" "+tenMatHang+" "+soLuongMua+" "+donGia+" "+chietKhau+" "+tongTien;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<HoaDon> ds = new ArrayList<>();
        for (int i = 0; i<n; i++){
            ds.add(new HoaDon(sc));
        }
        ds.sort(Comparator.comparingLong(HoaDon::getTongTien).reversed());
        for (HoaDon hoaDon: ds){
            System.out.println(hoaDon);
        }
        sc.close();
    }
}
