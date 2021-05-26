import java.util.*;
 
class BOJ_Coin_11047 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count =0;
        int[] arr =  new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
    
        for(int i = N-1; i >= 0; i--){
            if(M >= arr[i]){
                count += M / arr[i];
                M = M % arr[i];
            }
            
        }
        
        System.out.println(count);
    
        
    }
 
}
/*
10 4200
1
5
10
50
100
500
1000
5000
10000
50000
*/