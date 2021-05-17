/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_projects;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class SignUpClass extends javax.swing.JFrame
{
    boolean showflag = true;
    /**
     * Creates new form SignInClass
     */
    public SignUpClass()
    {
        initComponents();
        displayImage(lblsubmit,"F:\\Regal JAVA\\AWT & SWING\\Java_Projects\\images\\submit.png");
        displayImage(lblshowpass,"F:\\Regal JAVA\\AWT & SWING\\Java_Projects\\images\\eye-1.jpg");
        addWindowListener(new WindowClose(new LoginFrame()));
    }
    
    public void displayImage(JLabel lbl,String path)
    {
        ImageIcon ic = new ImageIcon(path);
        Image img = ic.getImage();
        Image newimg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(newimg);
        lbl.setIcon(im);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        lblsigninform = new javax.swing.JLabel();
        enteruser = new javax.swing.JLabel();
        enteruser1 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        enteruser2 = new javax.swing.JLabel();
        enteruser3 = new javax.swing.JLabel();
        lblmsg = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txthint = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        enteruser4 = new javax.swing.JLabel();
        lblsubmit = new javax.swing.JLabel();
        confirmpassfield = new javax.swing.JPasswordField();
        enterpassfield = new javax.swing.JPasswordField();
        lblshowpass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        lblsigninform.setBackground(new java.awt.Color(255, 255, 204));
        lblsigninform.setFont(new java.awt.Font("Californian FB", 1, 30)); // NOI18N
        lblsigninform.setForeground(new java.awt.Color(255, 0, 51));
        lblsigninform.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsigninform.setText("ENTER YOUR DETAILS");
        lblsigninform.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblsigninform.setOpaque(true);
        lblsigninform.setPreferredSize(new java.awt.Dimension(280, 40));

        enteruser.setBackground(new java.awt.Color(255, 255, 204));
        enteruser.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        enteruser.setForeground(new java.awt.Color(255, 0, 0));
        enteruser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enteruser.setText("Enter Username : ");
        enteruser.setOpaque(true);
        enteruser.setPreferredSize(new java.awt.Dimension(40, 30));

        enteruser1.setBackground(new java.awt.Color(255, 255, 204));
        enteruser1.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        enteruser1.setForeground(new java.awt.Color(255, 0, 0));
        enteruser1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enteruser1.setText("Create Password : ");
        enteruser1.setOpaque(true);
        enteruser1.setPreferredSize(new java.awt.Dimension(40, 30));

        txtuser.setFont(new java.awt.Font("Californian FB", 0, 20)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 0, 0));
        txtuser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtuser.setToolTipText("");
        txtuser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtuser.setPreferredSize(new java.awt.Dimension(200, 40));
        txtuser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtuserActionPerformed(evt);
            }
        });

        enteruser2.setBackground(new java.awt.Color(255, 255, 204));
        enteruser2.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        enteruser2.setForeground(new java.awt.Color(255, 0, 0));
        enteruser2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enteruser2.setText("Enter EMAIL ID : ");
        enteruser2.setOpaque(true);
        enteruser2.setPreferredSize(new java.awt.Dimension(40, 30));

        enteruser3.setBackground(new java.awt.Color(255, 255, 204));
        enteruser3.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        enteruser3.setForeground(new java.awt.Color(255, 0, 0));
        enteruser3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enteruser3.setText("Enter Hints : ");
        enteruser3.setOpaque(true);
        enteruser3.setPreferredSize(new java.awt.Dimension(40, 30));

        lblmsg.setBackground(new java.awt.Color(255, 255, 255));
        lblmsg.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblmsg.setForeground(new java.awt.Color(255, 0, 0));
        lblmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtemail.setFont(new java.awt.Font("Californian FB", 0, 20)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 0, 0));
        txtemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtemail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtemail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtemail.setPreferredSize(new java.awt.Dimension(200, 40));
        txtemail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtemailActionPerformed(evt);
            }
        });

        txthint.setFont(new java.awt.Font("Californian FB", 0, 20)); // NOI18N
        txthint.setForeground(new java.awt.Color(255, 0, 0));
        txthint.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txthint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txthint.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txthint.setPreferredSize(new java.awt.Dimension(200, 40));

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));

        enteruser4.setBackground(new java.awt.Color(255, 255, 204));
        enteruser4.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        enteruser4.setForeground(new java.awt.Color(255, 0, 0));
        enteruser4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enteruser4.setText("Confirm Password : ");
        enteruser4.setOpaque(true);
        enteruser4.setPreferredSize(new java.awt.Dimension(40, 30));

        lblsubmit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblsubmitMouseClicked(evt);
            }
        });

        confirmpassfield.setFont(new java.awt.Font("Californian FB", 0, 20)); // NOI18N
        confirmpassfield.setForeground(new java.awt.Color(255, 0, 0));
        confirmpassfield.setToolTipText("");
        confirmpassfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        confirmpassfield.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(enteruser4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(confirmpassfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(lblsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enteruser4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(confirmpassfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        enterpassfield.setFont(new java.awt.Font("Californian FB", 0, 20)); // NOI18N
        enterpassfield.setForeground(new java.awt.Color(255, 0, 0));
        enterpassfield.setToolTipText("");
        enterpassfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        enterpassfield.setPreferredSize(new java.awt.Dimension(200, 30));

        lblshowpass.setPreferredSize(new java.awt.Dimension(40, 40));
        lblshowpass.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblshowpassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enteruser3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enteruser2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enteruser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enteruser1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txthint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterpassfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblshowpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(159, 205, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblsigninform, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblsigninform, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enteruser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(enteruser1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(enterpassfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblshowpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enteruser2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enteruser3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblsubmitMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblsubmitMouseClicked
    {//GEN-HEADEREND:event_lblsubmitMouseClicked
        if(txtuser.getText().isEmpty() | enterpassfield.getText().isEmpty() | confirmpassfield.getText().isEmpty() | txtemail.getText().isEmpty() | txthint.getText().isEmpty())
        {
            lblmsg.setText("Field(s) are Empty");
            lblmsg.setOpaque(true);
        }
        else
        {
            lblmsg.setText("");
            lblmsg.setOpaque(false);
            int res;
            res = JOptionPane.showConfirmDialog(null,"Press OK!! If Details Entered Are Correct", "Are You Sure You Want To Submit?", JOptionPane.YES_NO_CANCEL_OPTION);
            if(res == JOptionPane.YES_OPTION)
            {
                if(Arrays.equals(enterpassfield.getPassword(), confirmpassfield.getPassword()))
                {
                    int flag = 0;
                    try
                    {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
                        Statement st = con.createStatement();
                        String query = "Insert into database.login(uname,passw,emailid,hint) values ('" + txtuser.getText().trim() + "','" + new String(enterpassfield.getPassword()) + "','" + txtemail.getText().trim() + "','" + txthint.getText().trim() + "')";
                        st.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Submitted Successfully");
                    }
                    catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, "Error When Submitting" + ex);
                        ex.printStackTrace();
                        flag = 1;
                    }
                    if(flag == 0)
                    {
                        new LoginFrame().setVisible(true);
                        dispose();
                        JOptionPane.showMessageDialog(null, "Account Created Successfully");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Created And Confirmed Password must be same");
                }
            }
        }
    }//GEN-LAST:event_lblsubmitMouseClicked

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtuserActionPerformed
    {//GEN-HEADEREND:event_txtuserActionPerformed
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            Statement st = con.createStatement();
            String query = "Select from database.login where uname = '" + txtuser.getText().trim() + "'";
            ResultSet rs;
            rs = st.executeQuery(query);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Username Already Exists!! Please Enter Valid Username");
                txtuser.setText(JOptionPane.showInputDialog("Enter Username Again"));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtemailActionPerformed
    {//GEN-HEADEREND:event_txtemailActionPerformed
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","root");
            Statement st = con.createStatement();
            String query = "Select from database.login where emailid = '" + txtemail.getText().trim() + "'";
            ResultSet rs;
            rs = st.executeQuery(query);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Email ID Already Exists!! Please Enter Valid Email ID");
                txtemail.setText(JOptionPane.showInputDialog("Enter Email ID Again"));
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtemailActionPerformed

    private void lblshowpassMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblshowpassMouseClicked
    {//GEN-HEADEREND:event_lblshowpassMouseClicked
        if(showflag == true)
        {
            displayImage(lblshowpass,"F:\\JAVA\\AWT\\Java_Projects\\images\\eye-2.png");
            enterpassfield.setEchoChar((char)0);
            showflag = false;
        }
        else
        {
            displayImage(lblshowpass,"F:\\JAVA\\AWT\\Java_Projects\\images\\eye-1.jpg");
            enterpassfield.setEchoChar('*');
            showflag = true;
        }
    }//GEN-LAST:event_lblshowpassMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SignUpClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SignUpClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SignUpClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SignUpClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new SignUpClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmpassfield;
    private javax.swing.JPasswordField enterpassfield;
    private javax.swing.JLabel enteruser;
    private javax.swing.JLabel enteruser1;
    private javax.swing.JLabel enteruser2;
    private javax.swing.JLabel enteruser3;
    private javax.swing.JLabel enteruser4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JLabel lblshowpass;
    private javax.swing.JLabel lblsigninform;
    private javax.swing.JLabel lblsubmit;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthint;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
