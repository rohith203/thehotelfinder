/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rohith
 */
public class TheHotelFinder {
    static User curUser = null;
    static LoginRegisterFrame logRegFrame;
    static DBConnect db = new DBConnect();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) {
           // handle exception
           System.out.println(e);
        }
   
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                logRegFrame = new LoginRegisterFrame();
                logRegFrame.setVisible(true);
            }
        });
    }
    
    public void setCurUser(User u){
        curUser = u;
    }

}
