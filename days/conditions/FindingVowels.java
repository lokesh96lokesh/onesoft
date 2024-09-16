package conditions;

public class FindingVowels {
	public static void main(String[] args) {
		String name="wytrs";
		if(name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o") || name.contains("u")) {
			System.out.println(name+" is contains for vowels");
		}
		else {
			System.out.println(name+" is  not contains for vowels");
		}
	}

}
