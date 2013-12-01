package radixsort;
import java.util.*;
/**
 * @author dlanz
 */
public class RadixSort {
    private int[] theArray;
    public void setArray(int[] array){
        this.theArray = array;
    }    
    public int[] getArray(){
        return this.theArray;
    }
    
    private int modulo = 10;
    public void setModulo(int mod){
        this.modulo = mod;
    }    
    public int getModulo(){
        return this.modulo;
    }
    
    private int ofInterest = 1;   
    public void setInterest(int interest){
        this.ofInterest = interest;
    }    
    public int getInterest(){
        return this.ofInterest;
    }
    
    private int significant = 0;
    private int curVal = 0;   
    
    private int max(int[] theArray) {
        int max = theArray[0];
        for(int i = 0; i < theArray.length; i++) {
            if ( theArray[i] > max) {
                  max = theArray[i];
            }
        }
        return max;
    }
    
    public int[] sort() {
        LinkedList<Queue> lists = new LinkedList<>();
        Queue<Integer> queue;
        
        lists.clear();
        for(int i = 0; i < 10; i++){
            queue = new LinkedList<>();
            lists.add(i, queue);
        }
       
        this.significant = String.valueOf(max(this.theArray)).length();
        
        for(int j = 1; j <= this.significant; j++){
            Queue<Integer> thisQueue;
            for(int value : this.theArray){
                this.curVal = value % this.modulo;
                this.curVal = this.curVal / this.ofInterest;
                thisQueue = lists.get(this.curVal);
                thisQueue.add(value);
                lists.set(this.curVal, thisQueue);
            }
            
            int k = 0;
            for(int i = 0; i < 10; i++){
                thisQueue = lists.get(i);
                while(!thisQueue.isEmpty()){
                    this.theArray[k] = thisQueue.remove();
                    k++;
                }
            }
            this.ofInterest = this.ofInterest * 10;
            this.modulo = this.modulo * 10;
        }
        return this.theArray;
    }
}