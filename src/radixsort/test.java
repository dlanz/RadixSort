/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

import java.util.Arrays;

/**
 *
 * @author Dans
 */
public class test {
    public static void main(String[] args) {
        int[] theArray = {43,37,597,98,73,214,436,100,67,512};
        
        RadixSort theSort = new RadixSort();
        theSort.setArray(theArray);
        
        System.out.println(Arrays.toString(theArray)+" - Start"); 
        int[] inOrder = theSort.sort();
        System.out.println(Arrays.toString(inOrder)+" - Final");
    }
}
