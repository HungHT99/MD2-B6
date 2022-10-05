package ra.dev;

import java.util.Scanner;

public class ProductManagament {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("*******Quan Ly Danh Muc **********");
            System.out.println("1.Quan ly danh muc");
            System.out.println("2.Quan ly san pham ");
            System.out.println("3.Thoat");
            System.out.println("lua chon cua ban la");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case  1:
                    Menu.displayMenu1();
                    break;
                case 2:
                    Menu.displayMenu2();
                    break;
                case 3:
                    System.exit(0);

            }

        }while(true);

    }
}