import java.util.*;
class tax
{
	public static void main(String args[])
	{
		double tax,income;
		Scanner sc=new Scanner(System.in);
		income=sc.nextDouble();
		if((income>0) && (income<180000))
		{
			tax=(0*income)/100;
		}
		else if((income>181001) && (income<300000))
		{
			tax=income*0.1;
		}
		else if((income>300001) && (income<500000))
		{
			tax=income*0.2;
		}
		else if((income>500001) && (income<1000000))
		{
			tax=income*0.3;
		}
		System.out.println(tax);
	
	}
}