package com.example.mavn;
import java.util.Scanner;
public class Calculator
{
    double number_1,number_2;
    void userInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        number_1 = input.nextDouble();
        System.out.println("Enter the second number : ");
        number_2 = input.nextDouble();
    }
    public void userChoice()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What operation you want to perform ? (+,-,*,/)");
        String operation = input.nextLine();
        //System.out.println("1.Add | 2.Subtract | 3. Multiply | 4. Divide");
//        int choice = input.nextInt();
//        if(choice == 1)
//        {
//            System.out.println("Addition of given numbers is : " + add_Numbers());
//        }
//        else if(choice == 2)
//        {
//            System.out.println("Difference of given numbers is : " + subtract_Numbers());
//        }
//        else if(choice == 3)
//        {
//            System.out.println("Multiplication of given numbers is : " + multiply_Numbers());
//        }
//        else if(choice == 4)
//        {
//            System.out.println("Division of given numbers is : " + divide_Numbers());
//        }
//        else
//        {
//            System.out.println("Enter a valid choice");
//        }
        switch(operation)
        {
            case "+" :
            {
                double add_result = add_Numbers();
                System.out.println("Addition of entered numbers is " + add_result);
                break;
            }
            case "-" :
            {
                double subtract_result = subtract_Numbers();
                System.out.println("Difference of entered numbers is " + subtract_result);
                break;
            }
            case "*" :
            {
                double multiply_result = multiply_Numbers();
                System.out.println("Multiplication of entered numbers is " + multiply_result);
                break;
            }
            case "/" :
            {
                double divide_result = divide_Numbers();
                System.out.println("Division of entered numbers is " +divide_result);
                break;
            }
        }
    }
    double add_Numbers()
    {
        userInput();
        return number_1 + number_2 ;
    }
    double subtract_Numbers()
    {
        userInput();
        return number_1 - number_2 ;
    }
    double multiply_Numbers()
    {
        userInput();
        return  number_1 * number_2 ;
    }
    double divide_Numbers()
    {
        userInput();
        double division = 0;
        try
        {
            division = (float)number_1/number_2;
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Second number should not be zero");
        }
        return division;
    }
}