/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


public class HashNode {
    HashNode next;
    int data;
    Node record;
        public HashNode(Node record){
            this.record = record;
            next = null;
            
        }
        public HashNode(int size){
            this.data = size;
            record = null;
            next = null;
        }
       
        
        
}
