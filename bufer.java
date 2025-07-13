import java.io.*;
public class bufer {
    public static void main(String[] args)  throws IOException{
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the integer");
        int a = Integer.parseInt(br.readLine());
        System.out.println(a);
    }

}
// import java.util.*;
// class bufer {
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter the integer");
//         int a=sc.nextInt();
//         for(int i=10; i>=1; i--){
//             System.out.print(a*i+" ");

    
//         }


//     }
// }