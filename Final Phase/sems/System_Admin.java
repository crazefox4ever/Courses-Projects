/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sems;


public class System_Admin extends User  {
   
   private int AdminID;
   private String AdminName;
   
    public System_Admin(){
        super();
    }
    public System_Admin(int AdminID,String AdminName,String FirstName , String LastName , String Email , String HubID
        ,int UserID,int PhoneNumber , int ElectrictySub){
        super( FirstName ,LastName ,Email ,HubID , UserID, PhoneNumber , ElectrictySub);
        this.AdminID = AdminID;
        this.AdminName = AdminName;
    }
    
    public int getAdminID(){
        return AdminID;
    }
    public String getAdminName(){
        return AdminName;
    }
    public void setAdminID(int AdminID){
        this.AdminID = AdminID;
    }
    public void setAdminName(String AdminName){
        this.AdminName = AdminName;
    }
    
    private String getUserInfo(){
        return super.toString();
    }
    
}
