package javaSample;

public class SampleExe {
	public static void main(String[] args) throws VowelExe {
		/*try {

			String a = "lokesh@gmail";
			if (a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
				System.out.println("word contain vowel");
			} else {
				throw new VowelExe("does not contain vowel");
			}
		} catch (VowelExe e) {
			System.out.println(e.getMessage());
		}
	}*/
		try {
			String a ="lokesh@gmail";
			String b="+91";
			String c="78563458765";
			if(c.length()>10&&b.startsWith("+91")) {
				System.out.println("valid mob num");
			}
			else {
				System.out.println("enter valid mob num");
			}
			if(a.contains("@")&&a.contains("gmail")) {
				System.out.println("valid mail id");
			}
			else {
				throw new VowelExe ("please enter valid mail id");
			}
		}catch(VowelExe e) {
			System.out.println(e.getMessage());
		}
	}
}

