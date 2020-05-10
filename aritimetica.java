public class aritimetica
{
	public static void main(String args[]) 
    { 
        
        cls();
        
        int x = 2+3;
        int y = 4-5;
        int z = x*y;
        int temp = -20;
        int days = 7*4;
        double div = 5/2;
        double accurate = 5/2.0;
        double div2 = 24/5;
        double accurate2 = 24/5.0;
        System.out.println("\nx = "+ x +" y = "+ y + " z = " + z);
        System.out.println("\ndiv ="+ div +" accurate = "+ accurate +" div2 = "+ div2 +" accurate2 = "+ accurate2);

        double paid = 10;
        double change = 3.25;
        double tip = (paid-change)*0.2;

        System.out.println("\ntip = "+ tip);
    }  

    public static void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }

        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}