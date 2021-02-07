/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sems;


public class Smart_Plug extends Hub implements Devciess {
    private  boolean ConnectedDevice ;
    private int PlugNumber ;
    private int PlugConsume;
    public Smart_Plug(){
      
    }
    
    public Smart_Plug(int Consumption , int ConsumptionLimit,int Watts , int Cost 
  , boolean HubStatutes,int SumOfWatts,boolean ConnectedDevice,int PlugNumber,int PlugConsume){
    super(Consumption, ConsumptionLimit, Watts ,  Cost  ,  HubStatutes, SumOfWatts);
        this.ConnectedDevice = ConnectedDevice;
        this.PlugNumber = PlugNumber;
        this.PlugConsume = PlugConsume;
        
    }
    public boolean TestConnection(){
        return ConnectedDevice == true;
    }
    public void ViewConsumption(){
        
        System.out.print("Device No.:"+PlugNumber+"\tCurrent Devcie cost :"
                +Formula(PlugConsume)+"\tDevice is ");
        
                if (ConnectedDevice == true){
                    System.out.println("ON");
                }
                else{
                    System.out.println("OFF");
                }
    }
    
    public boolean getConnectedDevice(){
        return ConnectedDevice;
    }
    
    public int getPlugConsume(){
        return PlugConsume;
    }
    public int getPlugNumber(){
        return PlugNumber;
    }
    public void setConnectedDevice(boolean ConnectedDevice){
        this.ConnectedDevice = ConnectedDevice;
    }
    public void setPlugNumber(int PlugNumber){
        this.PlugNumber = PlugNumber;
    }
    public void setPlugConsume(int PlugConsume){
        this.PlugConsume = PlugConsume;
    }
    
        @Override
    public boolean SwitchDevcieStatues() {
        
        ConnectedDevice = ConnectedDevice != true;
        
        if ( ConnectedDevice == true){
            System.out.println("Device is ON");
        }
        else{
                System.out.println("Device No. "+PlugNumber+" is OFF");
                 PlugConsume = 0;
        }
        
          return  ConnectedDevice; 
    }

    @Override
    public void SendNotifications() {
        
        System.out.println("HubStatutes is : "+ super.DevcieStatues() );
        
        
        }

    @Override
    public boolean DevcieStatues() {
        return ConnectedDevice;
    }
     
    
    
}
