import java.util.Scanner;
abstract class Quad{
    int X1;
    int X2;
    int X3;
    int X4;
    int Y1, Y2, Y3, Y4;

 Quad(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4)
 {
     this.X1=x1;
     this.X2=x2;
     this.X3=x3;
     this.X4=x4;
     this.Y1=y1;
     this.Y2=y2;
     this.Y3=y3;
     this.Y4=y4;

 }
 abstract int Area();
}
class Trapezoi extends Quad
{
    Trapezoi(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    @Override
    int Area()
    {
       int are=(((X4-X1)+(X3-X2))/2)*(Y2-Y1);
        return are;
    }
}
class Parralel extends Quad{

    Parralel(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    @Override
    int Area() {
       int are=(X3-X2)*(Y2-Y1);
        return are;
    }
}
class Rect extends Quad{

    Rect(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    @Override
    int Area() {
        int are=(X4-X1)*(Y2-Y1);
        return are;
    }
}
class square extends Quad{

    square(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    @Override
    int Area() {
        int  are=(X2-X1)*(X2-X1);
        return are;
    }
}

public class Points {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int X1, X2, X3, X4, Y1, Y2, Y3, Y4;
        X1 = sc.nextInt();
        X2 = sc.nextInt();
        X3 = sc.nextInt();
        X4 = sc.nextInt();
        Y1 = sc.nextInt();
        Y2 = sc.nextInt();
        Y3 = sc.nextInt();
        Y4 = sc.nextInt();


        System.out.println("enter 1 for Trapizoid area");
        System.out.println("enter 2 for parralellogram area");
        System.out.println("enter 3 for Rectangle area");
        System.out.println("enter 4 for square area");
        int n;
        n = sc.nextInt();
        switch (n) {
            case 1: {
                Quad q1 = new Trapezoi(X1, X2, X3, X4, Y1, Y2, Y3, Y4);
                float area = q1.Area();
                System.out.print(area);
                break;
            }
            case 2: {
                Quad q2 = new Parralel(X1, X2, X3, X4, Y1, Y2, Y3, Y4);
                float area = q2.Area();
                System.out.print(area);
                break;
            }


            case 3: {
                Quad q3 = new Rect(X1, X2, X3, X4, Y1, Y2, Y3, Y4);
                float area = q3.Area();
                System.out.print(area);
                break;
            }
            case 4: {
                Quad q4 = new square(X1, X2, X3, X4, Y1, Y2, Y3, Y4);
                float area = q4.Area();
                System.out.print(area);
                break;
            }

        }
    }
}