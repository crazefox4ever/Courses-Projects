/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author macbook
 */
public class Tree_test {
    public static void main(String[] args) {
        BST_Tree tree = new BST_Tree();
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
               Node temp = list.head;
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
           System.out.println("Before updating \n"+list.head.toString());
           Node t = list.head.next;
           tree.Update(t, list.head);
           System.out.println("After Updating\n"+list.head.toString());
           System.out.println("End of BST !");
           
           
           
           
           
          
        
    }
}
