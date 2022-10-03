package bus_mgmt;


import bus_mgmt.connect_db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;



public class Driver_Info extends javax.swing.JFrame {
    PreparedStatement ps;
    String sql=null;
    Connection conn;

    
    public Driver_Info() throws SQLException {
        initComponents();
        try{
            txtid.setEnabled(false);
        connect_db d=new connect_db();
        conn=DriverManager.getConnection(d.ss, d.stuid,d.stupw);
        }
        catch(Exception e)
        {
            System.out.println(e);;
        }
    }

    
    @SuppressWarnings("unchecked")
    public Boolean valid()
    {
    if(txtname.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Enter name");
    }
    
    if(txtfathername.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Enter father name");
    }
    
    if(txtaddress.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Enter Address");
    }
    
    if(txtdob.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Enter D.O.B");
    }
    
    if(txtqualification.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Enter Qualification");
    }
    
    if(txtexperience.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Enter Experience");
    }
    
    if(txtlicence.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Enter Licence Detail");
    }
    
    if(txtcontact.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Enter Contact No");
    }
    
    
    return true;
    }
            
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                Image img=Toolkit.getDefaultToolkit().getImage(Driver_Info.class.getResource("/images/10.jpg"));
                g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
            }
        };
        btupdate = new javax.swing.JButton();
        refifany = new javax.swing.JLabel();
        viewinfobt = new javax.swing.JButton();
        contactno = new javax.swing.JLabel();
        btdelete = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtfathername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        experience = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtcontact = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtlicence = new javax.swing.JTextField();
        btreset = new javax.swing.JButton();
        txtref = new javax.swing.JTextField();
        Qualification = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        txtqualification = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        txtexperience = new javax.swing.JTextField();
        fathername = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        licencedetail = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        jLabel9.setText("jLabel9");

        btupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\BAL\\Documents\\NetBeansProjects\\Bus_Mgmt\\src\\images\\software_update.png")); // NOI18N
        btupdate.setText("Update");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        refifany.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refifany.setText("Ref If Any");

        viewinfobt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewinfobt.setIcon(new javax.swing.ImageIcon("C:\\Users\\BAL\\Documents\\NetBeansProjects\\Bus_Mgmt\\src\\images\\new_doc.png")); // NOI18N
        viewinfobt.setText("View Info");
        viewinfobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewinfobtActionPerformed(evt);
            }
        });

        contactno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contactno.setText("Contact No");

        btdelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btdelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\BAL\\Documents\\NetBeansProjects\\Bus_Mgmt\\src\\images\\delete1.png")); // NOI18N
        btdelete.setText("Delete");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtfathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfathernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Driver Id");

        experience.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        experience.setText(" Experience");

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        btreset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btreset.setText("Reset");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });

        txtref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrefActionPerformed(evt);
            }
        });

        Qualification.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Qualification.setText("Qualification");

        dob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dob.setText("D.O.B");

        address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        address.setText("Address");

        fathername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fathername.setText("Father's Name");

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.setText("Name");

        txtdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdobActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DRIVER INFORMATION");

        licencedetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        licencedetail.setText("Licence Detail");

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon("C:\\Users\\BAL\\Documents\\NetBeansProjects\\Bus_Mgmt\\src\\images\\save1.png")); // NOI18N
        submit.setText("Save");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        btback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btback.setIcon(new javax.swing.ImageIcon("C:\\Users\\BAL\\Documents\\NetBeansProjects\\Bus_Mgmt\\src\\images\\exit1.png")); // NOI18N
        btback.setText("Back");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address)
                            .addComponent(fathername)
                            .addComponent(dob)
                            .addComponent(name)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(txtfathername, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(licencedetail)
                                    .addComponent(experience)
                                    .addComponent(contactno)
                                    .addComponent(Qualification)
                                    .addComponent(refifany))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtqualification, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtexperience, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(73, 73, 73))
                                        .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtlicence, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtref, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btreset)
                        .addGap(18, 18, 18)
                        .addComponent(submit)
                        .addGap(30, 30, 30)
                        .addComponent(btupdate)
                        .addGap(18, 18, 18)
                        .addComponent(btdelete)
                        .addGap(37, 37, 37)
                        .addComponent(viewinfobt)
                        .addGap(30, 30, 30)
                        .addComponent(btback)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name)
                    .addComponent(txtlicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licencedetail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Qualification)
                                    .addComponent(txtqualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(refifany, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dob)))
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btreset)
                    .addComponent(btupdate)
                    .addComponent(btback)
                    .addComponent(submit)
                    .addComponent(btdelete)
                    .addComponent(viewinfobt))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(905, 905, 905)
                .addComponent(jLabel9)
                .addContainerGap(95, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewinfobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewinfobtActionPerformed
        this.hide();
        Driver_table d=new Driver_table();
        d.setVisible(true);
    }//GEN-LAST:event_viewinfobtActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed

        int response=JOptionPane.showConfirmDialog(null,"do you want to delete","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(response==JOptionPane.YES_NO_OPTION)
        {
            try{
                String strdel="delete from driver_info where S_No='"+ txtid.getText()+"'";
                ps=conn.prepareStatement(strdel);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Record is successfully deleted");
                txtid.setText("");
                txtname.setText("");
                txtaddress.setText("");
                txtcontact.setText("");
                txtdob.setText("");
                txtexperience.setText("");
                txtfathername.setText("");
                txtlicence.setText("");
                txtqualification.setText("");
                txtref.setText("");
                //this.hide();
                Driver_table dt=new Driver_table();
                this.hide();
                dt.setVisible(true);
                dt.show_data();
              
            }
            catch(Exception e )
            {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        txtname.setText("");
        txtfathername.setText("");
        txtaddress.setText("");
        txtcontact.setText("");
        txtexperience.setText("");
        txtdob.setText("");
        txtlicence.setText("");
        txtref.setText("");
        txtref.setText("");
        txtqualification.setText("");
    }//GEN-LAST:event_btresetActionPerformed

    private void txtdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdobActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try{
            sql="insert into driver_info(Name,Father_Name,Address,D_O_B,Qualification,Exp,Licence_Details,Contact_No,Ref_If_Any)values('"+txtname.getText()+"','"+txtfathername.getText()+"','"+txtaddress.getText()+"','"+txtdob.getText()+"','"+txtqualification.getText()+"','"+txtexperience.getText()+"','"+txtlicence.getText()+"','"+txtcontact.getText()+"','"+txtref.getText()+"')";
            ps=conn.prepareStatement(sql);
            ps.execute();
            valid();
            JOptionPane.showMessageDialog(this, "Record Saved Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtfathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfathernameActionPerformed

    private void txtrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrefActionPerformed

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        // TODO add your handling code here:     
        int response=JOptionPane.showConfirmDialog(null,"Do You Want To Update This Record","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION) 
        { try {
            String strupdate="update driver_info set Name='"+txtname.getText()+"',Father_Name='"+txtfathername.getText()+"',Address='"+txtaddress.getText()+"',D_O_B='"+txtdob.getText()+"',Qualification='"+txtqualification.getText()+"',Exp='"+txtexperience.getText()+"',Licence_Details='"+txtlicence.getText()+"',Contact_No='"+txtcontact.getText()+"',Ref_If_Any='"+txtref.getText()+"' where S_No='"+txtid.getText()+"'";
            ps=conn.prepareStatement(strupdate);
            ps.execute();
            JOptionPane.showMessageDialog(this, "Record is updated Successfully");
            txtid.setText("");
        txtname.setText("");
        Driver_table dt=new Driver_table();
            dt.show_data();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        }

        
    }//GEN-LAST:event_btupdateActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // TODO add your handling code here:
        Bus_Menu bm=new Bus_Menu();
        bm.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btbackActionPerformed

                                                                                                                                                                                                                                                                                                                                                                                                                                                
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Driver_Info().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Driver_Info.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Qualification;
    private javax.swing.JLabel address;
    private javax.swing.JButton btback;
    public javax.swing.JButton btdelete;
    public javax.swing.JButton btreset;
    public javax.swing.JButton btupdate;
    private javax.swing.JLabel contactno;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel experience;
    private javax.swing.JLabel fathername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel licencedetail;
    private javax.swing.JLabel name;
    private javax.swing.JLabel refifany;
    public javax.swing.JButton submit;
    public javax.swing.JTextArea txtaddress;
    public javax.swing.JTextField txtcontact;
    public javax.swing.JTextField txtdob;
    public javax.swing.JTextField txtexperience;
    public javax.swing.JTextField txtfathername;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtlicence;
    public javax.swing.JTextField txtname;
    public javax.swing.JTextField txtqualification;
    public javax.swing.JTextField txtref;
    public javax.swing.JButton viewinfobt;
    // End of variables declaration//GEN-END:variables
}
