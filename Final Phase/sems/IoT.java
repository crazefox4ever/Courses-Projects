/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sems;

/**
 *
 * @author macbook
 */
public class IoT extends Hub implements Devciess {
   private String DeviceType;
   private String DeviceName;  
   private String ConnectionType;
   
   public IoT(){
       super();
   }
   public IoT(int Consumption , int ConsumptionLimit,int Watts , int Cost 
  , boolean HubStatutes,int SumOfWatts,String DeviceType,String DeviceName,
   String ConnectionType){
       
    super(Consumption, ConsumptionLimit, Watts ,  Cost  ,  HubStatutes, 
            SumOfWatts);
    this.ConnectionType = ConnectionType;
    this.DeviceName = DeviceName;
    this.DeviceType = DeviceType;
   }
   
   public String getDeviceName(){
       return DeviceName;
   }
   public String getConnectionType(){
       return ConnectionType;
   }
   public String getDeviceType(){
       return DeviceType;
   }
   public void setDeviceName(String DeviceName){
       this.DeviceName = DeviceName;
   }
   public void setDeviceType(String DeviceType){
       this.DeviceType = DeviceType;
   }
   public void setConnectionType(String ConnectionType){
       this.ConnectionType = ConnectionType;
   }

   
    @Override
   public  boolean SwitchDevcieStatues() {
       return super.SwitchDevcieStatues();   
}
   @Override
    public void SendNotifications()  {
     super.SendNotifications();
}  
   @Override
    public boolean DevcieStatues(){
    return super.DevcieStatues();
}
    
}
