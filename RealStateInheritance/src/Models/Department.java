package Models;

public class Department extends Property{
    private double expensePrice;

    public Department(String adress, int numberOfRooms, double rentalPrice, boolean comercialUse, int numberOfTenants, double expensePrice) {
        super(adress, numberOfRooms, rentalPrice, comercialUse, numberOfTenants);
        this.expensePrice = expensePrice;
    }

    @Override
    public String toString() {
        return "House: Adress = " + adress + " Number of rooms: " + numberOfRooms + " Base price: " + 
                basePrice + " Comercial use: " + comercialUse + " Number of tenants: " + numberOfTenants + " Expense price: " + expensePrice;
    }

    public double getExpensePrice() {
        return expensePrice;
    }

    public boolean isComercialUse() {
        return comercialUse;
    }

    public int getNumberOfTenants() {
        return numberOfTenants;
    }
     
    
}
