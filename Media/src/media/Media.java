package media;

import java.util.Scanner;

public class Media 
{

    public static void main(String[] args) 
    {
       Scanner leitura = new Scanner(System.in);
       
       float media;
       float n1;
       float n2;
       
        System.out.print("Informe a primeira nota: ");
        n1 = leitura.nextFloat();
        
        System.out.print("Informe a segunda nota: ");
        n2 = leitura.nextFloat();
        
        media = (n1+n2)/2;
        
        System.out.println("Sua média foi: " + media);
        
        if(media > 9)
        {
            System.out.println("Parabéns!!");
        }
       
       
    }
    
}
