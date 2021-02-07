
package sems;


public class Member extends User {
 public boolean Subscription;
 private String BuildingType;
 private String Address;
 
 
    public Member(){
        super();
    }
    public Member(String FirstName , String LastName , String Email , String HubID
        ,int UserID,int PhoneNumber , int ElectrictySub, boolean Subscription ,
        String BuildingType , String Address){
        super( FirstName ,LastName ,Email ,HubID , UserID, PhoneNumber , ElectrictySub);
        this.Address = Address;
        this.BuildingType = BuildingType;
        this.Subscription = Subscription;
    }
    public String getAddress(){
        return Address;
    }
    public String getBuilding(){
        return BuildingType;
    }
    
    public String getSubscriptiontype(){
        String s = "";
        if (Subscription == true){
            s = "Premium Member" ;
               }        
        else
            s ="Member";
        return s;
    } 
    public void setAddress(String Address){
        this.Address = Address;
    }
    public void setBuildingType(String BuildingType){
    this.BuildingType = BuildingType;    
    }
    public void setSubscription(boolean Subscription){
        this.Subscription = Subscription;
    }
    
   public boolean Subscribe(){
      return Subscription = true;
   }
   public boolean Unsubscribe(){
       return Subscription = false;
   }
   
@Override
  public String toString(){
      return "Member Information :\n\n"+"Name:"+super.getFirstName()+" "+super.getLastName()+"\t\t\t\tEmail:"+super.getEmail()
              +"\n\nHubID:"+super.getHubID()+"\t\t\t\tUser ID:"+super.getUserID()+"\n\nPhoneNumber:"+super.getPhoneNumber()+
              "\t\t\tElectricty Subscription:"+super.getSub()+"\n\nSubscription Type: "+getSubscriptiontype()+"\tAddress:"+getAddress()
              +"\n\nBuilding : "+getBuilding();
    }
    
}
