package Models;

import java.util.ArrayList;

public abstract class Property {
    protected String adress;
    protected int numberOfRooms;
    protected double basePrice;
    protected boolean comercialUse;
    protected int numberOfTenants;

    public Property(String adress, int numberOfRooms, double basePrice, boolean comercialUse, int numberOfTenants) {
        this.adress = adress;
        this.numberOfRooms = numberOfRooms;
        this.basePrice = basePrice;
        this.comercialUse = comercialUse;
        this.numberOfTenants = numberOfTenants;
    }

    @Override
    public abstract String toString();
    
    
}
