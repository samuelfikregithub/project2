
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASHKIM
 */
@ManagedBean
@SessionScoped
public class Toupdateuser {

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

    public String getGfName() {
        return gfName;
    }

    public void setGfName(String gfName) {
        this.gfName = gfName;
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

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    private String firstName;
        private String lastName;
            private String gfName;
                private String region;
                private String gender;
                    private String dateofbirth;

public void Toupdateuserinfo(){
    try {
         
         
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String edit= "update USERPAGE set FNAME='"+firstName+"',LNAME='"+lastName+"',GFNAME='"+gfName+"',REGION='"+region+"',GENDER='"+gender+"' DATEOFBIRTH='"+dateofbirth+"'";
          Statement sam=null;
        sam = con.createStatement();
        sam.executeQuery(edit);
            
          
       
            System.err.println("success");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
    
}
}