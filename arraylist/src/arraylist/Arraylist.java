/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> arr = new ArrayList <Integer>();
        for(i=0; i<5; i++){
            arr.add(i*5);
        }
        for(i=0; i<5; i++){
            System.out.println(arr.get(i));
        }
        
    }

    private static int add(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
