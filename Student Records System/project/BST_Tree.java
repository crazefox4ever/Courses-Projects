
package project;

public class BST_Tree {
    BSTNode root;
    int size;
    Stack stack;
    
        public BST_Tree(){
            root = null;
            size = 0;
            stack = new Stack();
        }
        public BST_Tree(Node n){
            root = new BSTNode(n);
            size = 0;
            stack = new Stack();
        }
       
        public BSTNode addRec(BSTNode p , Node record){
            if(p == null){
               return  new BSTNode(record);
            }
            if(record.StduedntID < p.record.StduedntID){
                p.left = addRec(p.left , record);
            }
            else if(record.StduedntID > p.record.StduedntID){
                p.right = addRec(p.right , record);
            }
            else  {
             return p;   
            }
            
            return p;
        }
        
            public void add(Node record){
                root = addRec(root,record);
                size++;
            }
            public boolean finding(BSTNode p , int ID){
            if (p == null){
                System.out.println("Not found !");
                return false;
            }
            
            if( ID == p.record.StduedntID){
                System.out.println("Record has been found \n"+p.record.toString());
                return true;
            }
            else
                return ID  < p.record.StduedntID ? finding(p.left,ID) : finding(p.right , ID);
            }
            
            public boolean find (int ID){
                return finding(root,ID);
            }
            
            public void PrintInOrder(BSTNode p){
                if(p != null){
                    PrintInOrder(p.left);
                    System.out.println(p.record.toString()+"");
                    PrintInOrder(p.right);
                }
            }
            
            public BSTNode removeRec(BSTNode p ,int ID ){
                    if(p == null){
                        return null;
                    }
                    if(ID < p.record.StduedntID){
                        p.left = removeRec(p.left,ID);
                        return p;
                    }
                    else if (ID > p.record.StduedntID){
                        p.right = removeRec(p.right , ID);
                        return p;
                    }
                    else if (ID == p.record.StduedntID){
                        if(p.isLeaf(p)){
                            return null;
                        }
                        else if(p.left == null){
                            return p.right;
                        }
                        else if(p.right == null){
                            return p.right;
                        }
                        else{
                            int minRight = minRight(p.right);
                            p.record.StduedntID = minRight;
                            p.right = removeRec(p.right,minRight);
                        }
                    }
                    
                    return p;
            }
            public int minRight(BSTNode p){
                return p.left == null ? p.record.StduedntID : minRight(p.left);
            }
            
            public void remove(int ID){
                root = removeRec(root,ID);
                size--;
            }
            
            public BSTNode UpdateRec(BSTNode p ,Node record ,Node oldRecord){
                if(p == null){
                    System.out.println("The record has not been found!");
                    return null;
                }
                else if(oldRecord.StduedntID < p.record.StduedntID){
                    p.left = UpdateRec(p.left , record , oldRecord);
                    return p;
                }
                else if(oldRecord.StduedntID < p.record.StduedntID){
                    p.right = UpdateRec(p.right , record , oldRecord);
                    return p;
                }
                
                else if (oldRecord.StduedntID == p.record.StduedntID){
                    stack.puch(oldRecord.StduedntID, oldRecord.Name, oldRecord.BirthDay
                    , oldRecord.Mobile, oldRecord.Address, oldRecord.Specialty, oldRecord.GPA);
                    
                    oldRecord.StduedntID = record.StduedntID; oldRecord.Name = record.Name; oldRecord.BirthDay = record.BirthDay;
                    oldRecord.Address = record.Address;oldRecord.Mobile = record.Mobile;oldRecord.Specialty = record.Specialty;
                    oldRecord.GPA = record.GPA;
                    
                }
                
                return p;
                
            }
            public void Update(Node newRecord , Node oldRecord){
                root = UpdateRec(root,newRecord,oldRecord);
            }
            public void backTracking(){
                System.out.println(stack.printRecord());
            }
}
