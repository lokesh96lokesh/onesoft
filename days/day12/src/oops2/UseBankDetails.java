package oops2;

import java.util.HashMap;
import java.util.Iterator;

public class UseBankDetails {
	public static void main(String[] args) {
		BankDetails b1=new BankDetails(25431,"loki",15,10000);
		BankDetails b2=new BankDetails(25432,"dina",25,223000);
		BankDetails b3=new BankDetails(25433,"anu",25,203200);
		BankDetails b4=new BankDetails(25434,"amu",26,2342412);
		BankDetails b5=new BankDetails(25435,"appu",35,202300);
		BankDetails b6=new BankDetails(25436,"uma",18,20312300);
		int temp=0;
		HashMap<Integer,BankDetails>blist=new HashMap<>();
		blist.put(b1.getAccountNo(), b1);
		blist.put(b2.getAccountNo(), b2);
		blist.put(b3.getAccountNo(), b3);
		blist.put(b4.getAccountNo(), b4);
		blist.put(b5.getAccountNo(), b5);
		blist.put(b6.getAccountNo(), b6);
		//System.out.println(blist.keySet());
		//System.out.println(blist.values());
		//for(Integer i:blist.keySet()) {
			//System.out.println(blist.get(i));
		//}
		//for(BankDetails i:blist.values()) {
			//System.out.println(i.getBalance());
		//}
		
		//System.out.println(blist.get(b4.getAccountNo()).getBalance());
		//blist.forEach((x,y)->System.out.println(x+" "+y.getName()));
		//blist.forEach((x,y)->System.out.println(x+" "+y));
		//Iterator<Integer>itrate=blist.keySet().iterator();
		//while(itrate.hasNext()) {
			//System.out.println(itrate.next());
			//if(itrate.next()==b2.getAccountNo()) {
				//itrate.remove();
		//Iterator<BankDetails>itrate=blist.values().iterator();
		//while(itrate.hasNext()) {
		//if(itrate.next().getName().startsWith("a")) {
			//itrate.remove();
			//}
	//}System.out.println(blist);
		//System.out.println(blist.get(25431));
		Iterator<Integer>itrate=blist.keySet().iterator();
		while(itrate.hasNext()) {
			temp=temp+itrate.next();
			
		}System.out.println(temp);
	}
}
