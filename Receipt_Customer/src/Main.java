import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Program program = new Program();

    public static void main(String[] args) {
        int choice = 3;
        do {
            System.out.println("\n" + "------Chọn chức năng-------");
            System.out.println("1: Thêm thông tin biên lai");
            System.out.println("2: Hiển thị thông tin hộ sử dụng điện");
            System.out.println("3: Thanh toán");
            System.out.println("4. Thoát");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    program.addReceipt();
                    break;
                case 2:
                    program.showReceipt();
                    break;
                case 3:
                    program.billReceipt();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
