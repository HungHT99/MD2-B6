package ra.dev;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Product {
    //xay dung cac thuoc tinh
    public String productId ;
    public String productName;
    public  String title;
    public float importPrice ;
    public  float exportPrice ;
    public int  quantity;
    public String descriptions ;
    public boolean productStatus ;
    //has-a
    public Catalog catalog ;

    public Product(){

    }

    public Product(String productId, String productName, String title, float importPrice, float exportPrice, int quantity, String descriptions, boolean productStatus, Catalog catalog) {

        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.productStatus = productStatus;
        this.catalog = catalog;
    }
    //  cac phuong thuc get set cho thuoc tinh

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã sản phẩm ");
        this.productId = sc.nextLine();
        System.out.println("Tên sản phẩm :");
        this.productName = sc.nextLine();
        System.out.println("Tiêu đề sản phẩm :");
        this.title = sc.nextLine();
        System.out.println("Gia nhap san pham");
        this.importPrice = Integer.parseInt(sc.nextLine());
        System.out.println("So luong  cua san pham :");
        this.quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Mo ta san pham:");
        this.descriptions = sc.nextLine();
        System.out.println("Trang thai san pham:");
        this.productStatus = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Danh muc sp ma sp thuoc ve:");

    }
    //public void inputData(Scaner sc){
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Mã sản phẩm ");
    //        this.productId = sc.nextLine();
    //        System.out.println("Tên sản phẩm :");
    //        this.productName = sc.nextLine();
    //        System.out.println("Tiêu đề sản phẩm :");
    //        this.title = sc.nextLine();
    //        System.out.println("Gia nhap san pham");
    //        this.importPrice = Integer.parseInt(sc.nextLine());
    //        System.out.println("So luong cua san pham :");
    //        this.quantity = Integer.parseInt(sc.nextLine());
    //        System.out.println("Mo ta san pham:");
    //        this.descriptions = sc.nextLine();
    //        System.out.println("Trang thai san pham:");
    //        this.productStatus = Boolean.parseBoolean(sc.nextLine())
    //        System.out.println("Danh muc sp ma sp thuoc ve:");
    //        for(int i = 0;i<indexMax;i++){
    //
    //    }
    public void displayData(){
        System.out.printf("%-15s%-30s%-30s%-15f%-15f%-10d%-50s%-10b\n", this.productId, this.productName, this.title,
                this.importPrice, this.exportPrice, this.quantity, this.descriptions, this.productStatus );
    }
    public void calExportPrice(){
        this.exportPrice=this.importPrice*1.2F;
    }

}