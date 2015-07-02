package tony.exer;

import java.util.Scanner;
public class PassObject {

	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject p = new PassObject();
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter radius: ");
		int time = input.nextInt();
		
		printAreas(c, time);
	}
	
	
	public static void printAreas(Circle c, int time){
		for(int i = 1;i<=time;i++) {
			c.setRaidus(i);
			
			System.out.println(c.getRaidus()+"\t"+c.findArea());
			
			
		}
		
		
	}

}
