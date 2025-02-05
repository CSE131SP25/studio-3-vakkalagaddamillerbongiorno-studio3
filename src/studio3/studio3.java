package studio3;
import java.util.Scanner;
public class studio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose a number to find the prime numbers of");
		int n = in.nextInt();
		
		boolean [] sieve;
		sieve = new boolean[n+1];
		for(int i = 0; i<=n; i++) {
			sieve[i] = true;
		}
			
			for(int j = 2; j<=n; j++) {
			for(int k = j*j; k<=n; k+=j) {
				sieve[k] = false;
		}
		}
		
		for(int l= 2; l < sieve.length; l++) {
			if(sieve[l] == true) {
			System.out.println(l);
			}
		}
	}
	}
