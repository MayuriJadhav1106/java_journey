public class ifelse_ladder{
    public static void main(String args[]){
        int age = 15;
        if(age >= 18)
        {
            System.out.println("Adult");
        }
        else if(age >=13 && age<= 17)
        {
            System.out.println("Teenager");
        }
        else{
            System.out.println("child");
        }
    }
}