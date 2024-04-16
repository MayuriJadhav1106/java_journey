import java.util.*;
public class additionOfNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        
        int i = 1;
        int sum = 0;

        while(i <= a)
        {
          sum = sum + i;
          
           i++;
        }
        System.out.println("the sum is: " + sum);
    }
}