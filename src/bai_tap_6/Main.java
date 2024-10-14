package bai_tap_6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ban muon nhap bao nhieu loai vat: ");
        int count = Integer.parseInt(scanner.nextLine());
            if (count <=0 ){
                System.out.println("gia tri ko hop le");

        }else {

        Animal[] animals = new Animal[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Nhap ID cho loai vat thu "+(i+1)+": ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap ten cho loai vat thu "+(i+1)+": ");
            String name = scanner.nextLine();
            System.out.println("Nhap mo ta cho loai vat thu "+(i+1)+": ");
            String description = scanner.nextLine();
            System.out.println("Nhap gioi tinh cho loai vat thu "+(i+1)+": ");
            String genderInput = scanner.nextLine();
            boolean gender = genderInput.equals("duc");
            animals[i] = new Animal(name, id, description, gender);

            }
            System.out.println("Danh sach cac loai vat da nhap: ");
            for (Animal a : animals) {
                System.out.println(a);
        }

}
        }

    }


