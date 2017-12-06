
public class ReverseOfString {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
	System.out.println(startTime);
		 String input = "The best of navya";
		 
	        // convert String to character array by using toCharArray
	        char[] c = input.toCharArray();
	 
	        for (int i = c.length-1; i>=0; i--)
	            System.out.print(c[i]);
	        long endTime = System.nanoTime();
	        System.out.println("\n"+endTime);
	        
	        long totalTime = endTime - startTime;
	        System.out.println("\n"+ totalTime+ "ns");
	}
	

}
 