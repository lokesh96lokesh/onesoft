package exceptions;

public class MoreClass {
	public static void main(String[] args) {
		try {
		int[] nums= {12,34,56,78,90};
		System.out.println(nums[7]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
