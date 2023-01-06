

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean

public class Toadmin {
      public List <Adminget> adminfList;
    public List <Adminget> getadmininformation(){
    adminfList = new ArrayList<>();
    
    
      
    try{
        
           DBConnection dbc = new DBConnection();
            Connection con = dbc.connMethod();
             ResultSet resultset = con.createStatement().executeQuery("select * from ADMINPAGE");
                 while (resultset.next()) {
             
          
                String userid = resultset.getString("USERID");                             
               String  name = resultset.getString("USERNAME");
                   String lname = resultset.getString("USERLASTNAME");
                   String  birthcard = resultset.getString("BIRTHCARD");
          
              
                adminfList.add(new Adminget(userid,name,lname,birthcard));
            } 
             
    }catch( SQLException | ClassNotFoundException e)
    {
    
    
    }
    
    return adminfList;
    }
}