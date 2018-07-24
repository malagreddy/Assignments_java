
abstract public class base1 {
	int i,j;
	public base1(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public base1(int i)
	{
		this.i=i;
	}
	
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	abstract public void disp();

}
