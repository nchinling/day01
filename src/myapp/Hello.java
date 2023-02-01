package myapp;
import java.io.Console;

public class Hello {
    
    //entry point

    public static void main(String[] args){

        //Get the console and assign it to a variable
        // Console cons = System.console();

        Console cons;
        cons = System.console();

        //Prompt user for an input and assign it to String
        String input = cons.readLine("What is your name? ");
        String phone = cons.readLine("What is your phone number? ");
        String strAge = cons.readLine("How old are you? ");

        int age = Integer.parseInt(strAge);

        //Print the input
        System.out.printf("Hello %s. Your phone no. is %s\n", input.toUpperCase(), phone);
        System.out.printf("You are %s years old\n", age);

        // can consider using boolean style. 

        if (age<=30){
            System.out.printf("Hello, %s\n", input);
        } else {
            System.out.printf("Hello, Mr %s\n", input);
        }
        // System.out.printf("Greater than 30? %b\n", age>30);

        //Can use 'switch' statements

        while (age > 0){
            System.out.printf("%d\n", age);
            age--;
        }




    }
}
