package tony.exer;

public class Circle {
	private double radius;
	
	public double findArea(){
		return Math.PI*radius*radius;
	}
	
	public double getRaidus(){
		return radius;
	}
	
	public void setRaidus(double n){
		radius = n;
	}
	
}
