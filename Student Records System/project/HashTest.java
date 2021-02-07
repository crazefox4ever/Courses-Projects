/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


public class HashTest {
    public static void main(String[] args) {
        DLList list = new DLList();
        
            list.add(213325,"Samer Ahmed","04/12/1995","0528732157",
            "32123 Riyadh","Computer Science",3.81);
            list.add(213326,"Rami saad","04/07/1995","0592132185","12121Riyadh","Information Technologye",2.82);
            list.add(213327,"Yasser Hamad","23/06/1995","0592138265","29053 Riyadh","Information Technologye",3.80);
            list.add(213328,"Jawaher Ahmed","18/10/1995","0529932000","39023 Riyadh","Computer Science",4.00);
            list.add(213330,"Deem Abdulaziz","10/10/1995","0544938720","78132 Riyadh","Computer Science",4.55);
            list.add(216103,"Noor Salah","01/11/1998","0539183156","87215 Riyadh","Information Technology",4.56);
            list.add(216104,"Noora Abdullah","01/09/1998","0545183199","16783 Riyadh","Information Technology",3.75);
            list.add(216110,"Abdullah Talal","19/10/1998","0598765156","87110 Riyadh","Computer Science",4.15);
            list.add(216112,"Sarah Salah","01/01/1998","0533181111","54372 Riyadh","Information Technology",2.15);
            list.add(216328,"Abdullah Ahmed","18/05/1998","0544432053","17843 Riyadh","Computer Science",3.60);
            
            
            System.out.println("Hash Table Test\n\n");
            
            HashTable table = new HashTable(10);
            Node temp = list.head;
            while(temp != null){
                table.insert(temp);
                temp = temp.next;
            }
            
            table.HashPrint();
            System.out.println("Table size : "+table.size);
            System.out.println("Removing  Record (213330) \n");
            table.remove(213330);
            
            System.out.println("After remvoing \n");
            table.HashPrint();
            System.out.println("Removing 444444");
            table.remove(444444);
            System.out.println("Table size : "+table.size);
            table.hachSearch(216104);
            
    }
}
