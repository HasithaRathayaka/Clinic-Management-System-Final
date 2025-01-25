
import java.sql.Connection;
import java.sql.DriverManager;


public class Dbconnect {
        Connection con = null;

    public Connection DBConnect() {

        try {
            final String url="jdbc:mysql://localhost/project";
            final String name="root";
            final String pass="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, name, pass);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return con;
    }
}
