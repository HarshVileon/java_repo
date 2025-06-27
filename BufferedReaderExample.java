import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String [] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // System.out.println("Enter the integer");
            // int a = Integer.parseInt(br.readLine());
            System.out.println("Enter the String");
            String b=br.readLine();
            System.out.println(b);
        }
    }
    
}
