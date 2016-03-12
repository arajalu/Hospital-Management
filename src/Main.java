/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coder
 */
import javax.swing.UIManager;
public class Main {

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Class.forName("java.sql.DriverManager");

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        String url, user, pass;
        url = "jdbc:mysql://localhost/hm";
        user = "root";
        pass = "";
        new admin_login(url, user,pass).setVisible(true);
    }
}
