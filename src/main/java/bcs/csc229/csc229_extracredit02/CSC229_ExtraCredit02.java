/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bcs.csc229.csc229_extracredit02;

/**
 *
 * @author harve
 */
public class CSC229_ExtraCredit02 {
    
    /*
    Develop an algorithm (Java or C++) that can find the ratio of 
    the sum of the largest two numbers divided by the sum of the smallest two numbers in an array. 
    The solution should be linear or better.  

    For example:
    If the input is 
    int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};

    The ratio is (450+321) / (1+1) = 385.5. 
    */
    

    public static void main(String[] args) {
        int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        
        int[] b = {0,1,1,4,6,8,7,9};
        
        int[] c = {1500,500,299,321,45,5};
        
        System.out.println(MinMaxSum(a));
        System.out.println(MinMaxSum(b));
        System.out.println(MinMaxSum(c));
    }
    
    public static double MinMaxSum(int[] arr){
        /*
        O(n) -- MinMaxSum traverses the array two times
                Once to find the the actual max and min
                Second time to find the second largest and smallest
                
                The function should be 2n + 7
        */
        
        double max1 = arr[0];   
        double max2 = arr[1];
        
        double min1 = arr[0];
        double min2 = arr[1];
        
        int indexToSkipMAX = 0;
        int indexToSkipMIN = 0;
        
        //first traversal
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max1 = arr[i];
                indexToSkipMAX = i;
            }
            
            if(arr[i] < min1){
                min1 = arr[i];
                indexToSkipMIN = i;
            }
        }
        
        //second traversal
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max2 && arr[i] <= max1 && i != indexToSkipMAX){
                max2 = arr[i];
            }
            
            if(arr[i] < min2 && arr[i] >= min1 && i != indexToSkipMIN){
                min2 = arr[i];
            }
        }
        
        return (max1 + max2) / (min1 + min2);
    }
  
}
