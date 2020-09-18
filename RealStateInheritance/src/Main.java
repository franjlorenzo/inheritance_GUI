/**1. A real estate agent asks us for a program with windows to keep track of the properties it rents.
   * For the properties it is necessary to store the address data, number of rooms, base rental price, if it will be for commercial use and the number of tenants for the case in which 
   * the property is not for commercial use. Two types of properties are registered: houses and apartments. Of the houses, you also want to register if you have a garage, and of the 
   * apartments you want to also register the price of the expenses. The rental price that must be paid for a home is made up of the base rental price, plus $ 1,000 if it is for 
   * commercial use. The rental price that must be paid for an apartment is made up of the base rental price, plus expenses, plus $ 500 if it is for commercial use.
   * The program must allow:
   * Load property data.
   * Calculate and display the average rental amount for the properties where 2 tenants live.
   * Calculate and display the number of houses with 3 bedrooms or more that have a garage.
 */
import Views.RealStateView;

public class Main {

    public static void main(String[] args) {
        
        RealStateView realStateView = new RealStateView();
        realStateView.setVisible(true);
    }
    
}
