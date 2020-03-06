/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;


import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */


public class BookingRoomID extends javax.swing.JFrame {

    java.sql.Connection conn=null;
    ResultSet rs,rs1=null;
    Statement st,st1;
    /**
     * Creates new form booking
     */
    public BookingRoomID() {
        initComponents();
        group();
        try
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","java");   
            st=(Statement)conn.createStatement();
            rs=st.executeQuery("select * from guest where id = '" + IDBook.ID + "'");
            rs.next();
            txtname.setText(rs.getString(1));
            txtid.setText(rs.getString(2));
            txtphonenum.setText(rs.getString(3));
        } 
        catch (SQLException ex) {
            Logger.getLogger(BookingRoomID.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtroomnum.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtroomnum = new javax.swing.JTextField();
        Book = new javax.swing.JButton();
        rbtriple = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtphonenum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtnightnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbcash = new javax.swing.JRadioButton();
        rbcredit = new javax.swing.JRadioButton();
        Homepage = new javax.swing.JButton();
        rbsingle = new javax.swing.JRadioButton();
        rbdouble = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tolip Royal Hotel");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Booking", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 48), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Guest Name ");

        txtname.setBackground(new java.awt.Color(204, 204, 204));
        txtname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Guest ID");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Number of Rooms wanted");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Room’s Type ");

