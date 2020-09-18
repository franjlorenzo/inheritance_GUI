package Models;

import java.util.ArrayList;

public class RealState {

    private ArrayList<Property> propertyList;

    public RealState() {
        this.propertyList = new ArrayList();
    }

    public void addNewProperty(Property newProperty) {
        propertyList.add(newProperty);
    }

    public ArrayList<Property> getPropertyList() {
        return propertyList;
    }

    //This method returns the rental price of a Property or a Department of a House
    public double rentalPrice() {
        double rentalPrice = 0;
        for (Property property : propertyList) {
            if (property instanceof House) {
                if (((House) property).comercialUse) {
                    rentalPrice = ((House) property).basePrice + 1000;
                } else {
                    rentalPrice = ((House) property).basePrice;
                }
            }
            if (property instanceof Department) {
                if (((Department) property).comercialUse) {
                    rentalPrice = ((Department) property).basePrice + ((Department) property).getExpensePrice() + 500;
                } else {
                    rentalPrice = ((Department) property).basePrice + ((Department) property).getExpensePrice();
                }
            }
        }
        return rentalPrice;
    }

    //This method returns the average rental amount for the properties where 2 tenants live. 
    public float averageTwoTenants() {
        float averageTenants = 0;
        int tenantCounter = 0;

        for (Property property : propertyList) {
            if (property instanceof House) {
                if (!((House) property).isComercialUse() && ((House) property).getNumberOfTenants() == 2) {
                    tenantCounter++;
                    averageTenants += this.rentalPrice();
                }
            }
            if (property instanceof Department) {
                if (!((Department) property).isComercialUse() && ((Department) property).getNumberOfTenants() == 2) {
                    tenantCounter++;
                    averageTenants += this.rentalPrice();
                }
            }  
        }
        return averageTenants / tenantCounter;
    }    

   //This method returns the number of houses with 3 bedrooms or more that have a garage 
    public int numberOfHousesWithRooms() {
        int bedroomHouseCounter = 0;
        for (Property property : propertyList) {
            if (property instanceof House && ((House) property).isGarage() && ((House) property).getNumberOfRooms() >= 3) {
                bedroomHouseCounter++;
            }
        }
        return bedroomHouseCounter;
    }
}
