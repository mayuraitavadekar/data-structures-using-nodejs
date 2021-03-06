/******************************************************************************

 statistical analysis of arrays - 2

*******************************************************************************/

import java.util.Arrays;
import java.util.*;

public class ArraySummary2
{
    public static int[] arr = {4,8,10,15,21,24,27,56,2,11,45,89,4,22,36,54,85};

    public int min() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i]; 
            }
        }
        
        return min;
    }
    
    public int max() {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    public int sum () {
        int sum = 0;
        for(int i=0;i<arr.length;++i) {
            sum =  sum + arr[i];
        }
        
        return sum;
    }
    
    public float avg () {
        int sum = 0;
        for(int i=0;i<arr.length;++i) {
            sum =  sum + arr[i];
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        
        ArraySummary2 obj = new ArraySummary2();
        System.out.println("MIN = " + obj.min());
        System.out.println("MAX = " + obj.max());
        System.out.println("sum = " + obj.sum());
        System.out.println("avg = " + obj.avg());
    }
}
