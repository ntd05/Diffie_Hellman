import java.util.*;

public class Diffie_Hellman
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter modulo(p)");
		long p=sc.nextLong();
		System.out.println("Enter primitive root of "+p);
		long g=sc.nextLong();
		System.out.println("Choose 1st secret no(Alice)");
		long a=sc.nextLong();
		System.out.println("Choose 2nd secret no(BOB)");
		long b=sc.nextLong();

		long A = (long)Math.pow(g,a)%p;
		long B = (long)Math.pow(g,b)%p;

        System.out.println("A = " + A);
        System.out.println("B = " + B);

		long S_A = (long)Math.pow(B,a)%p;
		long S_B =(long)Math.pow(A,b)%p;

		if(S_A==S_B)
		{
			System.out.println("ALice and Bob can communicate with each other!!!");
			System.out.println("They share a secret no = "+S_A);
		}

		else
		{
			System.out.println("ALice and Bob cannot communicate with each other!!!");
            System.out.println(S_A);
            System.out.println(S_B);
		}
	}
}