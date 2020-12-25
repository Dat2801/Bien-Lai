import java.util.Scanner;

public class Customer {
    private String name;
    private String  numberHome;
    private String idElectric;

    public Customer() {
    }

    public Customer(String name, String numberHome, String idElectric) {
        this.name = name;
        this.numberHome = numberHome;
        this.idElectric = idElectric;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(String numberHome) {
        this.numberHome = numberHome;
    }

    public String getIdElectric() {
        return idElectric;
    }

    public void setIdElectric(String idElectric) {
        this.idElectric = idElectric;
    }

    Scanner scanner = new Scanner(System.in);

    public Customer addCustomer() {
        Customer customer = new Customer();
        System.out.println("Nhập họ tên hộ sử dụng điện");
        String name = scanner.nextLine();
        customer.setName(name);

        System.out.println("Nhập số nhà hộ sử dụng điện");
        String  numberHome = scanner.nextLine();
        customer.setNumberHome(numberHome);

        System.out.println("Nhập mã số công tơ");
        String idElectric = scanner.nextLine();
        customer.setIdElectric(idElectric);

        return customer;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "hoTenChuHo='" + name + '\'' +
                ", numberHouse=" + numberHome +
                ", idElectric=" + idElectric +
                '}';
    }
}
