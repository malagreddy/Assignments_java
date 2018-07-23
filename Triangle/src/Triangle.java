
public class Triangle {
	int side1,side2,side3;
	public Triangle(int side1,int side2,int side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	boolean isTriangle()
	{	int max=Math.max(Math.max(side1, side2), side3);
		return (side1>0 && side2>0 && side3>0) && (max<=side1+side2+side3-max);
	}
	boolean isRight()
	{
		int max=Math.max(Math.max(side1, side2), side3);
		return (isTriangle() && ((max*max)==((side1*side1)+(side2*side2)+(side3*side3)-(max*max))));
	}
	boolean isScalene()
	{
		return (isTriangle() && (side1!=side2 && side2!=side3 && side3!=side1) && (!isRight()));
	}
	boolean isIsosceles()
	{
		return (isTriangle() && ((side1==side2 && side1!=side3)|| (side2==side3 && side2!=side1) || (side1==side3 && side1!=side2)));
	}
	boolean isEquilateral()
	{
		return (isTriangle() && (side1==side2 && side2==side3));
	}
}
