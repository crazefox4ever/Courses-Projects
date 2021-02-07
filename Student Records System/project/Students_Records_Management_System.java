
package project;


// The key of (Searech,Delete,Retrive,...ect) for This System is the student's ID
public class Students_Records_Management_System {
    
    public static void main(String[] args) {
        System.out.println("Inserting Records in the System :\n");
        
        DLList Records = new DLList();
            
        Records.add(213325,"Samer Ahmed","04/12/1995","0528732157",
            "32123 Riyadh","Computer Science",3.81);
        
            Records.add(213326,"Rami saad","04/07/1995","0592132185",
                    "12121Riyadh","Information Technologye",2.82);
            
            Records.add(213327,"Yasser Hamad","23/06/1995","0592138265"
                    ,"29053 Riyadh","Information Technologye",3.80);
            
            Records.add(213328,"Jawaher Ahmed","18/10/1995","0529932000"
                    ,"39023 Riyadh","Computer Science",4.00);
            
            Records.add(213330,"Deem Abdulaziz","10/10/1995","0544938720"
                    ,"78132 Riyadh","Computer Science",4.55);
            
            Records.add(216103,"Noor Salah","01/11/1998","0539183156"
                    ,"87215 Riyadh","Information Technology",4.56);
            
            Records.add(216104,"Noora Abdullah","01/09/1998","0545183199"
                    ,"16783 Riyadh","Information Technology",3.75);
            
            Records.add(216110,"Abdullah Talal","19/10/1998","0598765156"
                    ,"87110 Riyadh","Computer Science",4.15);
            
            Records.add(216112,"Sarah Salah","01/01/1998","0533181111"
                    ,"54372 Riyadh","Information Technology",2.15);
            
            Records.add(216328,"Abdullah Ahmed","18/05/1998","0544432053"
                    ,"17843 Riyadh","Computer Science",3.60);
             Records.add(222222,"Test","00/00/0000","000000000","NULL","NULL",0.00);
            
            System.out.println("Records in The LinkedList :\n");
            
            Records.Print();
            
            System.out.println("removing the Record(222222) :\n");
            System.out.println(Records.remove(222222));
            System.out.println("Searching for the record(222222):\n");
            Records.Retrive(222222);
            System.out.println("Updating the record(216112) :\n");
            //Records.Update(216112);
            //System.out.println("Back Tracking the Update :");
            //Records.backTrack();
            System.out.println("===================================");

            System.out.println("BST Implemention : \n");
            
            BST_Tree tree = new BST_Tree();
            
            Node temp = Records.head;
            
                while(temp!= null){
                    tree.add(temp);
                    temp = temp.next;
                }
                
           System.out.println("Full Tree (Inorder Treversal) :");
             
           tree.PrintInOrder(tree.root);
           System.out.println();
           System.out.println("Seareching for ID : 216104");
           tree.find(216104);
           System.out.println("Searching for ID : 321230");
           tree.find(321230);
           System.out.println();
           System.out.println("Deleting ID : 213328");
           tree.remove(213328);
           System.out.println("Udpating the root ");
           System.out.println("Before updating \n"+Records.head.toString());
           Node t = Records.head.next;
           tree.Update(t, Records.head);
           System.out.println("After Updating\n"+Records.head.toString());
           System.out.println("Back Tracking (before Update) : ");
           tree.backTracking();
           System.out.println("\n{End of BST !}");
           System.out.println("===================================");
           
            System.out.println("HachTable Implemention :");
            HashTable Table = new HashTable(Records.size);
            
            Node temp2 = Records.head;
            while(temp2 != null){
                Table.insert(temp2);
                temp2 = temp2.next;
            }
            Table.HashPrint();
            System.out.println("Table size : "+Table.size);
            System.out.println("Removing  Record (213330) \n");
            Table.remove(213330);
            
            System.out.println("After remvoing \n");
            Table.HashPrint();
            System.out.println("Removing 444444");
            Table.remove(444444);
            System.out.println("Table size : "+Table.size);
            System.out.println();
            System.out.println("Seareching for Record (216112)");
            Table.hachSearch(216112);
            System.out.println("Seareching for Record (222222)");
            Table.hachSearch(222222);
            System.out.println("===================================");
            
            System.out.println("Piority Queue Implemention :\n");
            
            PriorityQueue queue = new PriorityQueue(Records.size+1);
            
            Node temp3 = Records.head ;
            
            while(temp3 != null){
                queue.insert(temp3);
                temp3 = temp3.next;
            }
             System.out.println("Printing the queue in (Ascending Order) based on Student (GPA) :\n");
            queue.printQueue();
            
            System.out.println("Queue size :");
            System.out.println(queue.recordsSize);
            System.out.println("The highst Order in the queue :\n"+queue.highstOrder().toString());
            System.out.println("The lowest Order in the queue :\n"+queue.lowestOrder().toString());
            System.out.println("checking if the queue is full : "+queue.isFull());
            
            System.out.println("Removing (Serving):");
            System.out.println(queue.remove().toString());   
            System.out.println("Has been removed !");
            System.out.println();
            
            System.out.println("Checking if the queue is full : "+queue.isFull()); 
            System.out.println("\nChecking if the queue is empty :"+queue.isEmpty());
            System.out.println("\nThe highst Order in the queue :\n"+queue.highstOrder().toString());
            System.out.println("\nThe lowest Order in the queue :\n"+queue.lowestOrder().toString());
            System.out.println("================================================");
            System.out.println("{End Of the Students Records Management System}".toUpperCase());
            System.out.println("================================================");
            
            
    }
}
