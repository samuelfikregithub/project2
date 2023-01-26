
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean

public class Touser {
      public List <Userget> userfList;
    
    public List <Userget> getuserinformation(){
    userfList = new ArrayList<>();
    
    try{
        
           DBConnection dbc = new DBConnection();
            Connection con = dbc.connMethod();
          
             ResultSet resultset = con.createStatement().executeQuery("select * from USERPAGE ");
                 while (resultset.next()) {
             
                String name = resultset.getString("FNAME");                             
               String  lname = resultset.getString("LNAME");
                   String gfname = resultset.getString("GFNAME");
                   String  region = resultset.getString("REGION");
                   String  gender = resultset.getString("GENDER");
                   String  dateofbith = resultset.getString("DATEOFBIRTH");
          
              
                userfList.add(new Userget(name, lname, gfname,region, gender,dateofbith));
            } 
             
    }catch( SQLException | ClassNotFoundException e)
    {
    
    
    }
    
    return userfList;
    }
}


