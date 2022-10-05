package ra.dev;

import java.util.Objects;
import java.util.Scanner;
public class ProductManagetment {
    static Product[] listPro = new Product[100];
    static int index = 0;
    static Catalog[] lisCata = new Catalog[100];
    static int index2 =0;
    // MENU CHÍNH
    public static void main(String[] args) {
        do{
            System.out.println(" ");
            System.out.println("******* Quan Ly Cua Hang*******"+ "\n");
            System.out.println(" 1: QuảN lý danH mục sản phẩM ! ");
            System.out.println(" 2: QuảN lý sản phẩm ! ");
            System.out.println(" 3: thoAt ứng dụnG ! "+ "\n");
            System.out.println(" lựa chọN của bạn !");
            Scanner sc = new Scanner(System.in);
            int choice =Integer.parseInt (sc.nextLine());
            switch (choice){
                case 1:
                    ProductManagetment.menucatalog();
                    break;
                case 2:
                    ProductManagetment.menuproduct();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" bạn hãy chọN từ  1-3:");
            }
        }while (true);
    }
    // Quan ly danh muc
    public static void menucatalog(){
        boolean exitMENU = true;
        do {
            Scanner sc= new Scanner(System.in);
            System.out.println(" ");
            System.out.println("******* QUẢn LÝ DANH MỤC ******"+"\n" );
            System.out.println(" 1. NhậP thôNG tin danH mục ");
            System.out.println(" 2. HiểN thị danh mục theo độ ưu tiên ");
            System.out.println(" 3. Cập nhật thông tin danh mục theo mã danh mục");
            System.out.println(" 4. Chở lại Menu"+ "\n");
            System.out.println("Nhập lựa chọn của bạn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    // NHẬP DANH MỤC
                    System.out.println("Nhập số danh mục bạn muốn thêm : ");
                    int num2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập thông tin danh mục");
                    for (int i = 0; i < num2; i++) {
                        lisCata[index2]= new Catalog();
                        lisCata[index2].inputDataCata();
                        index2++;
                    }
                    break;
                case 2:


                case 3:
                    // CẬP NHẬT DANH MỤC
                    for (int i = 0; i < index2; i++){
                        System.out.print(" ID " + lisCata[i].getCatalogId());
                        System.out.println(" : " + lisCata[i].getCatalogName());
                    }
                    System.out.println("Nhập mã Id danh mục muốn cập nhật :");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < index2; i++) {
                        if (lisCata[i].getCatalogId()==idUpdate){
                            System.out.println("Mã danh mục cũ là  : " + lisCata[i].getCatalogId());
                            System.out.print("Mã danh mục mới là      :");
                            lisCata[i].setCatalogiD(Integer.parseInt(sc.nextLine()));
                            System.out.println("Tên danh mục cũ là : " + lisCata[i].getCatalogName());
                            System.out.print("Tên danh mục mới là     :");
                            lisCata[i].setCatalogName(sc.nextLine());
                            System.out.println("Độ ưu tiên cũ là   : " + lisCata[i].getPriority());
                            System.out.print("Độ ưu tiên mới          :");
                            lisCata[i].setPriority(Integer.parseInt(sc.nextLine()));
                            System.out.println("Trạng thái cũ là   : " + lisCata[i].getPriority());
                            System.out.print("Trạng thái mới là       :");
                            lisCata[i].setCatalogStatus(Boolean.parseBoolean(sc.nextLine()));
                        }
                    }
                    break;
                case 4:
                    exitMENU = false;
                    break;
                default:
                    System.out.println("vui long chon tu 1-4");

            }
        }while (exitMENU);
    }
    // THÔNG TIN SẢN PHẨM
    public static void menuproduct (){
        boolean exitmenuProduct = true;
        do {
            Scanner num = new Scanner(System.in);
            System.out.println("   ");
            System.out.println("****** QUẢN LÝ SẢN PHẨM ******"+ "\n");
            System.out.println("1. Nhập thông tin cho n sản phẩm (n nhập từ bàn phím.)");
            System.out.println("2. Tính giá bán cho tất cả sản phẩm.");
            System.out.println("3. Hiển thị thông tin các sản phẩm.");
            System.out.println("4. Sắp xếp sản phẩm theo giá bán tăng dần.");
            System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm.");
            System.out.println("6. Thống kê và in ra sản phẩm sắp hết.");
            System.out.println("7. Cập nhật trạng thái của sản phẩm theo mã sản phẩm");
            System.out.println("8. Quay lại menu "+ "\n");
            System.out.println(" lựa chọn của bạn ");
            System.out.println(" ");
            int choice = Integer.parseInt(num.nextLine());
            switch (choice) {
                case 1:
                    // NHẬP THÔNG TIN SẢN PHẨM
                    if (index2==0) {
                        System.err.println("Vui lòng tạo danh mục sản phẩm trước");
                        return;

                    } else {
                        System.out.println("Nhập mã danh mục sản phẩm bạn muốn thêm !");
                        for (int i = 0; i < index2; i++) {
                            System.out.print(" ID " + lisCata[i].getCatalogId());
                            System.out.println(" : " + lisCata[i].getCatalogName());
                        }
                        int catalog = Integer.parseInt(num.nextLine());
                        for (int i = 0; i < index2; i++) {
                            if (Objects.equals(lisCata[i].getCatalogId(), catalog)) {

                                System.out.println("Nhập số sản phẩm muốn thêm :");
                                int ssp = Integer.parseInt(num.nextLine());
                                for (int j = 0; j < ssp; j++) {
                                    listPro[index] = new Product();
                                    listPro[index].inputData();
                                    listPro[index].setCatalog(lisCata[i]);
                                    index++;
                                }
                            }
                        }
                    }
                    break;
                case 2:

                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    // CẬP NHẬT TRẠNG THÁI SẢN PHẨM
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Nhập thông tin sản phẩm muốn cập nhật");
                    String pro = sc3.nextLine();
                    for (int i = 0; i < index; i++) {
                        if(Objects.equals(listPro[i].getProductName(), pro)){
                            listPro[i].setProductStatus(false);
                        }else {
                            listPro[i].setProductStatus(true);
                        }
                    }
                    System.out.println("Trạng thái đã được thay đổi");
                    break;
                case 8:
                    break;
                default:
                    System.out.println("vui long chon tu 1-8");
            }
        }while (exitmenuProduct);

    }





}