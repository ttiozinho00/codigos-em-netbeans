package pernas;

import java.util.Scanner;

public class Pernas 
{

    public static void main(String[] args) 
    {
       Scanner leitura = new Scanner(System.in);
       
       String tipo;
       int perna;
       
        System.out.print("Quantas Pernas: ");
        perna = leitura.nextInt();
        
        System.out.print("\nIsso e um(a): ");
        
        switch(perna)
        {
            case 1:
                tipo = "Saci";
                break;
                
            case 2:
                tipo = "Bípede";
                break;
                
            case 3:
                tipo = "Tripé";
                break;
                
            case 4:
                tipo = "Quadrúpide";
                break;
                
            case 5:
                tipo = "Aranha";
                break;
                
            default:
                tipo = "ET";       
        }
        System.out.println(tipo);         
    }
}
