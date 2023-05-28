/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package raven.main;

import Calander.EventDateChooser;
import Calander.SelectedAction;
import Calander.SelectedDate;
import GUI.Message;
import GlassPanePopup.GlassPanePopup;
import Logic.Employee;
import Logic.GymSystem;
import Logic.PersonalTrainer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import FileManager.FileManager;
import Logic.Member;
import javax.swing.JFrame;

/**
 *
 * @author alija
 */
public class AddMemberPnl extends javax.swing.JPanel {
    
    Message obj = new Message();
    
    public AddMemberPnl() {
        initComponents();
        showExtraData();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        dateChooserAddMem.setTextRefernce(txtDm);
            dateChooserAddMem.addEventDateChooser(new EventDateChooser() {
            @Override
            public void dateSelected(SelectedAction action, SelectedDate date) {
                if (action.getAction() == SelectedAction.DAY_SELECTED) {
                    dateChooserAddMem.hidePopup();
                }
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

        RadioButtonGender = new javax.swing.ButtonGroup();
        RadioButtonMember = new javax.swing.ButtonGroup();
        dateChooserAddMem = new Calander.DateChooser();
        textField1 = new GUI.TextField();
        txtFm = new GUI.TextField();
        jLabel1 = new javax.swing.JLabel();
        txtPhon = new GUI.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLm = new GUI.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtAm = new GUI.TextField();
        jLabel6 = new javax.swing.JLabel();
        staff = new GUI.RadioButtonCustom();
        student = new GUI.RadioButtonCustom();
        femaleRadioButton = new GUI.RadioButtonCustom();
        maleRadioButton = new GUI.RadioButtonCustom();
        addEmpBtn = new GUI.Button();
        txtPositionOrMajor = new GUI.TextField();
        lblPositionOrMajor = new javax.swing.JLabel();
        txtDepartmentOrTeam = new GUI.TextField();
        lblDepartmenOrTeam = new javax.swing.JLabel();
        txtDm = new GUI.TextField();
        jLabel9 = new javax.swing.JLabel();
        button1 = new GUI.Button();

        dateChooserAddMem.setForeground(new java.awt.Color(68, 176, 191));

        setBackground(new java.awt.Color(42, 107, 120));

        textField1.setEditable(false);
        textField1.setBackground(new java.awt.Color(233, 189, 78));
        textField1.setForeground(new java.awt.Color(0, 0, 0));
        textField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField1.setText("Registar New Member Form");
        textField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textField1.setRound(50);
        textField1.setShadowColor(new java.awt.Color(0, 0, 0));

        txtFm.setBackground(new java.awt.Color(68, 176, 191));
        txtFm.setName("memf"); // NOI18N
        txtFm.setRound(30);
        txtFm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 189, 78));
        jLabel1.setText("First Name");

        txtPhon.setBackground(new java.awt.Color(68, 176, 191));
        txtPhon.setRound(30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 189, 78));
        jLabel4.setText("Phone number ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 189, 78));
        jLabel2.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 189, 78));
        jLabel5.setText("Gender");

