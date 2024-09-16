package javaSample;

public class IndexOutOfBound {
	public static void main(String[] args) {
		try {
			int[] nums= {86,85,37,0};
			//int num=nums[4];
			int num1=nums[0]/nums[3];
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		System.out.println("end");
	}

}
