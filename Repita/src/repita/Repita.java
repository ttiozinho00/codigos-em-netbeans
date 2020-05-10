package repita; 

import javax.swing.JOptionPane;

public class Repita 
{

    public static void main(String[] args) 
    {
        int n;
        int s = 0;
        do
        {    
             n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html><strong>Informe o valor:<br><em>(O valor 0 interrompe)</em></strong></html>"));
             s += n;
        }while(n != 0);
        JOptionPane.showMessageDialog(null,"<html>Resultado Final <hr>" + "Somatorio Vale <html>" + s);
    }
    
}
