/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is the length: " );
        int length = scnN.nextInt();
        System.out.print( "What is the width: " );
        int width = scnN.nextInt();
        System.out.print( "You will need to purchase "+ ((int)Math.ceil(((double)(length*width)/350))) +" gallons of paint to cover "
                + (length*width) +" square feet." );
    }
}
