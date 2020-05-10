package logicos;

public class Logicos 
{

    public static void main(String[] args) 
    {
        boolean r;
        int x;
        int y;
        int z;
        
        x = 4;
        y = 7;
        z = 12;
        
        r = (x<y ^ y<z) ? true:false;
        System.out.println(r);
        
    }
    
}
