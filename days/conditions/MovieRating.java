package conditions;

public class MovieRating {
	public static void main(String[] args) {
		int rate=6;
		switch(rate) {
		case 1:
			System.out.println("Not Satisfied");
			break;
			
		case 2:
			System.out.println("Ok");
			break;
			
		case 3:
			System.out.println("Good");
			break;
			
		case 4:
			System.out.println("Very Good");
			break;
			
		case 5:
			System.out.println("Wonderful");
			break;
			
			default: 
				System.out.println("Invalid");
		}
				
		
	}

}
