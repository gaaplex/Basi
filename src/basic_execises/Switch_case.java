/*
CYCARRENOL  
26.11.2017
In this programm  I am gonna show you the form how use the  control selection "Switch-case"
 */
package basic_execises;

import java.util.Scanner;

/**
 *
 * @author gaapl
 */
public class Switch_case {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        String vocal;

        System.out.println("Enter the vocal");
        vocal = enter.next();

        switch (vocal) {

            case "a": {
                System.out.println("You  enter the vocal a ");
                break;
            }

            case "e": {
                System.out.println("You  enter the vocal e ");
                break;
            }

            case "i": {
                System.out.println("You  enter the vocal i ");
                break;
            }
            case "o": {
                System.out.println("You  enter the vocal o ");
                break;
            }
            case "u": {
                System.out.println("You  enter the vocal u ");
                break;
            }
            default: {
                System.out.println("The letter enter not is a vocal");
            }
        }

    }

}
