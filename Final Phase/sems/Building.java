/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sems;


public class Building {
    private int NumberOfPlugs;
    private int NumberOfSensors;
    private boolean HubExist;
    private int ElectricBoardCapacity;
    private String ElectricBoardType;
    Devciess device;
    Hub hub;
    
        public Building(){
            
        }
        public Building(int NumberOfPlugs,int NumberOfSensors,boolean HubExist,
                int ElectricBoardCapacity,String ElectricBoardType){
            
            this.ElectricBoardCapacity = ElectricBoardCapacity;
            this.ElectricBoardType = ElectricBoardType;
            this.HubExist= HubExist;
            this.NumberOfPlugs = NumberOfPlugs;
            this.NumberOfSensors = NumberOfSensors;
        }
        public int getNumberOfPlugs(){
            
            return NumberOfPlugs;
        }
        public int getNumberOfSensors(){
            return NumberOfSensors;
        }
        public boolean getHubExist(){
            return HubExist;
        }
        public int getElectricBoardCapacity(){
            return ElectricBoardCapacity;
        }
        public String getElectricBoardType(){
            return ElectricBoardType;
        } 
}

