package tony.java;

public class TestArgsTransfer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSwap cc = new dataSwap();
		TestArgsTransfer1 tt= new TestArgsTransfer1();
		
		tt.swqp(cc);
		
		
	}
	public void swqp(dataSwap ds){
		int temp = ds.i;
		ds.i = ds.j;
		ds.i = temp;
		
	}
	
}

class dataSwap{
	int i = 10;
	int j = 5;
	
	
}