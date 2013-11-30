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
public class QueueExample {
    
    public static void queueTest(String args){
        int time = Integer.parseInt(args);
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--)
            queue.add(i);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            
        }
    }
    
    public static void main(String[] args) {
        queueTest("30");
       
    }
    
    
}