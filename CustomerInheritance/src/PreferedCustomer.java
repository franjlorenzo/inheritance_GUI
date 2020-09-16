public class PreferedCustomer extends Customer {
    
    private double balance;
    private double balanceLimit;
    private String adress;

    public PreferedCustomer(double balance, double balanceLimit, String adress, String name, int idCustomer, int phoneNumber) {
        super(name, idCustomer, phoneNumber);
        this.balance = balance;
        this.balanceLimit = balanceLimit;
        this.adress = adress;
    }
    
    @Override
    public String toString(){
        return "Balance: " + balance + ", Balance limit: " + balanceLimit + ", Adress: " + adress +
                ", Name: " + name + ", ID Customer: " + idCustomer + ", Phone number: " + phoneNumber;
    }
}
