import java.util.Scanner;
public class TriangleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides of a triangle");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		
		Triangle triangle=new Triangle(side1,side2,side3);
		
		System.out.println("right? "+ triangle.isRight());
		System.out.println("Isosceles? "+ triangle.isIsosceles());
		System.out.println("Scalene? "+ triangle.isScalene());
		System.out.println("Equilateral? "+ triangle.isEquilateral());

	}

}
