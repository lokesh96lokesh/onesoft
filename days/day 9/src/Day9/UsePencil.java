package Day9;

public class UsePencil {
	public static void main (String[]args) {
		Pencil pencil1 = new Pencil();
		pencil1.brand="absara";
		pencil1.price=30;
		pencil1.colour="black";
		Pencil pencil2 =new Pencil();
		pencil2.brand="natraj";
		pencil2.price=35;
		pencil2.colour="black";
		Pencil pencil3 =new Pencil();
		pencil3.brand="loki";
		pencil3.price=20;
		pencil3.colour="black";
		Pencil [] pencils= {pencil1,pencil2,pencil3};
		int max=0;
		String maxBrand="";
		for(int i=0;i<pencils.length;i++) {
			if (pencils[i].price>max) {
				max=pencils[i].price;
				maxBrand=pencils[i].brand;
			}
		}
			if(maxBrand.contains("a")||maxBrand.contains("e")||maxBrand.contains("i")||maxBrand.contains("o")||maxBrand.contains("u")) {
				System.out.println(maxBrand+" contains vowels");
			}
		
			
		
		
		}

}
