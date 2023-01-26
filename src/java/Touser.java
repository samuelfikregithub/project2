
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name="touser")

public class Touser {
      public List <Userget> userList;
    
    public List <Userget> getuserinformation(){
    userList = new ArrayList<>();
    
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
                   String  dateofbirth = resultset.getString("DATEOFBIRTH");
          
              
                userList.add(new Userget(name, lname, gfname,region, gender,dateofbirth));
            } 
             
    }catch( SQLException | ClassNotFoundException e)
    {
    
    
    }
    
    return userList;
    }
    private String fname;

    public List<Userget> getUserfList() {
        return userList;
    }

    public void setUserfList(List<Userget> userfList) {
        this.userList = userfList;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public List<User> getSingleList() {
        return singleList;
    }

    public void setSingleList(List<User> singleList) {
        this.singleList = singleList;
    }
    
    
    public List <User> singleList;
    public List <User> getsinglelist() throws ClassNotFoundException{
    singleList = new ArrayList<>();
    try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
          
      PreparedStatement pss = con.prepareStatement("select * from USERPAGE where FNAME=?");
               pss.setString(1, fname);
             ResultSet resultset = pss.executeQuery();
          
                 while (resultset.next()) {
             User insert = new User();
                
              insert.setFirstName(resultset.getString("FNAME"));
                insert.setLastName(resultset.getString("LNAME"));
                  insert.setGfName(resultset.getString("GFNAME"));
                 insert.setRegion(resultset.getString("REGION"));
 
                   insert.setGender(resultset.getString("GENDER"));
                    insert.setDateOfBirth(resultset.getString("DATEOFBIRTH"));
                    
          
                singleList.add(insert);
            } 
             
    }catch( SQLException e)
    {
    
    
    }
    
    return singleList;
    


    }
}