package com.lamouresparus;

public class Main {

    public static void main(String[] args) {
	// Loop Questions
        //1. A program to print out natural numbers from 1 - 200

        System.out.println("--------------Natural Numbers from 1 to 200---------------");

        for(int a = 1; a>0 & a<201; a++){
            System.out.println(a);
        }


        // 2. Calculate the sum of the first 10 natural numbers

        System.out.println("-----------------The sum of the first 10 natural numbers---------------");
        int b = 0;
        for(int a = 0; a<10; a++){
            b += a;
        }
        System.out.println(b);

        //correct sum of natural numbers
        int d = 0;
        for(int c = 0; c<=10; c++){
            d += c;
        }
        System.out.println(d);
    }
}
/*An INSTANCE VARIABLE is a variable declared inside the class but
    outside the body of the method.
    An instance variable can also be called a non-static field and global variable.


    A static variable is a variable declred as static. It cannot
    be local and has only one copy.

     8 Primitive data types in java
        * byte
        * short
        * int
        * long
        * float
        * double
        * boolean
        * char
 */

//score