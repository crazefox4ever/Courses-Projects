
package sems;


public class Sensors extends Hub implements Devciess {
    
    private boolean Movement;
    private boolean PepoleInBuilding;
    private int Range;


    public Sensors(){
        super();
    }
    
    public Sensors(int Consumption , int ConsumptionLimit,int Watts , int Cost 
  , boolean HubStatutes,int SumOfWatts,boolean Movement , boolean PepoleInBuilding,int Range){
        super(Consumption, ConsumptionLimit, Watts ,  Cost  ,  HubStatutes, SumOfWatts);
        this.Movement = Movement;
        this.PepoleInBuilding = PepoleInBuilding;
        this.Range = Range;

}
    
    public boolean DoesMovementExist(){
        return Movement == true;
    }
    public boolean getMovement(){
        return Movement;
    }
    public boolean getPepole(){
        return PepoleInBuilding;
    }
    public int getRange(){
        return Range;
    }
    public void setRange(int Range){
        this.Range = Range;
    }
    public void setPepole(boolean PepoleInBuilding){
        this.PepoleInBuilding = PepoleInBuilding;
    }
    public void setMovement(boolean Movement){
        this.Movement = Movement;
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