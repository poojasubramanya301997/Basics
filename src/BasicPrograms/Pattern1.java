package BasicPrograms;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("*");
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		// inverted
		for(int i=n;i>0;i--) {
			System.out.print("*");
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
