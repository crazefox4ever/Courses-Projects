/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


public class PriorityQueue {
   private  Node[] records;
    int recordsSize,capacity;
    
        public PriorityQueue(int capacity){
            this.capacity = capacity;
            records = new Node[capacity];
            recordsSize = 0;
        }
        public void insert(Node record){
            int i;
            if(recordsSize == 0){
                records[0] = record;
                recordsSize++;
                return;
            }
                for(i = recordsSize-1 ;i >=0 ; i--){
                    if(record.GPA < records[i].GPA){
                        records[i+1] = records[i];       
                    }
                    else{
                        break;
                    }
                    
                }
                records[i+1] = record;
                recordsSize++;   
        }
        
        public Node remove(){
           
           Node temp = records[recordsSize - 1];
           records[recordsSize - 1] = null; 
           recordsSize--;
            return temp;
        }
        
        public boolean isEmpty(){
            return recordsSize == 0;
        }
        
        public boolean isFull(){
            return recordsSize == capacity - 1;
        }
        
        public void printQueue(){
            
            for(int i = recordsSize -1 ; i >= 0 ; i--){
                System.out.println(records[i].toString()+" ");
            }
        }
        
        public Node highstOrder(){
            return records[recordsSize-1];
        }
        public Node lowestOrder(){
            return records[0];
        }
        
       
}
class App{
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
            PriorityQueue queue = new PriorityQueue(list.size+1);
            Node temp = list.head ;
            while(temp != null){
                queue.insert(temp);
                temp = temp.next;
            }
            System.out.println("Printing the queue in (Ascending Order) :");
            queue.printQueue();
            
            System.out.println("Queue size :");
            System.out.println(queue.recordsSize);
            System.out.println("The highst Order in the queue :\n"+queue.highstOrder().toString());
            System.out.println("The lowest Order in the queue :\n"+queue.lowestOrder().toString());
            System.out.println("checking if the queue is full : "+queue.isFull());
            
            System.out.println("Removing :");
            System.out.println(queue.remove().toString());   
            System.out.println("Has been removed !");
            System.out.println("\n");
            
            
            
            System.out.println("Checking if the queue is full : "+queue.isFull()); 
            System.out.println("\nChecking if the queue is empty :"+queue.isEmpty());
            System.out.println("\nThe highst Order in the queue :\n"+queue.highstOrder().toString());
            System.out.println("\nThe lowest Order in the queue :\n"+queue.lowestOrder().toString());
            
           
            
            
            
    }
}
