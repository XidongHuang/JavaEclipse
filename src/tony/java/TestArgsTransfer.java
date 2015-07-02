package tony.java;

public class TestArgsTransfer {

	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		System.out.println("i:" + i+"j:" +j);
		TestArgsTransfer c = new TestArgsTransfer();
		c.swap(i, j);
		
		System.out.println("i:" + i+"j:" +j);
	}

	
	public void swap(int i, int j){
		
		int temp = i;
		i = j;
		j = temp;
		
	}
}
