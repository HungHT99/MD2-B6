package ra.dev;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    static Product [] listProduct = new Product[1000];
    static int indexProduct = 0 ;
    static Catalog []  listCatalog = new Catalog[50];
    static int indexCatalog = 0;
    static Scanner sc = new Scanner(System.in);
    // quan li danh muc
    public static void displayMenu1(){
        do {
            System.out.println("***********QUAN LY DANH MUC********");
            System.out.println("1.Nhap thong tin danh muc ");
            System.out.println("2.Hien thi thong tin danh muc theo do uu tien");
            System.out.println("3.Cap nhap thong tin danh muc theo ma danh muc ");
            System.out.println(" 4.Thoat");
            System.out.println("SU lua chon la :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap so danh muc can nhao thong tin ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Catalog pro = new Catalog();
                        pro.inputData();
                        listCatalog[indexCatalog]=pro;
                        indexCatalog++;
                       /* c2
                       listCatalog[indexCatalog] = new Catalog();
                       listCatalog[indexCatalog].inputData();
                       indexCatalog++;
                        */
                        System.out.println("Them Thanh cong ");
                    }
                    break;
                case 2:
                    //hien thi danh muc theo do uu tien
                    //1.sx theo danh muc uu tien tang dan
                    for (int i = 0; i < indexCatalog-1; i++) {
                        for (int j = i+1;j< indexCatalog;j++){
                            if (listCatalog[i].getPriority()>listCatalog[j].getPriority()){
                                Catalog temp = listCatalog[i];
                                listCatalog[j] = listCatalog[i];
                                listCatalog[j] = temp;
                            }
                        }

                    }
                    break;
                case 3:
                    int catalogInUpdata = Integer.parseInt(sc.nextLine());
                    int indexCatalogUpdata = -1 ;
                    for (int i = 0 ;i < indexCatalog ; i++){
                        if (listCatalog[i].getCatalogId()==catalogInUpdata){
                            indexCatalogUpdata = i;
                        }
                        if(indexCatalogUpdata!=-1){
                            System.out.println("Nhap vao danh muc can cap nhat:");
                            String catalogName = sc.nextLine();
                            if (catalogName != "" &&catalogName.length()!=0){
                                listCatalog[indexCatalogUpdata].setCatalogName(catalogName);
                            }
                            System.out.println("Nhap vao do uu tien cua dnah muc");
                            String priorty = sc.nextLine();
                            if (priorty !=""&&priorty.length()!=0);
                            listCatalog[indexCatalogUpdata].setPriority(Integer.parseInt(priorty));
                            System.out.println("Nhap vao trang thai danh muc:");
                            String status = sc.nextLine();
                            if (status!=""&&status.length()!=0){
                                listCatalog[indexCatalogUpdata].setCatalogStatus(Boolean.parseBoolean(status));
                            }

                        }else {
                            System.out.println("ma danh muc khong ton tai ");
                        }
                    }
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
    public  static void displayMenu2(){
        do{
            System.out.println("**********QUAN LY SAN PHAM***********");
            System.out.println("1.Nhap thong tin  cho n san pham " );
            System.out.println("2.Tinh gia ban cho tat ca san pham");
            System.out.println("3.Hien thi thong tin cac pham");
            System.out.println("4.Sap xep san pham theo gia ban tang dan ");
            System.out.println("5.Tim kiem san pham theo ten san pham ");
            System.out.println("6.Thong ke so luong va in thong tin cac san pham sap het hang  (quantity<=5)");
            System.out.println("7.cap nhap trang thai cua san pham theo ma san pham ");
            System.out.println("8.Thoat");
            System.out.println("su lua chon cua ban la:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap thong tin so san pham ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Product pro =new Product();
                        pro.inputData () ;
                        listProduct[indexProduct] = pro;
                        indexProduct++;
                        System.out.println("san pham da dc them");
                    }
                    break;
                case 2:
                    for (int i = 0; i < indexProduct; i++) {
                        listProduct[i].calExportPrice();
                    }
                    System.out.println("Da tinh xong san pham ");
                    break;
                case 3:
                    System.out.println("Hien thi thong tin san pham la:");
                    System.out.printf("%-15s%-30s%-30s%-15s%-15s%-10s%-50s%-10s\n", "Product ID", "Product Name",
                            "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Status");
                    for (int i = 0; i < indexProduct; i++) {
                        listProduct[i].displayData();
                    }
                    break;
                case 4:
                    System.out.println("sap xep san pham theo gia tang dan:");
                    for (int i = 0; i < indexProduct; i++) {
                        for (int j = i+1; j<indexProduct;j++){
                            if (listProduct[i].getExportPrice()>listProduct[j].getExportPrice()){
                                Product temp = listProduct[i];
                                listProduct[i] = listProduct[j];
                                listProduct[j] = temp;
                            }
                            System.out.println("da sap xep san pham theo gia tang dan ");
                        }
                    }
                    break;
                case 5:
                    System.out.println("San pham hien thi theo ten ");
                    String strSeach = sc.nextLine();
                    System.out.printf("%-15s%-30s%-30s%-15s%-15s%-10s%-50s%-10s\n", "Product ID", "Product Name",
                            "Title", "Import Price", "Export Price", "Quantity", "Descriptions", "Status");
                    for (int i = 0; i < indexProduct; i++) {
                        if (listProduct[i].getProductName().startsWith(strSeach)){
                            listProduct[i].displayData();
                        }
                    }
                    break;
                case 6:
                    int cnt = 0;
                    System.out.printf("%-15s%-30s%-30s%-15s%-15s%-10s%-50s%-10s\n", "Product ID", "Product Name",
                            "Title", "Import Price", "Export Price", "Quantity", "Descriptions","Status");
                    for (int i = 0; i < indexProduct; i++) {
                        if (listProduct[i].getQuantity()<=5 ){
                            cnt++;
                            listProduct[i].displayData();
                        }
                    }
                    break;
                case 7:
                    String strUpdate = "";
                    System.out.println("Nhap vao ma san pham can cap nhat trang thai :");
                    strUpdate = sc.nextLine();
                    for (int i = 0; i < indexProduct; i++) {
                        if (listProduct[i].getProductId().equals(strUpdate)){
                            listProduct[i].setProductStatus(!listProduct[i].isProductStatus());
                        }
                    }
                    System.out.println("Da cap nhap thanh cong trang thai cua san pham ");
                    break;
                case 8:
                    return;
                default:
                    System.err.printf("vui long nhap tu 1 den 8");
            }
        }while(true);
    }
}