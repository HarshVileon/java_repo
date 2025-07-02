import java.util.*;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine();
//         String b = sc.nextLine();
//         System.out.println(a+" "+b);
// sc.close();
//     }
// }
class Solution {
     public void concatAndPrint(String a, String b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        solution.concatAndPrint(a, b);
        sc.close();    }
   
}
