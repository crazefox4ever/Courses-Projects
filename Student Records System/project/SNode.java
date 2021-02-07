
package project;

public class SNode {
    SNode next;
    int StduedntID;
    String Name;
    String BirthDay;
    String Mobile;
    String Address;
    String Specialty;
    double GPA;
    
    
        public SNode(){
            next  = null;
            StduedntID = 0;
            Name = null;
            BirthDay = null;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        
        public SNode(SNode next){
            this.next = next;
            StduedntID = 0;
            Name = null;
            BirthDay = null;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
            
        }
        public SNode(int ID,SNode next){
            this.next = next;
            StduedntID = ID;
            Name = null;
            BirthDay = null;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public SNode(int ID , String name,SNode next){
            this.next = next;
            StduedntID = ID;
            Name = name;
            BirthDay = null;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public SNode(int ID , String name , String BD,SNode next){
            this.next = next;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = null;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public SNode(int ID , String name , String BD,String mobile,SNode next){
            this.next = next;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = mobile;
            Address = null;
            Specialty = null;
            GPA = 0.0;
        }
        public SNode(int ID , String name , String BD,String mobile,String address,SNode next){
            this.next = next;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = mobile;
            Address = address;
            Specialty = null;
            GPA = 0.0;
        }
        public SNode(int ID , String name , String BD,String mobile,String address,String spec,SNode next){
            this.next = next;
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = mobile;
            Address = address;
            Specialty = spec;
            GPA = 0.0;
        }
        public SNode(int ID , String name , String BD,String mobile,String address,String spec,double gpa,SNode next){
            this.next = next;        
            StduedntID = ID;
            Name = name;
            BirthDay = BD;
            Mobile = mobile;
            Address = address;
            Specialty = spec;
            GPA = gpa;
        }
        public void setNext(SNode next){
        this.next = next;
        }
        public SNode getNext(){
        return next;
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
}


