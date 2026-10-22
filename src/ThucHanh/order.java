package ThucHanh;

public class order {
    public String nameCustomer;
    public Products products;
    private int purchaseQuantity;

    public order(String nameCustomer, Products products, int purchaseQuantity){
        this.nameCustomer = nameCustomer;
        this.products = products;
        if (purchaseQuantity < 1) {
            this.purchaseQuantity = 1;
        } else {
            this.purchaseQuantity = purchaseQuantity;
        }
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public Products getProducts() {
        return products;
    }

    public double getThanhTien(){
        double tien = products.getPrice()*purchaseQuantity;
        if (purchaseQuantity>=5){
            return tien *= 0.9;
        }
        return tien;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    @Override
    public String toString(){
        return nameCustomer+" "+products.getNameProduct()+" "+purchaseQuantity+" "+getThanhTien();
    }
}
