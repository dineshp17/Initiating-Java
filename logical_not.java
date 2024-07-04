
class logical_or
{
	public static void main(String []args)
	{
	String size="S";
	String colour="Black";
	System.out.println(!(colour=="Black" || size=="S"));//false
	System.out.println(!(colour=="Red" || size=="S"));//false
	System.out.println(!(colour=="Black" || size=="M"));//false
	System.out.println(!(colour=="RED" || size=="M"));//true
	}
}