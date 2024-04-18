public class loopbreak {
 
    public static void main(String[] args) {
         
        int i=1;
        while(i<6) {
            if(i==4) {
                break;
            }
            System.out.println(i);
            //update
            i++;
        }
    }
 
}