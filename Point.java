import java.util.*;
class Quadrilateral
{
	int x,y;

	
	public void points(int a,int b)
	{
		x=a;
		y=b;
	}
	public abstract void getArea();

}
class Trapezoid extends Quadrilateral
{
	public void getArea()
	{

	}


}
class Parallelogram extends Quadrilateral
{
	public void getArea()
	{
		
	}

}
class Rectangle extends Quadrilateral
{
	float area;
	int l,b;
	public void getArea()
	{
		l=sqrt(Sqaure(obj2.get(y)-obj1.get(y))+Sqaure(obj2.get(x)-obj1.get(x)));
		b=sqrt(Sqaure(obj3.get(y)-obj1.get(y))+Sqaure(obj3.get(x)-obj1.get(x)));
		area=l*b;
		System.out.println("Area of Rectangle is "+area);
	}


}
class Sqaure extends Quadrilateral
{
	float area;
	int side;
	public void getArea()
	{
		side=sqrt(Sqaure(obj2.get(y)-obj1.get(y))+Sqaure(obj2.get(x)-obj1.get(x)));
		
		area=side*side;
		System.out.println("Area of Sqaure is "+area);
	}

}
class Point
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int x[]=new x[4];
		int y[]=new y[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the co-ordinates of the point: ");
			x[i]=s.nextInt();
			y[i]=s.nextInt();
			

		}
		Quadrilateral obj1=new Quadrilateral();
			obj1.points(x[0],y[0]);

			Quadrilateral obj2=new Quadrilateral();
				obj2.points(x[1],y[1]);

			Quadrilateral obj3=new Quadrilateral();
				obj3.points(x[2],y[2]);

			Quadrilateral obj4=new Quadrilateral();
				obj4.points(x[3],y[3]);

		System.out.println("Choose your Shape:\n 1 for Trapezoid\n 2 for Parallelogram\n 3 for Rectangle\n 4 for Sqaure");
		int choice=s.nextInt();
		switch(choice)
		{
			case 1:
			Trapezoid t=new Trapezoid();
			t.getArea();
			break;

			case 2:
			Parallelogram p=new Parallelogram();
			p.getArea();
			break;

			case 3:
			Rectangle r=new Rectangle();
			r.getArea();
			break;

			case 4:
			Sqaure sq=new Sqaure();
			sq.getArea();
			break;

			default:
			System.out.println("Wrong Choice");
			break;

		}


		
	}
}