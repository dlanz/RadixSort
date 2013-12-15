package radixsort;
/**
 * @author Daniel Lanza
 * 
 * Group Members:
 * Daniel Lanza
 * Antonio Jemmott
 * Chanakya Chakravartula
 * Mihir Satish Sakhardande
 * Alldrin D'Costa
 */
import java.util.Arrays;

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