
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi cua ban: ");
        int age = Integer.parseInt(sc.nextLine());
        String ageWarning = (age < 0 || age > 100) ? "Canh bao: Tuoi khong hop le! Vui long nhap lai." : "";
        System.out.println(ageWarning);
        System.out.println("Nhap mon hoc cua ban: ");
        String subject = sc.nextLine();
        System.out.println("Nhap email cua ban: ");
        String email = sc.nextLine();
        String emailWarning = (!email.contains("@")) ? "Canh bao: Email khong hop lư! Vui long nhap lai." : "";
        System.out.println(emailWarning);
        System.out.println("Nhap dia chi cua ban: ");
        String diaChi = sc.nextLine();
    }
}
