import java.io.*;
public class bufer {
    public static void main(String[] args)  throws IOException{
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the integer");
        int a = Integer.parseInt(br.readLine());
        System.out.println(a);


    }



}
