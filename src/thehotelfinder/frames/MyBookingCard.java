/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder.frames;

import java.awt.Component;
import java.awt.Container;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import thehotelfinder.MyDate;
import thehotelfinder.TheHotelFinder;

/**
 *
 * @author Rohith
 */
public class MyBookingCard extends javax.swing.JPanel {

    /**
     * Creates new form BookingCard
     */
    public MyBookingCard(String bookingRef, String hotelName, String city, String state, String checkIn, String checkOut, String bookingDate, int nsingle,int ndouble, double totalAmount) {
        this.hotelName = hotelName;
        this.bookingRef = bookingRef;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.totalAmount = totalAmount;
        initComponents();
        bookingRefLabel.setText(bookingRef);
        hotelLabel.setText("<html>"+hotelName + ",<br> " + city + ", " + state+"</html>");
        checkInDateLabel.setText(checkIn);
        checkOutDateLabel.setText(checkOut);
        String bookingTime = MyDate.getBookingDate(bookingRef);
        bookingDateLabel.setText(bookingTime);
        
        if(nsingle!=0 && ndouble==0){
            roomsLabel.setText(nsingle + " single room(s)");
        }else if(ndouble!=0 && nsingle==0){
            roomsLabel.setText(ndouble + " double room(s)");
        }else{
            roomsLabel.setText("<html>"+nsingle + " single room(s) and <br>" + ndouble + " double rooms(s)</html>");
        }
        String status = "";
        Date curDate = new Date();
        if(curDate.before(MyDate.toDate(checkIn))){
            status+="NOT CHECKED IN";
            ratingBtn.setVisible(false);
            ratingComboBox.setVisible(false);
        }else if((curDate.equals(MyDate.toDate(checkIn)) || curDate.after(MyDate.toDate(checkIn))) && curDate.before(MyDate.toDate(checkOut))){
            status+="CHECKED IN";
        }else{
            status+="CHECKED OUT";
        }
        this.status = status;
        statusLabel.setText(status);
        
        if(MyDate.getDays(checkIn, MyDate.toStringInit(curDate))<3){
            modifyBtn.setVisible(false);
        }
        if(status.equals("CHECKED OUT")){
            modifyBtn.setVisible(false);
            cancelBtn.setVisible(false);
        }
        totalAmountLabel.setText("\u20B9"+totalAmount);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hotelLabel = new javax.swing.JLabel();
        bookingRefLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        checkInDateLabel = new javax.swing.JLabel();
        checkOutDateLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        roomsLabel = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        ratingBtn = new javax.swing.JButton();
        ratingComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        bookingDateLabel = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel1.setText("Booking Reference         :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 175, 50));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel2.setText("Hotel                                :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 175, 50));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel3.setText("Check in date                 :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 175, 50));

        hotelLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        hotelLabel.setForeground(new java.awt.Color(102, 102, 102));
        hotelLabel.setText("Booking Reference");
        add(hotelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 270, 50));

        bookingRefLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        bookingRefLabel.setForeground(new java.awt.Color(102, 102, 102));
        bookingRefLabel.setText("Booking Reference");
        add(bookingRefLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 13, 175, 50));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel6.setText("Check out date               :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 175, 50));

        checkInDateLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        checkInDateLabel.setForeground(new java.awt.Color(102, 102, 102));
        checkInDateLabel.setText("Booking Reference");
        add(checkInDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 175, 50));

        checkOutDateLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        checkOutDateLabel.setForeground(new java.awt.Color(102, 102, 102));
        checkOutDateLabel.setText("Booking Reference");
        add(checkOutDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 175, 50));

        cancelBtn.setText("Cancel Booking");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        modifyBtn.setText("Modify Booking");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });
        add(modifyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel9.setText("Rooms booked             :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 13, 175, 50));

        roomsLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        roomsLabel.setForeground(new java.awt.Color(102, 102, 102));
        roomsLabel.setText("Booking Reference");
        add(roomsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 13, 230, 50));

        totalAmountLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        totalAmountLabel.setForeground(new java.awt.Color(102, 102, 102));
        totalAmountLabel.setText("Booking Reference");
        add(totalAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 70, 220, 50));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel12.setText("Total Amount paid       :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 70, 175, 50));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel13.setText("Status                            :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 127, 175, 50));

        statusLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(102, 102, 102));
        statusLabel.setText("Booking Reference");
        add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 127, 210, 50));

        ratingBtn.setText("Give Rating");
        ratingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingBtnActionPerformed(evt);
            }
        });
        add(ratingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        ratingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        ratingComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ratingComboBoxItemStateChanged(evt);
            }
        });
        add(ratingComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel7.setText("Booking Date                  :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 175, 50));

        bookingDateLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        bookingDateLabel.setForeground(new java.awt.Color(102, 102, 102));
        bookingDateLabel.setText("Booking Reference");
        add(bookingDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 175, 50));

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thehotelfinder/imgs/Photo-Background-Application.jpg"))); // NOI18N
        bgLabel.setText("jLabel4");
        add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void ratingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingBtnActionPerformed
        // TODO add your handling code here:
        int rating = ratingComboBox.getSelectedIndex();
        if(TheHotelFinder.getDb().giveRating(rating, hotelName, bookingRef)){
            System.out.println("Rating: " + rating);
            JOptionPane.showMessageDialog(this, "Rating = " + rating);
        }else{
            System.out.println("Rating already given");      
            JOptionPane.showMessageDialog(this, "Rating already given for this booking.");
        }
        
    }//GEN-LAST:event_ratingBtnActionPerformed

    private void ratingComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ratingComboBoxItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ratingComboBoxItemStateChanged

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        // TODO add your handling code here:
        ModifyFrame mf = new ModifyFrame(bookingRef, hotelName);
        mf.setVisible(true);
        
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        Date curDate = new Date();
        String msg = "";
        int n = 0;
        if(MyDate.getDays(checkIn, MyDate.toStringInit(curDate))<3){
            double half = totalAmount * 0.5;
            msg += "Only 50% of the total amount \u20B9" + half +" of this booking will refunded.";
        }
        
        n = JOptionPane.showConfirmDialog(this,"<html>"+msg+"<br>Are you sure? Do you want to cancel this booking?</html>", "Confirm", JOptionPane.YES_NO_OPTION);

        if(n==1){
            return;
        }
        if(n==0){
            TheHotelFinder.getDb().cancelBooking(bookingRef);
            JOptionPane.showMessageDialog(this, "Your booking with reference: " + bookingRef + " has been canceled successfully");
            
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    public String getStatus(){
        return status;
    }
    private String hotelName;
    private String bookingRef;
    private String checkIn;
    private String checkOut;
    private double totalAmount;
    private String status;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel bookingDateLabel;
    private javax.swing.JLabel bookingRefLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel checkInDateLabel;
    private javax.swing.JLabel checkOutDateLabel;
    private javax.swing.JLabel hotelLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JButton ratingBtn;
    private javax.swing.JComboBox<String> ratingComboBox;
    private javax.swing.JLabel roomsLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel totalAmountLabel;
    // End of variables declaration//GEN-END:variables
}
