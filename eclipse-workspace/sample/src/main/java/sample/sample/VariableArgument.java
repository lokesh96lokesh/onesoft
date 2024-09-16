package sample.sample;

public  class VariableArgument {
	public static void fun(int ... a) 
	{
	
	        System.out.println("Number of arguments: "
	                           + a.length);
	 int add=0;
	        for (int i : a)
	        	add=add+i;
	            System.out.print(add);
	        System.out.println();
	    }
	 
	    public static void main(String args[])
	    {
	       
	        fun(101);
	           
	        fun(1,4,2,3);
	         
	} 
	
}
