import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Magical Forest Adventure Game 2.0");
        System.out.print("Please enter your name: ");
        String username = in.nextLine();

        System.out.println("\nHello, " + username + "! let's begin the adventure");

        Location entrance = new Location("Entrance to the Forest", "A small opening into a vast green forest.");
        System.out.println(entrance.getDescription());

        Location[] locations = {
                new Location("Forest Path","A narrow path surrounded by tall trees."),
                new Location("Clearing","An open space with sunlight streaming through."),
                new Location("Garden", "A lush garden with colorful flowers."),
                new Location("Quit", "Thanks for playing the game!")
        };

        String[] items = { "iPod nano", "Geometry Dash 2.2", "Whole Lotta Red", "Playboy Carti Album","Tech ham and cheese sandwich", "Balenciaga","Titanic subermarine"};

        int index = -1;
        int previousIndex = -1;

        while (true) {
            System.out.println("Actions: ");
            for (int i = 0; i < locations.length; i++) System.out.println((i + 1) + ": Go to the " + locations[i]);

            System.out.print("\nWhat would you like to do? ");
            try {
                index = Integer.parseInt(in.nextLine()) - 1;
                if (index < 0 || index > 3) continue;
            }
            catch (Exception e) {
                continue;
            }

            System.out.println("You moved to the " + locations[index]);
            if (previousIndex == 2 && index == 1) {
                int rnd = new Random().nextInt(items.length);
                System.out.println("You found a " + items[rnd]);
            }
            System.out.println(locations[index].getDescription());

            previousIndex = index;

            if (index == 3) {
                break;
            }
        }
    }
}