/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management_system;
import java.sql.*;
/**
 *
 * @author Balambika Baskaran
 */
public class conn {
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project1","root","");
            s = c.createStatement();
        }catch(ClassNotFoundException | SQLException e) {
        }
    }
}
