package buoi_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Moi ban nhap gia: ");
        Double price = Double.parseDouble(sc.nextLine());
        Product product2 = new Product(id, name, price);
        if (price<=0){
            System.out.println("Gia tri ko hop le!!");
        } else {

        }
    }
}
