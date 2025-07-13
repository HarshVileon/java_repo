import java.util.*;
class prime {
    boolean isprime (int n){
        if(n<=1) return false;
        for(int i=2; i<n; i++){
            if(n%i==0) return false;

        }return true;

    }
}
class nextprime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        int next1= n+1;
        prime p =new prime();
        while(true){
            if(p.isprime(next1)){
                System.out.println(next1);
                break;
            }
            next1+=1;
        
        }
        sc.close();
        

    }
}
