
package sems;


public class User {
   private String FirstName;
   private String LastName;
   private String Email;
   private String HubID;
   private int UserID;
   private int PhoneNumber;
   private int ElectrictySub;
   Hub hub;
        public User(){
          
        }
        
        public User(String FirstName , String LastName , String Email , String HubID
        ,int UserID,int PhoneNumber , int ElectrictySub)
        {
            this.FirstName  = FirstName;
            this.LastName = LastName;
            this.Email = Email;
            this.HubID = HubID;
            this.UserID = UserID;
            this.PhoneNumber = PhoneNumber;
            this.ElectrictySub = ElectrictySub;
             
        }
        public String getFirstName(){
            return FirstName;
        }
        public String getLastName(){
            return LastName;
        }
        public String getEmail(){
            return Email;
        }
        public String getHubID(){
            return HubID;
        }
        public int getUserID(){
            return UserID;
        }
        public int getPhoneNumber(){
            return PhoneNumber;
        }
        public int getSub(){
            return ElectrictySub;
        }
        public void setFirstName(String FirstName){
            this.FirstName = FirstName;
        }
        public void setLastName(String LastName){
            this.LastName = LastName;
        }
        public void setEmail(String Email){
            this.Email = Email;
        }
        public void setHubID(String HubID){
            this.HubID = HubID;
        }
        public void setUserId(int UserID){
            this.UserID = UserID;
        }
        public void setPhoneNumber(int PhoneNumber){
            this.PhoneNumber = PhoneNumber;
        }
        public void setSub(int ElectrictySub){
            this.ElectrictySub = ElectrictySub;
        }
        
        
        public void PayBill() throws InterruptedException{
             hub.Payment();
    }
    public void DesplayConsumption(){
        System.out.println("Consumption :"+hub.Formula(hub.getSumOfWatts()));
    }
    
    @Override
    public String toString(){
        return "User Information :\n\n"+"Name:"+getFirstName()+" "+getLastName()+"\t\t\t\tEmail:"+getEmail()
              +"\n\nHubID:"+getHubID()+"\t\t\t\tUser ID:"+getUserID()+"\n\nPhoneNumber:"+getPhoneNumber()+
              "\t\t\tElectricty Subscription:"+ElectrictySub+"\n ";
    }
    
}
