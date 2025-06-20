import java.util.Scanner;
class Area{
	Area(int radius){
		System.out.println("Area of circle = "+(radius*radius*3.14));
	}
	Area(int length,int width){
		System.out.println("Area of Rectangle = "+(length*width));
	}
	Area(float height,float base){
		System.out.println("Area of Triangle = "+((height*base)/2));
	}
}
public class AreaApp{
	public static void main(String args[]){
		Area a01 = new Area(6);
		Area a02 = new Area(10,10);
		Area a03 = new Area(10.00f,20.25f);
	}
}
