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
import java.util.Scanner;

public class SEMS {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    
    public static void main(String[] args) throws InterruptedException {
        // setting up a Hub
        Hub hub = new Hub (0 ,20000,0,0,true,1);
        // setting up a member
        Member member = new Member("Omr","Khalid","Omr123@hotmail.com","123HO0IS"
                ,11111,55123123,222222,true,"House","Riyadh,xxxx,xxxx");
        // plug no.1
        Smart_Plug plug1 = new Smart_Plug(0,15000,0,0,true,1,true,1,6000);
        // plug no.2
        Smart_Plug plug2 = new Smart_Plug(0,15000,0,0,true,1,true,2,12000);
        // plug no.3
        Smart_Plug plug3 = new Smart_Plug(0,15000,0,0,true,1,false,3,0);
        
        // an exam
        int [] Example = {700,900,1650,2000,7700,800,666,1000,1500,0,100,900,1345};
      

       
        
        System.out.println("1) View User Information \n2) Track Consumption \n"
                + "3) Control \n4) Payment\n");
        
        Scanner n = new Scanner(System.in);
        
        Scanner n2 = new Scanner(System.in);
        
        String choice3;
        
        int choice = n.nextInt();
        
        boolean flag = true;
        
        while(flag){
            
        switch(choice){
            
            case 1 :
                
                System.out.println("**************************************\n");
                
                System.out.println(member.toString()+"\n");
                
                System.out.println("**************************************");
                
                break;
                
            case 2 :
                
                System.out.println("\n**************************************");
                
              int p =  hub.Tracking(0,Example);
              
              pieChart.main(args);
              
                System.out.println("**************************************");
                
                break;
                
            case 3 :
                
            System.out.println("\n**************************************");

                System.out.println("choice a smart plug to control :\n");
                
                System.out.print("1 - "); plug1.ViewConsumption();
                
                System.out.print("2 - "); plug2.ViewConsumption();
                
                System.out.print("3 - "); plug3.ViewConsumption();
                
                    int choice2 = n.nextInt();
                    
        switch (choice2) {
            case 1:
                plug1.SwitchDevcieStatues();
                break;
            case 2:
                plug2.SwitchDevcieStatues();
                break;
            case 3:
                plug3.SwitchDevcieStatues();
                break;
            default :
                System.out.println("Invalid Device Number!");
                break;
        }
                    
                System.out.println("**************************************");

                break;
                
            case 4 :
                
            System.out.println("\n**************************************");
            
                hub.Payment();
                
            System.out.println("**************************************");

                break;
                
            default :
                    System.out.println("Enter a valid choice ");
           }

            System.out.println("You want another service ? Y/N");
            
            choice3 = n2.nextLine();
            
            if(choice3.equals("Yes")||choice3.equals("yes")||choice3.endsWith("Y")
                        ||choice3.equals("y")){
                
                 System.out.println("1) view user information \n2) Track Consumption \n"
                + "3) Control \n4) Payment\n");
                 
                           choice = n.nextInt();
                           
                           flag = true;
                }
            
                else{
                    flag = false;
                    System.out.println("\nBye-Bye\n");
            }
            
        }

    }
    
    
}
