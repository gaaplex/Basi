/*
CYCARRENOL
26.11.2017
This is a program for allow the access in an account, the objective is use the structure of contro "do-while"
 */
package basic_execises;

import java.util.Scanner;

/**
 *
 * @author gaapl
 */
public class Do_while {

    public static void main(String args[]) {
        Scanner enter = new Scanner(System.in);

        int password = 555;
        int password2;
        do {

            System.out.println("Enter you password:");
            password2 = enter.nextInt();

        } while (password != password2);

    }
}
