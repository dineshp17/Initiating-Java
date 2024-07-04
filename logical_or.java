
class logical_or
{
	public static void main(String []args)
	{
	String size="S";
	String colour="Black";
	System.out.println(colour=="Black" || size=="S");//true
	System.out.println(colour=="Red" || size=="S");//true
	System.out.println(colour=="Black" || size=="M");//true
	System.out.println((colour=="RED" || size=="M"));//false
	}
}