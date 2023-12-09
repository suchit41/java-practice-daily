import java.util.Scanner;

public class jumpingonCloud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []c = new int[n];
        for(int i=0; i<n; i++){
            c [i]  = sc.nextInt();
        }
        System.out.println(jumping(c));
    }

    public static int jumping(int [] c){

        int len = c.length;
        int count = -1;
        for(int i=0; i<len; i++){
            if(i+2 <len && i+2==0){
                i=i+2;
            }else{
                i++;
            }

            count++;
        }
        return count;

    }
}
