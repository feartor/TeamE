
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheMonster
 */
public class EmpGUI extends javax.swing.JFrame {
    // class level references or attributes
    private DefaultListModel<Emp> model;
    /**
     * Creates new form StocksGUI
     */
    public EmpGUI() {
        // creat the model fo the JList
        model = new DefaultListModel<Emp>();
        
        initComponents();
        
        // set form to center of screen
        this.setLocationRelativeTo(null);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpMainTabs = new javax.swing.JTabbedPane();
        pnlAddEmp = new javax.swing.JPanel();
        lblnameF = new javax.swing.JLabel();
        txtnameF = new javax.swing.JTextField();
        txtnameL = new javax.swing.JTextField();
        lblnameL = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        lblPurchasePrice = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        btnAddEmp = new javax.swing.JButton();
        pnlEmpList = new javax.swing.JPanel();
        scrEmp = new javax.swing.JScrollPane();
        lstEmp = new javax.swing.JList<>();
        btnRemoveEmp = new javax.swing.JButton();
        mnbMainMenu = new javax.swing.JMenuBar();
        mniFile = new javax.swing.JMenu();
        mniOpen = new javax.swing.JMenuItem();
        mniSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rocket Systems App");

        lblnameF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblnameF.setText("First Name:");

        txtnameF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtnameL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblnameL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblnameL.setText("Last Name:");

        txtDepartment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPurchasePrice.setText("Department:");

        txtID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblID.setText("ID:");

        btnAddEmp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddEmp.setText("Add Employee");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddEmpLayout = new javax.swing.GroupLayout(pnlAddEmp);
        pnlAddEmp.setLayout(pnlAddEmpLayout);
        pnlAddEmpLayout.setHorizontalGroup(
            pnlAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddEmpLayout.createSequentialGroup()
                        .addComponent(lblnameF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnameF, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddEmpLayout.createSequentialGroup()
                        .addComponent(lblnameL, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnameL, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddEmpLayout.createSequentialGroup()
                        .addComponent(lblPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddEmpLayout.createSequentialGroup()
                        .addGroup(pnlAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddEmp)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddEmpLayout.setVerticalGroup(
            pnlAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnameF)
                    .addComponent(txtnameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnameL)
                    .addComponent(txtnameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurchasePrice)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnAddEmp)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jtpMainTabs.addTab("Add Employee", pnlAddEmp);

        lstEmp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lstEmp.setModel(model);
        lstEmp.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEmpValueChanged(evt);
            }
        });
        scrEmp.setViewportView(lstEmp);

        btnRemoveEmp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemoveEmp.setText("Remove Employee");
        btnRemoveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEmpListLayout = new javax.swing.GroupLayout(pnlEmpList);
        pnlEmpList.setLayout(pnlEmpListLayout);
        pnlEmpListLayout.setHorizontalGroup(
            pnlEmpListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpListLayout.createSequentialGroup()
                .addGroup(pnlEmpListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmpListLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnRemoveEmp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmpListLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrEmp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEmpListLayout.setVerticalGroup(
            pnlEmpListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnRemoveEmp)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jtpMainTabs.addTab("List", pnlEmpList);

        mniFile.setText("File");
        mniFile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mniOpen.setText("Open");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mniFile.add(mniOpen);

        mniSave.setText("Save");
        mniSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        mniFile.add(mniSave);
        mniFile.add(jSeparator1);

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mniFile.add(mniExit);

        mnbMainMenu.add(mniFile);

        setJMenuBar(mnbMainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpMainTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpMainTabs, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        //Verify that the feilds are complete
        if(txtnameF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "First Name is required.", "Error. Missing Information",JOptionPane.ERROR_MESSAGE);
            txtnameF.requestFocus();
              return;
        }
        
        if(txtnameL.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Last Name is required.", "Error. Missing Information",JOptionPane.ERROR_MESSAGE);
            txtnameL.requestFocus();
              return;
        }
        
        if(txtDepartment.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Department is required.", "Error. Missing Information",JOptionPane.ERROR_MESSAGE);
            txtDepartment.requestFocus();
              return;
        }
        
        if(txtID.getText().equals("")){
            JOptionPane.showMessageDialog(this, "ID is required.", "Error. Missing Information",JOptionPane.ERROR_MESSAGE);
            txtID.requestFocus();
              return;
        }
        // get input
        String nameF = txtnameF.getText();
        String nameL = txtnameL.getText();
        String department = txtDepartment.getText();
        String ID = txtID.getText();
       
        //create the Emp object
        Emp emp = new Emp(nameF, nameL, department, ID);
        
        //add the Emp object to the JList
        model.addElement(emp);
       
        // reset form for the next emp
        txtnameF.setText("");
        txtnameL.setText("");
        txtDepartment.setText("");
        txtID.setText("");
        txtnameF.requestFocus();
        
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void lstEmpValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEmpValueChanged
        // get stock and who the current profit/loss
        Emp emp = lstEmp.getSelectedValue();
      
    }//GEN-LAST:event_lstEmpValueChanged

    private void btnRemoveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEmpActionPerformed
        // get stock position
        int position = lstEmp.getSelectedIndex();
        
        // if selected, remove the stock
        if(position >= 0){
            model.remove(position);
        }
        
    }//GEN-LAST:event_btnRemoveEmpActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
    //get file name
    String fileName = JOptionPane.showInputDialog("Enter filename: ");
    

    //save data to the file
    EmpIO outToFile = new EmpIO(fileName);
    
    ArrayList<Emp> data = new ArrayList<Emp>();
    
    for(int i =0; i < model.size(); i++){
        
        Emp emp = model.elementAt(i);
        data.add(emp);
    }
    outToFile.saveData(data);
    
    JOptionPane.showMessageDialog(this, "Data was saved to the file!");
    
    }//GEN-LAST:event_mniSaveActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        // get the file name
        String fileName = JOptionPane.showInputDialog("Enter filename: ");
        
        //get data from the file
        EmpIO inFromFile = new EmpIO(fileName);
        
        ArrayList<Emp> data = inFromFile.getData();
        
        //clear the model and copy new data
        model.clear();
        for (int i = 0; i < data.size(); i++)
        {
            Emp emp = data.get(i);
            model.addElement(emp);
        }
                
    }//GEN-LAST:event_mniOpenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnRemoveEmp;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jtpMainTabs;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPurchasePrice;
    private javax.swing.JLabel lblnameF;
    private javax.swing.JLabel lblnameL;
    private javax.swing.JList<Emp> lstEmp;
    private javax.swing.JMenuBar mnbMainMenu;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenu mniFile;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JPanel pnlAddEmp;
    private javax.swing.JPanel pnlEmpList;
    private javax.swing.JScrollPane scrEmp;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtnameF;
    private javax.swing.JTextField txtnameL;
    // End of variables declaration//GEN-END:variables

}
