package J05036;

import java.util.Scanner;

class MatHang {
    private static int count = 0;
    private String maHang;
    private String tenHang;
    private String donVi;
    private long donGia;
    private long soLuong;

    public MatHang(Scanner sc){
        count ++;
        maHang = String.format("MH%02d", count);

        tenHang = sc.nextLine();
        donVi = sc.nextLine();
        donGia = Long.parseLong(sc.nextLine());
        soLuong = Long.parseLong(sc.nextLine());
    }

    public long getPhiVanChuyen() {
        return Math.round((donGia*soLuong)*0.05);
    }
    public long getThanhTien(){
        return Math.round((donGia*soLuong)+getPhiVanChuyen());
    }

    public long getGiaBan() {
        double giaBan = getThanhTien() + getThanhTien()*0.02;
        return Math.round((giaBan / 100.0) * 100) ;
    }
    @Override
    public String toString(){
        return maHang+" "+tenHang+" "+donVi+" "+getPhiVanChuyen()+" "+getThanhTien()+" "+getGiaBan();
    }

}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] matHang = new MatHang[n];

        for(int i = 0; i<n;i++){
            matHang[i] = new MatHang(sc);
        }

        for(MatHang mh : matHang){
            System.out.println(mh);
        }
    }
}
