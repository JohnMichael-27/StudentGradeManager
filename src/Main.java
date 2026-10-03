import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int options;
        // used for the do-while block, while menu=true the code loops
        boolean menu = true;
        char quit;

        do {
            System.out.println(" ~ Welcome to the Student Grade Manager ~ ");
            System.out.println(" ~ What would you like to do? ~ ");
            System.out.println(" ~ 1: Check Current Grade ~ ");
            System.out.println(" ~ 2: Check GWA for the Semester ~ ");
            System.out.println(" ~ 3: Quit ~ ");
            options = cin.nextInt();

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
                    quit = cin.next().charAt(0);

                    if (Character.toUpperCase(quit) == 'Y') {
                        System.out.println("Program exited....");
                        menu = false;
                    } else {
                        System.out.println("Return to options");
                    }

                    break;
                    
                default:

                    System.out.println("~~ Error please choose from (1-3) ~~");
                    
                    break;
            }
        } while (menu);

        cin.close();
    }
}