/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;

/**
 *
 * @author Rohith
 */
public class TheHotelFinder {
    static int loc;
    static User curUser = null;
    static LoginRegisterFrame log_reg;
    static DBConnect db = new DBConnect();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loc = 0;
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                log_reg = new LoginRegisterFrame();
                log_reg.setVisible(true);
            }
        });
    }
    
    
    public void setCurUser(User u){
        curUser = u;
    }

}
