package object;

public class UsePencil {
	public static void main(String []args)
	{
		Pencil pencil1=new Pencil();
		
		pencil1.brand="nataraja";
		pencil1.price=10;
		pencil1.colour="Black";
		
		Pencil pencil2=new Pencil();
		
		pencil2.brand="absara";
		pencil2.price=15;
		pencil2.colour="blue";
		
		System.out.println(pencil1.brand);
		System.out.println(pencil1.price);
		System.out.println(pencil1.colour);
		
		System.out.println(pencil2.brand);
		System.out.println(pencil2.price);
		System.out.println(pencil2.colour);
	}
		
		
		
		
		
		
		 

}
