package cart;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to your shopping cart");
        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        Boolean stop = false;

        while (!stop) {//does not stop until user prompts exit
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

            
            System.out.printf("Command %s\n", terms[0]);

            switch (terms[0]) {
                case "list":
                    if (cart.size() <=0) {
                        System.out.println("Your cart is empty");
                    } else {
                    System.out.println("Contents of your cart");
                    for (int idx = 0; idx < cart.size(); idx++)
                    System.out.printf("%d. %s\n", idx + 1, cart.get(idx));
                    }
                break; //should be after if statement and for loop

                case "add":
                    if (cart.contains(terms[1])){
                        System.out.printf("You have %s in your cart\n", terms[1]);
                    }
                    else {
                    for (int i = 1; i < terms.length; i++){
                    cart.add(terms[i]);
                    System.out.printf("%s added to cart\n", terms [i]);
                    }}
                break;

                case "delete":
                    //create new variable to make input and index consistent
                    //also converting String into int, remember to use brackets around ((var) + 1)
                    int ind = (Integer.parseInt(terms[1]) - 1);
                    if(Integer.parseInt(terms[1]) > cart.size()){
                    System.out.println("Incorrect item index");}
                    else {
                    //print item removed associated with number
                    //to remove item by number
                    System.out.printf("%s removed from cart\n", cart.get(ind));
                    cart.remove(ind);}
                    
                break;

                case "exit":
                stop = true;
                break;


                default:
                System.out.printf("Unknown command %s\n", terms[0]);
            }
        }

        System.out.println("Thank you for shopping with us. Bye Bye");

    }



}