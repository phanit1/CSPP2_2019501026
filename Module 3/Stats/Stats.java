/**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Siva Sankar
 */

import java.util.*;

import javax.jws.WebParam.Mode;

public class Stats {

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        //  Your code goes here....
        int size=arr.length;
        double sum=0;
        double mean;
        if(size==0)
        {
            mean=0;
        }
        else
        {
        for ( int i=0;i<size;i++)
        {
            sum+=arr[i];    
        }
           
        mean=sum/size;
       } 
        return mean;
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        //  Your code goes here...
        Arrays.sort(arr);
        int a=arr.length;
        if(a%2!=0)
            return (double)arr[a/2];
        return (double)(arr[(a-1)/2]+arr[(a)/2])/2.0;
        }
    /**
     * This method returns the mode of the array. If there is no mode, then it returns
     * 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(int[] arr) {
        //  Your code goes here....
        //double mode=(3*(median(arr)))-(2*(mean(arr)));
        int mode = 0, count = 1;
        int l=arr.length;
        for (int i = 0; i < l; ++i) {
            int c = 0;
            for (int j = 0; j < l; ++j) {
                if (arr[j] == arr[i])
                ++c;
            }

            if (c > count)
            {
                count = c;
                mode = arr[i];
            } 
        }
        
        return mode;
    }

    /**
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        //  Your code goes here....
        double var = 0; 
        for (int i = 0; i < arr.length; i++)  
            var += (arr[i] - mean(arr)) *  (arr[i] - mean(arr));   
        return (double)var / arr.length;
    }

    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(int[] arr) {
        //  Your code goes here....
        double sd=Math.sqrt(variance(arr));
        return sd;
    }
}