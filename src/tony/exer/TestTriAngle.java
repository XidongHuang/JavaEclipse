package tony.exer;

import javax.management.RuntimeErrorException;

public class TestTriAngle {
	public static void main(String[] args) {
		TriAngle ta = new TriAngle(4.3, 6.4);
		System.out.println("The area of Triangle is " + ta.getArea());
		
	}
}

class TriAngle{
	private double base;
	private double height;
	
	
	public TriAngle(){
		base = 0;
		height = 0;
	}
	public TriAngle(double b, double h){
		base = b;
		height= h;
		
	}
	
	
	public void setBase(double n){
		if(n>0.0) {
			base = n;
			
		} else {
			throw new RuntimeException("Invalied Input!");
		}
		
	}
	
	public void setHeight(double n) {
		if(n > 0.0){
			height = n;
		} else {
			throw new RuntimeException("Invalied Input");
		}
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getArea(){
		return (base*height)/2;
		
	}
	
}