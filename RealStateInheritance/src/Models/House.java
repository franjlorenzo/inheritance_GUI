package Models;

public class House extends Property{
    private boolean garage;

    public House(String adress, int numberOfRooms, double rentalPrice, boolean comercialUse, int numberOfTenants, boolean garage) {
        super(adress, numberOfRooms, rentalPrice, comercialUse, numberOfTenants);
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House: Adress = " + adress + " Number of rooms: " + numberOfRooms + " Base price: " + 
                basePrice + " Comercial use: " + comercialUse + " Number of tenants: " + numberOfTenants + " Garage: " + garage;
    }

    public boolean isComercialUse() {
        return comercialUse;
    }

    public int getNumberOfTenants() {
        return numberOfTenants;
    }

    public boolean isGarage() {
        return garage;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    
    
}
