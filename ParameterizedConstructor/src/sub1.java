
public class sub1 extends base1{
	int i,j,k;
	public sub1(int i,int j,int k)
	{
		super(i,j);
		this.k=k;
	}
	public sub1(int i,int k)
	{
		super(i);
		this.k=k;
	}
	public sub1(int k)
	{
		this.k=k;
	}
	public void disp()
	{
		System.out.println("");
	}
}
