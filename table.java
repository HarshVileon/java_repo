import java.util.*;

public class table {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d=0;
        int e=0;
        
        for (int i=1; i<=10; i++){
             d = n1*i;
             System.out.print(d+" ");
        }
        System.out.println();
        for (int j=1; j<=10; j++){
             e = n2*j;
             System.out.print(e+" ");
        }
        System.out.println();
        for(int k=1; k<=10; k++){
            System.out.print((n1*k-n2*k)+" ");
        }
        // System.out.print(d-e);
        sc.close();
    }
}