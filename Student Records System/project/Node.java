
package project;

public class Node {
    Node next , prev;
    int StduedntID;
    String Name;
    String BirthDay;
    String Mobile;
    String Address;
    String Specialty;
    double GPA;
    
    
        public Node(){
            next = prev = null;
            StduedntID = 0;
            Name = null;
            BirthDay = null;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public Node(Node next,Node prev){
            this.next = next;
            this.prev = prev;
            StduedntID = 0;
            Name = null;
            BirthDay = null;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
            
        }
        public Node(int ID,Node next,Node prev){
            this.next = next;
            this.prev = prev;
            StduedntID = ID;
            Name = null;
            BirthDay = null;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public Node(int ID , String name,Node next,Node prev){
            this.next = next;
            this.prev = prev;
            StduedntID = ID;
            Name = name;
            BirthDay = null;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public Node(int ID , String name , String BD,Node next,Node prev){
            this.next = next;
            this.prev = prev;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public Node(int ID , String name , String BD,String mobile,Node next,Node prev){
            this.next = next;
            this.prev = prev;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = mobile;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public Node(int ID , String name , String BD,String mobile,String address,Node next,Node prev){
            this.next = next;
            this.prev = prev;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = mobile;
            Address = address;
            Specialty = null;
            GPA = 0.0;
        }
        public Node(int ID , String name , String BD,String mobile,String address,String spec,Node next,Node prev){
            this.next = next;
            this.prev = prev;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = mobile;
            Address = address;
            Specialty = spec;
            GPA = 0.0;
        }
        public Node(int ID , String name , String BD,String mobile,String address,String spec,double gpa,Node next,Node prev){
            this.next = next;
            this.prev = prev;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = mobile;
            Address = address;
            Specialty = spec;
            GPA = gpa;
        }
        public void setNext(Node next){
        this.next = next;
        }
        public void setPrev(Node prev){
            this.prev = prev;
        }
        public Node getNext(){
        return next;
        }
        public Node getPrev(){
        return prev;
        }
        public void setID(int ID){
            StduedntID = ID;
        }
        public int getID(){
            return StduedntID;
        }
        public void setName(String name){
            Name = name;
        }
        public String getName(){
            return Name;
        }
        public void setBirthDay(String BD){
            BirthDay = BD;
        }
        public String getBirthDay(){
            return BirthDay;
        }
        public void setMobile(String mobile){
            Mobile = mobile;
        }
        public String getMobile(){
            return Mobile;
        }
        public void setAddress(String address){
            Address = address;
        }
        public String getAddress(){
            return Address;
        } 
        public void setSpecialty(String spec){
            Specialty = spec;
        }
        public String getSpecialty(){
            return Specialty;
        }
        public void setGPA(double gpa){
            GPA = gpa;
        }
        public double getGPA(){
            return GPA;
        }
   @Override
   public String toString(){
       return (" Student ID : "+this.StduedntID+"\n Student Name : "+this.Name+"\n Student BirthDay :"+this.BirthDay+"\n Student Mobile Number :"+
               this.Mobile + "\n Student Address :"+this.Address+"\n Student Specialty :"+this.Specialty+"\n Student GPA : "+this.GPA+"\n----------------------------"
               );
   }
        
}


