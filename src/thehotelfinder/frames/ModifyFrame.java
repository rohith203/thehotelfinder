/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder.frames;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import thehotelfinder.MyDate;
import thehotelfinder.TheHotelFinder;

/**
 *
 * @author Rohith
 */
public class ModifyFrame extends javax.swing.JFrame {

    /**
     * Creates new form ModifyFrame
     */
    public ModifyFrame(String bookingRef, String hotelName) {
        this.bookingRef = bookingRef;
        initComponents();
        
        Calendar calendar = Calendar.getInstance(); // this would default to now
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        checkIndateChooser.setMinDate(calendar);
        Calendar calendar1 = Calendar.getInstance(); // this would default to now
        checkOutdateChooser.setMinDate(calendar1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modifyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        checkIndateChooser = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();
        checkOutdateChooser = new datechooser.beans.DateChooserCombo();
        singleSpinner = new javax.swing.JSpinner();
        doubleSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modifyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(760, 240, 400, 300));
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new java.awt.CardLayout());

        modifyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modify Booking", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 24), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Check In Date              :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Check Out Date           :");

        singleSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        doubleSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("No. of Single Rooms     :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("No. of Double Rooms   :");

        modifyBtn.setText("Modify");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifyPanelLayout = new javax.swing.GroupLayout(modifyPanel);
        modifyPanel.setLayout(modifyPanelLayout);
        modifyPanelLayout.setHorizontalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, modifyPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(doubleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(modifyPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(singleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)))
                            .addGroup(modifyPanelLayout.createSequentialGroup()
                                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkIndateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkOutdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(modifyBtn)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        modifyPanelLayout.setVerticalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkIndateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkOutdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(doubleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(modifyBtn)
                .addContainerGap())
        );

        getContentPane().add(modifyPanel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        // TODO add your handling code here:
        Date curDate = new Date();
        curDate = MyDate.removeTime(curDate);
        String newCheckIn = checkIndateChooser.getText();
        String newCheckOut = checkOutdateChooser.getText();
        int newsingle = (int)singleSpinner.getValue();
        int newdouble = (int)doubleSpinner.getValue();
        if(newsingle==0 && newdouble==0){
            JOptionPane.showMessageDialog(this, "Please select a room.");
            return;
        }
        int roomsArr[] = TheHotelFinder.getDb().getMaxRooms(bookingRef, newCheckIn, newCheckOut);
        if(newsingle<roomsArr[0] || newdouble<roomsArr[1]){
            System.out.println("not avialable");
            return;
        }
        
        if((MyDate.toDate(newCheckIn).after(curDate) || MyDate.toDate(newCheckIn).equals(curDate)) && 
           MyDate.toDate(newCheckOut).after(MyDate.toDate(newCheckIn))
          ){
            System.out.println("valid");
            boolean flag = TheHotelFinder.getDb().modifyBooking(bookingRef, newCheckIn, newCheckOut, newsingle, newdouble);
            if(flag) JOptionPane.showMessageDialog(this, "Booking modified successfully!");
            else JOptionPane.showMessageDialog(this, "Rooms not available in these dates");
            this.dispose();
        }else{
            System.out.println("invalid");
            JOptionPane.showMessageDialog(this, "Enter valid details");
        }
        
    }//GEN-LAST:event_modifyBtnActionPerformed

    String bookingRef;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo checkIndateChooser;
    private datechooser.beans.DateChooserCombo checkOutdateChooser;
    private javax.swing.JSpinner doubleSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JPanel modifyPanel;
    private javax.swing.JSpinner singleSpinner;
    // End of variables declaration//GEN-END:variables
}
