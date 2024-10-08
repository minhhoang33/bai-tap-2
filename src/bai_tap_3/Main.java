package bai_tap_3;

import java.util.Scanner;

class Account {
    private String username;
    private String password;
    private double balance;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }


    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    public void showAccountInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Balance: " + balance + " VND");
    }


    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Bạn đã rút " + amount + " VND.");
            System.out.println("Số dư còn lại: " + balance + " VND.");
        } else {
            System.out.println("Số dư không đủ để thực hiện giao dịch.");
        }
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Account myAccount = new Account("techmaster", "hoclacoviec", 1000000);

        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Nhập username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Nhập password: ");
            String inputPassword = scanner.nextLine();

            if (myAccount.login(inputUsername, inputPassword)) {
                System.out.println("Đăng nhập thành công!");
                loggedIn = true;
            } else {
                System.out.println("Sai username hoặc password.");
                System.out.print("Bạn có muốn thử lại không? (Y/N): ");
                String retry = scanner.nextLine();
                if (retry.equalsIgnoreCase("N")) {
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                }
            }
        }

        boolean continueProgram = true;
        while (continueProgram) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    myAccount.showAccountInfo();
                    break;
                case 2:
                    System.out.print("Nhập số tiền muốn rút: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    myAccount.withdraw(amount);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }

            System.out.print("Do you want to continue? (Y/N): ");
            String continueChoice = scanner.nextLine();
            if (continueChoice.equalsIgnoreCase("N")) {
                System.out.println("Tạm biệt!");
                continueProgram = false;
                System.exit(0);
            }
        }
    }


    public static void showMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Xem thông tin tài khoản");
        System.out.println("2. Rút tiền");
        System.out.println("====================");
        System.out.print("Nhập lựa chọn của bạn: ");
    }
}

