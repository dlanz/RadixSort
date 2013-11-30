/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

import java.util.*;

/**
 *
 * @author Dans
 */
public class RadixSort {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] theArray = {4,3,5,9,7,2,4,1,6,5};
        
        RadixSort theSort = new RadixSort();
        
        System.out.println(Arrays.toString(theArray)); //Outputs the original array
        theSort.sort(theArray);
        System.out.println(Arrays.toString(theArray)); //Outputs the original array (no modifictions)
    }
    
 
    
    public void sort(int[] theArray) {
        int significant;
        int curVal;    
        int modulo = 10;
        int ofInterest = 1;
        
        LinkedList<Queue> lists = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        int max = theArray[0];
        for(int i = 0; i < theArray.length; i++) {
            if ( theArray[i] > max) {
                  max = theArray[i];
            }
        }
        significant = String.valueOf(max).length();
        Queue<Integer> thisQueue;
        for(int j = 1; j <= significant; j++){
           
            lists.clear();
            for(int i = 0; i < 10; i++){
                lists.add(i, queue);
            }
            System.out.println(lists); //Outputs a list of 10 elements each with a value of null
            for(int value : theArray){
                  curVal = value % modulo;
                  curVal = curVal / ofInterest;
                  System.out.println(curVal); //Correctly outputs the expected result
                  System.out.println(lists.get(curVal)); //With each iteration this outputs 10 elements each with a queue of all values.
                  
                  thisQueue = new LinkedList<>();
                  thisQueue = lists.get(curVal);
                  thisQueue.add(value);
                  
                  lists.set(curVal, thisQueue);// This seems to insert the generated queue into every linked lists node.
            }
            int k = 0;
            for(int i = 0; i < 10; i++){
                Queue<Integer> curQueue = lists.get(i);
                if(!curQueue.isEmpty()){
                    theArray[k] = curQueue.remove();
                    k++;
                }
            }
            ofInterest = ofInterest * 10;
            modulo = modulo * 10;
        }
    }
}