class modulo
{
public static void main(String []args)
{
int re=0;
int num=62;
re=num%10;
System.out.println(re);
int tn=(((num/10)*10)+(num%10));
System.out.println(tn);
num=num/10;
System.out.println(num);
}
}