
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		
		
		try {
			t1.go();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Re-setting Index Value");
		  // e.printStackTrace();
		} finally { 
			
			 System.out.println("This is always printed");
		}
		
		
		

	}

	private void go() // throws  ArrayIndexOutOfBoundsException  
	{
		
		int i = 0; 
		
		String testStr [] =  { "Hello", "No, I mean it!", "WORLD!!" };
		
		while(i < 4) { 
			
			System.out.println(testStr[i]);
			i++; 
		}
		
	}
	



}
