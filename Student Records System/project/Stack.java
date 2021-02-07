
package project;

public class Stack {
    SNode top;
    int size;
        public Stack(){
            top = null;
            size = 0;
        }
        
        public void puch(int ID , String name , String BD,String mobile,String address,String spec,double gpa){
           SNode temp = new SNode(ID,name,BD,mobile,address,spec,gpa,top);
           top = temp;
           size++;
        }
        
        public SNode pop(){
            SNode temp = top;
            top = top.next;
            size--;
            return temp;
        }
        public SNode peek(){
            if (top == null)
                return null;
            return top;
        }
        public String printRecord(){
           SNode temp = top;
           String str = (" Student ID : "+temp.StduedntID+"\n Student Name : "+temp.Name+"\n Student BirthDay :"+temp.BirthDay+"\n Student Mobile Number :"+temp.Mobile+
             "\n Student Address :"+temp.Address+"\n Student Specialty :"+temp.Specialty+"\n Student GPA : "+temp.GPA);
            System.out.println("\n------------------------------");
            top = top.next;
            size--;
            return str;
}
        public boolean isEmpty(){
            return top == null;
        }
}