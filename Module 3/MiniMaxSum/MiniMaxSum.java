import java.util.Arrays;
/**
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 *
 * Input : {1,2,3,4,5};
 * Output : 14,10
 *
 * Input : {1,2}
 * Output : 2,1
 *
 * @author Siva Sankar
 */
final class MiniMaxSum {
    private MiniMaxSum() {
    }
    /**
     * This method returns the minimum element in the array.
     * @param arr , contains the elements in arr.
     * @return the minimum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int min(final int[] arr) {
        //  Your code goes here...
        int min = 0;
        if (arr.length != 0) {
            Arrays.sort(arr);
            min = arr[0];
        } else {
            min = -1;
        }
        return min;
    }
    /**
     * This method returns the maximum element in the array.
     * @param arr , contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(final int[] arr) {
        //  Your code goes here...
        int max = 0;
        if (arr.length != 0) {
            Arrays.sort(arr);
            max = arr[arr.length - 1];
        } else {
            max = -1;
        }
        return max;
    }
    /**
     * This method returns the sum of all the elements in the array.
     * @param arr , contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static int sum(final int[] arr) {
        //  Your code goes here...
        int sum = 0;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int i = 0; i <= arr.length - 1; i++) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
    /**
     * Make use of the functions defined for finding the
     * minimum element, maximum element and the sum of all the elements of teh
     * array arr.
     *
     * @param arr , the input array.
     * @return the string version of maxSum and minSum separated by commas.
     */
    public static String miniMaxSum(final int[] arr) {
        //  Your code goes here...
        String minmax = "";
        int minsum = sum(arr) - min(arr);
        int maxsum = sum(arr) - max(arr);
        minmax = (minsum) + "," + (maxsum);
        return minmax; } }
