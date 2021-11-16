/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author rohini
 */
public class OrderAcceptance {
    ArrayList<finalOrderModel> acceptedOrders = new ArrayList<finalOrderModel>();
 
    public ArrayList<finalOrderModel> getAcceptedOrders() {
        return acceptedOrders;
    }

    public void setAcceptedOrders(ArrayList<finalOrderModel> acceptedOrders) {
        this.acceptedOrders = acceptedOrders;
    }
    
}
