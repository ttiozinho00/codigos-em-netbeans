package classes; 

public class Fatorial 
{
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int n)
    {
        String s = "";
        int f = 1;
        num = n;
        int c;
        for(c = n;c > 1;c--)
        {
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial()
    {
        return fat;
    }
    
    public String getFomula()
    {
        return formula;
    }
}