        txtid.setBackground(new java.awt.Color(204, 204, 204));
        txtid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtroomnum.setBackground(new java.awt.Color(204, 204, 204));
        txtroomnum.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Book.setBackground(new java.awt.Color(153, 255, 153));
        Book.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Book.setForeground(new java.awt.Color(0, 153, 0));
        Book.setText("Book");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });

        rbtriple.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbtriple.setForeground(new java.awt.Color(204, 204, 204));
        rbtriple.setText("Triple ");
        rbtriple.setActionCommand("");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Guest phone number");

        txtphonenum.setBackground(new java.awt.Color(204, 204, 204));
        txtphonenum.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nights Number");

        txtnightnum.setBackground(new java.awt.Color(204, 204, 204));
        txtnightnum.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtnightnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnightnumActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Arrival Date");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Type of Payment ");

        rbcash.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rbcash.setForeground(new java.awt.Color(204, 204, 204));
        rbcash.setText("Cash");

        rbcredit.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rbcredit.setForeground(new java.awt.Color(204, 204, 204));
        rbcredit.setText("Credit");

        Homepage.setBackground(new java.awt.Color(153, 153, 153));
        Homepage.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Homepage.setForeground(new java.awt.Color(0, 0, 102));
        Homepage.setText("Home Page");
        Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomepageActionPerformed(evt);
            }
        });

        rbsingle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbsingle.setForeground(new java.awt.Color(204, 204, 204));
        rbsingle.setText("Single");

        rbdouble.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbdouble.setForeground(new java.awt.Color(204, 204, 204));
        rbdouble.setText("Double");

        jDateChooser1.setBackground(new java.awt.Color(204, 204, 204));
        jDateChooser1.setDateFormatString("dd / MM / yyyy");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Book, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(Homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rbsingle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(rbdouble)
                                .addGap(18, 18, 18)
                                .addComponent(rbtriple, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtid)
                            .addComponent(txtname)
                            .addComponent(txtphonenum)
                            .addComponent(txtroomnum)
                            .addComponent(txtnightnum)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbcash, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbcredit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtphonenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtroomnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtriple)
                    .addComponent(rbsingle)
                    .addComponent(rbdouble))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnightnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rbcash)
                    .addComponent(rbcredit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Book)
                    .addComponent(Homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void group()
    {
        ButtonGroup roomtype = new ButtonGroup();
        roomtype.add(rbsingle);
        roomtype.add(rbdouble);
        roomtype.add(rbtriple);
        ButtonGroup paymenttype = new ButtonGroup();
        paymenttype.add(rbcash);
        paymenttype.add(rbcredit);
    }
    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed

        String name=txtname.getText();
        String id=txtid.getText();
        String phone=txtphonenum.getText();
        if("".equals(name) ||"".equals(id) ||"".equals(phone) ||!rbsingle.isSelected() && !rbdouble.isSelected() && !rbtriple.isSelected() || !rbcash.isSelected() && !rbcredit.isSelected())
        {
            JOptionPane.showMessageDialog(null, "You must Fill all Fields", "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String roomnum;
        String nightnum;
        String roomtype = null,paymenttype=null;
        int roomnumbe;
        String roomnuber=null;
        String roomnuberr=null;
        double total=0;
        int numrooms,nightnumber,r1,r3;
        try
        {
            roomnum=txtroomnum.getText();
            if("".equals(roomnum))
            {
                JOptionPane.showMessageDialog(null, "You must Fill all Fields", "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
                return;
            }
            numrooms=Integer.parseInt(roomnum);
            if(numrooms<=0)
            {
                JOptionPane.showMessageDialog(null, "Invalid Number of Rooms", "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
                txtroomnum.setText(null);
                txtroomnum.grabFocus();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid Number of Rooms", "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
            txtroomnum.setText(null);
            txtroomnum.grabFocus();
            return;
        }
        try
        {
            nightnum=txtnightnum.getText();
            if("".equals(nightnum))
            {
                JOptionPane.showMessageDialog(null, "You must Fill all Fields", "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
                return;
            }
            nightnumber=Integer.parseInt(nightnum);
            if(nightnumber<=0)
            {
                JOptionPane.showMessageDialog(null, "Invalid Number of Nights", "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
                txtnightnum.setText(null);
                txtnightnum.grabFocus();
                return;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid Number of Nights", "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
            txtnightnum.setText(null);
            txtnightnum.grabFocus();
            return;
        }
        java.util.Date y=jDateChooser1.getDate();
        DateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd");  
        String date= dateFormat.format(y);           
        String day=date.substring(8, 10);
        String month=date.substring(5, 7);
        String year=date.substring(0, 4);
        if(day.startsWith("0"))
        {
            day=day.substring(1);
        }
        if(month.startsWith("0"))
        {
            month=month.substring(1);
        }
        String checkin=day+"/"+month+"/"+year;
        r1=Integer.parseInt(day);
        r3=Integer.parseInt(month);  
        int r=r1+nightnumber;
        if(r3==1 || r3==3 || r3==5 || r3== 7 || r3==8 || r3==10 || r3==12)
        {
            if(r>=31 && r<=61)
            {
                r-=31;
                r3++;
            }
        }
        if(r3==4 || r3==6 || r3==9 || r3==11)
        {
            if(r>=30 && r<=60)
            {
                r-=30;
                r3++;
            }
        }
        month=Integer.toString(r3);
        day=Integer.toString(r);
        String checkout=day+"/"+month+"/"+year;
        boolean flag1;
        int flag=0;
        if(rbsingle.isSelected())
        {
            int x=0;
            try
            {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","java");
                st=(Statement)conn.createStatement();
                rs=st.executeQuery("SELECT * FROM ROOM where availablity='True' and roomtype = 'Single'");
                while(rs.next())
                {
                    x++;
                }
                if(x<numrooms)
                {
                    JOptionPane.showMessageDialog(null, "Single Rooms available is only "+x, "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
                    txtroomnum.setText(null);
                    txtroomnum.grabFocus();
                    return;
                }
                
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            ArrayList<String> g=new ArrayList();
            roomtype=rbsingle.getText();
            roomnumbe=(int)(100+Math.random()*10);
            roomnuber=Integer.toString(roomnumbe);
            try
            {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","java");
                st=(Statement)conn.createStatement();
                rs=st.executeQuery("SELECT * FROM ROOM where availablity='False'");
                while(rs.next())
                {
                    g.add(rs.getString(1));
                    flag++;
                }
                if(flag==0)
                {
                    g.add(roomnuber);
                }
                else
                {   
                flag1 = true;
                while(flag1)
                {
                    for(int i=0; i<g.size();i++)
                    {
                        if(g.get(i).equals(roomnuber))
                        {
                            roomnumbe=(int)(100+Math.random()*10);
                            roomnuber=Integer.toString(roomnumbe);
                            break;
                        }
                        if(i==g.size()-1){
                            flag1=false;
                        }
                    }
                }
                g.add(roomnuber);
            }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(BookingRoomID.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i=0;i<numrooms-1;i++)
            {
                roomnumbe=(int)(100+Math.random()*10);
                roomnuberr=Integer.toString(roomnumbe);
                flag1 = true;
                while(flag1){
                    for(int j=0; j<g.size();j++)
                    {
                        if(g.get(j).equals(roomnuberr))
                        {
                            roomnumbe=(int)(100+Math.random()*10);
                            roomnuberr=Integer.toString(roomnumbe);
                            break;
                        }
                        if(j==g.size()-1){
                            flag1=false;
                        }
                    }
                }
                g.add(roomnuberr);
                roomnuber+=","+roomnuberr;
            }  
            SingleRoom s=new SingleRoom();
            total=s.fees(nightnumber);
        }
        if(rbdouble.isSelected())
        {
            int x=0;
            try
            {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","java");
                st=(Statement)conn.createStatement();
                rs=st.executeQuery("SELECT * FROM ROOM where availablity='True' and roomtype = 'Double'");
                while(rs.next())
                {
                    x++;
                }
                if(x<numrooms)
                {
                    JOptionPane.showMessageDialog(null, "Double Rooms available is only "+x, "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
                    txtroomnum.setText(null);
                    txtroomnum.grabFocus();
                    return;
                }
                
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            ArrayList<String> g=new ArrayList();
            roomtype=rbdouble.getText();
            roomnumbe=(int)(200+Math.random()*10);
            roomnuber=Integer.toString(roomnumbe);
            try
            {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","java");
                st=(Statement)conn.createStatement();
                rs=st.executeQuery("SELECT * FROM ROOM where availablity='False'");
                while(rs.next())
                {
                    g.add(rs.getString(1));
                    flag++;
                }
                if(flag==0)
                {
                    g.add(roomnuber);
                }
                else
                {  
                flag1 = true;
                while(flag1)
                {
                    for(int i=0; i<g.size();i++)
                    {
                        if(g.get(i).equals(roomnuber))
                        {
                            roomnumbe=(int)(200+Math.random()*10);
                            roomnuber=Integer.toString(roomnumbe);
                            break;
                        }
                        if(i==g.size()-1){
                            flag1=false;
                        }
                    }
                }
                g.add(roomnuber);
            }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(BookingRoomID.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i=0;i<numrooms-1;i++)
            {
                roomnumbe=(int)(200+Math.random()*10);
                roomnuberr=Integer.toString(roomnumbe);
                flag1 = true;
                while(flag1){
                    for(int j=0; j<g.size();j++)
                    {
                        if(g.get(j).equals(roomnuberr))
                        {
                            roomnumbe=(int)(200+Math.random()*10);
                            roomnuberr=Integer.toString(roomnumbe);
                            break;
                        }
                        if(j==g.size()-1){
                            flag1=false;
                        }
                    }
                }
                g.add(roomnuberr);
                roomnuber+=","+roomnuberr;
            }  
            DoubleRoom s=new DoubleRoom();
            total=s.fees(nightnumber);
        }
        if(rbtriple.isSelected())
        {
            int x=0;
            try
            {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","java");
                st=(Statement)conn.createStatement();
                rs=st.executeQuery("SELECT * FROM ROOM where availablity='True' and roomtype = 'Triple'");
                while(rs.next())
                {
                    x++;
                }
                if(x<numrooms)
                {
                    JOptionPane.showMessageDialog(null, "Triple Rooms available is only "+x, "Tolip Royal Hotel", JOptionPane.ERROR_MESSAGE);
                    txtroomnum.setText(null);
                    txtroomnum.grabFocus();
                    return;
                }
                
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            ArrayList<String> g=new ArrayList();
            roomtype=rbtriple.getText();
            roomnumbe=(int)(300+Math.random()*10);
            roomnuber=Integer.toString(roomnumbe);
            try
            {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","java");
                st=(Statement)conn.createStatement();
                rs=st.executeQuery("SELECT * FROM ROOM where availablity='False'");
                while(rs.next())
                {
                    g.add(rs.getString(1));
                    flag++;
                }
                if(flag==0)
                {
                    g.add(roomnuber);
                }
                else
                {
                flag1 = true;
                while(flag1)
                {
                    for(int i=0; i<g.size();i++)
                    {
                        if(g.get(i).equals(roomnuber))
                        {
                            roomnumbe=(int)(300+Math.random()*10);
                            roomnuber=Integer.toString(roomnumbe);
                            break;
                        }
                        if(i==g.size()-1){
                            flag1=false;
                        }
                    }
                }
                g.add(roomnuber);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(BookingRoomID.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int i=0;i<numrooms-1;i++)
            {
                roomnumbe=(int)(300+Math.random()*10);
                roomnuberr=Integer.toString(roomnumbe);
                flag1 = true;
                while(flag1){
                    for(int j=0; j<g.size();j++)
                    {
                        if(g.get(j).equals(roomnuberr))
                        {
                            roomnumbe=(int)(300+Math.random()*10);
                            roomnuberr=Integer.toString(roomnumbe);
                            break;
                        }
                        if(j==g.size()-1){
                            flag1=false;
                        }
                    }
                }
                g.add(roomnuberr);
                roomnuber+=","+roomnuberr;
            }  
            TripleRoom s=new TripleRoom();
            total=s.fees(nightnumber);
        }
        if(rbcash.isSelected())
            paymenttype=rbcash.getText();
        if(rbcredit.isSelected())
            paymenttype=rbcredit.getText();
        String x=null;
        try
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","root","java");   
            String query1 = "insert into guest values ('"+name+"', '"+id+"', '"+phone+"', '"+roomnum+"', '"+roomnuber+"', '"+roomtype+"', '"+nightnum+"', '"+checkin+"', '"+checkout+"', '"+paymenttype+"',  '"+total+"', '0.0', '"+total+"', 'No', '"+LoginUser.user+"')";
            String query3="insert into data values ('"+roomnuber+"', '"+id+"', '"+checkin+"', '"+checkout+"')";
            String query2=null;
            if(roomnuber.contains(",") || !roomnuber.contains(","))
            {
                for(int i=0,j=3;i<roomnuber.length();i++,j++)
                {
                    x=roomnuber.substring(i,j);
                    query2 = "update room set availablity='False' where roomnumber = '" + x + "'";
                    PreparedStatement ps2 = conn.prepareStatement(query2);
                    ps2.execute();
                    i+=3;
                    j+=3;
                } 
            }
            PreparedStatement ps1 = conn.prepareStatement(query1);
            PreparedStatement ps3 = conn.prepareStatement(query3);
            ps1.execute();
            ps3.execute();
            JOptionPane.showMessageDialog(null, "Room Booked Successflly", "Tolip Royal Hotel", JOptionPane.INFORMATION_MESSAGE);
            HomePage Info=new HomePage();
            Info.setVisible(true);
            setVisible(false);
        } 
        catch (SQLException ex) {
            Logger.getLogger(BookingRoomID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BookActionPerformed


    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnightnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnightnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnightnumActionPerformed

    private void HomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomepageActionPerformed
        // TODO add your handling code here:
        HomePage Info=new HomePage();
        Info.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HomepageActionPerformed

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
            java.util.logging.Logger.getLogger(BookingRoomID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingRoomID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingRoomID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingRoomID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingRoomID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book;
    private javax.swing.JButton Homepage;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbcash;
    private javax.swing.JRadioButton rbcredit;
    private javax.swing.JRadioButton rbdouble;
    private javax.swing.JRadioButton rbsingle;
    private javax.swing.JRadioButton rbtriple;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnightnum;
    private javax.swing.JTextField txtphonenum;
    private javax.swing.JTextField txtroomnum;
    // End of variables declaration//GEN-END:variables
}