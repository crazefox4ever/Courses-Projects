
package project;

import java.util.Scanner;
public class DLList {
Node head,tail;
int size;

Scanner n = new Scanner(System.in);
Stack stack; 

    public DLList(){
        head = tail = null;
        stack  = new Stack();
        size =0;
    }
   
    
    public void addFirst(int ID,String name,String BD,String mobile,String address,String spec,double gpa){
            Node temp = new Node(ID,name,BD,mobile,address,spec,gpa,null,null);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    
 public void add(int ID){
         Node temp = new Node(ID,null,null);
       if(head == null){
           head = tail = temp;
       }       
       else{
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
       }
       size++;
    }
 public void add(int ID,String name){
         Node temp = new Node(ID,name,null,null);
       if(head == null){
           head = tail = temp;
       }       
       else{
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
       }
       size++;
    }
 public void add(int ID,String name,String BD ){
         Node temp = new Node(ID,name,BD,null,null);
       if(head == null){
           head = tail = temp;
       }       
       else{
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
       }
       size++;
    }
 public void add(int ID,String name,String BD,String mobile){
         Node temp = new Node(ID,name,BD,mobile,null,null);
       if(head == null){
           head = tail = temp;
       }       
       else{
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
       }
       size++;
    }
 public void add(int ID,String name,String BD,String mobile,String address){
         Node temp = new Node(ID,name,BD,mobile,address,null,null);
       if(head == null){
           head = tail = temp;
       }       
       else{
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
       }
       size++;
    }
 public void add(int ID,String name,String BD,String mobile,String address,String spec){
         Node temp = new Node(ID,name,BD,mobile,address,spec,null,null);
       if(head == null){
           head = tail = temp;
       }       
       else{
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
       }
       size++;
    }
 public void add(int ID,String name,String BD,String mobile,String address,String spec,double gpa){
         Node temp = new Node(ID,name,BD,mobile,address,spec,gpa,null,null);
       if(head == null){
           head = tail = temp;
       }       
       else{
           tail.next = temp;
           temp.prev = tail;
           tail = temp;
       }
       size++;
    }
 
 public String remove(int ID){
        if(head == null){
            System.out.println("Cant'remove from empty list !");
            return null;
        }
        
     Node temp = head;
        if(temp.StduedntID == ID){
            head = head.next;
            head.prev = null;
                if(head == null){
                    tail = null;
                }
                
        }
        
        else{
                while(temp != null){
                    if(temp.StduedntID == ID){
                        
                        if(temp == tail){
                            tail = tail.prev;
                            tail.next = temp.next; 
                            break;
                        }
                        else{
                     temp.prev.next = temp.next;     
                     temp.next.prev = temp.prev;
                        
                      break;
                     }
                    }
                     temp = temp.next;
                }
                size--;
                return "Student ID Recored ["+ID+"] Has been removed from the Recoreds! ";    
        }
            if(temp.StduedntID != ID){
        System.out.println("["+ID+"] Not Found ! ");
        return null;
        }
        size--;
         return "Student ID Recored ["+ID+"] Has been removed from the Recoreds! ";    
    }
 public Node removeFromFront(){
             if(head == null){
                 System.out.println("Can't remove from empty list ");
                 return null;
             }
                Node element ;
                 element = head;
                head = head.next;
                head.prev = null;
                if(head == null){
                    tail = null;
                }
               size--; 
               return element;
        }
 
    public void Print(){
        Node t = head;
        while(t != null){
            System.out.print(" Student ID : "+t.StduedntID+"\n Student Name : "+t.Name+"\n Student BirthDay :"+t.BirthDay+"\n Student Mobile Number :"+t.Mobile+
                    "\n Student Address :"+t.Address+"\n Student Specialty :"+t.Specialty+"\n Student GPA : "+t.GPA);
            t = t.next;
            System.out.println("\n------------------------------");
        }
        System.out.println("Students Recoreds in the list : "+this.size);
    }
    
    
    public void PrintOne(Node pos){
        Node t = pos;
        if(t != null){
            System.out.print(" Student ID : "+t.StduedntID+"\n Student Name : "+t.Name+"\n Student BirthDay :"+t.BirthDay+"\n Student Mobile Number :"+t.Mobile+
             "\n Student Address :"+t.Address+"\n Student Specialty :"+t.Specialty+"\n Student GPA : "+t.GPA);
            System.out.println("\n------------------------------");
        }
    }
    
    
    public boolean Retrive(int ID ){
        Node temp = head;
            while(temp != null){
                if(temp.StduedntID == ID){
                    System.out.println("["+ID+"] Found!\nRecord informations :\n");
                     this.PrintOne(temp);
                     return true;
                }
                temp = temp.next;          
            }
            System.out.println("["+ID+"] Not Found !");
            return false;
    }
    
    
    public void Update(int ID){
            
           
            Node temp = head;
            boolean x = true;
                if(this.Found(ID, temp)){
                while(temp!= null){
                    if(temp.StduedntID == (ID)){
                      while(x){   
                        System.out.println("What would you like to update : ");
                        this.desplay();
                       
                        int inp = n.nextInt();
                            
                        
                        System.out.println("Enter the Updated info ");
                        
                         String t ;
                            switch(inp){
                                
                                case 1:
                                     t = n.next();
                                    stack.puch(temp.StduedntID, temp.Name, temp.BirthDay, temp.Mobile,temp.Address,temp.Specialty,temp.GPA);
                                    System.out.println("The new Updated Information\n");
                                    System.out.println(" Student ID : ["+temp.StduedntID+"]\n Student Name : "+temp.Name+"\n Student BirthDay :"+temp.BirthDay+"\n Student Mobile Number :"+temp.Mobile+
             "\n Student Address :"+temp.Address+"\n Student Specialty :"+temp.Specialty+"\n Student GPA : "+temp.GPA);
            System.out.println("\n------------------------------");
                                    break;
                                case 2:
                                    t = n.next();
                                    stack.puch(temp.StduedntID, temp.Name, temp.BirthDay, temp.Mobile,temp.Address,temp.Specialty,temp.GPA);
                                    temp.setName(t);
                                     System.out.println("The new Updated Information\n");
                                    System.out.println(" Student ID : "+temp.StduedntID+"\n Student Name :["+temp.Name+"]\n Student BirthDay :"+temp.BirthDay+"\n Student Mobile Number :"+temp.Mobile+
             "\n Student Address :"+temp.Address+"\n Student Specialty :"+temp.Specialty+"\n Student GPA : "+temp.GPA);
            System.out.println("\n------------------------------");
                                    break;
                                case 3:
                                    t = n.next();
                                    stack.puch(temp.StduedntID, temp.Name, temp.BirthDay, temp.Mobile,temp.Address,temp.Specialty,temp.GPA);
                                    temp.setBirthDay(t);
                                    System.out.println("The new Updated Information\n");
                                    System.out.println(" Student ID : "+temp.StduedntID+"\n Student Name : "+temp.Name+"\n Student BirthDay :["+temp.BirthDay+"]\n Student Mobile Number :"+temp.Mobile+
             "\n Student Address :"+temp.Address+"\n Student Specialty :"+temp.Specialty+"\n Student GPA : "+temp.GPA);
            System.out.println("\n------------------------------");
                                    break;
                                case 4:
                                    t = n.next();
                                    stack.puch(temp.StduedntID, temp.Name, temp.BirthDay, temp.Mobile,temp.Address,temp.Specialty,temp.GPA);
                                    temp.setMobile(t);
                                    System.out.println("The new Updated Information\n");
                                    System.out.println(" Student ID : "+temp.StduedntID+"\n Student Name : "+temp.Name+"\n Student BirthDay :"+temp.BirthDay+"\n Student Mobile Number :["+temp.Mobile+
             "]\n Student Address :"+temp.Address+"\n Student Specialty :"+temp.Specialty+"\n Student GPA : "+temp.GPA);
            System.out.println("\n------------------------------");
                                    break;
                                case 5 :
                                    t = n.next();
                                    stack.puch(temp.StduedntID, temp.Name, temp.BirthDay, temp.Mobile,temp.Address,temp.Specialty,temp.GPA);
                                    temp.setAddress(t);
                                    System.out.println("The new Updated Information\n");
                                    System.out.println(" Student ID : "+temp.StduedntID+"\n Student Name : "+temp.Name+"\n Student BirthDay :"+temp.BirthDay+"\n Student Mobile Number :"+temp.Mobile+
             "\n Student Address :["+temp.Address+"]\n Student Specialty :"+temp.Specialty+"\n Student GPA : "+temp.GPA);
            System.out.println("\n------------------------------");
                                    break;
                                case 6 :
                                    t = n.next();
                                    stack.puch(temp.StduedntID, temp.Name, temp.BirthDay, temp.Mobile,temp.Address,temp.Specialty,temp.GPA);
                                    temp.setSpecialty(t);
                                    System.out.println("The new Updated Information\n");
                                    System.out.println(" Student ID : "+temp.StduedntID+"\n Student Name : "+temp.Name+"\n Student BirthDay :"+temp.BirthDay+"\n Student Mobile Number :"+temp.Mobile+
             "\n Student Address :"+temp.Address+"\n Student Specialty :["+temp.Specialty+"]\n Student GPA : "+temp.GPA);
            System.out.println("\n------------------------------");
                                    break;
                                case 7 :
                                    double num = n.nextDouble();
                                    stack.puch(temp.StduedntID, temp.Name, temp.BirthDay, temp.Mobile,temp.Address,temp.Specialty,temp.GPA);
                                    temp.setGPA(num);
                                    System.out.println("The new Updated Information\n");
                                    System.out.println(" Student ID : "+temp.StduedntID+"\n Student Name : "+temp.Name+"\n Student BirthDay :"+temp.BirthDay+"\n Student Mobile Number :"+temp.Mobile+
             "\n Student Address :"+temp.Address+"\n Student Specialty :"+temp.Specialty+"\n Student GPA :["+temp.GPA+"]");
            System.out.println("\n------------------------------");
                                    break;
                                default:
                                    System.out.println("\nNot an Option please try again");
                                    break;
                                    
                            }
                            System.out.println("Would you like to Update/initializ again\n 1 - yes \n 2 - no ");
                                String xx = n.next().toLowerCase();
                               
                                    switch(xx){
                                        case "yes":
                                            x = true;
                                            
                                            break;
                                        case "no":
                                            x = false;
                                            break;
                                        default :
                                            System.out.println("["+xx+"]Is Unkown Input");
                                            x = false;
                                            break;
                                    }
                               } 
                        }
                        temp = temp.next;          
                    } 
                
                }
                else{
                    System.out.println("["+ID+"] Not found !\n");  
                    return;
                }
}
                
                
    
    public void desplay(){
        System.out.println("\n1 - ID\n2 - Name\n3 - BirthDay\n4 - Mobile\n5 - Address\n6 - Specialty\n7 - GPA\n-------------------");
    }

public boolean Found(int ID , Node temp){
        while(temp != null){
            if(temp.StduedntID == ID)
                return true;
            
            temp = temp.next;
        }
        return false;
    }

    public void backTrack(){
        while(!stack.isEmpty()){
            System.out.println(stack.printRecord());
        }
    }
   

}

