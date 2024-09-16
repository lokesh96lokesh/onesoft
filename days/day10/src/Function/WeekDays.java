package Function;

public class WeekDays {
	public void findMax(String Days) {
		switch (Days) {
		case "monday" :System.out.println("1 day of the week");break;
		case "tuesday" :System.out.println("2 day of the week");break;
		case "wednesday" :System.out.println("3 day of the week");break;
		case "thursday" :System.out.println("4 day of the week");break;
		case "friday" :System.out.println("5 day of the week");break;
		case "saturday" :System.out.println("6 day of the week");break;
		case "sunday" :System.out.println("7 day of the week");break;
		
			
		}
	}
	public static void main(String[] args) {
		WeekDays wd=new WeekDays();
		wd.findMax("sunday");
	}
	}
	
