/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.finalOrderModel;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rohini
 */
public class DeliveryBoy {
    String name;
    String status;
    UserAccount u;

    public UserAccount getUa() {
        return u;
    }

    public void setUa(UserAccount ua) {
        this.u = ua;
    }
    
    public DeliveryBoy(UserAccount ua)
    {
        this.u = ua;
        this.name = ua.getUsername();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<finalOrderModel> getDeliveredOrders() {
        return deliveredOrders;
    }

    public void setDeliveredOrders(ArrayList<finalOrderModel> deliveredOrders) {
        this.deliveredOrders = deliveredOrders;
    }
    ArrayList<finalOrderModel> deliveredOrders = new ArrayList<finalOrderModel>();
    public void addDeliveredOrder(finalOrderModel f)
    {
        deliveredOrders.add(f);
    }
}
