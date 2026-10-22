import java.util.Scanner;
public class J04003 {
    private float tuSo;
    private float mauSo;
    public J04003(float tuSo, float mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public String tinhPhanSo(float tuSo, float mauSo){
        while(tuSo%mauSo != 0){
            float temp = tuSo % mauSo;
            if (tuSo%mauSo==0){
                tuSo = mauSo;
                mauSo = temp;
            }
        }
        int mauSoMoi = (int) mauSo;
        int tuSoMoi = (int) tuSo;
        return tuSoMoi+"/" +mauSoMoi;
    }
    public float getMauSo() {
        return mauSo ;
    }

    public float getTuSo() {
        return tuSo;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float tuSo = sc.nextFloat();
        float mauSo = sc.nextFloat();
        J04003 phanSo = new J04003(tuSo, mauSo);
        phanSo.tinhPhanSo(tuSo, mauSo);
        sc.close();
    }
}
