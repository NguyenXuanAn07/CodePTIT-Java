package ThucHanh;

import ThucHanh.Products;
import ThucHanh.order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Products> sanPhams = new ArrayList<>();
        ArrayList<order> donHangs = new ArrayList<>();

        // 1. Tao san pham bang constructor day du
        Products sp1 = new Products("SP01", "Ban phim co", 450000, 20);
        Products sp2 = new Products("SP02", "Chuot khong day", 200000, 50);

        // 2. Tao san pham bang constructor 2 tham so
        Products sp3 = new Products("SP03", "Tai nghe");
        sp3.setPrice(350000);
        sp3.setStock(10);

        sanPhams.add(sp1);
        sanPhams.add(sp2);
        sanPhams.add(sp3);

        // 3. Tao 3 don hang
        order dh1 = new order("An", sp1, 2);
        order dh2 = new order("Binh", sp2, 5);
        order dh3 = new order("Chi", sp3, 0);

        donHangs.add(dh1);
        donHangs.add(dh2);
        donHangs.add(dh3);

        // 4. In danh sach san pham
        System.out.println("===== DANH SACH SAN PHAM =====");

        for (Products sp : sanPhams) {
            System.out.printf("%-5s %-20s %,10.0f ton %d%n",
                    sp.getIdProduct(),
                    sp.getNameProduct(),
                    sp.getPrice(),
                    sp.getStock());
        }

        // 5. In danh sach don hang
        System.out.println("\n===== DANH SACH DON HANG =====");

        System.out.printf("%-8s %-20s %-5s %s%n",
                "Khach", "San pham", "SL", "Thanh tien");

        for (order dh : donHangs) {
            System.out.printf("%-8s %-20s %-5d %,12.0f%n",
                    dh.getNameCustomer(),
                    dh.getProducts().getNameProduct(),
                    dh.getPurchaseQuantity(),
                    dh.getThanhTien());

            if (dh.getPurchaseQuantity() >= 5) {
                System.out.println("         (da giam 10%)");
            }
        }
    }
}
