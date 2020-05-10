package tipos;

import java.util.Scanner;

public class Tipos 
{
    public static void main(String[] args) 
    {
        Scanner leitura = new Scanner(System.in);
        
        String nome;
        float nota;
        
        System.out.print("Infome o nome: ");
        nome = leitura.nextLine();
    
        System.out.print("Informe a nota: ");
        nota = leitura.nextFloat();
       //System.out.println("a sua nota é: " + nota);
       //System.out.printf("\na sua nota é: %.2f\n",nota);
       //System.out.printf("\nA nota de %s  é: %.2f\n",nome,nota); 
       System.out.format("\nA nota de %s  é: %.2f\n",nome,nota); 
    } 
            
}
