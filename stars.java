// public class stars {
//     public static void main (String[] args) {
//         int n = 5;
//         for( int i=1; i<=n; i++){
//             for( int j=1; j<=n-i; j++){
//                 System.out.print("  ");

//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(" *");
//             }
//             for(int k=2; k<=i; k++){
//                 System.out.print(" *");

//             }
//             System.out.println();

//         }
//     }    
// }
// Java program to find factorial of given number
import java.util.*;
class stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++ ){
            int fact = 1;
            for(int j=1; j<=i; j++){
                fact = fact * j;
            }
            System.out.println("Factorial of " + i + " is " + fact);

        }
        int a =6;
        int b=7;
        int c= Math.min(a,b);
        System.out.println("Minimum of " + a + " and " + b + " is " + c);
        sc.close();

    }
}