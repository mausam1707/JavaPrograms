
class calculator
{
    public int add(int n1, int n2)
    {
        int r = n1+n2;
        return r;
    }
}
public class ooprog {
    public static void main(String args[])
    {
        int x=5;
        int y=8;
        calculator calc= new calculator();
        int result = calc.add(x,y);
        System.out.println(result);
    }
}
