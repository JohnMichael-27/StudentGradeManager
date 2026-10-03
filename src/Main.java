import java.util.Scanner;
/* 
Student Grade Management System. for now console based, 
but a GUI JavaFX will be added later on; Once the first version is finished 
*/
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // options is used as a variable to store input from user which will be used for the switch case
        int options;
        // menu used for the do-while block, while menu=true the code loops unless false 
        boolean menu = true;
        // quit is used for case 3 to receive input 'Y' or 'N'
        char quit;

        // do-while block; feel free to change anything since the original source code is uploaded to the main branch in GitHub
        // reminder to not change the main branch 
        do {
            System.out.println(" ~ Welcome to the Student Grade Manager ~ ");
            System.out.println(" ~ What would you like to do? ~ ");
            System.out.println(" ~ 1: Check Current Grade ~ "); 
            System.out.println(" ~ 2: Check GWA for the Semester ~ ");
            System.out.println(" ~ 3: Quit ~ ");
            options = cin.nextInt();
            // Cases still not finalized
            switch (options) {
                
                case 1:

                    // placeholder
                    System.out.println("Your Current Grade for this course is: 90.67");
                    
                    break;

                case 2:

                    // placeholder
                    System.out.println("Your GWA is: 1.50");
                    
                    break;

                case 3:

                    System.out.println(" Are you sure? Y or N: ");
                    quit = cin.next().charAt(0); // .charAt(); used so the scanner can receive char inputs

                    if (Character.toUpperCase(quit) == 'Y') { // if the user chooses 'Y' or 'y' lower; value of menu will become false terminating program
                        System.out.println("Program exited....");
                        menu = false;
                    } else { // returns the user back to menu; still needs changes
                        System.out.println("Return to options");
                    }

                    break;
                    
                default:
                    // this displays if the user inputs invalid option;
                    System.out.println("~~ Error please choose from (1-3) ~~");
                    
                    break;
            } 
        } while (menu); // as long as menu = true this block of code will loop

        cin.close();
    }
}