package Views;

import Models.House;
import Models.Department;
import Models.RealState;
import Models.Property;
import java.util.Objects;

public class RealStateView extends javax.swing.JFrame {

    RealState realState = new RealState();
    Property newProperty = null;

    public RealStateView() {
        initComponents();
        cboxGarage.setVisible(false);
        txtExpensesPrice.setVisible(false);
        txtNumberOfTenants.setText("0");
        cboPropertyType.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Properties = new javax.swing.JLabel();
        Adress = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        txtNumberOfRooms = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        cboxComercialUse = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumberOfTenants = new javax.swing.JTextField();
        btnLoadProperty = new javax.swing.JButton();
        cboPropertyType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboxGarage = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtExpensesPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRealState = new javax.swing.JList<>();
        btnLoadList = new javax.swing.JButton();
        lblRentalPrice = new javax.swing.JLabel();
        lblAverageRentalAmount = new javax.swing.JLabel();
        lblHouses3Bedrooms = new javax.swing.JLabel();
        btnMethods = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Properties.setText("Properties");

        Adress.setText("Adress");

        jLabel3.setText("Number of rooms");

        jLabel4.setText("Base price");

        cboxComercialUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxComercialUseActionPerformed(evt);
            }
        });

        jLabel5.setText("Comercial use");

        jLabel6.setText("Number of tenants");

        btnLoadProperty.setText("Load property");
        btnLoadProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadPropertyActionPerformed(evt);
            }
        });

        cboPropertyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House", "Department" }));
        cboPropertyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPropertyTypeActionPerformed(evt);
            }
        });

        jLabel7.setText("Property type");

        jLabel8.setText("Garage");

        jLabel9.setText("Expenses price");

        jScrollPane1.setViewportView(lstRealState);

        btnLoadList.setText("Load list");
        btnLoadList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadListActionPerformed(evt);
            }
        });

        lblRentalPrice.setText("Rental price: ");

        lblAverageRentalAmount.setText("Average rental amount for the properties where 2 tenants live:");

        lblHouses3Bedrooms.setText("Houses with 3 bedrooms or more that have a garage:");

        btnMethods.setText("Show methods");
        btnMethods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethodsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMethods)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLoadList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoadProperty)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExpensesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxGarage)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboxComercialUse)
                                            .addComponent(txtNumberOfTenants, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboPropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(111, 111, 111)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRentalPrice)
                                            .addComponent(lblHouses3Bedrooms)
                                            .addComponent(lblAverageRentalAmount)))
                                    .addComponent(txtNumberOfRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(75, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Adress)
                                    .addComponent(jLabel4)
                                    .addComponent(Properties)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Properties)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adress)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumberOfRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRentalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cboxComercialUse)
                    .addComponent(lblAverageRentalAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumberOfTenants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouses3Bedrooms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboPropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboxGarage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExpensesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoadProperty)
                    .addComponent(btnLoadList)
                    .addComponent(btnMethods))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadPropertyActionPerformed
        if (cboPropertyType.getSelectedItem() == "House") {
            String adress = txtAdress.getText();
            int numberOfRooms = Integer.parseInt(txtNumberOfRooms.getText());
            double basePrice = Double.parseDouble(txtPrice.getText());
            boolean comercialUse = cboxComercialUse.isSelected();
            int numberOfTenants = Integer.parseInt(txtNumberOfTenants.getText());
            boolean garage = cboxGarage.isSelected();

            newProperty = new House(adress, numberOfRooms, basePrice, comercialUse, numberOfTenants, garage);

        } else {
            String adress = txtAdress.getText();
            int numberOfRooms = Integer.parseInt(txtNumberOfRooms.getText());
            double basePrice = Double.parseDouble(txtPrice.getText());
            boolean comercialUse = cboxComercialUse.isSelected();
            int numberOfTenants = Integer.parseInt(txtNumberOfTenants.getText());
            double expensesPrice = Double.parseDouble(txtExpensesPrice.getText());

            newProperty = new Department(adress, numberOfRooms, basePrice, comercialUse, numberOfTenants, expensesPrice);
        }

        realState.addNewProperty(newProperty);

    }//GEN-LAST:event_btnLoadPropertyActionPerformed

    private void cboPropertyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPropertyTypeActionPerformed
        if (cboPropertyType.getSelectedItem() == "House") {
            cboxGarage.setVisible(true);
            txtExpensesPrice.setVisible(false);
        } else {
            cboxGarage.setVisible(false);
            txtExpensesPrice.setVisible(true);
        }
    }//GEN-LAST:event_cboPropertyTypeActionPerformed

    private void btnLoadListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadListActionPerformed
        lstRealState.setListData(realState.getPropertyList().toArray());
    }//GEN-LAST:event_btnLoadListActionPerformed

    private void cboxComercialUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxComercialUseActionPerformed
        if(cboxComercialUse.isSelected()){
            txtNumberOfTenants.setVisible(false);
        }
        if(cboxComercialUse.isSelected() == false){
            txtNumberOfTenants.setVisible(true);
        }
    }//GEN-LAST:event_cboxComercialUseActionPerformed

    private void btnMethodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethodsActionPerformed
        lblRentalPrice.setText("Rental price: $" + realState.rentalPrice());
        lblAverageRentalAmount.setText("Average rental amount for the properties where 2 tenants live:: $" + realState.averageTwoTenants());
        lblHouses3Bedrooms.setText("Houses with 3 bedrooms or more that have a garage:: " + realState.numberOfHousesWithRooms());
    }//GEN-LAST:event_btnMethodsActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealStateView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adress;
    private javax.swing.JLabel Properties;
    private javax.swing.JButton btnLoadList;
    private javax.swing.JButton btnLoadProperty;
    private javax.swing.JButton btnMethods;
    private javax.swing.JComboBox<String> cboPropertyType;
    private javax.swing.JCheckBox cboxComercialUse;
    private javax.swing.JCheckBox cboxGarage;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAverageRentalAmount;
    private javax.swing.JLabel lblHouses3Bedrooms;
    private javax.swing.JLabel lblRentalPrice;
    private javax.swing.JList<Object> lstRealState;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtExpensesPrice;
    private javax.swing.JTextField txtNumberOfRooms;
    private javax.swing.JTextField txtNumberOfTenants;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
