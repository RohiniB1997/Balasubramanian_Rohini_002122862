/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author ram.a
 */
public class Patient {
    private String patientID;
   
    private Encounter vitalSignHistory;

    public Patient() {
        this.vitalSignHistory = new Encounter();
    }
    
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }


    public Encounter getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(Encounter vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
    
    
}
