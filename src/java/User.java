
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;





@ManagedBean
@RequestScoped
public class User {
   private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
   private String lastName;
   private String gfName;

    public String getGfName() {
        return gfName;
    }

    public void setGfName(String gfName) {
        this.gfName = gfName;
    }
   private String region;
   private String gender;
  private String dateOfBirth;

  
    public void userregister() throws ClassNotFoundException {
        try {
           DBConnection db=new DBConnection();
             Connection connection = db.connMethod();
        PreparedStatement stmt=connection.prepareStatement("Insert into USERPAGE(FNAME,LNAME,GFNAME,REGION,GENDER,DATEOFBIRTH) values (?,?,?,?,?,?)");     
        stmt.setString(1,firstName);  
        stmt.setString(2,lastName);  
        stmt.setString(3,gfName);  
        stmt.setString(4,region); 
        stmt.setString(5,gender); 
        stmt.setString(6,dateOfBirth);
        stmt.executeUpdate();  
            System.err.println("success");
        }
        catch (SQLException e) {
        }
    }
}
