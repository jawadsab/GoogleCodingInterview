package googlecoding;

public class MagicNthNumber {
	
	static int nthMagicNum(int num)
	{
		int pow = 1;
		int result = 0;
		int answer = 0;
		while(num!=0)
		{
			result = (int) Math.pow(5, pow);
			if(((int) num & 1) == 1)
			{
				answer+=result;
			}
			num>>=1;
			pow++;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5; 
	    System.out.println("nth magic" + 
	    " number is " + nthMagicNum(n)); 

	}

}
