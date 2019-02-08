import java.util.*;
class Sequentials  {
 public double x;
 public double y;
 Sequentials(double x,double y){
	 this.x=x;
	 this.y=y;
 }
}
class dist{
	public double finddist(Sequentials sq[]) {
		double a,b;
		a=Math.sqrt((sq[1].x-sq[0].x)*(sq[1].x-sq[0].x)+(sq[1].y-sq[0].y)*(sq[1].y-sq[0].y));
		b=Math.sqrt((sq[2].x-sq[1].x)*(sq[2].x-sq[1].x)+(sq[2].y-sq[1].y)*(sq[2].y-sq[1].y));
				return a+b;
	}
}
class distances{
	public static void main(String args[]) {
		Sequentials sq[]=new Sequentials[4];
		sq[0]=new Sequentials(6,8);
		sq[1]=new Sequentials(3,4);
		sq[2]=new Sequentials(6,8);
		dist d= new dist();
		Double z=d.finddist(sq);
		System.out.println(z);
	}
	
}

