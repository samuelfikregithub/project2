/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASHKIM
 */
public class Userget {
    private String firstName;
private String lastName;
private String gfName; 
private String region;
private String gender;
private String dateofbirth; 

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGfName() {
        return gfName;
    }

    public String getRegion() {
        return region;
    }

    public String getGender() {
        return gender;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }
    public  Userget(String firstName,String lastName,String gfName,String region,String gender,String dateofbirth){
  this.firstName=firstName;
       this.lastName=lastName;
         this.gfName=gfName;
          this.region=region;
          this.gender=gender;
          this.dateofbirth=dateofbirth;


}
}
