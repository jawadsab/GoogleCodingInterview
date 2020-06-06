package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class FaithFulNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		BigInteger power[] = new BigInteger[21];
		BigInteger base = new BigInteger("7");
		for(int i=0;i<=20;i++)
		{
			power[i] = base.pow(i);
		}
		while(t > 0)
		{	
			int p = 0;
			BigInteger result = new BigInteger("0");
			int n = scan.nextInt();
			BigInteger answer = new BigInteger("0");
			while(n!=0)
			{
				
				result = power[p];
				if((int)(n & 1) == 1)
				{
					answer = answer.add(result);
				}
				p++;
				n>>=1;
			}
			System.out.println(answer);
		    t--;
		}
		
	
		

	}

}
