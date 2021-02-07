
package project;


public class BSTNode {
    BSTNode right,left;
    String key;
    Node record;
    
        public BSTNode(){
            right = left = null;
            record = null;
            key = null;
        }
      
        
        
        public BSTNode(Node node , BSTNode right,BSTNode left){
            record = node;
            this.right = right;
            this.left = left;
        }
        public BSTNode(Node node){
            record = node;
            left = right = null;
        }
        
        public void setRight(BSTNode right){
            this.right = right;
        }
        public void setLeft(BSTNode left){
            this.left = left;
        }
        public void setRecored(Node record){
            this.record = record;
        }
       
        public BSTNode getRitgh(){
            return right;
        }
        public BSTNode getLeft(){
            return left;
        }
        public Node getRecord(){
            return record;
        }
        public boolean isLeaf(BSTNode p){
            return (p.left == null && p.right == null);
        }
}
