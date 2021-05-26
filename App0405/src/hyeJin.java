import java.util.Arrays;
import java.util.Random;

public class hyeJin {
	public static void main(String[] args) {
		   
		   int number [] = new int [8]; 
		   Random r = new Random();
		   
		   int i = 0, j=0, tmp=0;
		   number [i] = r.nextInt();
		   int ls[] = number;
		   
		for ( i = 0; i < ls.length; i++) {
		   
		   for ( j = i+1 ; j<ls.length-i ; j++)
		      
		      if (ls[i]<ls[j]) {
		         
		         tmp = ls[i];
		         ls[i] = ls[j];
		         ls[j]=tmp;
		         
		}

		System.out.println(Arrays.toString(ls)); 


		}
		}
}
