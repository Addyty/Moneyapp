/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneybank;
import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author tyagi
 */
public class ManagerCreate {
    public static void main(String[] args) {
        String Username = "Yadav";
        String EmpId = "2056";
        String Fullname = "Mohit Yadav";
        String Email = "abcd@gmail.com";
        String Mobile = "854122365";
        String Gender = "Male";
        String Address = "Hello";
        String Branch = "Mahendragarh";
        String Designation = "Manager";
        String Password = "yadav@123";
        String CnfPassword = "yadav@123";
        
        try{
    Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mpd", "root", "Tyagi67@#");
           PreparedStatement ps = con.prepareStatement("insert into managerlogin values(?,?,?,?,?,?,?,?,?,?,?,?)");
           String filename = "D:/Moneyapp/src/moneybank/images/mngpic.png";  // Eor example Let your picture is present in the folder named Picture in the D drive, then the file path will be: 'D:/Picture/abc.jpg'
           File f = new File(filename);
                
                InputStream is = new FileInputStream(f);
                ps.setBlob(1, is);
                ps.setString(2, Username);
                ps.setString(3, EmpId);
                ps.setString(4, Fullname);
                ps.setString(5, Email);
                ps.setString(6, Mobile);
                ps.setString(7, Gender);
                ps.setString(8, Address);
                ps.setString(9, Branch);
                ps.setString(10, Designation);
                ps.setString(11,Password);
                ps.setString(12, CnfPassword);
                int i = ps.executeUpdate();
}
    catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
    }
}
