
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_grade_calculator;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author pc
 */
public class JavaConnect {
    public static Connection ConnerDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\pc\\Desktop\\javac\\Student_Grade_Calculator\\src\\student_grade_calculator\\infos.sqlite");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
