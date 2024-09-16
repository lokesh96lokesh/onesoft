package exceptions;

public class ArrayExe {
	public static void main(String args) {
		try {
			int[] nums= {12,56,89,76};
			System.out.println(nums[6]);
			}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			
			
		}
	}

}
