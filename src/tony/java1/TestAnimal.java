package tony.java1;

public class TestAnimal {
	public static void main(String[] args){
		Animal a1 = new Animal();
		a1.setLegs(4);
		a1.setName("huahua");
		a1.info();
		a1.eat();
		
	}
	
}

class Animal{
	private String name;
	private int legs;
	
	public void setLegs(int n){
		if(n>0 && 1%2 == 0){
			legs = n;
			
		}else{
			System.out.println("Input invalided!");
			
		}
		
	}
	
	public void setName(String n){
		name = n;
		
	}
	
	public void eat(){
		System.out.println("Animals eat");
	}
	
	public void sleep(){
		System.out.println("Animals sleep");
	}
	
	public void info(){
		System.out.println("name:" + name+" legs:" + legs);
	}
}