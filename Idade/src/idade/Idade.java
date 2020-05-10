package idade;

import java.util.Scanner;

public class Idade 
{

    public static void main(String[] args) 
    {
        Scanner leitura = new Scanner(System.in);
        
        int nasc;
        int i;
        
        System.out.print("Informe seu ano de nascimento: ");
        nasc = leitura.nextInt();
        
        i = 2020 - nasc;
        
        System.out.println("sua idade e: " + i);
        
        if(i >= 18)
        {
            System.out.println("\nMaior Idade!");
        }
        
        else
        {
            System.out.println("\nMenor de Idade!");
        }
    }    
}
