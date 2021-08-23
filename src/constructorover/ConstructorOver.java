package constructorover;
public class ConstructorOver 
{
    public static void main(String[] args) 
    {
AbcConst abc=new AbcConst (5,5,5);
AbcConst abc1=new AbcConst ();
double vol=abc.volume();
double vol2=abc1.volume();
System.out.println(vol);
System.out.println(vol2);

    }
    
}
