// class bitwise {
//     public static void main(String[] args){
//         int i= 1;
//         System.out.println(~i);
//     }
// }
class bitwise {
    public int[] computeOperations(int x, int y) {
        // code here
        int p = x + y;
        int q = x-y;
        int r=x*y;
        int s=x/y;
        int t=x%y;
    return new int[]{p, q,r,s,t};
    }
     public static void main(String[] args){
        bitwise obj = new bitwise();
        int[] result = obj.computeOperations(10, 5);
        for (int res : result) {
            System.out.println(res);
        }
    }
}