import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Receipt> receipts = new ArrayList<>();
    static Customer customer = new Customer();

    public void addReceipt() {
        Receipt receipt = new Receipt();
        receipt.setCustomer(customer.addCustomer());

        do {
            System.out.println("Chỉ số cũ hộ sử dụng điện");
            int indexOld = scanner.nextInt();
            receipt.setIndexOld(indexOld);
        } while (receipt.getIndexOld() < 0);

        do {
            System.out.println("Chỉ số mới hộ sử dụng điện");
            int indexNew = scanner.nextInt();
            receipt.setIndexNew(indexNew);
        } while (receipt.getIndexOld() > receipt.getIndexNew());

        receipts.add(receipt);
    }

    public void showReceipt() {
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s"
                , "Tên hộ dân cư"
                , "Số nhà"
                , "Mã số công tơ"
                , "Chỉ số công tơ cũ"
                , "Chỉ số công tơ mới");
        for (Receipt receipt : receipts) {
            System.out.printf("\n%-20s%-20s%-20s%-20s%-20s"
                    , receipt.getCustomer().getName()
                    , receipt.getCustomer().getNumberHome()
                    , receipt.getCustomer().getIdElectric()
                    , receipt.getIndexOld()
                    , receipt.getIndexNew());
        }
    }

    public void billReceipt() {
        System.out.println("Nhập mã công tơ hộ sử dụng: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        for (Receipt receipt : receipts) {
            if (id.equals(receipt.getCustomer().getIdElectric())) {
                System.out.println("----------Thông tin hộ sử dụng-----------");
                System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s"
                        , "Tên hộ sử dụng"
                        , "Số nhà"
                        , "Mã số công tơ điện"
                        , "Chỉ số công tơ cũ"
                        , "Chỉ số công tơ mới"
                        , "Thanh toán");
                System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s"
                        , receipt.getCustomer().getName()
                        , receipt.getCustomer().getNumberHome()
                        , receipt.getCustomer().getIdElectric()
                        , receipt.getIndexOld()
                        , receipt.getIndexNew()
                        , receipt.getPrice() + "vnđ");
            }
        }
    }
}
