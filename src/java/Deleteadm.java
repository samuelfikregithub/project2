import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class Deleteadm {
    private String userId;

    public String getuserId() {
        return userId;
    }

    public void setuserId(String userId) {
        this.userId = userId;
    }
    
    public void delete() throws ClassNotFoundException, SQLException{
    
            
          
          Boolean status=false;
            String query = "delete from ADMINPAGE where USERID='"+userId+"'";
            DBConnection connection1 = new DBConnection();
            Connection connection = connection1.connMethod();
            Statement statement = null;
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try{
                status=statement.execute(query);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    
}

