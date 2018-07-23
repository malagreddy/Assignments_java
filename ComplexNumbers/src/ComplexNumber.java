
public class ComplexNumber {
	private int real;
	private int imaginary;
	public ComplexNumber(int real,int imaginary)
	{
		super();
		this.real=real;
		this.imaginary=imaginary;
	}
	public ComplexNumber()
	{
		super();
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	public void sum(ComplexNumber complexnum1,ComplexNumber complexnum2)
	{
		real=complexnum1.real+complexnum2.real;
		imaginary=complexnum1.imaginary+complexnum2.imaginary;
		display();
	}
	public void display()
	{
		System.out.println(real+"+i"+imaginary);
	}
	
}
