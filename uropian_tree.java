import java.util.Scanner;

public class uropian_tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0; i<x; i++){
            int cycle = sc.nextInt();
            System.out.println(Uropiantree(cycle));
        }
    }

    public static int Uropiantree(int n){
        return (1<<((n>>1)+1))-1<<n%2;

    }
}
