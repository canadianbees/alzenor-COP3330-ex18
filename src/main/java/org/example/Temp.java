/*
 *  UCF COP3330 Fall 2021 Temp Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.util.Scanner;

public class Temp
{
    private final String choice;

    //asks if user wants what temperature unit to convert to
    public Temp()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter C to convert from Fahrenheit to Celsius\nEnter F to convert from Celsius to Fahrenheit");
        System.out.print("Your choice: ");
        this.choice = input.next();
    }

    public void Converter()
    {
        String finalOut = null;
        //converts fahrenheit to celsius and prints the result
        if(this.choice.matches("C") || this.choice.matches("c")) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int fah = input.nextInt();

            double cel = (fah - 32) * (5.0/9.0);
            finalOut = "The temperature in Celsius is " + (int) cel;
        }

        //converts celsius to Fahrenheit and prints the result
        if(this.choice.matches("F") || this.choice.matches("f"))
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the temperature in Celsius: ");
            int cel = input.nextInt();

            double fah = (cel * (5.0/9.0)) - 32 ;
            finalOut = "The temperature in Fahrenheit is "+(int) fah;
        }

        System.out.print(finalOut);
    }
}
