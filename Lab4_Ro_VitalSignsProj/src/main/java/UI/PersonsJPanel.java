/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Class.Person;
import Class.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ram.a
 */
public class PersonsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonsJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    public PersonsJPanel(JPanel userProcessContainer,PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory= personDirectory;
        this.userProcessContainer= userProcessContainer;
    }
    
    private void populatePersonsTable(ArrayList<Person> personsList) {
        DefaultTableModel model = (DefaultTableModel) viewPersonsJTable.getModel();
        model.setRowCount(0);
        if(personsList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Person unavailable. Please add"
                    + " Person's", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personsList) {
            Object[] row = new Object[5];
            row[0] = person;
            row[1]= person.getAge();
            row[3]=person.getCommunity();
            if(person.getPatient()!=null)
            {
                row[2] = person.getPatient().getPatientID();
            }
            else
            {
                row[2] = "Patient missing";
            }
            
            model.addRow(row);
        }
        
    }
    
    private void clearFields()
    {
        pesonNameJTextField.setText("");
        personAgeJTextField.setText("");
    }
    private Boolean checkBlankInput()
    {
        if(pesonNameJTextField.getText().length()==0
                ||personAgeJTextField.getText().length()==0)
        {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonsJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        deletePersonJButton = new javax.swing.JButton();
        searchBoxJTextField = new javax.swing.JTextField();
        searchPersonJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        patientNameJLabel = new javax.swing.JLabel();
        pesonNameJTextField = new javax.swing.JTextField();
        patientNameJLabel1 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        personAgeJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxComm = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        viewPersonsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Name", "Age", "Patient ID", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPersonsJTable);

        backJButton.setText("GoBack");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        deletePersonJButton.setText("Delete");
        deletePersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonJButtonActionPerformed(evt);
            }
        });

        searchPersonJButton.setText("Search");
        searchPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPersonJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Reload");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        patientNameJLabel.setText("Name of the Person");

        patientNameJLabel1.setText("Age of the Person ");

        btnsave.setText("SAVE HERE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Add Person Details");

        jLabel2.setFont(new java.awt.Font("Zapf Dingbats", 3, 24)); // NOI18N
        jLabel2.setText("\"PREVENTION IS BETTER THAN CURE\"");

        boxComm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asian ", "Haitian", "African " }));
        boxComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCommActionPerformed(evt);
            }
        });

        jLabel3.setText("Community");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patientNameJLabel)
                                            .addComponent(patientNameJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel3)))
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pesonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(766, 766, 766))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchPersonJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(deletePersonJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletePersonJButton)
                    .addComponent(refreshJButton)
                    .addComponent(searchPersonJButton)
                    .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameJLabel)
                    .addComponent(pesonNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(btnsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deletePersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*Ask confirmation*/
        int flag= JOptionPane.showConfirmDialog(this, "Remove?",
            "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            personDirectory.deletePerson(person);
            populatePersonsTable(personDirectory.getPersonHistory());
        }
    }//GEN-LAST:event_deletePersonJButtonActionPerformed

    private void searchPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPersonJButtonActionPerformed
        // TODO add your handling code here:
        String key= searchBoxJTextField.getText();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Enter key.",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPersons;
        searchPersons=personDirectory.searchPerson(key);
        populatePersonsTable(searchPersons);
    }//GEN-LAST:event_searchPersonJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        searchBoxJTextField.setText("");
        populatePersonsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput()==Boolean.TRUE)
        {
            Person person=personDirectory.createAndAddPerson();
            person.setPersonName(pesonNameJTextField.getText());
            person.setAge(Integer.parseInt(personAgeJTextField.getText()));
            person.setCommunity(boxComm.getSelectedItem().toString());

            JOptionPane.showMessageDialog(this, "Person added", "Update",
                JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Enter all values",
                "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void boxCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCommActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> boxComm;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton deletePersonJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JLabel patientNameJLabel1;
    private javax.swing.JTextField personAgeJTextField;
    private javax.swing.JTextField pesonNameJTextField;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField searchBoxJTextField;
    private javax.swing.JButton searchPersonJButton;
    private javax.swing.JTable viewPersonsJTable;
    // End of variables declaration//GEN-END:variables
}