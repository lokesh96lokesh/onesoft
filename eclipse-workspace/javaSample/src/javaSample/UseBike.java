package javaSample;

public class UseBike {
	public static void main(String[] args) {
		Engine e=new Engine("hero",3276);
		Engine e1=new Engine("herclus",18276);
		Bike b1=new Bike("Duke","black",75000,e);
		Bike b2=new Bike("hero","black",45000,e1);
		Bike[] bikes= {b1,b2};
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i].getBrand()+"-"+bikes[i].getColor()+bikes[i].getPrice()+bikes[i].getEngine().getBrand()+bikes[i].getEngine().getPrice());
			}
		}
		
	}


