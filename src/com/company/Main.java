package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //sum three numbe
//        int r=0,t=0,y=0;
//
//        System.out.print("Enter the first number: ");
//        r=sc.nextInt();
//        System.out.print("Enter the second number: ");
//        t=sc.nextInt();
//        System.out.print("Enter the third number: ");
//         y=sc.nextInt();
//        System.out.println("sum of numbers: "+sumNumber(r,t,y));

        // Multiply numbers and compare if their sum equals 50 prints true
//                multiplying(2,4,6);

       // sum tow number and compaer if bager thane 10 and small thane 20 print true
             // sumtow(2,10);

        // take tow number if any number != 10 print true
                 //  comparison(10,10);

        // Check the text if it equals a word SAFCSP print true
                  // comaerText("SAFCSP","tawiq");


       // Compare two numbers and print the largest
           // numberCombaer(1,5);

        //If the score is greater than 51 print successful
              // grade(52);

        //Take a number and determine whether it is negative or positive
                // number(-1);

        //Define the arithmetic operation
          /* define("add two numbers",1,3);
           define("Subtract two numbers",4,1);*/

        //Determine the student's grade
        gradeStudent(100);
    }
    //sum three number
public static int sumNumber(int a, int b,int c)
{
        return a+b+c;
}

// Multiply numbers and compare if their sum equals 50 prints true
public static void multiplying(int a,int b,int c)
{
  if(a*b*c ==50)
  {
      System.out.println("true");
  }
  else
  {
      System.out.println("false");
  }
}
//sum tow number and compaer
    public static void sumtow(int number1,int number2)
    {
        if(number1+number2 >10&& number1+number2<20)
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
    // take tow number if any number != 10 print true
    public static void comparison(int a,int b)
    {
        if(a!=10 ||b!=10)
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
    // Check the text if it equals a word SAFCSP print true
    public static void  comaerText(String a,String b)
    {
        if(a=="SAFCSP" || b=="SAFCSP")
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }
    }
    // Compare two numbers and print the largest
    public static void numberCombaer(int a, int b )
    {
       if (a>b)
       {
           System.out.println(a);
       }else
       {
           System.out.println(b);
       }
    }
    //If the score is greater than 51 print successful
    public static void grade(int a)
    {
       if (a>51)
       {
           System.out.println("successful");
       }else
           System.out.println("fail");
    }
    //Take a number and determine whether it is negative or positive
    public static void number(int a)
    {
        if(a<0)
        {
            System.out.println("negative ");
        }else
        {
            System.out.println("positive");
        }
    }
    //Define the arithmetic operation
    public static void define(String a ,int b , int c)
    {
        if (a=="add two numbers")
        {
            System.out.println(b+c);
        }
        else if (a== "Subtract two numbers")
        {
            System.out.println(b-c);
        }else
        {
            System.out.println("erorr");
        }
    }
    //Determine the student's grade
    public static void gradeStudent(int a)
    {
        if(a>90 || a ==100 )
        {
            System.out.println("A");
        }
        else if (a >=80 || a <=90 )
        {
            System.out.println("B");
        }else if (a >=70 || a<=80)
        {
            System.out.println("C");
        }
    }
}
