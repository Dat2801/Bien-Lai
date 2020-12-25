public class Receipt extends Customer {
    private int indexOld;
    private int indexNew;
    private double price;
    private Customer customer;

    public Receipt() {
    }

    public Receipt(int indexOld, int indexNew, int price) {
        this.indexOld = indexOld;
        this.indexNew = indexNew;
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getIndexOld() {
        return indexOld;
    }

    public void setIndexOld(int indexOld) {
        this.indexOld = indexOld;
    }

    public int getIndexNew() {
        return indexNew;
    }

    public void setIndexNew(int indexNew) {
        this.indexNew = indexNew;
    }

    public double getPrice() {
        return price = ((getIndexNew() - getIndexOld()) * 750);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "indexOld=" + indexOld +
                ", indexNew=" + indexNew +
                ", price=" + price +
                ", customer=" + customer +
                '}';
    }
}
