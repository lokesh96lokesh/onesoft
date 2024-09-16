package Function;

public class UseCollege {
	public static void main(String[] args) {
		College c=new College();
		c.dept="arts";
		c.price=57000;
		College c1=new College();
		c1.dept="science";
		c1.price=730000;
		College [] colleges= {c,c1};
		c1.findMax(colleges);
	}

}
