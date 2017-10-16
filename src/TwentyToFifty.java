//the OOP version of Random

import java.util.Random;

public class TwentyToFifty {
    private int[] array = new int[10];
    private int max;
    
    public TwentyToFifty() {
        for (int i =0 ; i < array.length ; i++) {
            array[i] = 20 + (int)(Math.random() * 31); 
        }
        max = findMax(array);
    }        
    
    public TwentyToFifty(Random r) {
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = 20 + r.nextInt(31);
        }
        max = findMax(array);              
    }    
    
    private int findMax(int[] array) {
        int max; //different to this.max
        if (array.length > 0) {
            max = array[0];
            for (int i : array) {
                if (i > max) max = i;
            }
        return max;
        }
        return -1;
    }
    
    public String toString() {
        String str = "Numbers: ";
        for (int i : array) {
            str += i + ", ";
        }
        str += "\b\b. Max: ";
        str += max;
        return str;
    }   
}

class RandTester {
    public static void main (String[] args) {
        
        TwentyToFifty ttf = new TwentyToFifty();
        System.out.println(ttf);
        
        Random randNums = new Random();
        TwentyToFifty ttf2 = new TwentyToFifty(randNums);
        System.out.println(ttf2); 
    } 
}


