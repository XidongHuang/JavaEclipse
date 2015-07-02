package tony.exer;

public class TestPerson {
	public static void main(String[] args){
		//TestPerson tp = new TestPerson();
		Person p = new Person();
		
		p.setAge(-5);
		System.out.println("Age is: "+p.getAge());
		p.setAge(30);
		System.out.println("Age is: "+p.getAge());
	
		
		p.setAge(143);
		System.out.println("Age is: "+p.getAge());
			p.setAge(9);
		System.out.println("Age is: "+p.getAge());
		
		
		
	}
}


class Person{
	//Field
	private int age;
	private String name;
	
	
	//Constructor
	public Person(){
		this.name = "";
		this.age = 0;
	}
	public Person(String n){
		this.name = n;
	}
	
	
	
	public void setAge(int i){
		if(i<130 && i>0 ){
			age = i;
			
		} else {
			throw new RuntimeException("Invalied age!");
		}
				
	}
	
	public int getAge(){
		return age;
	}
	 
}