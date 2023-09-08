class Computer
{
    public void playMusic()
    {
        System.out.println("playing");
    }
    public String getmepen(int cost)
    {   
        if(cost>10)
        return "pen";
        else
        return "Nopen";
    }
}

public class oop2 {
    public static void main(String args[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getmepen(11);
        System.out.println(str);
    }
    
}
