import java.util.*;
public class largestNumber{
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            if(largest< number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,2,3,6,5};
        System.out.println("largest value in array is: "+getLargest(number));
    }
}