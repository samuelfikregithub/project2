
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Checkpass {
  
    public static boolean check(String name, String password) {
        boolean check = false;
        try {

            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select * from USERLOGIN where USERNAME=? and PASSWORD=?");
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            check = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return check;
    }
    
}

