/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rohini
 */
public class DeliveryBoyDirectory {
    ArrayList<DeliveryBoy> deliveryDirectory = new ArrayList<DeliveryBoy>();

    public ArrayList<DeliveryBoy> getDeliveryDirectory() {
        return deliveryDirectory;
    }

    public void setDeliveryDirectory(ArrayList<DeliveryBoy> deliveryDirectory) {
        this.deliveryDirectory = deliveryDirectory;
    }
    
    public void addDelivery(DeliveryBoy d)
    {
        deliveryDirectory.add(d);
    }
    
    public DeliveryBoy getDeliveryMan(UserAccount  ua)
    {
        for(DeliveryBoy d: deliveryDirectory)
        {
            if(d.getName().equals(ua.getUsername()))
                return d;
        }
        return null;
    }
}

