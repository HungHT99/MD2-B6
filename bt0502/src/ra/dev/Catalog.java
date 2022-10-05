package ra.dev;

import java.util.Scanner;

public class Catalog {
    //cac thuoc tinh
    public  int catalogId ;
    public String catalogName ;
    public  int priority ;
    public Boolean catalogStatus ;
    //2 .cac constructor
    public   Catalog (){

    }

    public Catalog(int catalogId, String catalogName, int priority, boolean catalogStatus) {

        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma danh muc san pham ");
        this.catalogId = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten danh muc san pham :");
        this.catalogName = sc.nextLine();
        System.out.println("Nhap do uu tien cua danh muc:");
        this.priority = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap trang thai cua danh  muc:");
        this.catalogStatus = Boolean.parseBoolean(sc.nextLine());
    }
    //public void inputData(Scanner sc){
    //        Scanner sc = new Scanner(System.in);
    //        System.out.println("Nhap ma danh muc san pham ");
    //        this.catalogId = Integer.parseInt(sc.nextLine());
    //        System.out.println("nhap ten danh muc san pham :");
    //        this.catalogName = sc.nextLine();
    //        System.out.println("Nhap do uu tien cua danh muc:");
    //        this.priority = Integer.parseInt(sc.nextLine());
    //        System.out.println("Nhap trang thai cua danh  muc:");
    //        this.catalogStatus = Boolean.parseBoolean(sc.nextLine());
    //    }
    public  void displayData(){

        System.out.printf("-14d%-18s%-13s%-14b%\n",this.catalogId,this.catalogName,this.priority,this.catalogStatus);

    }
}