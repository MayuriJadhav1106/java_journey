import java.util.*;
public class numberInRange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        
        int counter = 1;
        while(counter <= a)
        {
          System.out.println(counter);
           counter++;
        }
    }
}