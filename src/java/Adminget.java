
public class Adminget {



    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getBirthCard() {
        return birthCard;
    }
    private String userId;
private String userName;
private String userLastName;
private String birthCard; 

public  Adminget(String userId,String userName,String userLastName,String birthCard){
  this.userId=userId;
       this.userName=userName;
         this.userLastName=userLastName;
          this.birthCard=birthCard;

}
}
