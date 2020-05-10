/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feriado;

/**
 *
 * @author dodo3
 */
public class Feriado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diaDaSemana = 0;
        boolean feriado = false;

	if (diaDaSemana == 7 || feriado == true) 
	{
            System.out.println("Domingo acorda às 7:00");
    	}

    	else
    	{
            System.out.println("Domingo Dormir até tarde!");
    	}

    	if (diaDaSemana == 1 || feriado == false) 
    	{
            System.out.println("Segunda-feira acorda às 7:00");
    	}

    	else
    	{
            System.out.println("Segunda-feira Dormir até tarde!");
    	}

     	if (diaDaSemana == 2 || feriado == false) 
     	{
            System.out.println("Terça-feira acorda às 7:00");
    	}

    	else
    	{
    		System.out.println("Terça-feira Dormir até tarde!");
    	}

    	if(diaDaSemana == 3 || feriado == false) 
    	{
        	System.out.println("Quarta-feira acorda às 7:00");
    	}

    	else
    	{
    		System.out.println("Quarta-feira Dormir até tarde!");
    	}

    	if(diaDaSemana == 4 || feriado == true) 
    	{
        	System.out.println("Quinta-feira acorda às 7:00");
    	}

    	else
    	{
    		System.out.println("Quinta-feira Dormir até tarde");
    	}

    	if(diaDaSemana == 5 || feriado == false) 
    	{
        	System.out.println("Sexta-feira acorda às 7:00");
    	}

    	else
    	{
    		System.out.println("Sexta-feira Dormir até tarde!");
    	}

    	if(diaDaSemana == 6 || feriado == true) 
    	{
        	System.out.println("Sabado acorda às 7:00");
    	}

    	else
    	{
    		System.out.println("Sabado Dormir até tarde!");
    	}
    }
    
}
