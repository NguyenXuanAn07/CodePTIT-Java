package ThucHanh;

public class Products {
    public String nameProduct;
    public String idProduct;
    public double price;
    public int stock;

    public Products(String nameProduct, String idProduct, double price, int stock){
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.price = price;
        this.stock = stock;
    }
    public Products(String nameProduct, String idProduct){
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.price = 0;
        this.stock = 0;
    }

    public String getIdProduct(){
        return idProduct;
    }
    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public void giamSoLuongTon(int soLuong) {
        stock -= soLuong;
    }

    @Override
    public String toString(){
        return idProduct+" "+nameProduct+" "+price+" "+stock;
    }
}