        txtLm.setBackground(new java.awt.Color(68, 176, 191));
        txtLm.setRound(30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 189, 78));
        jLabel3.setText("Address");

        txtAm.setBackground(new java.awt.Color(68, 176, 191));
        txtAm.setRound(30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(233, 189, 78));
        jLabel6.setText("Member Type");

        RadioButtonMember.add(staff);
        staff.setText("Staff");
        staff.setFocusPainted(false);
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });

        RadioButtonMember.add(student);
        student.setText("Student");
        student.setFocusPainted(false);
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        RadioButtonGender.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.setFocusPainted(false);
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        RadioButtonGender.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.setFocusPainted(false);
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        addEmpBtn.setBackground(new java.awt.Color(68, 176, 191));
        addEmpBtn.setForeground(new java.awt.Color(233, 189, 78));
        addEmpBtn.setText("Add");
        addEmpBtn.setFocusPainted(false);
        addEmpBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemBtnActionPerformed(evt);
            }
        });

        txtPositionOrMajor.setBackground(new java.awt.Color(68, 176, 191));
        txtPositionOrMajor.setRound(30);

        lblPositionOrMajor.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblPositionOrMajor.setForeground(new java.awt.Color(233, 189, 78));
        lblPositionOrMajor.setText("Position");

        txtDepartmentOrTeam.setBackground(new java.awt.Color(68, 176, 191));
        txtDepartmentOrTeam.setRound(30);

        lblDepartmenOrTeam.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblDepartmenOrTeam.setForeground(new java.awt.Color(233, 189, 78));
        lblDepartmenOrTeam.setText("Department");

        txtDm.setBackground(new java.awt.Color(68, 176, 191));
        txtDm.setRound(30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(233, 189, 78));
        jLabel9.setText("Date of birth");

        button1.setText("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFm, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtLm, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAm, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDm, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhon, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtPositionOrMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDepartmentOrTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPositionOrMajor)
                                    .addComponent(lblDepartmenOrTeam))))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(addEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblPositionOrMajor)
                        .addGap(0, 0, 0)
                        .addComponent(txtPositionOrMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDepartmenOrTeam)
                        .addGap(0, 0, 0)
                        .addComponent(txtDepartmentOrTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(txtAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFmActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void addMemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemBtnActionPerformed
        String gender = "";
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        }
        try {
            if (student.isSelected()) {
                ///lablablab the one for the show and remove
                Member m = new Member(txtFm.getText(), txtLm.getText(), txtAm.getText(), txtPhon.getText(), gender, txtDm.getText());
                GymSystem.members.add(m);
                obj.jLabel1.setText("A new Member has been added");
                GlassPanePopup.showPopup(obj);
            }
            if (staff.isSelected()) {
                //// same lalalalalalal for show and remove
                Member m = new Member(txtFm.getText(), txtLm.getText(), txtAm.getText(), txtPhon.getText(), gender, txtDm.getText());
                GymSystem.members.add(m);
                obj.jLabel1.setText("A new Member has been added");
                GlassPanePopup.showPopup(obj);
            }
            txtFm.setText("");
            txtLm.setText("");
            txtAm.setText("");
            txtPhon.setText("");
            txtDm.setText("");
            RadioButtonGender.clearSelection();
            FileManager.getInstance().WriteMember();
        } catch (Exception e) {
            obj.jLabel1.setText("Please check your input data");
            GlassPanePopup.showPopup(obj);
        }

    }//GEN-LAST:event_addMemBtnActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        showExtraData();
        if (student.isSelected()) {
            lblPositionOrMajor.setText("Major");
            lblDepartmenOrTeam.setText("Sport Team");
            
        }       
            }//GEN-LAST:event_studentActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        showExtraData();
        if (staff.isSelected()) {
            lblPositionOrMajor.setText("Position");
            lblDepartmenOrTeam.setText("Department");
            
        }
    }//GEN-LAST:event_staffActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
dateChooserAddMem.showPopup();
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RadioButtonGender;
    private javax.swing.ButtonGroup RadioButtonMember;
    private GUI.Button addEmpBtn;
    private GUI.Button button1;
    private Calander.DateChooser dateChooserAddMem;
    private GUI.RadioButtonCustom femaleRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDepartmenOrTeam;
    private javax.swing.JLabel lblPositionOrMajor;
    private GUI.RadioButtonCustom maleRadioButton;
    private GUI.RadioButtonCustom staff;
    private GUI.RadioButtonCustom student;
    private GUI.TextField textField1;
    private GUI.TextField txtAm;
    private GUI.TextField txtDepartmentOrTeam;
    private GUI.TextField txtDm;
    private GUI.TextField txtFm;
    private GUI.TextField txtLm;
    private GUI.TextField txtPhon;
    private GUI.TextField txtPositionOrMajor;
    // End of variables declaration//GEN-END:variables
        public void showExtraData() {
        boolean check = RadioButtonMember.getSelection() != null ? true : false;
        
        lblPositionOrMajor.setVisible(check);
        txtPositionOrMajor.setVisible(check);
        lblDepartmenOrTeam.setVisible(check);
        txtDepartmentOrTeam.setVisible(check);
    }
}
