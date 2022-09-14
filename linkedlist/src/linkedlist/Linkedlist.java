/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Student
 */
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <String> arr = new LinkedList <>();
        
        arr.add("cse");
        arr.add("365");
        
        System.out.println("array head :"+arr.poll());
        System.out.println("array next :"+arr.poll());
    }
    
}
