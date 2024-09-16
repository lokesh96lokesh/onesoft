package loop22;

public class LastCharacter {
	public static void main(String[] args) {
		String[] name= {"suren","arun","ajith"};
		for(int i=0;i<=name.length-1;i++) {
			int len=name[i].length();
			System.out.println(name[i].toUpperCase().charAt(len-1));
		}
	}

}
