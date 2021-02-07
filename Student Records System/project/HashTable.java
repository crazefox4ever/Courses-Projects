
package project;

public class HashTable {
   private HashNode[] table;
   int size;
    public HashTable(int tableSize){
        table = new HashNode[tableSize];
        size = 0; 
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    public void clear(){
        int l = table.length;
        table = new HashNode[l];
        size = 0;
    }
    public void insert(Node record){
        int pos = hash(record.StduedntID);
        HashNode temp = new HashNode(record); 
            if(table[pos] == null){
                table[pos] = temp;
            }
            else{
                temp.next = table[pos];
                table[pos] = temp;
            }
            size++;
    }
    
    
    public void remove(int record){
        int pos = hash(record);
            HashNode temp = table[pos];
            HashNode curr = temp;
                if(temp.record.StduedntID == record){
                    size--;
                    table[pos] = temp.next;
                    return; 
                }
                while(curr.next != null && curr.next.record.StduedntID != record){
                    curr = curr.next;
                }
                if(curr.next == null){
                    System.out.println("\nRecord Not found !");
                    return;
                }
                size--;
                if(curr.next.next == null){
                    curr.next = null;
                    return;
                }
                curr.next = curr.next.next;
                table[pos] = temp;
                
    }
        public boolean hachSearch(int ID){
            int pos = hash(ID);
            HashNode temp = table[pos];
            HashNode curr = temp;
            if(temp.record.StduedntID == ID){
                   System.out.println("Record Found :\n"+temp.record.toString());
                   return true;
                }
             while(curr.next != null && curr.next.record.StduedntID != ID){
                    curr = curr.next;
                }
                if(curr.next == null){
                    System.out.println("\nRecord["+ID+"] Has Not been found !");
                    return false;
                }
                
                
                return curr.next.record.StduedntID == ID;
        }
    
  
    public int hash(int ID){
        return ID % table.length;
    }
    
    public void HashPrint(){
        System.out.println();
        for(int i = 0 ; i < table.length ; i++){
            System.out.print("Hash_Table["+i+"] :"); 
                HashNode temp = table[i];
                while(temp  != null ){
                    System.out.print(" "+temp.record.StduedntID+" ");
                    temp = temp.next;
                }
                System.out.println();
        }
    }
}
