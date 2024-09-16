package exceptions;

public class FinallyExe {
	public static void main(String[] args) {
		try {
			int[] nums= {12,34,56,78};
			System.out.println(nums[9]);
		}
		catch(StringIndexOutOfBoundsException se) {
			se.printStackTrace();
		}
		finally {
			System.out.println("out");
		}
	}

}
