package radixsort;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Dans
 */
public class LinkedListOfQueues {
    public static void main(String[] args){
        LinkedList<Queue> lists = new LinkedList<>();
        Queue<Integer> queue; 
        
        for(int i = 0; i < 5; i++){
            queue = new LinkedList<>();
            lists.add(queue); //I guess every element has a reference to the same Queue now
        }
        
        int element;
        Queue<Integer> curQueue;
        for(int i = 0; i < 20; i++){
            curQueue = new LinkedList<>(); //These lines are essentially pointless
            curQueue.clear();  //These lines are essentially pointless
            
            element = i % 5;
            element = element / 1;
            curQueue = lists.get(element);
            curQueue.add(element);
            
            lists.set(element, curQueue);
            
        }
        System.out.println(lists.get(0)); //Same Values
        System.out.println(lists.get(1)); //Same Values
        System.out.println(lists.get(2)); //Same Values
        System.out.println(lists.get(3)); //Same Values
        System.out.println(lists.get(4)); //Same Values
    }
}