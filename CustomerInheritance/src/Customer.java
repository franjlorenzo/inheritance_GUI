public class Customer {
    
    protected String name;
    protected int idCustomer;
    protected int phoneNumber;

    public Customer(String name, int idCustomer, int phoneNumber) {
        this.name = name;
        this.idCustomer = idCustomer;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer name = " + name + ", ID Customer = " + idCustomer + ", Phone number = " + phoneNumber;
    }  
}
