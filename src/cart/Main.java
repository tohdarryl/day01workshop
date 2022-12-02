package cart;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        
        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        Boolean stop = false;

        while (!stop) { 
            // list 
            // add <item>
            // delete <num>
            // exit

            String line = cons.readLine("> ");
            line = line.trim();
            //command line delimited by space

            // add apple => [add , apple]
            // list +> [list]
            String[] terms = line.split(" ");

            System.out.printf("Command $s\n", terms[0]);

            switch (terms[0]) {
                case "list":
                    if (cart.size() <=0) {
                        System.out.println("Your cart is empty");
                    } else {
                    System.out.println("Contents of your cart");
                    for (Integer idx = 0; idx < cart.size(); idx++)
                    System.out.printf("%d. %s\n", idx + 1, cart.get(idx));
                    }
                break;

                case "add":
                cart.add(terms[1]);
                System.out.printf("Added %s to cart\n", terms [1]);
                break;

                case "delete":
                break;

                case "exit":
                stop = true;
                break;


                default:
                System.out.printf("Unknown command $s\n", terms[0]);
            }
        }

        System.out.println("Thank you for shopping with us. Bye Bye");

    }



}