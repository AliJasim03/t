/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package raven.main;

import GUI.Message;
import GlassPanePopup.GlassPanePopup;
import Logic.GymSystem;
import Logic.Member;
import Logic.PolytechnicStudent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alija
 */
public class ManageMembersPnl extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeePnl
     */
        Message obj = new Message();

    public ManageMembersPnl() {
        initComponents();
        membersTable.fixTable(jScrollPane);
                        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new GUI.TextField();
        jScrollPane = new javax.swing.JScrollPane();
        membersTable = new Table.Table();

        setBackground(new java.awt.Color(42, 107, 120));

        textField1.setEditable(false);
        textField1.setBackground(new java.awt.Color(233, 189, 78));
        textField1.setForeground(new java.awt.Color(0, 0, 0));
        textField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField1.setText("Manage Members");
        textField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textField1.setRound(50);
        textField1.setShadowColor(new java.awt.Color(0, 0, 0));

        membersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Type"
            }
        ));
        membersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        membersTable.setShowGrid(true);
        jScrollPane.setViewportView(membersTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private Table.Table membersTable;
    private GUI.TextField textField1;
    // End of variables declaration//GEN-END:variables
public void showData() {
        DefaultTableModel model = (DefaultTableModel) membersTable.getModel();
        model.setRowCount(0);
        for (Member mem : GymSystem.members) {
            if (mem instanceof PolytechnicStudent) {
                membersTable.addRow(new Object[]{mem.getId(), mem.getFullName(),mem.getPhone(),mem.getBirthDate(), "Student"});
            } else {
                membersTable.addRow(new Object[]{mem.getId(), mem.getFullName(),mem.getPhone(),mem.getBirthDate(), "Staff"});
            }
        }
    }
}
