package Day9;

public class UseBus {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.regno="TN82AZ2345";
		bus1.color="black";
		bus1.noOfSeats=14;
		Bus bus2 = new Bus();
		bus2.regno="KL82KL2346";
		bus2.color="white";
		bus2.noOfSeats=20;
		Bus bus3 = new Bus();
		bus3.regno="KA82KA2347";
		bus3.color="red";
		bus3.noOfSeats=18;
		Bus[] buses= {bus1,bus2,bus3};
		for(int i=0;i<buses.length;i++) {
			if(buses[i].regno.startsWith("TN")) {
			System.out.println(buses[i].regno+" "+buses[i].color+" "+buses[i].noOfSeats);	
			}
		}
//		Bus [] buses= {bus1,bus2,bus3};
//		String even="";
//		for(int i=0;i<buses.length;i++) {
//			if(buses[i].regno%2==0) {
//				System.out.println(buses[i].regno+" "+buses[i].color+" "+buses[i].noOfSeats);
//				
//			}
//		}
	}

}
