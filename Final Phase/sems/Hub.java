
package sems;

import java.util.Scanner;

public class Hub implements Devciess {
  private int Consumption;
  private int ConsumptionLimit;
  private int Watts;
  private int Cost;
  private boolean HubStatutes;
  private int SumOfWatts;
  Building building;
  
  
  public Hub (){
      
  }
  public Hub(int Consumption , int ConsumptionLimit,int Watts , int Cost 
  , boolean HubStatutes,int SumOfWatts ){
      
            this.SumOfWatts = SumOfWatts;
            this.Consumption = Consumption;
            this.ConsumptionLimit = ConsumptionLimit;
            this.Watts = Watts;
            this.Cost = Cost;
            this.HubStatutes = HubStatutes;
  }
  
  public double Formula (int SumOfWatts){
      //Electric company cost rate = 0.18;
      
      return (SumOfWatts/1000)*0.18;
  }
   
  public int Tracking(int SumOfWatts,int[] Example) throws InterruptedException{
      int counter = 0;
      
      
      if(counter < Example.length){
      Watts = Example[counter];
      }
      
        while(Watts > 0){
            SumOfWatts = SumOfWatts + Watts;
            System.out.printf("%s %.2f %s","Current Consumption Cost = "
                    ,Formula(SumOfWatts),"SR\n");

            
            System.out.println(".........");
            
            Thread.sleep(3000);
            
            counter++;
            
            Cost = SumOfWatts;
            Watts = Example[counter];
            
            if (SumOfWatts > ConsumptionLimit){
                SendNotifications(3);
        }
            
        }
        
        if(Watts == 0){
            SendNotifications(4);
        }
        
        if (Watts < 0){
            SendNotifications(5);
        }
      
      return SumOfWatts;
     
  }
  public void Payment() throws InterruptedException {
      //
      double example = Formula(1000000);
      Scanner n = new Scanner(System.in);
      Scanner n2 = new Scanner(System.in);

      System.out.println("Last paid bill : 200SR");
      
      System.out.println("Current bill : "+example+"SR");
      System.out.println("Choice Your payment Option: \n1) Apple Pay\n2) Mastter Card"
              + "\n3) Paypal ");
      boolean flag = true;
      String s="" ;

      int choice = n.nextInt();
      
      while(flag){
      switch (choice) {
          case 1:
              System.out.println("You sure you want to pay using Apple Pay? Y/N");
                    s = n2.nextLine();

              break;
          case 2:
              System.out.println("You sure you want to pay using Master Card? Y/N");
                    s = n2.nextLine();

              break;
          case 3:
              System.out.println("You sure you want to pay using Paypal? Y/N");
                    s = n2.nextLine();

              break;
          default:
              System.out.println("Enter a valid Number !");
              break;
      }
      if(s.equals("Yes")||s.equals("yes")||s.endsWith("Y")
                        ||s.equals("y")){
          System.out.println("Order conformed \n processing .....");
          Thread.sleep(2000);
          System.out.println("Done, You have paid "+example+" successfuly!");
          flag = false;
      }
      else if (s.equals("No")||s.equals("no")||s.endsWith("N")
                        ||s.equals("n")){
          System.out.println("Choice Your payment Option: \n1) Apple Pay\n2) Mastter Card"
              + "\n3) Paypal ");
          choice = n.nextInt();
          flag = true;
      }
      else{
          System.out.println("Eneter a valid choice !");
          System.out.println("Choice Your payment Option: \n1) Apple Pay\n2) Mastter Card"
              + "\n3) Paypal ");       
           choice = n.nextInt();
            flag = true;

      }
      
  }
      
  }
  
  
    @Override
    public boolean SwitchDevcieStatues() {
        HubStatutes = HubStatutes != true;
            
          return  HubStatutes; 
    }

    
    public void SendNotifications(int Code) {
            switch(Code){
                case 1 :
                    System.out.println("Current Consumption Cost = "+SumOfWatts);
                    break;
                case 2 :
                    System.out.println("HubStatutes is : "+ HubStatutes );
                    break;
                case 3 :
                    System.out.println("Alert: Consumption lmit has been reached!");
                    break;
                case 4 :
                    System.out.println("Alert : There is no Electricty !");
                    break;
                case 5 :
                    System.out.println("Alert : Something is Wrong With the hub");
                    break;
                default :
                    System.out.println("Unknown Notification !");
            }
        
        }

    @Override
    public boolean DevcieStatues() {
        return HubStatutes;
    }
    
    public int getSumOfWatts(){
        return SumOfWatts;
    }
    public int getWatts(){
        return Watts;
    }
    public int getCost(){
        return Cost;
    }
    public int getConsumptionLimit(){
        return ConsumptionLimit;
    }
    
    public boolean getHubStatutes(){
        return HubStatutes;
    }
    public void setConsumptionLimit(int ConsumptionLimit){
        this.ConsumptionLimit = ConsumptionLimit;
       
    }
    public void setSumOfWatts(int SumOfWatts){
        this.SumOfWatts = SumOfWatts;
    }
    public void setWatts(int Watts){
        this.Watts = Watts;
    }
    public void setCost(int Cost){
        this.Cost = Cost;
    }
    public void setHubStatutes(boolean HubStatutes){
        this.HubStatutes = HubStatutes;
    }

    @Override
    public void SendNotifications() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
