
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class Admin {
private String userId;
private String userName;
private String userLastName;
private String birthCard;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getBirthCard() {
        return birthCard;
    }

    public void setBirthCard(String birthCard) {
        this.birthCard = birthCard;
    }
     public void adminregister() throws ClassNotFoundException {
        try {
           DBConnection db=new DBConnection();
             Connection connection = db.connMethod();
        PreparedStatement pstmt=connection.prepareStatement("Insert into ADMINPAGE(USERID,USERNAME,USERLASTNAME,BIRTHCARD) values (?,?,?,?)");     
        pstmt.setString(1,userId);   
        pstmt.setString(2,userName);  
        pstmt.setString(3,userLastName); 
        pstmt.setString(4,birthCard); 
        
        pstmt.executeUpdate();  
            System.err.println("success");
        }
        catch (SQLException e) {
        }
    }
}
